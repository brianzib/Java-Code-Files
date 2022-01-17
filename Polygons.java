import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polygons {

	public static void main(String[] args) throws IOException {

		int iSides;
		int iTens;
		int iUnits;

		String szInput;
		String szPref = "" ;
		String szSuff = "" ;
		String szAnd = "kai";
		String szEnd = "gon";


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a value for the number of sides between 20 and 100");
		szInput = br.readLine();
		iSides = Integer.parseInt(szInput);

		iTens = iSides / 10;
		iUnits = iSides % 10;

		if (iSides >= 20 && iSides <= 100)
		{
			switch (iTens)
			{
			case 2: 
			{		
				szPref = "Icosi";
				break;
			}
			case 3: 
			{		
				szPref = "Triaconta";
				break;
			}
			case 4: 
			{		
				szPref = "Tetraconta";
				break;
			}
			case 5: 
			{		
				szPref = "Pentaconta";
				break;
			}
			case 6: 
			{		
				szPref = "Hexaconta";
				break;
			}
			case 7: 
			{		
				szPref = "Heptaconta";
				break;
			}
			case 8: 
			{		
				szPref = "Octaconta";
				break;
			}
			case 9: 
			{		
				szPref = "Enneconta";
				break;
			}
			case 10: 
			{		
				szPref = "Hecta";
				break;
			}
			}


			switch (iUnits)
			{
			case 1: 
			{		
				szSuff = "hena";
				break;
			}
			case 2: 
			{		
				szSuff = "di";
				break;
			}
			case 3: 
			{		
				szSuff = "tri";
				break;
			}
			case 4: 
			{		
				szSuff = "tetra";
				break;
			}
			case 5: 
			{		
				szSuff = "penta";
				break;
			}
			case 6: 
			{		
				szSuff = "hexa";
				break;
			}
			case 7: 
			{		
				szSuff = "hepta";
				break;
			}
			case 8: 
			{		
				szSuff = "octa";
				break;
			}
			case 9: 
			{		
				szSuff = "ennea";
				break;	
			}
			}

			if (iSides % 10 > 0)
			{
				System.out.println("This is the Polygons name " + szPref + szAnd + szSuff + szEnd);
			}
			else 
			{
				System.out.println("This is the Polygons name " + szPref + szSuff + szEnd);
			}
		}
	}
}

