package AllTypeOccurenceProgram;

public class ArrayOccurence {

	public static void main(String[] args) {
		int a[]= {10,20,20,30,40,50,5,60,60,60,60};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}	
		int array[]=new int[max+1];
		for(int i=0;i<a.length;i++)
		{
			array[a[i]]++;
		}
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>0)
			{
				System.out.println(i+"="+array[i]);
//				System.out.println(i + " occurs " + array[i] + " times");
			}
		}
		
	}

}

