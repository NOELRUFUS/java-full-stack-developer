package typecastingandaccessmodifiers;
import java.util.Scanner;
public class typecasting {
	
	  public static void main(String[] args) 
	  {
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int i=sc.nextInt();
	        long l = i;  
	        float f = l;  
	        double d= f;
	        System.out.println("After type casting : ");
	        System.out.println("Int value "+i); 
	        System.out.println("Long value "+l); 
	        System.out.println("Float value "+f); 
	        System.out.println("Double value "+d); 

	  }
	}


