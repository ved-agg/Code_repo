package Factory;

import Factory.Component.IOSButton;
import Factory.Component.IOSMenu;

public class IOSUIFactory implements UIFactory{

	@Override
	public IOSButton createButton() {
		return new IOSButton();
	}

	@Override
	public IOSMenu createMenu() {
		return new IOSMenu();
	}

}
