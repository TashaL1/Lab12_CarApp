package co.grandcircus;


public class UsedCar extends Car{

	private double mileage;

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsedCar(String carMake, String carModel, int carYear, double carPrice, double mileage) {
		super(carMake, carModel, carYear, carPrice);
		this.mileage = mileage;	
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	
	@Override
	public String toString() {
		return super.toString() + " (Used) " + mileage + "miles";
	}

	
}
