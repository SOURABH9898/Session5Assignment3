package com.acadglid.java.core.session5.assignment3;

public class AreaConctructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ShapeArea shape=new ShapeArea(6);
	System.out.println("Area of Square is " +shape.getArea());
	shape=new ShapeArea(14,15);
	System.out.println("Area of Rectangle is "+shape.getArea());
	}

}
