package com.teja.objectoriented;

public class RectangleRunner {
	public static void main(String[] args) {
		RectangleClass rectangle = new RectangleClass(5, 4);
		System.out.println(rectangle.toString());
		rectangle.findArea();
		rectangle.findPerimeter();
		rectangle.changeLength(13);
		System.out.println(rectangle.toString());
	}

}
