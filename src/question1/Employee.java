package question1;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String  name;
	private String  address;
	
	
	public Employee() {}


	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	public int compareTo(Employee o) {
		String nam1=this.name;
		String nam2=o.name;
		if(nam1.compareTo(nam2)>0)
			return 1;
		else if(nam1.compareTo(nam2)<0)
			return -1;
		
		return 0;
	}


		
	
			

}
