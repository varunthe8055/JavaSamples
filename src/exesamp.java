import java.util.Scanner;

public class exesamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int l = s.nextInt();
		int rem;
		rem = l % 2;
		System.out.println(rem);
		if (rem == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
