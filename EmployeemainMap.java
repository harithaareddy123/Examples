package haritha;
import java.util.*;

import Exception.IncorrectidException;

public class EmployeemainMap {
	
		public static void main(String[] args) {
			EmployeemainMap ui=new EmployeemainMap();
			ui.execute();
		}
		
		Map<Integer,Employee>store=new HashMap<>();
		public void execute() {
		
			try {
				Employee e1=new Employee(-1," ram", 2000);
				//store.put(1,e1);
				addemployee(e1);

				Employee e2=new Employee(2,"haritha",4000);
				//store.put(2,e2);
				addemployee(e2);
				Manager m1=new Manager(3,"tarun",6000);
				//store.put(3,m1);
				addemployee(m1);
				Employee e3=new Employee(4,"krish",4400);
				//store.put(4,e3);
				addemployee(e3);
				m1.addManagedEmployees(e2);
				m1.addManagedEmployees(e1);
				print();
				Employee fetched=findById(2);
				System.out.println("Name has been fetched from the above id is:");
				System.out.println(fetched.getName());
			}catch(IncorrectidException e)
			{
				System.out.println("Incorrect Id");
			}
				
				
		}	
		public void addemployee(Employee e) {
			int id=e.getId();
			if(id<0) {
				throw new IncorrectidException("id is negative");
			}
			store.put(id, e);
		}
				
			
			public Employee findById(int id){
				Employee e=store.get(id);
				return e;
			}
			
			
			
		
		public void print() {
			Set<Integer> keys=store.keySet();
			for(Integer id: keys) {
				Employee e=store.get(id);
				System.out.println(e.getName()+"      "+e.getSalary());
				boolean isManager=e instanceof Manager;
				
				if(isManager) {
					System.out.println("Manager is " +e.getName());
					Manager m=(Manager) e;
					System.out.println("managed employees");
					Employee[] ManagedEmployees=m.getManagedEmployees();
					for(Employee Managed :ManagedEmployees)
					{
						if(Managed!=null)
						{
							System.out.println(Managed.getName()+"      "+Managed.getSalary());
						}
					}
				}
				
			}
		}
}
			
		

	


