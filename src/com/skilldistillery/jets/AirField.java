package com.skilldistillery.jets;

public class AirField {

	Jets[] jets = new Jets[50];

	public AirField() {

		jets[0] = new CargoPlane("C-130 Hercules", 268.0, 2361, 30_000_000);
		jets[1] = new CargoPlane("C-130J Super Hercules", 416.0, 2072, 167_000_000);
		jets[2] = new FighterJet("F-16 Fighting Falcon", 1500.0, 2622, 18_800_000);
		jets[3] = new FighterJet("F-22 Raptor", 1498.0, 1839, 334_000_000);
		jets[4] = new JetImpl("T1 Jayhawk", 534.0, 2417, 4_100_000);

	}

	void listJets() {
		for (Jets jet : jets) {
			if (jet != null) {
				System.out.println(jet);
			}
		}
	}

	void flyAll() {
		for (Jets jet : jets) {
			if (jet != null) {
				jet.fly();
			}
		}
	}

	void listFastest() {
		double speed = 0.0; 
		for (Jets jet : jets) {
			if (jet != null) {
				if(jet.getSpeed() > speed) {
					speed = jet.getSpeed();
					jet.fast();
				}
			}

		}
	}
	
	void longestRange() {
		double range = 0.0; 
		for (Jets jet : jets) {
			if (jet != null) {
				if(jet.getRange() > range) {
					range = jet.getRange();
					jet.longest();
				}
			}
			
		}
	}

}
