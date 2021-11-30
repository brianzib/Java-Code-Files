    import java.io.*;

    public class FileReaderAndWriter
     {

    public static void main(String[] args) throws IOException
    {

     
        String szUpdate = "File Currently not Written";
        System.out.println(szUpdate);

        String szUpdated = newF(szUpdate);
        System.out.println(szUpdated);


        String szInput = "";

        System.out.println( ReadFile(szInput));

    }


public static String newF(String szUpdate) throws IOException
{
    
    BufferedWriter bw = new BufferedWriter
    (new FileWriter("C:\\Users\\Oem\\OneDrive\\Documents\\Brian\\Computer Science\\Java\\output.txt"));
    
    bw.write("This");
    bw.write("is");
    bw.write("a");
    bw.write("test");
    bw.close();

    szUpdate = "File has now been Written";
    return szUpdate;
}

public static String ReadFile(String szInput) throws IOException
{
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Oem\\OneDrive\\Documents\\Brian\\Computer Science\\Java\\output.txt"));
    while ((szInput = br.readLine()) != null)
    {
        System.out.println(szInput);
    }
    br.close();
    
    
    return szInput;
}

    }

