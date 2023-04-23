/*Part of Ques 3: Also, Access the PROTECTED fields and methods from child class located in a different package.
Access the PROTECTED fields and methods from any class in different package */

/*Answer: The protected access modifier is accessible within the package. We can not access it outside the class directly. 
However, it can also accessible outside the package but through inheritance only.  */

package com.accessmodifiers.Test2;

public class ChildForStudentInTest3 extends com.accessmodifiers.Test3.Student {
	public static void main(String[] args) {
		ChildForStudentInTest3 obj = new ChildForStudentInTest3();

		System.out.println("a= " + obj.a);
		System.out.println("b= " + obj.b);
		obj.getSum();

	}

}
