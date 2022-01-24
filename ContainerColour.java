
public enum ContainerColour 
{

	NOT_SET(0), Rainbow (1) , Black(2), White(3), Red(4), Organge(5), Yellow(6), Green(7), Blue(8), Indigo(9), Violet(10);

	private int iValue;

	private ContainerColour(int v)
	{
		iValue = v;
		return;
	}

	public int getValue()
	{
		return(iValue);
	}

}
