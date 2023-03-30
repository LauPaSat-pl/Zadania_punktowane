import java.util.ArrayList;

public class World {
	ArrayList<Customer> customers;

	public World() {
		customers = new ArrayList<>();
	}

	public void goLive() {
		LaundryMachine laundryMachine = new LaundryMachine();
		for (int i = 0; i < 10; i++) {
			customers.add(new Customer(laundryMachine));
		}
		for (Customer customer : customers) {
			customer.doJob();
		}
	}

}
