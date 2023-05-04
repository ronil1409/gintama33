package assignment1;
import java.util.Scanner;

public class greatest3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any three digits");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 int max=(a>b)?(a>c?a:c):(b>c?a:c);
		 System.out.println("the greatest of three is :"+max);
		

	}

}
