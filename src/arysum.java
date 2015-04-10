
public class arysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumary[] = {24, 35, 42, 67, 34, 56, 79};
		int sum =0;
		//int avg= 0;
		
		for (int i = 0; i < sumary.length; i++) {
			sum+=sumary[i];
			
		}
		System.out.println(sum/sumary.length);
		
		

	}

}
