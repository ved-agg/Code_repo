package ProdBuilder;

public class Client {

	public static void main(String[] args) {
		Student builder = Student.getBuilder()
				.setName("Vedanshu") //having student type obj and 
				.setAge(21) //set methods from Builder class, so all setters will return builder type
				.build(); // chnge the data type from void to builder

		System.out.println(builder.toString());

	}

}
