import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class FiniteStateMachine {

	public static void main(String[] args ) throws IOException {


		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		boolean bNumState;
		boolean bISlORsym; 
		boolean bValidState;

		String szInput;

		int iASCIIval = 0;





		System.out.println("Please enter a character");

		szInput = BR.readLine();

		if (szInput.length() > 1)



		{

			bValidState = false;

			while (szInput.length() > 1 )

			{

				System.out.println("Please enter a single character ");

			}


		}

		if (szInput.length() <= 1)

		{

			bValidState = true;

			char cInput = szInput.charAt(0);





		}

		iASCIIval = (int)cInput ;

		if (iASCIIval >= 33 & iASCIIval <= 126)


		{

			bISlORsym = true;






		}

		else 
			
		{



		}
	



	System.out.println("Is valid" + bValidState + "Is integer" + bNumState + "Is other character " + bISlORsym);

}
	
}
