package domParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
	private static final String NAME = "name";
	private static final String STREET = "street";
	private static final String CITY = "city";
	private static final String ZIP = "zip";
	//Use the DomServiceClass to get all customers
	//whose city of residence begins with "Ma", in sorted order.
	//Create
	public List<Customer> allCustomersBeginWithMa() {
		List<Customer> customers = new ArrayList<>();

        try {
        	DomInterface xml = new DomServiceClass("customer.xml");
            List<Properties> propsList = xml.lookupEntry("city", "Ma");
            for (Properties properties : propsList) {
            	Customer cust = new Customer(properties.getProperty("name"), properties.getProperty("street"), properties.getProperty("city"), properties.getProperty("zip"));
            	customers.add(cust);
            }
        }
        catch(DomException e) {
            System.out.println(e.getMessage());
        }
        return customers;
	}

	public static void main(String[] args) {
		Main m = new Main();
		List<Customer> list = m.allCustomersBeginWithMa();
		System.out.println(list);

	}

}
