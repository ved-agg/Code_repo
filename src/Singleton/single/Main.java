package Singleton.single;

public class Main {

	public static void main(String[] args) {
		DBConnections instance1 = DBConnections.getInstance();
		DBConnections instance2 = DBConnections.getInstance();
		DBConnections instance3 = DBConnections.getInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
	}
	public static class DBConnections{
		private static DBConnections instance = null;
		
		private DBConnections() {}
		public static DBConnections getInstance() {
			if(instance==null) {
				synchronized(DBConnections.class){
					if(instance==null) {
						instance = new DBConnections();
					}
				}
			}
			return instance;
		}
	}
}


