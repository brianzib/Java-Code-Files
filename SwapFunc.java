
public class SwapFunc 
{

	public static void main(String[] args) 
	{
		int [] a = {3}; 
		int [] b = {4};
		
// Setting the value for a and b as single value arrays
		
		doSwap(a, b); 
		// Calls the doSwap function, Passes by value, only takes the original copies of the values
		// but not the actual values stored within the variables.
		
		System.out.println(a[0] + b[0]);
		// Prints out the two arrays passed back by the function
	}





//This is the DoSwap function, it takes an two arrays, a and b, that hold one list item each
//It then takes the values [idexed at 0] and swaps the values around, 
// It then takes those swaped values and return them
//However, the function references the memory address dot the values rather than taking copies of the values
// This allows the function to alter the contents of the array, and keep it that way rather than letting
// it revert to its previous values. It then returns the addresses with the new values.

	public static int doSwap(int [] a, int [] b )
	{
		int iTemp = 0;
		iTemp = a[0];
		a[0] = b[0];
		b[0] = iTemp;
		return a[0] + b[0];	
	}


}
