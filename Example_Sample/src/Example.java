import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;

public class Example {

	public static void main(String[] args) {
		//String s ="teeter";
		CountDownLatch countdown=new CountDownLatch(1);
		Thread11 t=new Thread11(countdown,"A");
		Thread11 t1=new Thread11(countdown,"B");
		Thread11 t2=new Thread11(countdown,"C");
		
		Thread tt=new Thread(t);
		tt.start();
		
		Thread tt1=new Thread(t1);
		tt1.start();
		
		Thread tt2=new Thread(t2);
		tt2.start();
		
		try {
			countdown.await();
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		System.out.println("this is the main thread");
		
		/*int count=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			//if(!(map.containsKey(s.charAt(i))))
			//{
				map.put(s.charAt(i), count+1);
			//}
			
		}
		
		Iterator<Map.Entry<Character, Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			/*Entry<Character, Integer> entry=itr.next();
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}*/
			
				
		

	}

}
