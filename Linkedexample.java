package lists;

import java.util.*;


public class Linkedexample {
	public static void main(String[] args) {
		List list=new LinkedList();
		//defining the list as a linked type
		//List<Integer> list=new Linkedexample<>();//generic
		list.add(1);//adding the elements into the list
		list.add(2);
		list.add(3);
       list.add(4);
Object o=list.get(0);//return type will be object
int firstElement=(int)o;//casting the object to int type
       
System.out.println(firstElement);
 Linkedexample ex=new Linkedexample();
ex.print(list);
list.remove(1);//removing the element of index 1
Object object=3;
list.remove(object);//removing the object 3
ex.print(list);

	}
	//defining the print method
	public void print(List list) {
		for(Object e:list) {
			int num=(int)e;
			System.out.println(num);
		}
	}

}



