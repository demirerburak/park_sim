//Burak Demirer 150122030
//This class creates objects of the parkplace class with the information of the vehicles entering the park.
public class ParkPlace {
	private int size;
	private Vehicle vehicle;

	// Constructor of ParkPlace class.
	public ParkPlace(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.size = vehicle.getSize();
	}

	public int getSize() {
		return size;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
}
