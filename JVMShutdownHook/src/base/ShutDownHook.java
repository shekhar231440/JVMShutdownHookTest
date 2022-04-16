package base;

public class ShutDownHook
{
public static void main(String[] args)
{

	Runtime.getRuntime().addShutdownHook(new Thread() {
		
		 public void run() {
			System.out.println("Shutdown hook is being executed at the last .. just before JVM shutdown");
		}
	});
	
	
	System.out.println("calling System.exit()...");
	
	System.exit(0);
	
	System.out.println("after calling System.exit()...");
}
}
