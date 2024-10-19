package Decorator;

public class MangoScoop implements IceCreanConeConstituents{

	private IceCreanConeConstituents iceConeConstituents;
	
	public MangoScoop() {
	}
	
	public MangoScoop(IceCreanConeConstituents iceConeConstituents) {
		if(iceConeConstituents == null) {
			throw new IllegalArgumentException("Cannot add Scoop without Base");
		}
		this.iceConeConstituents = iceConeConstituents;
	}
	
	@Override
	public int getCost() {
		if(iceConeConstituents != null) {
			return iceConeConstituents.getCost() + 10;
		}
		return 10;
	}

	@Override
	public String getDescription() {
		if(iceConeConstituents != null) return iceConeConstituents.getDescription()+ " Mango Scoop added";
		return " Mango Scoop added";
	}

}
