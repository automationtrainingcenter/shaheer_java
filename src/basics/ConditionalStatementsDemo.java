package basics;
/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

import java.util.Scanner;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {
		// if statement
		// given number is positive
		int num = 121;
		if (num >= 0) {
			System.out.println("Given number is positive");
		}
		System.out.println("if statement completed");

		// if else
		if (num >= 0) {
			System.out.println("Given number is positive");
		} else {
			System.out.println("Given number is negative");
		}
		
		
		//verify given number is even or odd
		if(num % 2 == 0) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
		}
		Scanner sc = new Scanner(System.in);
		
		//facebook scenario
		System.out.println("enter user name");
		String username = sc.next();
		System.out.println("enter password");
		String pass = sc.next();
		if(username.equalsIgnoreCase("sunshine") && pass.equals("password")) {
			System.out.println("Welcome "+username);
		}else {
			System.out.println("invalid credentials");
		}
		
		//nested if
		//gmail scenario
		System.out.println("enter gmail username");
		String guser = sc.next();
		if(guser.equalsIgnoreCase("sunshine")) {
			System.out.println("enter gmail password");
			String gpass = sc.next();
			if(gpass.equals("google")) {
				System.out.println("welcome sunshine");
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("user does not exist... do you want to create an Account");
		}
		
		//else if ladder
		System.out.println("enter your choice");
		String choice = sc.next().toLowerCase();
//		if(choice.equals("biggener")) {
//			System.out.println("Launching game in Bigger mode");
//			System.out.println("click on hint button to get a hint");
//		}else if(choice.equals("moderate")) {
//			System.out.println("Launching game in moderate mode");
//			System.out.println("you can use hints for 3 times only");
//		}else if(choice.equals("expert")) {
//			System.out.println("Lauching game in expert mode");
//			System.out.println("No hints available in expert mode");
//		}else {
//			System.out.println("invalid choice");
//		}

//		System.out.println("enter your score");
//		int score = sc.nextInt();
//		if(score >= 500 && score < 700) {
//			System.out.println("got bronze medal");
//		}else if(score >= 700 && score < 1000) {
//			System.out.println("got silver medal");
//		}else if(score >= 1000 && score < 1500) {
//			System.out.println("Got Gold medal");
//		}else if(score >= 1500){
//			System.out.println("Got Dimond medal");
//		}
		
		//switch case
		switch(choice) {
		case "biggener":
			System.out.println("Launching game in Bigger mode");
			System.out.println("click on hint button to get a hint");
			break;
		case "moderate":
			System.out.println("Launching game in moderate mode");
			System.out.println("you can use hints for 3 times only");
			break;
		case "expert":
			System.out.println("Lauching game in expert mode");
			System.out.println("No hints available in expert mode");
			break;
		default:
			System.out.println("invalid choice");
		}
			
		
		

	}

}
