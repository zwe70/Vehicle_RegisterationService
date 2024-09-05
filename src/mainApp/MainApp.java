package mainApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import service.VehicleRegistrationSrevice;
import service.CarRegistrationService;
import service.CycleRegistrationService;
import service.TruckRegistrationService;

public class MainApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		VehicleRegistrationSrevice service = null;
		String flag;
		do {
			System.out.print("Enter Vehicle Type(Car/Truck/Motorcycle):");
			String type = br.readLine();
			if (type.equalsIgnoreCase("car")) {
				service = new CarRegistrationService();

			} else if (type.equalsIgnoreCase("motorcycle")) {
				service = new CycleRegistrationService();

			} else if (type.equalsIgnoreCase("truck")) {
				service = new TruckRegistrationService();
			}
			service.create();

			System.out.println("Do u want to add another vehicle (yes/no) ? ");
			flag = br.readLine();

		} while (flag.equalsIgnoreCase("yes"));

		service.displayInfo();
	}

}
