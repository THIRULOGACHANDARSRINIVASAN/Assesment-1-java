import java.util.*;
class checkprime
{
		public static void main(String[]SK)
		{
		int n,i,c=0;
		Scanner K=new Scanner(System.in);
		System.out.println("enter any number to check");
		n=K.nextInt();
		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{	
		c++;
		break;
		}
		}
		if(c==0&&n!=1)
		{
		System.out.println("the given number is a prime number");
		}
		else
		{
		System.out.println("the given number is not a prime number");
		}
		}
}
