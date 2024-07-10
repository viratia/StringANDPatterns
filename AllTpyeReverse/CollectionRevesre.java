package AllTpyeReverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionRevesre {

	public static void main(String[] args) {

		String s="Hello,Hello";
		List <Character> list=new ArrayList<Character>();
		
		for(char c:s.toCharArray())
		{
			list.add(c);
		}
		Collections.reverse(list);
		
		StringBuilder sb=new StringBuilder(list.size());
		for(char c:list)
		{
			sb.append(c);
		}
		System.out.println("Reverse String is:"+sb.toString());
	}

}
