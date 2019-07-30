package co.gc;

import java.util.LinkedList;
import java.util.Scanner;

import co.grandcircus.Car;
import co.grandcircus.Validator;


public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Langston's Auto Sales!");
		System.out.println();
		int numCars = Validator.getInt(scan, "How many cars would you like to enter?");
		System.out.println();
		

		LinkedList<Car> cars = new LinkedList<>();

		for (int i = 0; i < numCars; i++) {
			String car = Validator.getString(scan, "Car Make #"  + (i + 1) + ": ");
			String model = Validator.getString(scan, "Car Model #" + (i + 1) + ": ");
			int year = Validator.getInt(scan,"Car Year #" + (i + 1) + ": " );
			double price = Validator.getDouble(scan, "Car Price #" + (i + 1) + ": ");
			cars.add(new Car(car, model, year, price));
		}
		System.out.println();
		System.out.println("Current Inventory: ");
		for(Car pTemp: cars)
		System.out.println(pTemp);
	
	
		cars.add(new Car("Nikolai", "Model S", 2020, 54999.90));
		cars.add(new Car("Ford", "Escape", 2020, 31999.90));
		cars.add(new Car("Chevy", "Equinox", 2020, 44989.95));
		
		

	}
	

}
