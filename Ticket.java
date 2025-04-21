//Burak Demirer 150122030
//Class create ticket for cars and can print their info and can calculate price.
public class Ticket {
	private Vehicle vehicle;
	private double totalPrice;
	private java.util.Date entryDate;
	private java.util.Date exitDate;
	public static int numberOfTickets;

	// Constructor of Ticket class.
	Ticket(Vehicle vehicle, java.util.Date entryDate) {
		this.vehicle = vehicle;
		this.entryDate = entryDate;
	}

	public double calculatePrice(double hourlyPrice, java.util.Date exitDate) {
		double exit = exitDate.getTime();
		double entry = entryDate.getTime();
		double hours = ((exit - entry) / 1000) / 3600;
		// Rounding of hours.
		hours = Math.ceil(hours);
		double parkingCost = vehicle.getSize() * hourlyPrice * hours;
		this.totalPrice = parkingCost;
		this.exitDate = exitDate;
		return parkingCost;
	}

	public String getTicketInfo() {
		String result;
		// It checks if there is a release date here.
		if (exitDate == null) {
			result = "Ticket Info" + "\nPlate Number : " + vehicle.getPlateNumber() + "\nEntry : " + entryDate;
		} else {
			double exit = exitDate.getTime();
			double entry = entryDate.getTime();
			double hours = ((exit - entry) / 1000) / 3600;
			hours = Math.ceil(hours);
			result = "Ticket Info" + "\nPlate Number : " + vehicle.getPlateNumber() + "\nEntry : " + entryDate
					+ "\nExit : " + exitDate + "\nHour : " + (int) hours + "\nFee : " + totalPrice;
			;
		}
		return result;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public double getPrice() {
		return this.totalPrice;
	}
}