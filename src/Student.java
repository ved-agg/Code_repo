
public class Student {
	int age;
	String name;
	
	public void display() {
		System.out.println("My name is "+ this.name + ". I am "+ this.age +" years old");
	}
	public void sayHello() {
		System.out.println(name.getClass().getSimpleName() +" says hello to "+this.name);
	}
}
