//3. Apply private, public, protected and default access modifiers to the constructor
/*Answer: access modifiers does not play a role in overloading, hence if we define multiple constructor with different
access modifiers to same method/constructor, it will lead to error in program. */
package com.constructors;

public class Test3 {
	private Test3() {
		System.out.println("I'm constructor with PRIVATE access modifier");
	}

	public Test3() {
		System.out.println("I'm constructor with PUBLIC access modifier");
	}

	protected Test3() {
		System.out.println("I'm constructor with PROTECTED access modifier");
	}

	Test3() {
		System.out.println("I'm constructor with DEFAULT access modifier");
	}

	public static void main(String[] args) {
		Test3 ob = new Test3();
	}

}
