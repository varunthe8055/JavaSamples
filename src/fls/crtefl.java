package fls;

import java.io.File;

public class crtefl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new file
		
		File f = new File("c:\\j\\sampfilecreate.txt");
		try {
			f.createNewFile();
			System.out.println(f.getName());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured");
		}
		

	}

}
