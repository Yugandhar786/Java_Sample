package sample;
import java.util.Scanner;
import loginvalidating.*;
public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=259259,b=259259,c=259259;
		int d;
		d=a+b+c;
		Math1.keygen();
		

	}
	public static class Math1 extends Arithmatic{
		
		public static void keygen() {
			Scanner key1 = new Scanner(System.in);  
		    System.out.println("\n\n\n\nEnter Secret Key:");

		    String secretKey = key1.nextLine(); 
		    Message.details(secretKey);
		   
		}
		
	}


}
