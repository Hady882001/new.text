
package graphics;

import java.io.*;
import java.util.ArrayList;

public class User {
    ArrayList<String>ar=new ArrayList<>();
    
    public void Display(String filename) throws FileNotFoundException, IOException
    {
        try{

            try (DataInputStream x = new DataInputStream(new FileInputStream(filename))) {
                while(x.available()!=0)
                {
                    ar.add(x.readUTF()+" ");
                }
                System.out.println(ar);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }    
}
