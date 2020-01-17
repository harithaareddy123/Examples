package haritha;
import java.util.*;

public class SetEx {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"haritha",3000);
		Employee e2=new Employee(2,"ram",3400);
		Employee e3=new Employee(3,"krishna",9000);
		Employee e4=new Employee(4,"ramana",8400);
		boolean same=e1==e2;
		System.out.println("e1and e2 are same: "+same);
		boolean equals=e1.equals(e2);
		System.out.println("e1 equals e2 :"+equals);
		
		
		Set set=new LinkedHashSet();//creating a linked hashset(composite type)
		
		boolean added=set.add(e1);//returns true if the element is added
		System.out.println("element is added: "+added);
		set.add(e2);//adding into hashset
		set.add(e3);
		set.add(e4);
		int size=set.size();//size of set
		System.out.println("size:"+size);
		boolean contains=set.contains(e2);//checking for the presence of e2
		System.out.println("set contains e2: "+contains);
		System.out.println("\n");
		SetEx ex=new SetEx();
		ex.print(set);
        boolean removed=set.remove(e2);//removing e2
        System.out.println("element is removed"+removed);
        System.out.println("\n");
        System.out.println("removed element is:"+e2.getName());
        System.out.println("the remaining set is");
        ex.print(set);
        
	}
	
	//print method
	public void print(Set set) {
		for(Object o:set) {
			Employee e=(Employee)o;
			System.out.println(e.getId()+" "+e.getName());
		}
	}

}
