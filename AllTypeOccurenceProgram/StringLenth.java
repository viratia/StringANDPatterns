package AllTypeOccurenceProgram;

import java.util.Scanner;

public class StringLenth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s1=sc.nextLine();
        String s2=s1.replaceAll("", "");
        System.out.println(s2+""+s2.length());
	}

}
