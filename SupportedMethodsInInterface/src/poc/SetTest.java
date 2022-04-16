package poc;
import java.util.HashSet;
import java.util.Set;

public class SetTest implements Parent, Parent2{

	public static void main(String[] args) {

		Parent parent = new SetTest();

		parent.hello();
		
		parent.myDefaultMethod();
				
		
	}

	@Override
	public void hello() {
		System.out.println("Hello implemented in class for abstract method");
		
	}
	
	
}
