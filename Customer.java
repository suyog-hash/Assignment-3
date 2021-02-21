package OopsAssignmentt;

public class Customer {
	
	private String customerName;
	private Address residentialAddr;
	private Address officialAddr;
	public Customer() {
		super();
		customerName="Rahul";
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddr() {
		return residentialAddr;
	}

	public void setResidentialAddr(Address residentialAddr) {
		this.residentialAddr = residentialAddr;
	}

	public Address getOfficialAddr() {
		return officialAddr;
	}

	public void setOfficialAddress(Address officialAddr) {
		this.officialAddr = officialAddr;
	}
	public String getCustomerDetails()
	{
		return ("Customer : "+customerName+ " \nResidential Addr :"+residentialAddr+
				"\nOfficial Addr :"+officialAddr);
	}
	public Customer(String customerName, Address residentialAddr, Address officeAddr) {
		super();
		this.customerName = customerName;
		this.residentialAddr = residentialAddr;
		this.officialAddr = officeAddr;
	}


	}

