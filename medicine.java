package OopsAssignmentt;
import java.util.Date;

public abstract class medicine {
	double price;
	Date expiryDate;

	public medicine() {
		super();

	}
	public medicine(double price, Date expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public void getDetails(){
		System.out.println("Price = "+price+" Expiry Date = "+expiryDate);
	}
	public abstract void displayLabel();


}