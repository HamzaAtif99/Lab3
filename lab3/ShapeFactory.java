package lab3;

import java.awt.Color;
import java.util.Random;

public class ShapeFactory {
	private final static Random random = new Random();
	private static int x_coordinate = 10;
	private static int y_coordinate = 10;
	private static int shapeCount = 0;

	private static Color getRandomColor() {
		final int randomColor1 = random.nextInt();
		final int randomColor2 = random.nextInt();
		final int randomColor3 = random.nextInt();
		final int color = (randomColor1 + randomColor2 + randomColor3) / 3;

		return new Color(color);
	}

	public static Shape getShape(String shapeType) {
		Shape shape = null;
		final int low = 10;
		final int high = 100;

		// generate width and height between 10 and 100
		final int width = random.nextInt(high - low) + low;
		final int height = random.nextInt(high - low) + low;

		if ("circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle(getXCoordinate(), getYCoordinate(), width, width, getRandomColor());
		} else if ("square".equalsIgnoreCase(shapeType)) {
			shape = new Square(getXCoordinate(), getYCoordinate(), width, height, getRandomColor());
		} else if ("rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle(getXCoordinate(), getYCoordinate(), width, height, getRandomColor());
		}

		shapeCount++;

		return shape;
	}

	private static int getXCoordinate() {
		return x_coordinate + (shapeCount * 80);
	}

	private static int getYCoordinate() {
		return y_coordinate + (shapeCount * 80);
	}

	public static void resetShapeCount() {
		shapeCount = 0;
	}
}
