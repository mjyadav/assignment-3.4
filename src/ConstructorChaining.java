/*  Create a program to demonstrate Constructor Chaining. */
public class ConstructorChaining {
	/* main method*/
	public static void main(String args[]) {
		/* creating object*/
		Derived sub = new Derived("Test");
	}
}

/*creating class*/
class Base {
	/* variable declare*/
	protected String name;

	/* constructor creating*/
	public Base() {
		/* calling one argument constructor of same class*/
		this("");
		System.out.println("Inside no argument constructor of Base class"); // output
	}

	public Base(String name) {
		this.name = name;
		System.out.println("One arg constructor of Base class");
	}
}

/*derived class*/
class Derived extends Base {
	/*constructor creating*/
	public Derived() {
		System.err.println("Inside no argument constructor of Derived class");
	}

	public Derived(String name) {
		/* calling one argument constructor of super class */
		super(name);
		System.out.println("Inside one arg constructor from Derived class");// output
	}

}