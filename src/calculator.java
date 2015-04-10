import java.util.Scanner;

public class calculator {
	public static void main (String[] args){
		Scanner sum = new Scanner(System.in);
		double fnum = 0, total;
		int snum = 0;	
		System.out.println("enter 1st number:");
		fnum =sum.nextDouble();
		System.out.println("enter 2nd number:");
		snum = sum.nextInt();
		total = fnum + snum;	
		
		System.out.println(total);
		sum.close();	
	}

}
