package haritha;

import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		Map<Integer,Employee>map=new HashMap<>();
		Employee e1=new Employee(1,"haritha",2000);
		Employee e2=new Employee(2,"ram",2500);
		Employee e3=new Employee(3,"harshini",2000);
		Employee e4=new Employee(4,"sam",2500);
		map.put(1,e1);
		map.put(2,e2);
		map.put(3,e3);
		map.put(4,e4);
		//Employee fetched1=map.get(1);
		//Employee fetched2=map.get(2);
		MapEx ex=new MapEx();
		System.out.println("by keys");
		
		ex.printBykeys(map);
		System.out.println("by entries");
		ex.printByEntries(map);
		System.out.println("by values");
		ex.printByValues(map);
		map.remove(1);
		System.out.println("removed");
		System.out.println("by keys");
		ex.printBykeys(map);
		System.out.println("by entries");
		ex.printByEntries(map);
		System.out.println("by values");
		ex.printByValues(map);
		
	}
	public void printByEntries(Map<Integer,Employee>map) {
		Set<Map.Entry<Integer,Employee>>entries=map.entrySet();
		for(Map.Entry<Integer,Employee>entry:entries) {
		int key=entry.getKey();
		Employee value=entry.getValue();
		System.out.println(value.getName());
		}
		
	}
	public void printByValues(Map<Integer,Employee>map) {
		Collection<Employee>values=map.values();
		for(Employee e:values)
			System.out.println(e.getName());
		
	}
	public void printBykeys(Map<Integer,Employee>map) {
		Set<Integer> keys=map.keySet();
		for(int key:keys)
		{
			Employee value=map.get(key);
			System.out.println(value.getName());
			
		}
	}

}
