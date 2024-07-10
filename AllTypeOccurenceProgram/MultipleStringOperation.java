package AllTypeOccurenceProgram;

public class MultipleStringOperation {
	public void ReverseString(String x)
	{
//		char a[]=s.toCharArray();
//		int mid=a.length/2;
//		int end=a.length-1;
//		
//		for(int i=0;i<mid;i++)
//		{
//			char temp=a[i];
//			a[i]=a[end];
//			a[end]=temp;
//			end--;			
//		}
//		System.out.println("Reverse String is:");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.printf(""+a[i]);
//		}
		
		String rev=" ";
		char c[]=x.toCharArray();
		int len=c.length-1;
		
		for(int i=len;i>=0;i--)
		{
			
			rev=rev+c[i];
		}	 
		System.out.println("1 Reverse String is:"+rev);	
		
		
		String[] words = x.split(" ");
		String r="";
		for(int i=0;i<words.length;i++)
		{
			r=r+words[i];
		}
		System.out.println("2 Remove space String is:"+r);
		
		
		String s1="a";
		boolean b=x.endsWith(s1);
		System.out.println("endwith------"+b);
	}
	public void reverseEachWordOfString(String x)
	{
		 String[] words = x.split(" ");
         
	        String reverseString ="";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord ="";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseString = reverseString + reverseWord +" ";
	        }        
		System.out.println("2 Reverse String is:"+reverseString);
	}
	void reversePositionOfWords(String x)
	{
		 String[] words = x.split(" ");
         
	        String reverseString ="";
	         
	        for (int i= words.length-1; i>=0; i--) 
	        {
	            String word = words[i];
	            reverseString =reverseString+word+" ";
	        }
	        System.out.println("3 reverse string:"+reverseString);
	     
	}
	void capitalN(String x)
	{
		 String[] words = x.split(" ");
		 String reverseString = "";
         
	        for (int i= words.length-1; i>=0; i--) 
	        {
	            String word = words[i];
	            reverseString =reverseString+word+" ";
	        }
         StringBuffer str=new StringBuffer(reverseString);
        
		 str.replace(1,3,"ND");
		 
		
		 System.out.println("4 Reverse string:"+str);
	}
	void deletechar(String x,int index,int a)//(string x.int start ,int end;
	{
		StringBuffer str=new StringBuffer(x);
		str.delete(a, index);
		int len=x.length();
		System.out.println("5 reverse string:"+len);
		System.out.println("5 reverse string:"+str);
		
	}
	public static void main(String[] args)
	{
		MultipleStringOperation mo=new MultipleStringOperation();
		mo.ReverseString("i Am Ajinkya");
		mo.reverseEachWordOfString("i Am Ajinkya");
		mo.reversePositionOfWords("I am Indian");
		mo.capitalN("I am Indian");
		mo.deletechar("I Am Indian", 10, 7);
	}

}
