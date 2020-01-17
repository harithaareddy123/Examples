package haritha;

public class Employeemain {
	public static void main(String[] args) {
		Employee[] store=new Employee[5];
		
			store[0]=new Employee(1," ram", 2000);
			store[1]=new Employee(2,"haritha",4000);
			Manager m1=new Manager(3,"tarun",6000);
			
			store[2]=m1;
			store[3]=new Employee(4," krish", 3400);
			store[4]=new Employee(5,"sam",3000);
			
		m1.addManagedEmployees(store[0]);
		m1.addManagedEmployees(store[4]);
		
		Employeemain m=new Employeemain();
		m.print(store);
		}	
	public void print(Employee[] employees) {
		for(Employee e: employees) {
			System.out.println(e.getName()+e.getSalary());
			boolean isManager=e instanceof Manager;
			if(isManager) {
				Manager m=(Manager) e;
				System.out.println("managed employees");
				Employee[] ManagedEmployees=m.getManagedEmployees();
				for(Employee Managed :ManagedEmployees)
				{
					if(Managed!=null)
					{
						System.out.println(Managed.getName()+" "+Managed.getSalary());
					}
				}
			}
			
		}
		
	}

}
