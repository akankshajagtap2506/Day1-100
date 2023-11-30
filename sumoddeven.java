package step1;
import java.util.Scanner;
public class  sumoddeven{
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];
        int sodd = 0;
        int seven = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) 
            {
                seven += num[i];
            } 
            else 
            {
                sodd += num[i];
            }
        }

        System.out.print(seven+" "+sodd);
       
    }
}
