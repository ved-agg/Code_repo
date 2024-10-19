package Factory;

import Factory.Component.Button;

public class Client {

	public static void main(String[] args) {
		Flutter f = new Flutter();
		UIFactory ui = f.createUIFactory(SupportedPlatform.ANDROID);
		
		Button b = ui.createButton();
		System.out.println("Debug");

	}

}
