import java.util.Random;

public class FruitMachine 
{

    public static void main (String [] args)
    {
        
        Random r = new Random();


        String [] szSymbols = {"Cherry", "Bell", "Lemon", "Orange" , "Star", "Skull"};

        
        
        for (int j = 0; j <= 2; j++)
        {
            int i = r.nextInt(0, 6); 
            String symbol = "";
            symbol += " " + szSymbols[i];
            System.out.println("The symbols you have gotten are " + symbol);

        }
        
    }


    
}