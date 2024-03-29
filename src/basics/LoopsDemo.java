package basics;

import java.util.Scanner;

/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expr ession){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */

public class LoopsDemo {
	public static void main(String[] args) {
		System.out.println("************WHILE LOOP FROM 1 TO 10****************");
		// while loop
		// print numbers from 1 to 10
		// initiaization
		int i = 1;
		while(i <= 10) { // condition
			System.out.println(i);
			i++; //increment
		}
		
		System.out.println("************DO WHILE NUMBERS FROM 20 T0 10****************");
		//do while loop
		//print numbers from 20 to 10
		// initialization
		int j = 20;
		do {
			System.out.println(j);
			j--; // decrement
		}while(j>10);
		
		System.out.println("************GMAIL USERNAME USING DO WHILE****************");
		// gmail scenario
		String uname = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter user name");
			uname = sc.next();
		}while(!uname.equals("sunshine"));
		
		System.out.println("************FOR LOOP TO PRINT MULTIPLES OF 3****************");
		//for loop
		// print multiples of 3 from 5 to 10 
		for(int k=5; k<=10; k++) {
			System.out.println(k*3);
		}
		
		System.out.println("************FOR EACH LOOP OVER AN VOWEL ARRAY****************");
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(char vowel : vowels) {
			System.out.println(vowel);
		}
		
		// break statement
		int m = 0;
		while(m < 10) {
			if(m == 5) {
				break; // it will terminate the loop
			}
			System.out.print(m+"\t");
			m++;
		}
		System.out.println();
		
		
		// continue statement
		int n= -1;
		while(n < 10) {
			n++;
			if(n == 5) {
				continue;
			}
			System.out.print(n+"\t");
			
		}
		System.out.println();
		
		
		int x = 10;
		while(x < 20) {
			x++;
			if(x % 2 != 0) {
				continue;
			}
			System.out.print(x+"\t");
		}
		System.out.println();
		
		// verify a given number is prime or not
		System.out.println("enter a number");
		int primeOrNot = sc.nextInt();
		boolean flag = true;
		for(int p = 2; p <= primeOrNot/2; p++) {
			if(primeOrNot % p == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given number is not prime");
		}
		
		// write a program to reverse the given string
		String str = "sunshine";
		String rstr = "";
		for(i = str.length() - 1  ;i >= 0; i--) {
			rstr = rstr + str.charAt(i);
//			System.out.println(rstr);
		}
		System.out.println(rstr);
		
		//change the case of alternate characters eg: sunshine output: SuNsHiNe
		
	}
	
	
	
	
	

}
