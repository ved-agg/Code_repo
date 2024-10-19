package ProdBuilder;

public class Student {
	String name;
	int age;
	String gender;
	String university;
	double cgpa;
	String address;
	
	public Student(Builder builder) {
		//Validation
		if(builder.getAge()>50) throw new IllegalArgumentException("Student age cannot be more than 50"); 
		this.name = builder.getName();
		this.age = builder.getAge();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", university=" + university
				+ ", cgpa=" + cgpa + ", address=" + address + "]";
	}
	
	public static Builder getBuilder() {
		return new Builder();
	}
	
	static class Builder {
		private String name;
		private int age;
		private String gender;
		private String university;
		private double cgpa;
		private String address;
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public int getAge() {
			return age;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getUniversity() {
			return university;
		}
		public void setUniversity(String university) {
			this.university = university;
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
		public Student build() {
			return new Student(this);
		}
	
	}
	
}
