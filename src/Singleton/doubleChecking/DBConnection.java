package Singleton.doubleChecking;

public class DBConnection {

	private static DBConnection instance = null;
	private DBConnection() {
	}

	public static DBConnection getInstance() {
		if(instance==null) {
			synchronized (DBConnection.class) {
				if(instance==null)
					instance = new DBConnection();
			}
		}
		return instance;
	}
}


//public static synchronized DBConnection getInstance() {
//	if(instance==null)
//		instance = new DBConnection();
//	return instance;
//}