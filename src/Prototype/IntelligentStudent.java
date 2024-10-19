package Prototype;

public class IntelligentStudent extends Student{

	int iQ;
	@Override
	public IntelligentStudent cloning() {
//		IntelligentStudent st = new IntelligentStudent();
//		st.setAge(this.getAge());
//		st.setName(this.getName());
//		st.setGender(this.getGender());
//		st.setbatchName(this.getbatchName());
//		st.setCgpa(this.getCgpa());
//		st.setAddress(this.getAddress());
//		st.iQ = this.iQ;
		return new IntelligentStudent(this);
	}
		
	public IntelligentStudent() {
//		super();
	}

	IntelligentStudent(IntelligentStudent student){
		super(student);
		this.iQ = student.iQ;
	}
}
