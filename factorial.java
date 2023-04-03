import java.util.*;
class factorial
{
	public static void main(String[]SR)
	{
	int x,fact=1,i;
	Scanner SK=new Scanner(System.in);
	System.out.print("Enter the number to get factorial of the number:");
	x=SK.nextInt();
	for(i=1;i<=x;i++)
	{
		fact=fact*i;
	}
	System.out.print("The factorial of the number "+i+" is"+fact);
	}
}