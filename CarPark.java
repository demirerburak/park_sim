//Burak Demirer 150122030
//Class create Parkplace array and Ticket array in this class and fills these arrays. It can print vehicle list, ticket list and total income.
public class CarPark {
	private int capacity;
	public ParkPlace[] parkPlaceArray;
	public Ticket[] ticketArray;
	private double hourlyPrice;

	// Constructor of CarPark class.
	CarPark(int capacity, double hourlyPrice) {
		this.capacity = capacity;
		this.hourlyPrice = hourlyPrice;
	}

	// Here the program create new arrays according to cars inside of its.
	public Ticket parkVehicle(Vehicle vehicle, java.util.Date entryDate) {
		int i = 0;
		int j = 0;
		// Here it checks if there is space here
		if (vehicle.getSize() < capacity) {
			ParkPlace parkPlace = new ParkPlace(vehicle);
			Ticket ticket = new Ticket(vehicle, entryDate);
			Ticket[] ticketArrayTemp = ticketArray;
			ParkPlace[] parkPlaceArrayTemp = parkPlaceArray;
			// If there is a parked car, it enlarges the array, otherwise it declare a new
			// array.
			if (ticketArrayTemp != null) {
				this.ticketArray = new Ticket[ticketArrayTemp.length + 1];
			} else {
				ticketArrayTemp = new Ticket[0];
				this.ticketArray = new Ticket[1];
			}
			// Here is the same.
			if (parkPlaceArrayTemp != null) {
				this.parkPlaceArray = new ParkPlace[parkPlaceArrayTemp.length + 1];
			} else {
				parkPlaceArrayTemp = new ParkPlace[0];
				this.parkPlaceArray = new ParkPlace[1];
			}
			// It reduces capacity according to size.
			capacity = capacity - vehicle.getSize();
			// Here it rewrite the old cars and tickets to new arrays.
			while (parkPlaceArrayTemp.length > i) {
				parkPlaceArray[i] = parkPlaceArrayTemp[i];
				i++;
			}
			while (ticketArrayTemp.length > j) {
				ticketArray[j] = ticketArrayTemp[j];
				j++;
			}
			// Here it write the new car and ticket to new arrays.
			ticketArray[ticketArrayTemp.length] = ticket;
			parkPlaceArray[parkPlaceArrayTemp.length] = parkPlace;
			System.out.println("The vehicle with " + vehicle.getPlateNumber() + " plate number is parked.");
			Ticket.numberOfTickets++;
			return ticket;
		} else {
			System.out.println("Car park is full!");
			return null;
		}
	}

	public Vehicle exitVehicle(Ticket ticket, java.util.Date exitDate) {
		ParkPlace[] tempParkPlaceArray = new ParkPlace[parkPlaceArray.length - 1];
		int j = 0;
		int i = 0;
		int k = 0;
		int k1 = 0;
		do {
			// Here it finds the matching tickets.
			if (ticket == ticketArray[j]) {
				System.out.println("The price for vehicle with " + ticket.getVehicle().getPlateNumber()
						+ " plate number is: " + ticket.calculatePrice(hourlyPrice, exitDate));
				// Writes the remaining cars to a new array.
				while (parkPlaceArray.length > i) {
					if (ticket.getVehicle() != parkPlaceArray[i].getVehicle()) {
						tempParkPlaceArray[k] = parkPlaceArray[k1];
						k++;
					}
					k1++;
					i++;
				}
				// It increases capacity according to size.
				capacity = capacity + ticket.getVehicle().getSize();
				// Here it updates the array.
				parkPlaceArray = tempParkPlaceArray;
				return ticket.getVehicle();
			}
			j++;
		} while (j < ticketArray.length);
		return null;
	}

	// Calculation of total income.
	public double getTotalIncome() {
		int i = 0;
		double result = 0;
		while (ticketArray.length > i) {
			result = result + ticketArray[i].getPrice();
			i++;
		}
		return result;
	}

	// It prints the parking cars.
	public void printVehicleList() {
		int i = 0;
		while (parkPlaceArray.length > i) {
			System.out.println(parkPlaceArray[i].getVehicle().getVehicleInfo());
			System.out.println();
			i++;
		}

	}

	// It prints the whole tickets.
	public void printTickets() {
		int i = 0;
		while (ticketArray.length > i) {
			System.out.println(ticketArray[i].getTicketInfo());
			System.out.println();
			i++;
		}
	}
}