package trailcodes;

public class NormalAndStaticMethodDifferece {

	public void normalFunction() {
		System.out.println("You have called normal function.");
	}
	public static void staticFunction() {
		System.out.println("You have called a static function.");
	}
	public static void main(String[] args) {
		// normal function can only be called by creating a object
		NormalAndStaticMethodDifferece normalFunctionCall = new NormalAndStaticMethodDifferece();
		normalFunctionCall.normalFunction();
		System.out.println("------------------------");
		//static functions can be called directly
		staticFunction();
	}

}
