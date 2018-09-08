package com.skilldistillery.jets;

public class CargoPlane extends Jets {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		System.out.println(this.getModel() + " is now boarding...");
	}
}