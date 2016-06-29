package com.training;

public class MeterReading {
private long consumerNo;
private String consumerName;
private double currentMonthReading;
private double lastMonthReading;
private String consumerType;
public long getConsumerNo() {
	return consumerNo;
}
public void setConsumerNo(long consumerNo) {
	this.consumerNo = consumerNo;
}
public String getConsumerName() {
	return consumerName;
}
public void setConsumerName(String consumerName) {
	this.consumerName = consumerName;
}
public double getCurrentMonthReading() {
	return currentMonthReading;
}
public void setCurrentMonthReading(double currentMonthReading) {
	this.currentMonthReading = currentMonthReading;
}
public double getLastMonthReading() {
	return lastMonthReading;
}
public void setLastMonthReading(double lastMonthReading) {
	this.lastMonthReading = lastMonthReading;
}
public String getConsumerType() {
	return consumerType;
}
public void setConsumerType(String consumerType) {
	this.consumerType = consumerType;
}
public MeterReading(long consumerNo, String consumerName, double currentMonthReading, double lastMonthReading,
		String consumerType) {
	super();
	this.consumerNo = consumerNo;
	this.consumerName = consumerName;
	this.currentMonthReading = currentMonthReading;
	this.lastMonthReading = lastMonthReading;
	this.consumerType = consumerType;
}


}
