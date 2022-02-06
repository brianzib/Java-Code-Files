
public class Cup extends LiquidContainer {

	String szColour;
	String szMaterial;
	String szType;

	private int iTemperature;



	Cup()
	{
		super.reset();

		reset();

		return;
	}

	//Setters

	void reset()
	{
		szColour = "White";
		szMaterial = "Clay";
		szType = "Tea";
		iTemperature = 0;
	}


	public void setMaterial(String szElement)
	{
		szMaterial = szElement;
		return;
	}
	
	public void setColour(String szC)
	{
		szColour = szC;
		return;
	}

	public void setTemperature(int iVlaue)
	{
		iTemperature = iVlaue;
		return;
	}

	//Getters
	
	public String getMaterial()
	{
		return(szMaterial);
	}
	
	private int getTemperature() 
	{
		return(iTemperature);
	}
	
	private String getColour() 
	{
		return (szColour);
	}

	//Utilities 
	
	public void Display()
	{
		System.out.println("The Cups Capacity is " + super.getCapacity());
		System.out.println("The Cups Colour is " + getColour());
		System.out.println("The Cup is made from " + getMaterial());
		System.out.println("The current remperature of the liquid is " + getTemperature());
		System.out.println("The cup is currently holding this much liquid: " + super.getVolume() + " ml");

		if (super.getFill() == true )
		{
			System.out.println("The cup is currently not filled");
		}

		else
		{
			System.out.println("The cup is filled!");
		}

	}


	public static void main(String[] args) {
		
		Cup myCup = new Cup();

		myCup.setCapacity(450);
		myCup.setVolume(450);
		int V = myCup.getVolume();
		
		myCup.setFill(V);
		
		myCup.setTemperature(50);
		myCup.setColour("Blue");
		myCup.setMaterial("Glass");
		
		myCup.Display();
		
		
	}

}
