package intermed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class arylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ary []= {"pen", "pencil","water","curry"};
		List<String> aylist = new ArrayList<String> ();
		
		String ary2[]={"pen","Pencil"};
		List<String> aylist2 =new ArrayList<String>();
		
        for (String x : ary) {
        	aylist.add(x);
        }
        
        for (String y : aylist2) {
			aylist2.add(y);
		}
//	    System.out.println(aylist);
	    
//	    for (int i = 0; i <aylist.size(); i++) {
//	    	System.out.printf(" %s ",aylist.get(i));
//			
//		}
        editlist(aylist,aylist2);
        System.out.println();
	    
	    for(String s:aylist){
	    	System.out.println(s);
	    }
	}
       public static void editlist(Collection<String>L, Collection<String>L1) {
    	   Iterator<String> I = L.iterator();
    	   while (I.hasNext()) {
			if (L1.contains(I.next())) {
				I.remove();
			}
		}
       }

}
