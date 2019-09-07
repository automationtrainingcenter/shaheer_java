package exception_handling;

public class InvalidBrowserException extends RuntimeException{
	
	public InvalidBrowserException() {
		super("Browser name must be either chrome or firefox");
	}
}
