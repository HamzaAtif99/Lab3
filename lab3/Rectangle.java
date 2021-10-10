package lab3;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle(int upperX, int upperY, int width, int height, Color shapeColor) {
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
		final double result = this.width * this.height;
		return result;
	}
}