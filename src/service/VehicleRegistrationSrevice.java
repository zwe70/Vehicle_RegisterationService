package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Vehicle;

public class VehicleRegistrationSrevice {
	
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Vehicle vehicle;
	
	public static Vehicle [] vehicleList = new Vehicle[1000];
	
	public void create() throws IOException{
		getCommonInfo();
		registerProcess();
			
	}
	public void registerProcess() throws IOException{
		
	}
	
	public void getCommonInfo()throws IOException {
		System.out.println("Enter brand : ");
		String brand = br.readLine();
		System.out.println("Enter model : ");
		String model = br.readLine();
		
		this.vehicle = new Vehicle (brand,model);
	}
	public void displayInfo() {
		for (int i=0;i<Vehicle.getCount();i++) {
			vehicleList[i].displayInfo();
			
		}
		System.out.println();
		
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
