package Factory;

import Factory.Component.AndroidButton;
import Factory.Component.AndroidMenu;

public class AndroidUIFactory implements UIFactory{

	@Override
	public AndroidButton createButton() {
		return new AndroidButton();
	}

	@Override
	public AndroidMenu createMenu() {
		return new AndroidMenu();
	}

}
