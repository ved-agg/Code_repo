package Decorator;

public class Client {

	public static void main(String[] args) {
		IceCreanConeConstituents iceCreanConeConstituents = new ChocoCone(new MangoScoop());
		System.out.println(iceCreanConeConstituents.getCost());
		System.out.println(iceCreanConeConstituents.getDescription());
	}

}
