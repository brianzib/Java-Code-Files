
public class LiquidContainer {

	//Variables

	private int iCapacity;
	private int iVolume;

	private boolean fill;

	// Constructors

	LiquidContainer()
	{
		reset();

		return;
	}

	//Setters

	void reset()
	{
		iCapacity = 0;
		iVolume = 0;
		fill = false;
	}

	void setCapacity(int iValue)
	{
		iCapacity = iValue;		
		return;
	}

	void setVolume(int iValue)
	{
		iVolume = iValue;
		return;
	}

	void setFill(int iValue)
	{
		if (iValue > 0)
		{
			fill = true;
		}

		else
		{
			fill = false;
		}
	}
	//Getters

	int getCapacity()
	{
		return(iCapacity);
	}

	boolean getFill()
	{
		return(fill);
	}

	int getVolume()
	{
		return(iVolume);
	}

	//Utilities

	private void Display()
	{
		System.out.println("The liquid containers capacity is : " + getCapacity());
		System.out.println("The liquid containers Volume is : " + getVolume());

		if (fill == true)
		{
			System.out.println("The container is currently filled");
		}

		else 
		{
			System.out.println("The container is currently empty");
		}

	}


	public static void main(String[] args) {

		LiquidContainer LC = new LiquidContainer();

		LC.Display();

		LC.setCapacity(400);
		LC.setVolume(300);
		int V = LC.getVolume();

		System.out.println("Value of V " + V);

		LC.setFill(V);

		LC.Display();

		LC.setVolume(400);
		LC.Display();
	}

}
