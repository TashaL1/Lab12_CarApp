package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Langston's Auto Sales!");
		System.out.println();
		
			ArrayList<Car> cars = new ArrayList<>();
			System.out.println("Current Inventory: ");
			cars.add(new Car("Nikolai", "Model S", 2020, 54999.90));
			cars.add(new Car("Ford", "Escape", 2020, 31999.90));
			cars.add(new Car("Chevy", "Equinox", 2020, 44989.95));
			cars.add(new UsedCar("Tesla", "Model S", 2017, 54999.90, 35987.6));
			cars.add(new UsedCar("Honda", "Civic", 2016, 34999.90, 3500.3));
			cars.add(new UsedCar("Chrysler", "Jeep", 2015, 24999.90, 37865.9));
			
			String cont = "y";
			while (cont.equalsIgnoreCase("y")) {
				int n = 1;
			for (Car xCar2 : cars) {
				System.out.println(n++ + " " + xCar2);
			}
			System.out.println();
			int carSelection = Validator.getInt(scan, "Which car would you like?");
			System.out.println(cars.get(carSelection - 1));
			cont = Validator.getString(scan, "Would you like to buy this car? (y/n)");
			System.out.println("Excellent! Our finance department will be in touch shortly.");
			cars.remove(carSelection -1);
			System.out.println();
					
			}
	
			System.out.println("Thanks!");
}
}
