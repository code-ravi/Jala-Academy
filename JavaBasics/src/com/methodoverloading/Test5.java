//5. Write two methods with the same name, number of parameters and data type but different return Type
//Answer: Return type does not affect overloading but we can not keep same number of parameters and data type
package com.methodoverloading;

public class Test5 {
	static int getSum(int a, int b) {
		return a + b;
	}

	static String getSum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(getSum(10, 15));
		System.out.println(getSum(25, 35));
	}

}
