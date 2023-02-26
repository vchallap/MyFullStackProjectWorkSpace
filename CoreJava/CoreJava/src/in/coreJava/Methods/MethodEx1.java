package in.coreJava.Methods;

import java.util.Arrays;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MethodEx1 mex1=new MethodEx1();
		int[] arr = {1,2,3,4};
		mex1.print(arr);
		
		mex1.personname("Venkatesh", "Challapalli");
		
		mex1.add(10,20);
		
	}
	
	String personname(String fanme,String lname)
	{
		
		String s1=fanme +  lname;
		System.out.println(s1 );
		return s1;
	}
	void print(int [] arr)
	{
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
	}
	
	 void add(int a, int b)
	{
		 int c=a+b;
		System.out.println(c);
		
	}
	 
	
	 
	 

}
