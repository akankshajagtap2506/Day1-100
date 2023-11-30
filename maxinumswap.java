package step1;
import java.util.*;
public class maxinumswap
{
	static int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	static void swap(int x,int y)
	{
		int t=x;
		x=y;
		y=t;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int r;
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			r=max(a,b);
			System.out.println(r);
			break;
		}
		case 2:
		{
			swap(a,b);
			System.out.println(a +" "+b);
			break;
		}
		default:
		{
			System.out.println("invalid");
		}
		
		}
	}
	
}
