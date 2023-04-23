//5. Try to call the constructor multiple times with the same object
/*Answer: We can not call the constructor of an object multiple times with the same object. When we create an object using the new keyword, 
the constructor is called once to initialize the object's state, and we cannot call it again for the same object*/
package com.constructors;

public class Test5 {
	Test5() {
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		Test5 ob = new Test5();
//		ob.Test5();
	}

}
