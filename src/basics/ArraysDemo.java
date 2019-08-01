package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	public static void main(String[] args) {
		// declare a 1D array
		int[] marks = new int[6];

		// assign values to the array
		marks[0] = 21;
		marks[1] = 22;
		marks[2] = 23;
		marks[3] = 20;
		marks[4] = 19;
		marks[5] = 25;
//		marks[6] = 18; we can't use the index number which is greater than or equal to length of the array

		// retrieving data from array
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks[5]);
		// retrieving data from array using normal for loop
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// array initialization
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// find the number of items in an array
		System.out.println("the number of items in vowels array is " + vowels.length);

//		System.out.println(vowels[0]);
//		System.out.println(vowels[1]);
//		System.out.println(vowels[2]);
//		System.out.println(vowels[3]);
//		System.out.println(vowels[4]);
		for (char v : vowels) {
			System.out.println(v);
		}

		// 2D arrays
		int[][] matrix1 = new int[2][2];

		// assign the values
		matrix1[0][0] = 1;// row 1 column 1
		matrix1[0][1] = 0;// row 1 column 2
		matrix1[1][0] = 0;// row 2 column 1
		matrix1[1][1] = 1;// row 2 column 2

		// retrieve the data
//		System.out.print(matrix1[0][0] + "\t");
//		System.out.println(matrix1[0][1]); // first row completed
//		System.out.print(matrix1[1][0] + "\t");
//		System.out.println(matrix1[1][1]); // second row completed
		// retrieve data using for loop
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[r].length; c++) {
				System.out.print(matrix1[r][c]+"\t");
			}
			System.out.println();
		}

		// initialize a 2D array
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// retrieve the data
		System.out.print(matrix2[0][0] + "\t");
		System.out.print(matrix2[0][1] + "\t");
		System.out.print(matrix2[0][2] + "\n");
		// second row
		System.out.print(matrix2[1][0] + "\t");
		System.out.print(matrix2[1][1] + "\t");
		System.out.print(matrix2[1][2] + "\n");
		// third row
		System.out.print(matrix2[2][0] + "\t");
		System.out.print(matrix2[2][1] + "\t");
		System.out.print(matrix2[2][2] + "\n");

		// find the number of rows
		System.out.println("number of rows is = " + matrix2.length);

		// find the number of columns in every row
		System.out.println("number of columns in first row = " + matrix2[0].length);
		System.out.println("number of columns in second row = " + matrix2[1].length);
		System.out.println("number of columsn in third row = " + matrix2[2].length);

		int[][] arr = { { 1, 2, 3, 4 }, { 0, 2, 4, 8, 9 }, { 9, 7, 5, 3, 1 } };

		// find the number of rows
		System.out.println("number of rows is = " + arr.length);

		// find the number of columns in every row
		System.out.println("number of columns in first row = " + arr[0].length);
		System.out.println("number of columns in second row = " + arr[1].length);
		System.out.println("number of columsn in third row = " + arr[2].length);

		// retrieve the data
//		System.out.print(arr[0][0] + "\t");
//		System.out.print(arr[1][0] + "\t");
//		System.out.print(arr[2][0] + "\n");
//		System.out.print(arr[0][1] + "\t");
//		System.out.print(arr[1][1] + "\t");
//		System.out.print(arr[2][1] + "\n");
//		System.out.print(arr[0][2] + "\t");
//		System.out.print(arr[1][2] + "\t");
//		System.out.print(arr[2][2] + "\n");
//		System.out.print(arr[0][3] + "\t");
//		System.out.print(arr[1][3] + "\t");
//		System.out.print(arr[2][3] + "\n");
//		System.out.print(arr[1][4] + "\t");
//		System.out.print(arr[2][4] + "\n");
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}
}
