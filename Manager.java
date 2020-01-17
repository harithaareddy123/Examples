package haritha;

public class Manager extends Employee {
	public int i;
	private Employee ManagedEmployees[]=new Employee[2];
	public Employee[] getManagedEmployees() {
	return ManagedEmployees;
	}
	public Manager(int id,String name,double salary) {
	super( id,name,salary);
	}
	public void addManagedEmployees(Employee e) {
		ManagedEmployees[i]=e;
		i++;
	}

}
