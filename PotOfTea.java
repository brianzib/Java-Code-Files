
public class PotOfTea extends LiquidContainer {

	public enum MATERIAL {

		STEEL(1), CLAY(2), TIN(3);
		
		public int Value;
		MATERIAL (int iValue)

		{
			this.Value = iValue;
		}
		
		
	}

	private String szColour;
	private int iTemperature;

	PotOfTea()
	{
		super.reset();
		reset();
		return;
	}

	void reset()
	{
		szColour = "white";		
		iTemperature = 0;	
		int iTag = 0;
	}
	
	void setColour(String C)
	{
		szColour = C;
		return;
	}

	void setTempereature(int i)
	{
		iTemperature = i;
		return;
	}
	
	void setTag(int i)
	{
		iTag = i;
	}
		
	// Getters
	
	private String getColour()
	{
		return(szColour);	
	}	

	private int getTempereature()
	{
		return(iTemperature);
	}
	
	

	// Utilities
	
	private void Display()
	{
		System.out.println("The liquid containers capacity is : " + getCapacity());
		System.out.println("The liquid containers Volume is : " + getVolume());

		if (getFill() == true)
		{
			System.out.println("The container is currently filled");
		}

		else 
		{
			System.out.println("The container is currently empty");
		}

		
		
		
	}
	
	public static void main(String[] args) {
		
		PotOfTea POT = new PotOfTea(); 
		
		POT.setCapacity(500);
		POT.setColour("Blue");
		POT.setTempereature(75);
		POT.setVolume(460);
		POT.setTag(3));
		
		POT.Display();
		
	}

}
