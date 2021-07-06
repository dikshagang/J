package Array;

import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		
		Iterator i= v1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
