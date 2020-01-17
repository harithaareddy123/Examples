package haritha;

public class calcmain {
	public static void main(String[]args){
		calc c=new calc();
		int result=c.add(10, 30);
		System.out.println(result);
		float fresult=c.add(12.5f, 17.9f);
		System.out.println(fresult);
		
		String stringResult=c.add("hel","lo");
		System.out.println(stringResult);
	}
}
