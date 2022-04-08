import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 implements Sample1,Sample2 {

	public static void main(String[] args) {
		
		Example1 ex=new Example1();
		ex.test();
		//ExecutorService exec=Executors.newFixedThreadPool(4);
		
		
		
		

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Sample1.super.test();
		//Sample2.super.test();
	}

}
