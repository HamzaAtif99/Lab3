package lab3;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle(int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}

	@Override
	public void drawShape(Graphics form) {
		form.fillOval(upperX, upperY, width, height);
	}

	@Override
	public Color getColor() {
		return shapeColor;
	}

	@Override
	public double getSurfaceArea() {
		final double result = (Math.PI * Math.pow(this.width / 2, 2));
		return result;
	}
}
