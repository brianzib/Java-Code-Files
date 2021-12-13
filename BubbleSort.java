import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main (String[] args) {

		int [] iNums = {4, 6, 1, 7}; 
		int n;
		int i;
		int j;
		
		n = iNums.length - 1;

		for (i = 1; i <= n; i++);
		{

			for (j = 1; j <= n; j++)
			{

				if (iNums[i] > iNums[j])
				{
					int iTemp = iNums[i];
					iNums[i] = iNums[j];
					iNums[j] = iTemp;
				}
			}
		}



	}
	
	

}
