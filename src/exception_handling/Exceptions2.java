package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Exceptions2 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(".\\notes\\data.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String prodURL = prop.getProperty("productionurl");
			String prodUser = prop.getProperty("username_prod");
			String prodPass = prop.getProperty("password_prod");
			System.out.println("production url is " + prodURL);
//			Connection con = DriverManager.getConnection("");
//		} catch (FileNotFoundException e) {
//			System.out.println("file not found in the given location");
//		} catch (IOException e) {
//			System.out.println("fial read properties");
//		} catch (SQLException e) {
//			System.out.println("database connection url is invalid");
//		}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}

}
