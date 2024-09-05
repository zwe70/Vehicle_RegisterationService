package service;

import java.io.IOException;
import model.Vehicle;
import model.Motorcycle;

public class CycleRegistrationService extends VehicleRegistrationSrevice{
	
	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter sidecar :");
		boolean hasSideCar;
		if (br.readLine().equalsIgnoreCase("yes")) {
			hasSideCar=true;
		}
		else {
			hasSideCar=false;
		}
		Vehicle cycle =new Motorcycle(this.getVehicle(),hasSideCar);
		this.setVehicle(cycle);
		vehicleList[Vehicle.getCount()-1] = cycle;
		
	}

}
