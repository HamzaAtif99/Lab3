package lab3;

import java.util.List;

public class SortingTechnique {

	public static void sortShapes(List<Shape> shapes) {
		boolean sorted = false;

		while (!sorted) {
			sorted = true;

			for (int i = 0; i < shapes.size() - 1; i++) {
				if (shapes.get(i).compareTo(shapes.get(i + 1)) > 0) {
					swapShapesAndCoordinates(shapes, i);
					sorted = false;
				}
			}
		}
	}

	private static void swapShapesAndCoordinates(List<Shape> shapes, int i) {
		final Shape tempShape1 = shapes.get(i);
		final Shape tempShape2 = shapes.get(i + 1);

		// Swapping shapes coordinates
		final int tempShape1X = tempShape1.getUpperX();
		final int tempShape1Y = tempShape1.getUpperY();
		tempShape1.setUpperX(tempShape2.getUpperX());
		tempShape1.setUpperY(tempShape2.getUpperY());
		tempShape2.setUpperX(tempShape1X);
		tempShape2.setUpperY(tempShape1Y);

		// Swapping shapes
		shapes.set(i, tempShape2);
		shapes.set(i + 1, tempShape1);
	}
}
