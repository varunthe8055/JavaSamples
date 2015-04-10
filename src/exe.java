import java.util.Scanner;


public class exe {
	
	public static void main(String[] args) {
		
//		String str="adelbc";
//		  if ((str.startsWith(("del"), 1))) {
//			  System.out.println(str.substring(0,1)+str.substring(4));
//			
//		} else {
//			System.out.println(str);
//
//		}
	}
	

	
//	sum double
//	public int sumDouble(int a, int b) {
//		if (a == b) {
//		int	sum = 2*(a+b);
//		} else {
//			int sum = a+b;
//		}
//		
//		}

	
//	public int diff21(int n) {
//		int	diff = 21-n;
//			if (n>21) {
//				Math.abs(diff*2);
//				
//			} else {
//				
//				Math.abs(diff);
//			}
//			return diff; 
//		}
	
	

//	public String notString(String str) {
//		if (str.startsWith("not")) {
//			return str;
//			
//		} else {
//return ("not" + " "+ str);
//		}
		  
//	public String missingChar(String str, int n) {
//		
//		String l =  str.substring(0, n);
//		String b = str.substring(n+1);
//		return l+b;
//	}
	
//	public String front3 (String str) {
//		  if (str.length()<3) {
//			return str;
//		} else {
//            String a =  (str.substring(0, 2));
//            return (a+a+a);
//		}
	
//	public String backAround(String str) {
//		if (str.length()==1) {
//			return (str+str+str);
//			
//		} else {
//			int n = (str.length()-1);
//			 char k = (str.charAt(n));
//			 return (k+str+k);		
//			
//
//		}
//		  
//	}
	
//	public boolean or35(int n) {
//		if ((n%3 ==0)|| (n%5 ==0)) {
//			return true;	
//		} else {
//return false;
//		}
//		  
//	}

//	public String front22(String str) {
//		if (str.length()<2) {
//			return (str+str);
//			
//		} else {
//			
//			String s = str.substring(0, 1);
//			return (s+str+s);
//
//		}
//		
//	public boolean startHi(String str) {
//		if (str.startsWith("Hi")) {
//			return true;
//		} else {
//            return false;
//		}
//		  
//	}
//	public boolean icyHot(int temp1, int temp2) {
//		  if ((temp1<0 && temp2>100)||(temp1>0 && temp2<100)) {
//			return true;
//		} else {
//			return false;
//
//		}
//	}

//	public boolean in1020(int a, int b) {
//		  if ((10 >= a && a <= 20)||(10 >= b && b <= 20)) {
//			  return true;
//			
//		} else {
//			return false;
//
//		}
//	}
//	public boolean hasTeen(int a, int b, int c) {
//		if ((a >= 13 && a <= 19)||(b >= 13 && b <= 19)||(c >= 13 && c <= 19)) {
//			  return true;
//			
//		} else {
//			return false;
//
//		}
//	}
//	public boolean loneTeen(int a, int b) {
//		  if ((a >= 13 && a <= 19)&&(b >= 13 && b <= 19)) {
//			return false;
//		} else {
//			if ((a >= 13 && a <= 19)||(b >= 13 && b <= 19))
//			return true;
//		}
//		  return false;
//	}
//	public boolean mixStart(String str) {
//		  if (str.startsWith("ix", 1)) {
//			  return true;
//			
//		} else {
//			return false;
//
//		}
//	public String startOz(String str) {
//		String s = "";
//		if (str.length() > 1 && str.substring(0, 2).equalsIgnoreCase("oz") ) {
//			s= str.substring(0, 2);
//		} else if(str.length()>0 && str.substring(0, 1).equals("o")){
//			s= str.substring(0, 1);
//
//		}else if(str.length()>1 && str.substring(1, 2).equals("z")){
//			s= str.substring(1, 2);
//		}
//		return s;
//	public int intMax(int a, int b, int c) {
//		  if (a>b && a>c) {
//			return a;
//		
//		} else {if (b>a && b>c) {
//			return b;
//			
//		} else {if(c>a && c >b)
//			
//			return c;
//		}
//		return 0;
//		}
	
	public int max1020(int a, int b) {
//		int adiff =Math.abs(a - 10);
//			int bdiff = Math.abs(b-10);
			
			if (((a>=10 && a <=20)&& (b>=10 && b <=20)) && (a> b) ) {
				return a; 
			} else if (((a>=10 && a >=20)&& (b>=10 && b >=20)) && (b> a) ) {
				return b; 
			}else if ((a <=10 || a >=20) && (b >=10 || b <=20)) {
					return b; 
			}else if ((b <=10 || b >=20) && (a >=10 || a <=20)) {
				return a; 
			}
			return 0;
		}
	}

	


	
	







	
		  
	

	
	



