package haritha;
import java.util.*;
public class calculator {
	


	public static void main(String[]args){
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	a=sc.nextInt();
	System.out.println("enter second number");
	b=sc.nextInt();
	sc.close();
	sum=a+b;
	System.out.println("sum of these numbers: "+sum);
	}
}
