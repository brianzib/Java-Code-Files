
public class RectangleArea {

	public static void main(String[] args) {
		
		int h = 1;
		int i = 2 ;
		int iArea = 50;
		
		double dUpperLimMul = 0;
		double dLowerLimMul = 0;
		double dUpperLimH = 0;
		double dSide2 = 1 + i;
		double dArea;
		
		dUpperLimMul = iArea + 1;
		dLowerLimMul = iArea - 1;
		dUpperLimH = iArea / 2;
		
		
		
		for (dArea = 0; dArea <= dUpperLimMul; dSide1++, dSide2++)
		{
		
		dArea = h * dSide2;
		
		h++;
		
		dSide2++
		
		
		
		}
		
		System.out.println("The value of h is" + h);
		
		
		
		

	}

}
