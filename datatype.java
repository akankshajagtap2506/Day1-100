package step1;
import java.util.*;
public class datatype 
{
	public static void main(String[]args)
	{
		System.out.println("Enter");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
			case "Integer":
				System.out.println("4");
				break;
			case "Long":
				System.out.println("8");
				break;
			case "Float":
				System.out.println("4");
				break;
			case "Double":
				System.out.println("8");
				break;
			case "Character":
				System.out.println("1");
				break;
			default:
				System.out.println("No match found");
		}
	}
	
}
