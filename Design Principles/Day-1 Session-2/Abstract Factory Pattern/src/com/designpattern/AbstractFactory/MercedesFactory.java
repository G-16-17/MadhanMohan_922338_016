package com.designpattern.AbstractFactory;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
