import java.util.Scanner;

public class gcd {

	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers for gcd");
		int a= in.nextInt();
		int b= in.nextInt();
		
		 int h =hcf(a,b);
		System.out.println(h);
	
	}
	
	public static int hcf(int a, int b){
		
		if(a==0)
		 return b;
		else
			return hcf(b%a,a);
	}
}
