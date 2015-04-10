
public class militrytime2 {
	
	private int hour;
	
//	public int getHour() {
//		return hour;
//	}
//
//	public void setHour(int hour) {
//		this.hour = hour;
//	}

	private int minutes;
	private int seconds;
	
	public  void times (int h,int m,int s){
		hour=(h>=0 && h<= 24)?h:0;
		minutes=(m>=0 && m<= 60)?m:0;
		seconds=(s>=0 && s<= 60)?s:0;
		
		System.out.println(hour+":" + minutes +":"+ seconds);
	}
	

}
