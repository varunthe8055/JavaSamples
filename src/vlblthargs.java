
public class vlblthargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sampvlb(1,2,3,3,4);

	}

	public static void sampvlb(int...x){
		
		int sum = 0;
		for (int i : x) {
			sum+=i;
			
		}
		System.out.println(sum);
		
		
	}
}
