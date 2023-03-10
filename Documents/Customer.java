import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<RentItem> rentItems = new ArrayList<RentItem>();

	public Customer(String name, List<RentItem> rentItems) {
		this.name = name;
		this.rentItems = rentItems;
	}

}
