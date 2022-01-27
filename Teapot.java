import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Material {

	STEEL, CLAY, TIN;

}

public class Teapot {

	private Material szMaterial;
	private String szColour;

	private int iCapacity;
	private int iTemperature;
	private int iVolume;

	private boolean bEmpty = false;
	private boolean bBoiled = false;

	public Teapot() 
	{
		reset();
		return;
	}

	public void reset()
	{
		setCapacity(300);
		setTemperature(25);
		setFill(0);
		setColour("Blue");
		return;
	}


	public void wash()
	{
		setCapacity(0);
		setTemperature(0);
		setFill(0);
		setColour("");
		return;
	}

	private void setFill(int i) 
	{
		if (i> 0)
		{
			bEmpty = false;
			return;
		}
	}

	private void setBoiled(int i) 
	{
		if (i < 80)
		{
			bBoiled = false;
			return;
		}

		else 
		{
			bBoiled = true;
		}
	}

	public void setCapacity(int iValue)
	{
		iCapacity = iValue;	
		return;
	}

	public void setMaterial(Material m)
	{
		szMaterial = m;
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

	private String getColour() 
	{

		return(szColour);
	}

	private boolean getFill() 
	{
		return(bEmpty);
	}


	private boolean getBoiled() 
	{
		return(bBoiled);
	}

	private int getTemperature() 
	{
		return(iTemperature);
	}


	private int getVolume() 
	{

		return(iVolume);

	}

	public int getCapacity()
	{
		return(iCapacity);
	}

	public Material getMaterial()
	{
		return(szMaterial);
	}

	//utilities

	public void Display()
	{
		System.out.println("The capacity of the teapot is " + getCapacity());
		System.out.println("The teapots colour is " + getColour());
		System.out.println("The Teapot is made out of " + getMaterial());

		if (bBoiled = true)
		{
			System.out.println("The Teapot has been boiled, and is currently at the temperature of: " + getTemperature());
		}

		else 
		{
			System.out.println("The teapot has not been boiled and currently has the temperature of: " + getTemperature());	
		}

		if (bEmpty = false)
		{
			System.out.println("The current holding volume of the teapot is: " + getVolume());
		}

		else 
		{
			System.out.println("The teapot currently has no liquid inside");
		}
	}

	public void set() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Please enter the capacity of the teapot ");
		String szInput = br.readLine();
		int i = Integer.parseInt(szInput);

		setCapacity(i);

		System.out.println("Please enter the colour of the teapot ");
		szInput = br.readLine();

		setColour(szInput);

		System.out.println("Please enter the material of the teapot, steel, clay or tin. ");
		szInput = br.readLine();

		szInput = szInput.toLowerCase();

		if (szInput == "steel")
		{
			Material m = Material.STEEL;
			setMaterial(m);
		}
		
		if (szInput == "clay")
		{
			Material m = Material.CLAY;
			setMaterial(m);
		}
		
		if (szInput == "tin")
		{
			Material m = Material.TIN;
			setMaterial(m);
		}

		System.out.println("Please enter the current volume of the teapot ");
		szInput = br.readLine();
		i = Integer.parseInt(szInput);

		setVolume(i);
		setFill(i);

		System.out.println("Please enter the current temperature of the teapot ");
		szInput = br.readLine();
		i = Integer.parseInt(szInput);

		setTemperature(i);
		setBoiled(i);

	}





	public static void main(String[] args) throws IOException {

		Teapot myTeapot = new Teapot();

		myTeapot.set();

		myTeapot.Display();








	}

}
