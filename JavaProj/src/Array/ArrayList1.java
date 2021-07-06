package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add("Gauri");
		a1.add("Labh");
		a1.add("************");

		
		Iterator i= a1.iterator();
		while(i.hasNext()) {
			String string=(String)i.next();
			System.out.println(string);
		}
		}

	}


