package com.skilldistillery.jets;

public abstract class Jets {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public Jets() {}
	
	public Jets(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

	// prints out the array in this format
	@Override
	public String toString() {
		return "MODEL: " + model + ",   SPEED: " + speed + ",   RANGE: " + range + ",   PRICE: " + price;
	}
	
	//fly method that also calculates the time left that Jets can fly till they run out of fuel
	public void fly() {
		double timeLeft = range/speed;
		double hours = Math.round(timeLeft * 100.0) / 100.0;
		System.out.println(getModel() + " is flying... and has " + hours + " hours left until it runs out of fuel.");
	}
	
	public void displayNewJet() {
		String jetData = toString();
		System.out.println(jetData);
	}
	
	
}
