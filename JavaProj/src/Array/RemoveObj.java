package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveObj {

	public static void main(String[] args) {
		ArrayList <Emp> e=new ArrayList<Emp>();
		e.add(new Emp(101, "Jai"));
		e.add(new Emp(202, "Pari"));
		e.add(new Emp(303,"Parth"));
		
		Iterator i =e.iterator();
		while(i.hasNext()) {
			Emp e1=(Emp)i.next();
			if(e1.empName.equals("Jai"))
			{
				i.remove();
			}
			
		}
		for(Emp ee:e) {
			System.out.println(ee.empId+"            "+ee.empName);
		}
		
	}

}
