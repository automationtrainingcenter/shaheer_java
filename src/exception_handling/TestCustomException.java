package exception_handling;

public class TestCustomException {
	public static void main(String[] args) {
		try {
			BrowserUtility.launchBrowser("firefoxnbv");
		}catch(InvalidBrowserException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
