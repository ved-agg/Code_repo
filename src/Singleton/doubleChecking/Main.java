package Singleton.doubleChecking;

public class Main {

	public static void main(String[] args) {
		DBConnection instance1 = DBConnection.getInstance();
		DBConnection instance2 = DBConnection.getInstance();
		DBConnection instance3 = DBConnection.getInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
	}

}
