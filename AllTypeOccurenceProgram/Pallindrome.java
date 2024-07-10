package AllTypeOccurenceProgram;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		boolean flag=true;
		
		int j=str.length()-1;
		char ch[]=str.toCharArray();
		for(int i=0;i<j;i++)
		{
			if(ch[i]!=ch[j])
			{
				flag=false;
			}
			j--;
		}
		if(flag)
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
		{
			
		}

	}

}
