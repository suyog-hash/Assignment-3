package OopsAssignmentt;

public class TestCustomer {
	
	public static void main(String[] args) {
		Customer cust=new Customer("Vikram",new Address("1st Main Vidyagiri","Dharwad"),new Address("1st Main Gandhinagar","Dharwad"));
		System.out.println(cust.getCustomerDetails());
	}

}


