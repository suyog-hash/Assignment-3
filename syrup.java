package OopsAssignmentt;
import java.util.Date;

public class syrup extends medicine{

	public syrup() {
		super();
		price=500;
		expiryDate=new Date();
	}

	public syrup(double price, Date expiryDate) {
		super(price, expiryDate);
	
	}

	@Override
	public void displayLabel() {
		
		System.out.println("Syrup name(xyz)"+ "\n"+"Before use shake it well");

	}

}