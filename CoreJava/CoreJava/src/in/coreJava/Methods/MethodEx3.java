package in.coreJava.Methods;

import java.util.Arrays;

public class MethodEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx3 m3 = new MethodEx3();
		int[] arr = { 10, 20, 30, 40 };
		m3.print(arr);

	}

	void print(int[] arr) {
		String str = Arrays.toString(arr);
		System.out.println(str);
	}

}
