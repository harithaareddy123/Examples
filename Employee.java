package haritha;
import java.lang.*;

public class Employee {
	
	public Employee(int id ,String name,double salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;

	}
	private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
		//col. employee e1=new col.employee(10);
		//col.employee e2=e1;
		//boolean result=e1.equals(e2);
		if(obj==this) {
			return true;
			}
		//col.employee e1=new col.employee(10);
				//col.employee e2=null;
				//boolean result=e1.equals(e2);
		//col.employee e1=new col.employee(10);
		//string e2="10";
		//boolean result=e1.equals(e2);
		if(obj==null||!(obj instanceof Employee))
		{
			return false;
		}
		
		//col.employee e1=new col.employee(10);
		//col.employee e2=new col.employee(10);
		//boolean result=e1.equals(e2);
		Employee e=(Employee)obj;
		return e.id==this.id;
	}
}