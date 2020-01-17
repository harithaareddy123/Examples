package lists;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		// List<Integer> list = (List<Integer>) new ArrayListEx();

		boolean isAdded = list.add(5);
		System.out.println("is added: " + isAdded);
		list.add(7);
		list.add(9);
		list.add(3);
		list.add(6);
		list.add(8);

		Object o = list.get(0);
		int firstElement = (int) o;
		// int firstElement = list.get(0);
		System.out.println("first element is  " + firstElement);
		System.out.println("the list is:");
		ArrayListEx ex = new ArrayListEx();
		ex.print(list);
		list.remove(1);
		System.out.println("element is removed and the list is:");
		ex.print(list);
		Object object = 3;
		list.remove(object);
		System.out.println("object is removed and the list is:");
		ex.print(list);

	}

	public void sort(List list) {
		IntegerComparator Comparator = new IntegerComparator();
		list.sort(Comparator);
	}

	public void print(List list) {
		for (Object e : list) {
			int num = (int) e;
			System.out.println(num);
		}
	}

}
