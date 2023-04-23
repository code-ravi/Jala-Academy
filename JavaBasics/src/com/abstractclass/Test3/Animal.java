//3. Create an instance for the child class in child class and call abstract methods

/*Answer: It's mandatory to provide implementation in child class for abstract method, 
then it can child's object. At runtime, JVM will binds up functionality with child. */
package com.abstractclass.Test3;

abstract class Animal {
	abstract void eats();
}
