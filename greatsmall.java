package step1;
import java.util.*;
public class greatsmall 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println("Greater");
		}
		else if(n1<n2)
		{
			System.out.println("Smaller");
		}
		else if(n1==n2)
		{
			System.out.println("Equal");
		}
	}
}
/*import java.util.*;
public class Solution {
    public static String compareIfElse(int a, int b) 
    {
        if(a>b)
        {
            System.out.println("greater");
        }
        else if(a==b)
        {
            System.out.println("eqaul");
        }
        else
        {
            System.out.println("smaller");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        compareIfElse(a, b);
    }
}*/
