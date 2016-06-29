package com.training;

public class BillManager {
	private MeterReading reading;
	
	

	public MeterReading getReading() {
		return reading;
	}



	public void setReading(MeterReading reading) {
		this.reading = reading;
	}



	public BillManager(MeterReading reading) {
		super();
		this.reading = reading;
	}



	public BillManager() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double calculateBillAmount(MeterReading reading)
	{
		double amt =0;
		double unitConsumed=reading.getCurrentMonthReading()-reading.getLastMonthReading();
		
		if (reading.getConsumerType().equals("COM"))
		{
			if (unitConsumed>400)
			{
			amt= unitConsumed * 5;	
			}
			else
			{
				amt =unitConsumed*3;
			}
			
		}
		else
		{
			if (unitConsumed>300)
			{
				amt = unitConsumed*4;
			}
			else
			{
				amt =unitConsumed*2;
			}
		}
	return amt;
	}
	
	public double calculateBillAmount()
	{
		double amt= calculateBillAmount(reading);
		return amt;
	}
}


