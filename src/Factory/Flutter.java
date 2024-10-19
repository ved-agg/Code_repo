package Factory;

public class Flutter {

	void setTheme() {
		
	}
	
	void setRefreshRate() {
		
	}
	
	UIFactory createUIFactory(SupportedPlatform platform) {
		return UIFactoryCreator.getUIFactoryForPlatform(platform);
	}
}
