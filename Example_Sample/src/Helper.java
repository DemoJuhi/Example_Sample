import java.util.Timer;
import java.util.TimerTask;

public class Helper extends TimerTask {
	int i=0;
	@Override
	public void run() {
		System.out.println("This is the value of i " +i);
		i++;
		
	}

}
