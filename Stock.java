
package graphics;

import java.io.*;

public class Stock {

    public void addProduct(String filename, String name, String id, String price, String amount) throws FileNotFoundException, IOException {
        try (DataOutputStream wr = new DataOutputStream(new FileOutputStream(filename, true))) {
            wr.writeUTF(name);
            wr.writeUTF(id);
            wr.writeUTF(price);
            wr.writeUTF(amount);
            wr.writeUTF("\n");
            wr.flush();
            wr.close();
        }

    }

    public void searchProduct(String filename, String name) throws FileNotFoundException, IOException {
        boolean found = false;
        DataInputStream r = new DataInputStream(new FileInputStream(filename));
        try {
            while (r.available() > 1) {
                String n = (r.readUTF());
                String id = (r.readUTF());
                String pr = (r.readUTF());
                String am = (r.readUTF());

                if (n.equals(name)) {
                    System.out.println(n + " " + id + " " + pr + " " + am);
                    found = true;
                }
            }
            r.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        if (found == false) {
            System.out.println("Item not found");
        }

    }

    public void deleteProduct(String filename, String name) throws FileNotFoundException {

        boolean found = false;
        DataInputStream r = new DataInputStream(new FileInputStream(filename));
        DataOutputStream temp= new DataOutputStream(new FileOutputStream("temp.bin"));

        try {
            while (r.available() > 1) {
                String n = (r.readUTF());
                String id = (r.readUTF());
                String pr = (r.readUTF());
                String am = (r.readUTF());

                if (n.equals(name)) {
                    found = true;
                }
                else
                {
                    temp.writeUTF(n);
                    temp.writeUTF(id);
                    temp.writeUTF(pr);
                    temp.writeUTF(am);

                }

            }
            r.close();
            r.reset();
        } catch (IOException e) {
            System.out.println(e);
        }
        if (found == false) {
            System.out.println("Item not found");
        }


    }

    public void editProduct(String filename,String name , String editname) throws FileNotFoundException {
        boolean found = false;
        DataInputStream r = new DataInputStream(new FileInputStream(filename));
        DataOutputStream temp= new DataOutputStream(new FileOutputStream("temp.bin"));

        try {
            while (r.available() > 1) {
                String n = (r.readUTF());
                String id = (r.readUTF());
                String pr = (r.readUTF());
                String am = (r.readUTF());

                if (n.equals(name)) {
                    found = true;
                    temp.writeUTF(editname);
                    temp.writeUTF(id);
                    temp.writeUTF(pr);
                    temp.writeUTF(am);
                }
                else
                {
                    temp.writeUTF(n);
                    temp.writeUTF(id);
                    temp.writeUTF(pr);
                    temp.writeUTF(am);

                }

            }
            r.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        if (found == false) {
            System.out.println("Item not found");
        }
    }
    
}
