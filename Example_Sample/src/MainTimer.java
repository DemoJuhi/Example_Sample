import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;

public class MainTimer {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		Employee e=new Employee(1,"a","testing");
		Employee e1=new Employee(2,"b","development");
		Employee e2=new Employee(3,"c","data mgmt");
		Employee e3=new Employee(4,"d","data masking");
		Employee e4=new Employee(5,"e","devops");
		Employee e5=new Employee(6,"f","uat");
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		List<String> list2=list.stream().map(e6->e6.getEmpname()).collect(Collectors.toList());
		System.out.println(list2);
		
		/*Timer timer=new Timer();
		Helper help=new Helper();
		
		
		SimpleDateFormat format=new SimpleDateFormat();
		
		
		
		//Date date=new Date();
		//System.out.println(date.getHours());
		
		//System.out.println(c);
		
		//System.out.println(format.format(date));
		//System.out.println(date.
		//timer.schedule(help, new Date());
		//timer.scheduleAtFixedRate(help, null, 0);*/
		

	}

}
