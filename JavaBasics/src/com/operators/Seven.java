//7. Print the smaller and larger number
package com.operators;

public class Seven {
	
	public static void main(String[] args) {
		int a=10, b=20, c=5;
		
		if(a>b && a>c) {
			System.out.println("Largest Number is: "+ a);
			System.out.println("Smallest Number is: "+ ((b<c)? b:c));
		}else if(b>a && b>c) {
			System.out.println("Largest Number is: "+ b);
			System.out.println("Smallest Number is: "+ ((a<c)? a:c));
		} else{
			System.out.println("Largest Number is: "+ c);
			System.out.println("Smallest Number is: "+ ((a<b)? a:b));
		} 

	}

}
