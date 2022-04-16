package poc;

public interface Parent {
	
	public void hello();
	
	default public void myDefaultMethod() {
		
		System.out.println("inside default method");
		
		myStaticWork();
		myPrivateWork();
		
	}
	
	public static void myStaticWork() {
		System.out.println("inside static method");
	}
	
	private void myPrivateWork() {
		System.out.println("inside private method");
		
		myStaticWork();
	}

}
