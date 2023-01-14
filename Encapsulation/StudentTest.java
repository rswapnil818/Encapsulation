package Encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student st=new Student();
		st.setId(1);
		System.out.println(st.getId());
		st.setName("Swapnil Ramteke");
		System.out.println(st.getName());
		st.setAge(23);
		System.out.println(st.getAge());

	}

}
