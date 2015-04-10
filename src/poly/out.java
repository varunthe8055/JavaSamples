package poly;

public class out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		birds a = new crow();
//		birds b = new parrot();
//		birdsist list = new birdsist();
//		
//		list.add(a);
//		list.add(b);
		
		
//		add crow and parrot  to birds array
		
		birds b[]= new birds [2];
		crow c= new crow();
		parrot p = new parrot();
		
		b[0]=c;
		b[1]=p;
		
		for (birds x : b) {
			x.color();
			
			
		}
		
		
	}

}
