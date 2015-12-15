package com.decorator;

public class WhipDecorator extends CondimentDecorator {
	
	public WhipDecorator(Beverage bvg){
		this.beverage = bvg;
	}
	

	@Override
	public String getDescription() {
		return "Whip"+","+beverage.getDescription();
	}

	@Override
	public int getcost() {
		return 2 + beverage.getcost();
	}

}
