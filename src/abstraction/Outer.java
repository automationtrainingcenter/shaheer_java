package abstraction;

/*
 * inner interface is an interface inside another interface
 */
/*
 * interface WebDriver{
	.
	.
	void get(String arg);
	Options manage();
	.
	.
	interface Options{
		.
		.
		.
		Window window();
		.
		.
	}
	interface Window{
		.
		.
		void maximize();
		.
		.
	}
}

class ChromeDriver implements WebDriver, Options, Window .. etc{
	void get(String arg) { ....}
	Options manage(){...}
	Window window(){....}
	void maximize(){ ... }
}

class TestClass{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com")
	Options opt = driver.manage();
	Window window = opt.window();
	window.maximize();
	OR
	driver.manage().window().maximize();
}
 */
public interface Outer {

	void methodOne();

	// this method return inner interface object reference
	Inner method();

	interface Inner {
		void methodTwo();
	}
}
