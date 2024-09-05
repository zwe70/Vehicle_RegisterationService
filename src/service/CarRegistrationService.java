package service;

import java.io.IOException;
import model.Vehicle;
import model.Car;

public class CarRegistrationService extends VehicleRegistrationSrevice{


	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter door :");
		int door= Integer.parseInt(br.readLine());
		
		Vehicle car = new Car(this.getVehicle(),door);
		
		vehicleList[Vehicle.getCount()-1] = car;
	}


}
