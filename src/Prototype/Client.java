package Prototype;

public class Client {
	
	public static void fillRegistry(StudentRegistry registry) {
		Student julyBatch = new Student();
		julyBatch.setbatchName("july23");
		julyBatch.setCgpa(9);
		registry.register(julyBatch.getbatchName(), julyBatch);
		
		Student augBatch = new Student();
		augBatch.setbatchName("aug23");
		augBatch.setCgpa(9);
		registry.register(augBatch.getbatchName(), augBatch);
		
		IntelligentStudent juneBatch = new IntelligentStudent();
		juneBatch.setbatchName("june23");
		juneBatch.iQ = 100;
		registry.register(juneBatch.getbatchName(), juneBatch);
	}

	public static void main(String[] args) {
		StudentRegistry registry = new StudentRegistry();
		fillRegistry(registry);
		Student st1 = registry.get("july23").cloning();
		st1.setName("Aniket");
		st1.setAge(21);
		st1.setGender("M");
		
		Student st2 = registry.get("aug23").cloning();
		st2.setName("Neha");
		st2.setAge(22);
		st2.setGender("F");
		
		Student st3 = registry.get("june23").cloning();
		st3.setName("Swati");
		st3.setAge(29);
		st3.setGender("F");
		
		System.out.println("Debug");
	}

}
