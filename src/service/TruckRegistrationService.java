package service;

import java.io.IOException;
import model.Vehicle;
import model.Truck;

public class TruckRegistrationService extends VehicleRegistrationSrevice{
	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter Capacity :");
		int capacity = Integer.parseInt(br.readLine());
		Vehicle truck = new Truck(this.getVehicle(), capacity);
		this.setVehicle(truck);
		vehicleList[Vehicle.getCount()-1]= truck;
		
	}


}
