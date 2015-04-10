
public class arymet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ary [] = {1,2,3,4,5};
		newmeth(ary);
		
		for (int lmn : ary) {
			System.out.println(lmn);
		}
		
	}

	public static void newmeth (int samp []){
		for (int i = 0; i < samp.length; i++) {
			samp[i]+=20;
			
		}
		
	}
}
