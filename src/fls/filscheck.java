package fls;

import java.io.File;





public class filscheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
File f = new File("c:\\j\\sample test.txt");

if (f.exists()){
	System.out.println(f.getName());
}else{
	System.out.println("file not there");
}

	}

}
