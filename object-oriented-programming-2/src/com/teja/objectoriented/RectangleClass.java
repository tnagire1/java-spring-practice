package com.teja.objectoriented;

public class RectangleClass {

	int length, width, area, perimeter;

	public RectangleClass(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void changeLength(int length) {
		this.length = length;
	}

	public void changeWidth(int width) {
		this.width = width;
	}

	public int findArea() {
		return length * width;
	}

	public int findPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return (String.format("Length: %d,Width: %d,Perimeter:%d,Area:%d", length, width, findArea(), findPerimeter()));
	}

}
