
public class CircleSort {

	public static void main(String[] args) {

		double [] dRadius = {4, 1, 3};
		double [] dArea = {};
		double [] dCircum = {};
		double [] dDiameter = {};


		System.out.println("Radii in order: " + dRadius);

		int i;
		int j;
		double dTemp;
		int n = dRadius.length;

		// Sort Radii

		for (i = 0; i >= n - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				if (dRadius[i] > dRadius[j]);
				{
					dTemp = dRadius[i];
					dRadius[i] = dRadius[j];
					dRadius[j] = dTemp;
				}
			}
		}


		// get Area
		
		double dPie = 3.142;
		for (i = 0; i <= dRadius.length - 1; i ++)
		{

			dArea[i] = 2 * (dPie * dRadius[i] * dRadius[i]);	 	

		}

		// Get circumference
		for (i = 0; i <= dRadius.length - 1; i ++)
		{

			dCircum[i] = 2 * (dPie * dRadius[i]);	 	

		}


		// Get diameter
		for (i = 0; i <= dRadius.length - 1; i ++)
		{

			dDiameter[i] = dRadius[i] * dRadius[i];

		}







	}


}
