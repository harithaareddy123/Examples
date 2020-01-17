
package Exception;

import haritha.Employee;

public class ExceptionEx 
{
	
	private Employee employee;
	public static void main(String[] args)
{
	ExceptionEx ex=new ExceptionEx();
	try 
	{
		ex.execute();
	}catch(Exception e) 
	{
		System.out.println("id was incorrect");
	}
    catch(Throwable e)
	{
		System.out.println("Exception Handler");
	}
    finally 
    {
    	System.out.print("always get executed");
    }
	System.out.println("after execution");
}
public void execute() throws Exception
{

	if(employee.getId()<0) {
		RuntimeException exception=new IncorrectidException("wrong");
}
	
	
	
}

}

