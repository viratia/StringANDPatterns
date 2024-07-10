package AllTypeOccurenceProgram;

import java.util.Scanner;

public class occurenceString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		boolean flag;
		s1.trim();
		char ch[]=s1.toCharArray();	
		for(int i=0;i<ch.length;i++)
		{	int count=1;
			flag=true;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])//                     && i!=j
				{
					count++;
				}
			}
			for(int k=0;k<i;k++)
			{
				if(ch[i]==ch[k])
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println(ch[i]+"----->"+count);
			}
		}
	}
}
