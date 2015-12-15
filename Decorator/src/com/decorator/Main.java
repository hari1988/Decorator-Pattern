package com.decorator;

public class Main {

	public static void main(String[] args) {
		Beverage bvg = new HouseBlend();
		bvg = new MochaDecorator(bvg);
		bvg = new WhipDecorator(bvg);
		System.out.println(bvg.getDescription());
		System.out.println(bvg.getcost());
	}

}
