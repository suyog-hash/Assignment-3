package OopsAssignmentt;

import java.util.Date;
public class tablet extends medicine{
	public tablet() {
		super();
		price=500;
		expiryDate=new Date();
	}

	public tablet(double price, Date expiryDate) {
		super(price, expiryDate);
		
	}

	@Override
	public void displayLabel() {
		
		System.out.println("Tablet name(xyz)"+"\n"+"Preserve in a cool dry place");

	}

}
