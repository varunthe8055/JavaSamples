import java.util.Scanner;

public class prmenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int pr = s.nextInt();
		long startTime = System.currentTimeMillis();
		boolean isPrime = true;
		for(int i=2;i<pr;i++){
			if(pr%i==0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("true");
		}else{
			System.out.println("false");
		}


		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime-startTime);
		s.close();
	}
}
