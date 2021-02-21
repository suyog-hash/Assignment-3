package OopsAssignmentt;

import java.util.Random;
public class medicinetest 
{
	public static void main(String[] args) {
		Random rand = new Random(); 
		medicine arr[]=new medicine[5];
		arr[0]= new tablet();

		arr[1]= new syrup();
		arr[2]= new ointement();

		int rand_arr = rand.nextInt(3); 

		medicine m=arr[rand_arr] ;
		m.displayLabel();
		m.getDetails();
	}

}