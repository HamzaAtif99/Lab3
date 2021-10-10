package lab3;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	public Square(int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}

	@Override
	public void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, height);
	}

	@Override
	public Color getColor() {
		return shapeColor;
	}

	@Override
	public double getSurfaceArea() {
		final double result = Math.pow(this.width, 2);
		return result;
	}
}
