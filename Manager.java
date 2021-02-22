
package graphics;

import java.io.*;

public class Manager extends Stock {
   
    
    public String Display(String filename) throws FileNotFoundException, IOException
    {
        String file= "";
        try{


            DataInputStream x=new DataInputStream(new FileInputStream(filename));

            while(x.available()!=0)
            {

                file+=( x.readUTF()+" ");
                file+=( x.readUTF()+" ");
                file+=( x.readUTF()+" ");
                file+=( x.readUTF()+"\n");
            }
            x.close();

        }
        catch (IOException e)
        {
            System.out.println(e);

        }
        return file;
    }

}
