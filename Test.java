
//Burak Demirer 150122030
//This Class Test the code.
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// creation of carpark object.
		CarPark carpark = new CarPark(10, 5);
		// creation of vehicles object.
		Vehicle v1 = new Vehicle("34KMS12", 4);
		Vehicle v2 = new Vehicle("34BEN21", 2);
		Vehicle v3 = new Vehicle("34AKF34", 1);
		Vehicle v4 = new Vehicle("34GHI77", 2);
		Vehicle v5 = new Vehicle("34JKL68", 4);
		// creation of entrydates.
		Date entryDate1 = new Date();
		Date entryDate2 = new Date(entryDate1.getTime() + 3600000);
		Date entryDate3 = new Date(entryDate1.getTime() + 2 * 3600000);
		Date entryDate4 = new Date(entryDate1.getTime() + 3 * 3600000);
		Date entryDate5 = new Date(entryDate1.getTime() + 4 * 3600000);
		// creation of tickets.
		Ticket t1 = carpark.parkVehicle(v1, entryDate1);
		Ticket t2 = carpark.parkVehicle(v2, entryDate2);
		Ticket t3 = carpark.parkVehicle(v3, entryDate3);
		Ticket t4 = carpark.parkVehicle(v4, entryDate4);
		Ticket t5 = carpark.parkVehicle(v5, entryDate5);
		System.out.println();
		carpark.printVehicleList();
		// creation of exitdates
		Date exitDate1 = new Date(entryDate1.getTime() + 3600000);
		Date exitDate2 = new Date(entryDate2.getTime() + 2 * 3600000);
		Date exitDate3 = new Date(entryDate3.getTime() + 3 * 3600000);
		Date exitDate4 = new Date(entryDate4.getTime() + 4 * 3600000);
		carpark.exitVehicle(t1, exitDate1);
		carpark.exitVehicle(t2, exitDate2);
		System.out.println();
		carpark.printVehicleList();
		carpark.exitVehicle(t3, exitDate3);
		carpark.exitVehicle(t4, exitDate4);
		System.out.println();
		System.out.println("The total income: " + carpark.getTotalIncome());
		System.out.println();
		System.out.println("Total number of vehicles: " + Ticket.numberOfTickets);
		System.out.println();
		carpark.printTickets();

	}
}
