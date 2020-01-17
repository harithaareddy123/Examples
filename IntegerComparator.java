package lists;
import java.util.*;
public class IntegerComparator implements Comparator {

//public class IntegerComparator implements Comparator<Integer> {// (generics type)

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
	//public int compare(Integer num1, Integer num2) {//(remove casting for generics)
		int num1=(int)o1;
		int num2=(int)o2;
		if(num1>num2) {
			return 1;
		
		}
		if(num1<num2) {
			return -1;
			
		}
		return 0;

}
}
