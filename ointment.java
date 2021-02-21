package OopsAssignmentt;

import java.util.Date;

public class ointement extends medicine{


	public ointement() {
		super();
		price=500;
		expiryDate=new Date();


	}

	public ointement(double price, Date expiryDate) {
		super(price, expiryDate);

	}

	@Override
	public void displayLabel() {

		System.out.println("Ointement name(xyz)"+"\n"+"use it for external  only");
	}

}