import java.util.*;
class PALINDROME
{
	public static void main(String[]SK)
	{
		int length,j;
		String i, reverse="";
		Scanner STR=new Scanner(System.in);
		System.out.println("Enter any string to check for palindrome:");
		i=STR.nextLine();
		System.out.println("The given string is:"+i);
		length=i.length();
		for(j=length-1;j>=0;j--)
		{
			reverse=reverse+i.charAt(j);
		}
		if(i.equals(reverse))
		{
		System.out.println("The given string "+i+" is a palindrome");
		}
		else
		{
		System.out.println("The given string "+i+" is not a palindrome");
		}
	}
}