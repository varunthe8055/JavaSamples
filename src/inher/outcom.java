package inher;

public class outcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		car a = new car();
//	bus b = new bus();
//	a.wheels();
//	b.wheels();

//	vehicles v[] = new vehicles[2];
//	v[0]= new car();
//	v[1]= new bus();
//		
//		for (int i = 0; i < v.length; i++) {
//			
//			v[i].wheels();
		
//		
//		}
//		
		vehicles obj = new vehicles();
		apls apobj =new apls();
		vehicles cobj = new car();
		
		obj.wheels(apobj);
		cobj.wheels(apobj);
		
		

	}

}
