package AllTypeOccurenceProgram;

public class firstNonRepeatingChar {

	public static void main(String[] args) 
	{
		firstNonRepeatingChar fs=new firstNonRepeatingChar();
		String s="leetclode";
		char res=fs.firstrepeated(s);
		System.out.println("First repeted element is:"+res);
	}

	public char firstrepeated(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			boolean flag=false;	
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(j)==ch)
				{
					flag=true;
					break;
					
				}
			}
			if(!flag)
			{
				 return ch;
			}
		}
		return 0;	
	}

}