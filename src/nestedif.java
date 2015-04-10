
public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 53;
		
		if (grade>75) {
			System.out.println("A Grade");
			
		} else {
			System.out.println("Lower than A grade");
			if (grade<60 && grade>50) {
				System.out.println("B Grade");
				
			} else {
				System.out.println("Lower than B Grade");
				if (grade<50) {
					System.out.println("C Grade");
				} else {
					System.out.println("Fail");

				}

			}

		}

	}

}
