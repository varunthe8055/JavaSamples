import java.util.Scanner;


public class militrytime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sampscn = new Scanner(System.in);
		 militrytime2 sampm = new militrytime2();
		int hr;
		int min;
		int sec;
		
		hr= sampscn.nextInt();
		min= sampscn.nextInt();
		sec= sampscn.nextInt();
			

 
    sampm.times(hr, min, sec);
    
    
	
		//System.out.println(sampscn.nextLine());
		sampscn.close();
		
	}

}
