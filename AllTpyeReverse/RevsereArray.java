package AllTpyeReverse;

public class RevsereArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int mid=a.length/2;
		int end=a.length-1;
		
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
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
