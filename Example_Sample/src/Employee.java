
public class Employee {
	
	private Integer empid;
	private String empname;
	private String empdept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String empname, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + "]";
	}
	

}
