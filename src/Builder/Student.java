package Builder;

public class Student {
	String name;
	int age;
	String gender;
	String university;
	double cgpa;
	String address;
	
	public Student(Helper helper) {
		//Validation
		if(helper.age>50) throw new IllegalArgumentException("Student age cannot be more than 50"); 
		this.name = helper.name;
		this.age = helper.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", university=" + university
				+ ", cgpa=" + cgpa + ", address=" + address + "]";
	}
	
	
}
