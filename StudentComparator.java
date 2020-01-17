package haritha;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1,Student o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		if(o1.getId()<o2.getId()) {
			return -1;
		}
		return 0;
	}
	

}

	
	

