package Decorator;

public class ChocoChips implements IceCreanConeConstituents{

	IceCreanConeConstituents iceCreanConeConstituents;
	
	public ChocoChips(IceCreanConeConstituents iceCreanConeConstituents) {
		if(iceCreanConeConstituents == null) throw new IllegalArgumentException("Cannot be added without base");
		
		this.iceCreanConeConstituents = iceCreanConeConstituents;
	}
	
	@Override
	public int getCost() {
		return iceCreanConeConstituents.getCost() + 10;
	}

	@Override
	public String getDescription() {
		return iceCreanConeConstituents.getDescription() + "Choco Chips Added";
	}

	
}
