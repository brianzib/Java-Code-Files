
/*
* @Author Brian Zibiri
* Code for FizzBuzz
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;




public class FizzBuzz {


	public static void main(String[] args) throws IOException {

		// Declaration of Variables

		int i = 0;
		int j;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Declaration of buffer reader

		String szInput;

		String szJstring;

		System.out.println("Please enter the number that you would like to go up to"); // Prompt user input

		szInput = br.readLine(); // Store user input in szInput via buffered reader

		i = Integer.parseInt(szInput); // Parse user input to an integer	

		for(j = 1; j <= i; j++ ) // Loop for the number of time (i = user input line 29), j is incrementally increased as each loop passes
		{

			szJstring = Integer.toString(j);



			if(j % 3 == 0 || szJstring.contains("3")  ) // Checks if number is a multiple of 3 (if 3 can go into it till it equal 0) or if the string variant of j contains 3

			{			
				if (j % 5 == 0 || szJstring.contains("5") ) // Checks if number is a multiple of 5 (if 5 can go into it till it equal 0) or if the string variant of j contains 5

				{

					System.out.println("FizzBuzz"); // Print FizzBuzz if both of the statements are true


				}

				else 
				{

					System.out.println("Fizz"); // Print Fizz as statement 1 still has to be true

				}
			}

			else if (j % 5 == 0 || szJstring.contains("5")) // Checks if number is a multiple of 5 (if 5 can go into it till it equal 0) or if the string variant of j contains 3
			{

				System.out.println("Buzz"); // Prints Buzz if either statement is true

			}

			else

			{
				System.out.println(j);	// if all 3 of the other statements are false will print out just the number (j)
			}



		}







	}

}


