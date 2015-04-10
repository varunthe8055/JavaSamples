package fls;

import java.io.File;
import java.util.Formatter;


public class addat {
	private File f;

	public void createfile() {
		try {
//			f.createNewFile();
			f= new File("c:\\j\\chinese.txt");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		
	}
	
	public void write() {
		f.format ("%s%s%s","divya","anand","yalgoori");
		
	}
	
}
