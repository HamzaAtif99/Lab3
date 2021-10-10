package lab3;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape> {

	protected int upperX;
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;

	public Shape(int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}

	public abstract Color getColor();

	public abstract void drawShape(Graphics form);

	public abstract double getSurfaceArea();

	@Override
	public int compareTo(Shape s) {
		int result = 0;

		if (this.getSurfaceArea() < s.getSurfaceArea()) {
			result = -1;
		} else if (this.getSurfaceArea() > s.getSurfaceArea()) {
			result = 1;
		}

		return result;
	}

	public int getUpperX() {
		return upperX;
	}

	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	public int getUpperY() {
		return upperY;
	}

	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getShapeColor() {
		return shapeColor;
	}

	public void setShapeColor(Color shapeColor) {
		this.shapeColor = shapeColor;
	}
}
