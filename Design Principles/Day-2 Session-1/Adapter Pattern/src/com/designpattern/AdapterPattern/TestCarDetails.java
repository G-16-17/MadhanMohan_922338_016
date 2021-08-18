package com.designpattern.AdapterPattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarDetails {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(), 425.00, 0.00001);
	}
}
