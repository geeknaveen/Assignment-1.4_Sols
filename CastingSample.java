/*Write a program in java to implement type casting between different variables. 
 Take six variables as one of each byte, short, int_, long, float and double. Initialize only byte 
and short asking the value from the user. 
*/
package casting.example;

import java.util.Scanner;

//Part-1
public class CastingSample {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		byte b = 42; 
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        System.out.println(" Please Enter the Byte & Short Value: ");
		b = (byte) sc.nextInt();
		s = (short) sc.nextInt();
		  System.out.println(" The value of Byte is : " + b);
		  System.out.println(" The value of Short is : " + s);
	}
}


 