package step1;
import java.util.*;
public class takinginput
{
	    
	    public static void main(String[] args)
	     {
	        int res;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the character:");
	        char ch=sc.next().charAt(0);
	        if(ch>='A'&&ch<='Z')
	        {
	            res=1;
	        }
	        else if(ch>='a'||ch<='z')
	        {
	            res=0;
	        }
	        else
	        {
	            res=-1;
	        }
	        System.out.println("Output:"+res);
	}
}
