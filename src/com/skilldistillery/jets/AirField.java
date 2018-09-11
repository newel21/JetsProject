package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {

	Jets[] jets = new Jets[100];

	public AirField() {

		jets[0] = new CargoPlane("C-130 Hercules", 268.0, 2361, 30_000_000);
		jets[1] = new CargoPlane("C-130J Super Hercules", 416.0, 2072, 167_000_000);
		jets[2] = new FighterJet("F-16 Fighting Falcon", 1500.0, 2622, 18_800_000);
		jets[3] = new FighterJet("F-22 Raptor", 1498.0, 1839, 334_000_000);
		jets[4] = new JetImpl("T1 Jayhawk", 534.0, 2417, 4_100_000);

	}

	public Jets[] getJets() {
		return jets;
	}
	
	public void setJets(Jets[] jets) {
		this.jets = jets;
	}
	
	//prints out or list items in the array
	void listJets() {
		for (Jets jet : jets) {
			if (jet != null) {
				System.out.println(jet);
			}
		}
	}

	// calls fly() method from Jets class
	void flyAll() {
		for (Jets jet : jets) {
			if (jet != null) {
				jet.fly();
			}
		}
	}

	// iterate through the loop to find the Jet with highest speed 
	void listFastest() {
		double speed = 0.0; 
		String model = "";
		for (Jets jet : jets) {
			if (jet != null) {
				if(jet.getSpeed() > speed) {
					speed = jet.getSpeed();
					model = jet.getModel();
				}
			}

		}
		System.out.println(model + " is the fastest Jet.");
	}
	// iterate through the loop to find the Jet with the longest range 
	void longestRange() {
		int range = 0; 
		String model = "";
		for (Jets jet : jets) {
			if (jet != null) {
				if(jet.getRange() > range) {
					range = jet.getRange();
					model = jet.getModel();				
				}
			}		
		}
		System.out.println(model + " has the longest range.");
	}
	
	// iterate through the loop and find Jet(s) that implements CargoCarrier
	void loadingCargoNow() {
		for (Jets jet : jets) {
			if (jet != null) {
				if (jet instanceof CargoCarrier) {				
					((CargoPlane) jet).loadCargo();
				}
			}	
		}
	}
	
	// iterate through the loop and find Jet(s) that implements CombatReady
	void dogFight() {
		for (Jets jet : jets) {
			if (jet != null) {
				if (jet instanceof CombatReady) {					
					((FighterJet) jet).fight();
				}
			}					
		}
	}
	
	// prompts user to enter Jet info in order to add newJet in the Array of Jets
	public void addJets() {
		
		Scanner add = new Scanner(System.in);
		
		System.out.print("Enter Model: ");
		String addModel = add.nextLine();
		
		System.out.print("Enter Speed: ");
		double addSpeed = add.nextDouble();
		
		System.out.print("Enter Range: ");
		int addRange = add.nextInt();
		
		System.out.print("Enter Price: ");
		long addPrice = add.nextLong();
	
		JetImpl newJet = new JetImpl(addModel, addSpeed, addRange, addPrice);
		
		//newJet.displayNewJet();;
	    
		for (int i=0; i<jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = newJet;
				break;
			}
			//System.out.println(i);
		}
					
		
		
	}


	
}
