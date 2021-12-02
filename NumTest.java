import java.util.Random;

public class NumTest {

	public static void main(String[] args) {
		
		int iUpperLim = 10;
		Random newNum = new Random();
		int i;
/*		
 * 
	
		
	
	for (int i  = newNum.nextInt(iUpperLim); i <= iUpperLim; i-- )
	{
		
		for (int j = 0; j <= iUpperLim; j++) {
			
			i = newNum.nextInt(iUpperLim);
			System.out.println("Random number generated  " + i );
				
		}
		
	}
	
	*/
		
	i = getanInfin(iUpperLim, newNum);
		
	int iRandom = getRan(newNum);
		
	iRandom =takeFour(iRandom);
	
	System.out.println("Random num generated = " + iRandom);
	
	}

	public static int getRan(Random newNum) 
	{
		int iSeed = 5555;
		int i;
		int iRandom;
		i = newNum.nextInt(iSeed);
		iRandom = i * i;
		
		return iRandom;
	}
	
	public static int takeFour(int iRandom) 
	{
	
		int n = iRandom;
		int i;
		int iLength = (int) (Math.log10(n)+1);

	
		
		
		return iRandom;
		
		
	}

	public static int getanInfin(int iUpperLim, Random newNum)
	{
		int i;
		

		for ( i = newNum.nextInt(iUpperLim); i <= iUpperLim; i-- )
		{
			
			for (int j = 0; j <= iUpperLim; j++) {
				
				i = newNum.nextInt(iUpperLim);
				System.out.println("Random number generated  " + i );
					
			}
			
		}
		
		
		return i ; 
		
	}

}
