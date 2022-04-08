import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ListtoMap {

	public static void main(String[] args) {
		Employee e=new Employee(1,"abc","dev");
		Employee e1=new Employee(2,"def","test");
		Employee e2=new Employee(3,"ghi","tdm");
		Employee e3=new Employee(4,"jkl","support");
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Map<Integer, Employee> map=list.stream().collect(Collectors.toMap((e7->e7.getEmpid()),em->em));
		//map.forEach((k,v)->System.out.println(k+" "+v));
		
		Iterator<Entry<Integer, Employee>> iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, Employee> entry=iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		
		
		

	}

	
}
