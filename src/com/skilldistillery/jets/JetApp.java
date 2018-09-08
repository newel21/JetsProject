package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {

	public static void main(String[] args) {

		JetApp menu = new JetApp();
		menu.displayUserMenu();
	

	}

	private void displayUserMenu() {

		
		Scanner sc = new Scanner(System.in);
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
		
							
		AirField fleet = new AirField();
				
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
				System.out.println("You chose Option 5");
				break;
			case 6:
				System.out.println("You chose Option 6");
				break;
			case 7:
				System.out.println("You chose Option 7");
				break;
			case 8:
				System.out.println("QUIT!");
				break;
			default:
				System.out.println("Invalid Option!");
			}

			sc.close();
		
	}


}
