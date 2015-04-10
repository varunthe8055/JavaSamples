import java.util.Random;


public class randmary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random dice = new Random();
		System.out.println("no"+" "+"output");
		int dceply[] = new int[6] ;
		
		for (int i = 0; i < 100; i++) {
			 ++dceply[dice.nextInt(6)] ;
			
		}
		
		for (int il = 0; il < 6; il++) {
			System.out.println(il + ": "+dceply[il]);
			
		}
		
	}

}
