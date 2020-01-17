package haritha;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExGenerics {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"haritha",3000);
		Employee e2=new Employee(2,"ram",3400);
		Employee e3=new Employee(3,"krishna",9000);
		Employee e4=new Employee(4,"ramana",8400);
		boolean equals=e1.equals(e2);
		Set<Employee> set=new LinkedHashSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		ExGenerics ex=new ExGenerics();
		ex.print(set);
	}
	//print method
		public void print(Set <Employee>set) {
			for(Employee e:set) {
				
				System.out.println(e.getName());
			}
		}
}
