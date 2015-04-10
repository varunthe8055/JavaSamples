
public enum DaysEnum {
	MONDAY(0, 03, 2015),
	TUESDAY(1, 03, 2015),
	WEDNESDAY(2, 03, 2015),
	THURSDAY(3, 03, 2015),
	FRIDAY(4, 03, 2015),
	SATURDAY(5, 03, 2015),
	SUNDAY(6, 03, 2015);
	
	private int day;
	private int mon;
	private int yer;
	
	public int getDay() {
		return day;
	}

	public int getMon() {
		return mon;
	}

	public int getYer() {
		return yer;
	}

	DaysEnum(int numDay, int month, int year){
		day = numDay;
		mon = month;
		yer = year;
	}
	
}
