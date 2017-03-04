/*Create a program to display the use of Static Variables and Methods in java */
/*creating class*/
public class Static1 {
	/* instance variable*/
	int x; 
	/* static variable*/
	static int y;
	/*instance method*/
	public void fun1() { 
		
	}
	/*static method*/
	public static void fun2(){ 
		y=5;
		
	}
	/* static inner class*/
	static class Test{
		/*static  variable*/
		public static  String country="india"; 
		
	}
	/* main method*/
	public static void main(String[] args) { 
		/* creating object*/
		Static1 mj=new Static1(); 
		System.out.println(mj.x=4);
		 /*calling static variable*/
		System.out.println(Static1.y=5);
		/*calling static method*/
		 Static1.fun2();
		/* output*/
        System.out.println(Static1.Test.country);
	}

}
