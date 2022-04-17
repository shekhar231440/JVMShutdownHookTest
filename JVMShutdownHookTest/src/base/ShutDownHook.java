package base;

public class ShutDownHook
{
public static void main(String[] args) throws InterruptedException
{

	Runtime.getRuntime().addShutdownHook(new Thread() {
		
		 public synchronized void run() {
			System.out.println("Shutdown hook is being executed at the last .. just before JVM shutdown");
		}
	});
	
	for(int i=0; i<10; i++) {
		
		System.out.println(i +"* 2 = "+ i*2 );
		
		Thread.sleep(3000);
	}
	
	System.out.println("calling System.exit()...");
	System.exit(0);
	
	System.out.println("after calling System.exit()...");
}
}
