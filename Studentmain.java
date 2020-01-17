package haritha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Studentmain {
	 

	public static void main(String[] args) {
		
		Studentmain m=new Studentmain();
		m.execute();
	}
	Map<Integer,Student>store=new HashMap<>();
	public void execute() {
		Student e1=new Student(1,"ram");
		store.put(1,e1);
		Student e2=new Student(2,"ram");
		store.put(2,e2);
	
	}
	public void print() {
		Set<Integer> keys=store.keySet();
		for(Integer id: keys) {
		Student e=store.get(id);
       }
	}
}