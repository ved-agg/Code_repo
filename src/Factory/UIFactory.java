package Factory;

import Factory.Component.Button;
import Factory.Component.Menu;

public interface UIFactory {

	Button createButton();
	Menu createMenu();
}
