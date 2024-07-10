package AllTypeOccurenceProgram;

import java.util.HashMap;

public class CollectionOcuurence {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 2, 1, 3, 4, 5, 4};
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
        	int key=a[i];
        	if(hm.containsKey(key))
        	{
        		hm.put(key,hm.get(key)+1);
        	}
        	else
        	{
        		hm.put(key, 1);
        	}
        }
        
        for(Integer key:hm.keySet())
        {
        	System.out.println(key+"="+hm.get(key));
        }
  
    }
}
