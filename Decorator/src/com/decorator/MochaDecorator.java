package com.decorator;

public class MochaDecorator extends CondimentDecorator{
	
	public MochaDecorator(Beverage bvg){
		this.beverage = bvg;
	}
	
	@Override
	public int getcost() {	
		return 1+beverage.getcost();
	}

	@Override
	public String getDescription() {
		return "Mocha"+","+beverage.getDescription();
	}

}
