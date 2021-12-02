/**
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DigitComb {

	public static void main(String[] args) throws IOException 
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String szInput;
		
		int iDig1 = 0;
		int iDig2 = 0;
		int iDig4 = 0;
		int iDig3 = 0;
		int iFinalComb;
	
		szInput = br.readLine();
		iDig1 = Integer.parseInt( szInput );
		
		szInput = br.readLine();
		iDig2 = Integer.parseInt( szInput );
		
		szInput = br.readLine();
		iDig3 = Integer.parseInt( szInput );
		
		szInput = br.readLine();
		iDig4 = Integer.parseInt( szInput );
		
		br.close();
		
	    iFinalComb =findComb(iDig1, iDig2, iDig3, iDig4);

	}
	
	public static int findComb(int iDig1, int iDig2, int iDig3, int iDig4) 
	
	{
		
		int iTemp = 0;
		
		boolean bReaccuring;
		
	
		if (iDig1 == iDig2)
		{	
			boolean Reaccuring = true;
		}
		
		
		
		return iDig4;
		
		
		
		
	}
	
	}


