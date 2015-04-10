
public class multiarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int frstary[][]= {{0,1,2,3,4},{9,9,8,7,10,11}};
       example(frstary);
	}

	public static void example (int sam [][]){
		
		for (int row = 0; row < sam.length; row++) {
			for (int clmn = 0; clmn < sam[row].length; clmn++) {
				
				System.out.print(sam[row][clmn]+" ");
			}
			System.out.println();
		}
		
	}
}
