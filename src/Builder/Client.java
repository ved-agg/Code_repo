package Builder;

public class Client {

	public static void main(String[] args) {
		Helper helper = new Helper();
		
		helper.name = "Vedanshu";
		helper.age = 21;
		
		Student st = new Student(helper);
		
		System.out.println(st.toString());

	}

}
