
public class Mug 
{
	//---------------------------------------------------------------------
	//Variables
	//---------------------------------------------------------------------

	private int iCapacity;
	private int iTemperature;
	private int iVolume;

	private boolean bEmpty = false;

	private String szMaterial;
	private String szColour;


	//---------------------------------------------------------------------
	//Constructors
	// This is known as the default constructor, see below
	//---------------------------------------------------------------------

	public Mug()
	{	
		reset();

		return; 
	}

	//---------------------------------------------------------------------
	//Setters 
	//---------------------------------------------------------------------

	public void reset()
	{
		setCapacity(300);
		setMaterial("Clay");
		setTemperature(25);
		setFill(true);
		setColour("Blue");
		return;
	}

	public void wash()
	{
		setCapacity(0);
		setMaterial("");
		setTemperature(0);
		setFill(true);
		setColour("");
		return;
	}
	
	private void setFill(boolean bEmpty) 
	{
		if (iCapacity > 0)
		{
			bEmpty = false;
			return;
		}
	}

	public void setCapacity(int iValue)
	{
		iCapacity = iValue;	
		return;
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

	public void setVolume (int iValue)
	{


		if (iValue <= iCapacity && iValue >= 0 )
		{
			iVolume = iValue;
		}
		else 
		{
			iVolume = 0;
		}
		
		return;
	}

	//---------------------------------------------------------------------
	//Getters
	//---------------------------------------------------------------------

	private void getColour(String szColour) 
	{
		szMaterial = szColour;
		return;
	}

	private void getFill() 
	{
		
		

	}

	private void getTemperature() 
	{


	}


	private int getVolume() 
	{

		return(iVolume);
		
	}

	public int getCapacity()
	{
		return(iCapacity);
	}

	public String getMaterial()
	{
		return(szMaterial);
	}
	//utilities
	
	public void Display()
	{
		
		
		
	}

	//testing
	public static void main(String[] args)
	{
		Mug myMug = new Mug(); // This produces the object (Mug)
		myMug.setCapacity(200);

		Mug yourMug = new Mug();
		yourMug.setCapacity(400); 


		System.out.println("Capacity = " + myMug.getCapacity() + " Material is : " + myMug.getMaterial()); //Gives out the object using the getCapacity method.
		System.out.println("Capacity = " + yourMug.getCapacity());
	}
}
