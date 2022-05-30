package Day1;

class A {
	private int data = 40;

	private void msg() {
		System.out.println("Hello java");
	}
}

class B {
	private B() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}

}

class C {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class Simple extends C {
	public static void main(String args[]) {
//		void msg(){
//			System.out.println("Hello java");
//			}
		A obj = new A();
		 Simple obj1=new Simple();  
		   //obj.msg();  
		//B obj1 = new B();
		// System.out.println(obj.data);// Compile Time Error
		// obj.msg();// Compile Time Error
	}
}

//++++++++++++++++++++++++++++++++++++++++++
