/*Take byte & short variables and store their sum in the integer variable and print the sum 
and then take short and int_ and store their addition in a long variable and now take an int 
and long and so on. */  
package casting.example;

public class CastingSample2 {

	public static void main(String[] args) {
		 Short shortObject = new Short("10");
		    byte b = shortObject.byteValue();
		    System.out.println("byte:"+b);
		    short s = shortObject.shortValue();
		   System.out.println("short:"+s);
		    int i = shortObject.intValue();
		    System.out.println("The sum of integer variable is: "+ b + s);

		    short s1 = shortObject.shortValue();
		    System.out.println("\nshort:"+s1);
		    int i1 = shortObject.intValue();
		    System.out.println("int:"+ b + s1);
		    long l = shortObject.longValue();
		    System.out.println("The sum of long variable is: "+s1+i1);
		    
		    int i2 = shortObject.intValue();
		    System.out.println("\nint:"+ b + s1);
		    long l2 = shortObject.longValue();
		    System.out.println("long:"+l);
		    float f = shortObject.floatValue();
		    System.out.println("The sum of float variable is: "+i2+l2);

		    long l3 = shortObject.longValue();
		    System.out.println("\nlong:"+l);
		    float f1 = shortObject.floatValue();
		    System.out.println("float"+f);
		    double d1 = shortObject.doubleValue();
		    System.out.println("The sum of double variable is: "+l3+f1);
	    }
}
