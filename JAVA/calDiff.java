import java.util.*;
public class calDiff {
	int calculateDifference(int num)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=num;i++)
		{
			sum1+=i*i;
			sum2+=i;
		}
		int diff= sum1 -(sum2*sum2);
		return diff;
	}
	public static void main(String[] args) {
		calDiff cd= new calDiff();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num: ");
		int n= sc.nextInt();
		System.out.println("Diff. no.s : "+cd.calculateDifference(n));
		sc.close();
	}
}