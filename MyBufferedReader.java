/**
 * 	@author Brian Zibiri
 * Practice Assignment for the use of Buffered Readers
 * Following algorithm takes an input stores it in a buffer and is later printed to the user (output via console)
 */

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.math.BigDecimal;

import java.math.* ;

public class MyBufferedReader
{
	// Brian Zibiri
	// Practice Assignment for the use of Buffered Readers
	// Following algorithm takes an input stores it in a buffer and is later printed to the user (output via console)

	public static void main(String[] args) throws IOException
	{


		//Declaration of Variables

		String szYourName = "";
		String szInput;
		int iCurAge = 0;
		int iFutAge = 0;
		String szDayNMonth; 
		int iYearOFB= 0;
		String szNextBD;
		int iCurYear = 21;


		//Declaration of a buffer reader

		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		// Ask for a user to input their name and store it in the buffer.

		System.out.println("Please enter your name");

		szInput = BR.readLine();

		szYourName = szInput;

		// Ask for a user to input their age and store is in the buffer.

		System.out.println("Please enter your current age");

		szInput = BR.readLine();
		
		iCurAge = Integer.parseInt( szInput );

		// Ask for a user to input their age next year and store is in the buffer.

		System.out.println("Please enter how old you would be next year");

		szInput = BR.readLine();

		iFutAge = Integer.parseInt( szInput );	

		// Ask for user to enter date of birth and store in buffer

		System.out.println("Enter enter the day and month you were born on in the form DD/MM");

		szInput = BR.readLine();

		szDayNMonth = szInput;	

		// Concatenate DayNMonth AND curYear and store it in nextBD

		szNextBD = szDayNMonth + "/" + iCurYear;

		// Print name, current age and future age in a single sentence

		System.out.println("Your name is " + szYourName + " You are currently " + iCurAge + " years old, and you will turn " + iFutAge + " On the " + szNextBD);

		

		/*

		int i;
		int S = 2;

		for(i = 0; i < 18; i ++ )
		{
			System.out.println(( long )( Math.pow(S , i))) ;
		}
		return ;


		 */	

		/*

		BigDecimal fMon = new BigDecimal("2.15");

		BigDecimal iPower = new BigDecimal("1.10");

	System.out.println((fMon.subtract(iPower)));

		 */
	}

}