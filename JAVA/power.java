import java.util.Scanner;

public class power {
	public static boolean checkNumber(int n)
	{
		int i=0;
		boolean flag=true;
		while(flag)
		{
			if(n==Math.pow(2,i))
			{
				
				return true;
			}
			else
			{
				
				if(n>Math.pow(2,i))
				{
					
					i++;
				}
				else{
					
					flag=false;
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num: ");
		n=scan.nextInt();
		boolean flag=checkNumber(n);
		if(flag)
		{
			System.out.println("The number is a power of 2");
			
		}
		else
			System.out.println("The number is not a power of 2 ");
	}

}