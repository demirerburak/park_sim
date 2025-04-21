//Burak Demirer 150122030
//This class create vehicle objects.
public class Vehicle {
	private String plateNumber;
	private int size;

	// Constructor of Vehicle class.
	public Vehicle(String plateNumber, int size) {
		this.plateNumber = plateNumber;
		this.size = size;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public int getSize() {
		return size;
	}

	public String getVehicleInfo() {
		String result = "Vehicle info  " + "\nPlate number: " + plateNumber + " \nSize: " + size;
		return result;

	}
}
