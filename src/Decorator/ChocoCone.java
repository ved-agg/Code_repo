package Decorator;

public class ChocoCone implements IceCreanConeConstituents{
	private IceCreanConeConstituents iceCreamConeConst;
	
	public ChocoCone() {
	}
	
	public ChocoCone(IceCreanConeConstituents iceCreamConeConstistuents){
		this.iceCreamConeConst = iceCreamConeConstistuents;
	}

	@Override
	public int getCost() {
		if(iceCreamConeConst != null) {
			return iceCreamConeConst.getCost() + 30;
		}
		return 30;
	}

	@Override
	public String getDescription() {
		if(iceCreamConeConst != null) {
			return iceCreamConeConst.getDescription() + "Chocolate Cone";
		}
		return "Chocolate Cone";
	}
}
