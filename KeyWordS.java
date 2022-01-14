import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.*;

public class KeyWordS 

{

	public static void main (String [] args) throws IOException
	{

		String szKeyword;
		String szNewKey = "";
		String szMessage;
		String szNewAlphabet; 
		String szNewMessage; 

		int iLength = 0;

		// Collect Keyword

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		System.out.println("Enter the keyword that you would like to use ");

		szKeyword =  br.readLine();
		iLength = szKeyword.length();

		StringBuffer sbf = new StringBuffer(szKeyword);

		for (int i = 0 ; i < iLength - 1; i++)
		{

			
			szNewKey += szKeyword.charAt(i); 
			
			if (szKeyword.contains(szNewKey))
			{
		
				szNewKey
				
				
			}

		}
		
		System.out.println(sbf);
		
		
	}
	
	
	
}
