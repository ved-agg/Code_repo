package Factory;

public class UIFactoryCreator {

	public static UIFactory getUIFactoryForPlatform(SupportedPlatform platform) {
		if(platform.equals(SupportedPlatform.ANDROID)) return new AndroidUIFactory();	
		else if (platform.equals(SupportedPlatform.IOS)) return new IOSUIFactory();
		else throw new RuntimeException("Platforn not supported");
	}
}
