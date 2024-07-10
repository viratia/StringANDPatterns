package AllTypeOccurenceProgram;
import java.util.*;
public class StringOccurence {

	public static void main(String[] args) {
		
		Scanner xyz=new Scanner (System.in);
		String s="AbcCdfhdrt";
		String str=s.toLowerCase();
		System.out.println("Original String is:");
		System.out.println(str);	
		int ch[]=new int[256];
		for(char c:str.toCharArray())
		{
			ch[c]++;
		}
		
		for(int i=0;i<256;i++)
		{
			if(ch[i]==1)
			{
				System.out.println((char)i+"="+ch[i]);
			}
			if(ch[i]>1)
			{
				System.out.println((char)i+"="+ch[i]);
			}
		}
	}
}
