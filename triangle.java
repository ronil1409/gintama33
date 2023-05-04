package classwork_collection;
import java.util.Scanner;

public class triangle {
	
     public static void main(String[] args) 
		{
			
			double side1, side2, side3;
			Scanner sc = new Scanner(System.in);	
			
			System.out.println("Please Enter Three sides of Triangle ");
			side1 = sc.nextDouble();
			side2 = sc.nextDouble();
			side3 = sc.nextDouble();
			if(side1>0&&side1<100 && side2>0&&side2<100 &&side3>0&&side3<100)
			{
				
			
			
			if(side1 == side2 && side2 == side3) 
			{
				System.out.println("It is an Equilateral Triangle");
			}	
			else if(side1 == side2 || side2 == side3 || side1 == side3) 
			{
				System.out.println("It is an Isosceles Triangle");
			} 
			else 
			{
				System.out.println("It is a Scalene Triangle");
			}
		}
			else {
				System.out.println("enter the value within range(0-100)");
			}
		}
	}

