package fls;

import java.io.File;
import java.util.Scanner;

public class rdfile {
	
	private Scanner f ;
	
	public void openfl() {
		try {
			f = new Scanner (new File("jpn.txt"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}		
	}
	public void rdfl() {
		while (f.hasNext()) {
			String a = (String) f.next();
			String b = (String) f.next();
			String c = (String) f.next();
			
System.out.println("%s %s %s",a,b,c);			
		}
	}

}
