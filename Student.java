package haritha;

public class Student {
  private int id;
private String Name;



public  Student(int id,String Name) {
	  this.id=id;
	  this.Name=Name;
	  
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
Student e1=new Student(1,"ram");
Student e2=new Student(2,"seethu");


@Override
public boolean equals(Object obj)
{
	if(obj==this) {
		return true;
	}
		if(obj==null||!(obj instanceof Student))
		{
			return false;
		}
		Student e=(Student)obj;
		return e.id==this.id;
		}
public void hashCode(Object obj)
{
	if(e1.hashCode()==e2.hashCode())
	{
		if(e1.equals(e2))
			System.out.println("both objects are equal");
		else
			System.out.println("both objects are different");
	}
	else
		System.out.println("both objects are not equal");
	
	
			
		
	}
}

