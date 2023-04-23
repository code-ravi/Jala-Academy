//4. Write a program to print the odd and even numbers.
package com.loops;

public class Four {

	public static void main(String[] args) {
		
		//printing even numbers
		System.out.print("Even Numbers: ");
		for(int i=1; i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		//printing odd numbers
		System.out.print("\nOdd Numbers: ");
		for(int j=1; j<=20;j++) {
			if(j%2 !=0) {
				System.out.print(j+" ");
			}
		}
	}

}
