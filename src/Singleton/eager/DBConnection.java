package Singleton.eager;

public class DBConnection {

	private static DBConnection instance = new DBConnection();
	
	private DBConnection() {
		//initialise aatributes
	}
	
	public static DBConnection getInstance() {
		return instance;
	}
}
