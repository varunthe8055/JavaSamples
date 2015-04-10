import java.util.EnumSet;




public class secenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (DaysEnum days : DaysEnum.values()) {
//			System.out.println(days.getDay());
//		}

		for (DaysEnum a : EnumSet.range(DaysEnum.TUESDAY, DaysEnum.FRIDAY)) {
			System.out.println(a.getMon());
			
		}
	}

}
