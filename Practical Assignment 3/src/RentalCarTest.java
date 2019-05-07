/**
 * Class which that tests both static and instance fields and methods(including
 * constructors) of Rental Car.
 * 
 * @author Hoai Nhan Nguyen
 */
public class RentalCarTest {
	public static void main(String[] args) {
		// Prints out the description of the rental car class.
		System.out.println("RentalCar description: " + RentalCar.getDescription());

		// Created an object name MitsubishiGold using the main constructor.
		RentalCar MitsubishiGold = new RentalCar("Mitsubishi Ireland", "mitsubishi", "Challenger", "RchTfxHJ", 1000.0, true);
		// Prints out the MitsubishiGold object into a string and displays details of the rental car.
		System.out.println("\nMitsubishiGold\n" + MitsubishiGold.display());

		// Created an object name MitsubishiSilver using the first additional constructor.
		RentalCar MitsubishiSilver = new RentalCar("Mitsubishi Ireland", "mitsubishi", "Outlander", "Vxco9i2v", 800.0);
		// Prints out the MitsubishiSilver object into a string and displays details of the rental car.
		System.out.println("\nMitsubishiSilver\n" + MitsubishiSilver.display());

		// Created an object name MitsubishiBronze using the second additional constructor.
		RentalCar MitsubishiBronze = new RentalCar("Mitsubishi Ireland", "mitsubishi", "Eclipse Cross");
		// Prints out the MitsubishiBronze object into a string and displays details of the rental car.
		System.out.println("\nMitsubishiBronze\n" + MitsubishiBronze.display());

		// Below are methods that where created in RentalCar class.
		// Below I have tested these methods on the MitsubishiGold object.
		// Method that changes the price of an object.
		MitsubishiGold.changePrice(1200.0);
		// Prints out the price of rental car while using the method checkPrice.
		System.out.println("\nMitsubishiGold price: " + MitsubishiGold.checkPrice());
		// Prints out the borrowed status of rental car while using the method checkBorrowed.
		System.out.println("MitsubishiGold borrowed: " + MitsubishiGold.checkBorrowed());
		// Using the method checkPrice returnRentalCarto change the borrowed status to false.
		MitsubishiGold.returnRentalCar();
		// Prints out the borrowed status of rental car while using the method checkBorrowed.
		System.out.println("MitsubishiGold borrowed: " + MitsubishiGold.checkBorrowed());
		// Using the method borrow to check if the rental car is available or not.The borrow method uses an if-else statement.
		MitsubishiGold.borrow();
	}
}