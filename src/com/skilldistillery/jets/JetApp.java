package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {

	public static void main(String[] args) {
	
		JetApp menu = new JetApp();
		menu.displayUserMenu();
		
	}

	private void displayUserMenu() {
		
		// create an object then call methods inside the object depending on the case
		AirField fleet = new AirField();
		
		// prompts user to select from the list
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Choose from the menu: ");
		System.out.println();
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Quit");
		System.out.println();

		int input = sc.nextInt();

		// Jets newJet = new Jets();

		switch (input) {
			case 1:
				System.out.println("Here are the list of Jets in the Airfield: ");
				System.out.println();
				fleet.listJets();
				break;
			case 2:
				System.out.println();
				fleet.flyAll();
				break;
			case 3:
				System.out.println();
				fleet.listFastest();
				break;
			case 4:
				System.out.println();
				fleet.longestRange();
				break;
			case 5:
				System.out.println();
				fleet.loadingCargoNow();
				break;
			case 6:
				System.out.println();
				fleet.dogFight();
				break;
			case 7:
				System.out.println();
				fleet.addJets();				
				break;			
			case 8:
				System.out.println("GoodBye!");
				System.exit(0);
				//break;
			default:
				System.out.println("Invalid Option!");
			}
		}
			

		//sc.close();

	}

}
