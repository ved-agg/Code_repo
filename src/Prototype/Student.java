package Prototype;

public class Student implements Prototype<Student>{
	String name;
	int age;
	String gender;
	String batchName;
	double cgpa;
	String address;
	
	public Student() {
	}
	
	public Student(Student student) {
		this.name = student.name;
		this.age = student.age;
		this.gender = student.gender;
		this.batchName = student.gender;
		this.cgpa = student.cgpa;
		this.address = student.address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getbatchName() {
		return batchName;
	}
	public void setbatchName(String batchName) {
		this.batchName = batchName;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public Student cloning() {
//		Student st = new Student();
//		st.age = this.age;
//		st.name = this.name;
//		st.gender= this.gender;
//		st.batchName = this.batchName;
//		st.cgpa = this.cgpa;
//		st.address = this.address;
//		return st;
		return new Student(this);
	}
	
	
}
