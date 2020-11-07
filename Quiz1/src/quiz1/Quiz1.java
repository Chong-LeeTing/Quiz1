package quiz1;
import java.util.*;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("1. Female \n2. Male");
		System.out.print("Please choose the gender:");
		int choice =in.nextInt();
		
		if(choice == 1) {
			System.out.print("Input height in feet:");
			int feet1 = in.nextInt();
			System.out.print("Input height in inch:");
			int inch1 = in.nextInt();
			int heightinInch1 = feet1*12 + inch1;
			int weight1 = 40 + (5*inch1);
			System.out.println("Female height: "+heightinInch1+" inches");
			System.out.println("Fenale ideal weight: "+weight1+" kg");
		}
		
		else if(choice == 2) {
			System.out.print("Input height in feet:");
			int feet2 = in.nextInt();
			System.out.print("Input height in inch:");
			int inch2 = in.nextInt();
			int heightinInch2 = feet2*12 + inch2;
			int weight2 = 50 + (6*(12+inch2));
			System.out.println("Male height: "+heightinInch2+" inches");
			System.out.println("Male ideal weight: " + weight2 + " kg");
		}
		
		else {
			System.out.print("Your choice is invalid. Please try Again");
		}
		
	
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
	

	}

}
