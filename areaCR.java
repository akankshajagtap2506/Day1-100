package step1;
import java.util.*;
public class areaCR 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
		{
			int r=sc.nextInt();
			double ac=3.14*r*r;
			System.out.println(ac);
			break;
		}
		case 2:
		{
			int l=sc.nextInt();
			int b=sc.nextInt();
			int ar=l*b;
			System.out.println(ar);
			break;
		}
		}
	}
}
