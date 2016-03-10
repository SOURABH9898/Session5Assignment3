package com.acadglid.java.core.session5.assignment3;

public class ShapeArea {
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	//Constructor overloading
	public ShapeArea(int side){
		this.setLength(side);
	}
	public ShapeArea(int length, int breadth){
		this.setLength(length);
		this.setBreadth(breadth);
	}
	public int getArea(){
		if (this.breadth !=0){
			return (length*breadth);
		}else{
			return (int)Math.pow(length, 2);
		}
	}

}
