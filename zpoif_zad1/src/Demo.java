import guests.Guest;
import guests.Student;
import guests.Tourist;
import scareThings.Hospital;
import scareThings.MortgageDebtApartment;
import scareThings.OldCastle;
import scareThings.WaterDebtApartment;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Guest> guests = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Student student = new Student();
			Tourist tourist = new Tourist();
			guests.add(student);
			guests.add(tourist);
		}
		OldCastle oldCastle = new OldCastle();
		Hospital hospital = new Hospital();
		WaterDebtApartment waterDebtApartment = new WaterDebtApartment();
		MortgageDebtApartment mortgageDebtApartment = new MortgageDebtApartment();
		for (Guest guest:guests){
			System.out.println("\nNew guest");
			oldCastle.visit(guest);
			System.out.println(guest);
			hospital.visit(guest);
			System.out.println(guest);
			waterDebtApartment.visit(guest);
			System.out.println(guest);
			mortgageDebtApartment.visit(guest);
			System.out.println(guest);
		}
	}
}
