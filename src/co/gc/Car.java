package co.gc;

public class Car {
	
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	
	public Car() {
		super();
		
	}
	public Car(String carMake, String carModel, int carYear, double carPrice) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		String myFormat = "Make: %-10s Model: %-10s Year: %-10s Price: $%-11s";
		return String.format(myFormat, carMake, carModel, carYear, carPrice);
	}
	
	
	
}
