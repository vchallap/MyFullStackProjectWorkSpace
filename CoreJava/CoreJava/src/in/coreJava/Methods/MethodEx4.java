package in.coreJava.Methods;

import java.util.Arrays;

public class MethodEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40 };
		print(arr);
	}

	static void print(int[] arr) {
		String str = Arrays.toString(arr);
		System.out.println(str);
	}

}
