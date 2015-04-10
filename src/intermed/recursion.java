package intermed;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rec(25));
	}
	
	public static int rec(int m) {
		if (m <=1) {
			return 1;
		} else {
            return (m* rec(m-1));
		}
		
	}

}
