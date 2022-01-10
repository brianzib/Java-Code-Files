import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CeaserShift
{
    public static void main (String [] args) throws IOException
    {
        int iShift = 0;
        int iAscii = 0;
        int iNewAscii = 0;
        int iLength = 0;
        
        char curChar;
        char newChar;

        String szInput;
		String szMessage;

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Please enter how many times you would like to shift your messsage");
        szInput = br.readLine();
        iShift = Integer.parseInt(szInput);

        System.out.println("Please enter your messsage");
		szMessage = br.readLine();

        iLength = szMessage.length();

        for (int i = 0; i > iLength; i++)
        {
            iAscii = (int) szMessage.charAt(i);   
            iNewAscii = iAscii + iShift;
            newChar = (char) iNewAscii;
            
        }
        
        }
    }

    /*
    public static char [] doShift(char [] alpha, char [] Shifted, int iShift,  String szMessgae) {
*/
}