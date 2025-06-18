package edu_package;
import java.util.*;
import java.util.StringJoiner;
public class Array_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String ab=("Hello");//String literal
		System.out.println(ab);
		String pr=new String("Inline");//using new keyword
		System.out.println(8);
		System.out.println(8 >> 2);
		System.out.println(8 << 2);
		System.out.println(-1>>> 2);
		System.out.println(6>2);
		String a[][]= {{"123","456"},{"1","2"}};
		String b[][]=a.clone();
		System.out.println("damn"+Arrays.toString(a));
		System.out.println("damn"+Arrays.toString(b));
		System.out.println(a);
		String name="BHupesh S Patel";
		int []arr= {1,2,3,4,5};
		for(int i=0;i<5;++i) {
			System.out.println(" no "+(i+1)+ " " +arr[i]);
		}
	}

}
