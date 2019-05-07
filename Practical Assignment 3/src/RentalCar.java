/**
 * Class which describes both static and instance fields and methods(including
 * constructors) of Rental Car.
 * 
 * @author Hoai Nhan Nguyen
 */
public class RentalCar {
	// Description of rental car.
	private static String descriptionOfRentalCar = "This contains Rental Car details about the manufacturer, model, bodyType, registrationNumber, price and borrowed status.";
	// Name of Manufacturer.
	private String manufacturer;
	// Name of car modal.
	private String model;
	// Description of body type.
	private String bodyType;
	// Description of registration number.
	private String registrationNumber;
	// Price of Rental Car.
	private double price;
	// Whether or not the Rental Car is borrowed.
	private Boolean borrowed;

	// Main constructor for making rental car which includes manufacturer, model, body type, registration number, price and borrowed.
	public RentalCar(String manufacturer, String model, String bodyType, String registrationNumber, double price,
			Boolean borrowed) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.bodyType = bodyType;
		this.registrationNumber = registrationNumber;
		this.price = price;
		this.borrowed = borrowed;
	}

	// First additional constructor for making rental car which includes, manufacturer, model, body type, registration number, price.
	public RentalCar(String manufacturer, String model, String bodyType, String registrationNumber, double price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.bodyType = bodyType;
		this.registrationNumber = registrationNumber;
		this.price = price;
	}

	// Second additional constructor for making rental car which includes, manufacturer, model, body type.
	public RentalCar(String manufacturer, String model, String bodyType) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.bodyType = bodyType;
	}

	// Uses a if-else statement to indicate whether the rental car is borrowed or not.If it is false it will set it to true.
	// If the statement is already true it will print out the the car is on a loan.
	public void borrow() {
		if (!this.borrowed) {
			this.borrowed = true;
			System.out.println("Dear Customer,\n" + "The following rental car is avalible: " + this);
		} else {
			System.out.println("Dear Customer,\n" + "The current RentalCar has already been loaned: " + this);
		}
	}

	// Set the status of borrowed to false
	public void returnRentalCar() {
		this.borrowed = false;
	}

	// Change the current price to the newly specified price.
	public void changePrice(double price) {
		this.price = price;
	}

	// Return the current cost of renting the RentalCar
	public double checkPrice() {
		return this.price;
	}

	// Return the current status of borrowed
	public boolean checkBorrowed() {
		return this.borrowed;
	}

	// Return the object as a string and displays the 6 attributes for the details of rental car.
	public String display() {
		StringBuffer sb = new StringBuffer("**********");
		sb.append("\nManufacturer: ").append(this.manufacturer);
		sb.append("\nModel: ").append(this.model);
		sb.append("\nBodyType: ").append(this.bodyType);
		sb.append("\nRegistrationNumber: ").append(this.registrationNumber);
		sb.append("\nPrice: ").append(this.price);
		sb.append("\nBorrowed: ").append(borrowed);
		return sb.toString();
	}

	// Return the description of rental car class.
	public static String getDescription() {
		return RentalCar.descriptionOfRentalCar;
	}
}
