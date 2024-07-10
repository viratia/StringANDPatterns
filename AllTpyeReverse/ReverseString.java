package AllTpyeReverse;

public class ReverseString {

	public static void main(String[] args) {

		String s="Hello,Hello";
		char a[]=s.toCharArray();
		int mid=a.length/2;
		int end=a.length-1;
		
		for(int i=0;i<mid;i++)
		{
			char temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;			
		}
		System.out.println("Reverse Array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
