package com.training;

public class Converter {

		private float doller;
		private float celsius;

public Converter(float doller, float celsius) {
			super();
			this.doller = doller;
			this.celsius = celsius;
		}

public float convertToRupees()
	{
	return 60*doller;
	}

public float convertToFahrenheit()
	{
	return (float) (celsius*1.8 + 32);
	}
}

