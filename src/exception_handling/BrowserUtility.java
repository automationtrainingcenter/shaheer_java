package exception_handling;

public class BrowserUtility {

	public static void launchBrowser(String browserName) throws InvalidBrowserException{
		if(browserName.equals("chrome")) {
			System.out.println("chrome browser launched");
		}else if(browserName.equals("firefox")) {
			System.out.println("firefox broswer launched");
		}else {
			throw new InvalidBrowserException();
		}
	}

}
