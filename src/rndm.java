import java.util.Random;


public class rndm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdmd = new Random();
		//int num;
		int i = 0;
		
		while (i<=5) {
			i++;
			
			int num = rdmd.nextInt(12);
			System.out.println(num);
			
		}

	}

}
