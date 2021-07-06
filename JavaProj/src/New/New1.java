package New;

public class New1 {

	public static void main(String[] args) {
String str="ASSSSSSddhjhfjhf_dhjgd jbkadkdk";
System.out.println(str.length());

String [] st = str.split("_");
System.out.println(st.length);

for(int i=0;i<st.length;i++) {
	System.out.println(st[i]);
}
	}

}
