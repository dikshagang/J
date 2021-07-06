package Array;

public class Array2 {

	public static void main(String[] args) {
		Emp e1=new Emp(10,"AAa");
		Emp e2=new Emp(20,"Bbbb");
		Emp e3=new Emp(30,"Dddd");
		Emp[] E =new Emp[4];
		
		E[0]=e1;
		E[1]=e2;
		E[2]=e3;
		for(Emp ee:E) {
			System.out.println(ee.empId+"  "+ee.empName);
		}
		

	}

}
