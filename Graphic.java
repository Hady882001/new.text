
package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Graphic {

          public Graphic() throws IOException {
              
              Manager s=new Manager();
              Stock m=new Stock();
              
                    JFrame frame1 = new JFrame("Stock System");
                    JButton Man = new JButton("Manger");
                    JButton Use = new JButton("User");
                    frame1.add(Man);
                    frame1.add(Use);
                    frame1.setSize(1000,200);
                    frame1.setLayout(new FlowLayout());
                    frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame1.setLocationRelativeTo(null);


                    JFrame frame2 = new JFrame("Buy products");

                    frame2.setSize(1000,200);
                    frame2.setLayout(new FlowLayout());
                    frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame2.setLocationRelativeTo(null);


                    JFrame frame3 = new JFrame("choose products");
                    JButton Lap = new JButton("Laptops");
                    JButton Mob = new JButton("Mobiles");
                    JButton Pods = new JButton("Headphones");
                    JButton PS = new JButton("PlayStations");
                    frame3.add(Lap);
                    frame3.add(Mob);
                    frame3.add(Pods);
                    frame3.add(PS);
                    frame3.setSize(1000,200);
                    frame3.setLayout(new FlowLayout());
                    frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame3.setLocationRelativeTo(null);
                    
                    
                    JFrame frame4 = new JFrame("choose products");
                    JButton Lap1 = new JButton("Laptops");
                    JButton Mob1 = new JButton("Mobiles");
                    JButton Pods1 = new JButton("Headphones");
                    JButton PS1 = new JButton("PlayStations");
                    frame4.add(Lap1);
                    frame4.add(Mob1);
                    frame4.add(Pods1);
                    frame4.add(PS1);
                    frame4.setSize(1000,200);
                    frame4.setLayout(new FlowLayout());
                    frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame4.setLocationRelativeTo(null);
                    
                    JFrame frame12 = new JFrame("choose products");
                    JButton Lap2 = new JButton("Laptops");
                    JButton Mob2 = new JButton("Mobiles");
                    JButton Pods2 = new JButton("Headphones");
                    JButton PS2 = new JButton("PlayStations");
                    frame12.setSize(1000,200);
                    frame12.setLayout(new FlowLayout());
                    frame12.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame12.setLocationRelativeTo(null);
                    
                    
                      JFrame frame121 = new JFrame("Finished");
                    frame121.setSize(1000,200);
                    frame121.setLayout(new FlowLayout());
                    frame121.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame121.setLocationRelativeTo(null);
                    
   JFrame frame131 = new JFrame("Finished");
                    frame131.setSize(1000,200);
                    frame131.setLayout(new FlowLayout());
                    frame131.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame131.setLocationRelativeTo(null);
                    
                    
             JFrame frame13 = new JFrame("choose products");
              frame13.setSize(1000,200);
                    frame13.setLayout(new FlowLayout());
                    frame13.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame13.setLocationRelativeTo(null);
 JLabel enterz5=new JLabel("Choose category:");
                    JTextField prodz5=new JTextField(10);
                     JLabel enterz6=new JLabel("Product :");
                    JTextField prodz6=new JTextField(10);
                    JButton submitz1 = new JButton("submit");
                      frame13.add(enterz5);
                    frame13.add(prodz5);
                    frame13.add(enterz6);
                    frame13.add(prodz6);
                    frame13.add(submitz1);
                    

                    





                    JFrame frame5 = new JFrame("Sign in");
                    JLabel user = new JLabel("Username : ");
                    JLabel pass = new JLabel("Password : ");
                    JTextField user1 = new JTextField(15);
                    JTextField pass1 = new JPasswordField(15);
                    JButton Done = new JButton("Done");
                    String UserName = "Manager123";
                    String Passwords = "1234";
                    String Warning = "invalid";
                    frame5.add(user);
                    frame5.add(user1);
                    frame5.add(pass);
                    frame5.add(pass1);
                    frame5.add(Done);
                    frame5.setSize(1000,200);
                    frame5.setLayout(new FlowLayout());
                    frame5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame5.setLocationRelativeTo(null);

                    JFrame frame6 = new JFrame("Choice");
                    JButton Dis = new JButton("Display");
                    JButton Del = new JButton("Delete");
                 
                    JButton add = new JButton("add");
                    
                    JLabel Note = new JLabel("choice a function");
                    frame6.add(Note);
                    frame6.add(add);
                    frame6.add(Dis);
                    frame6.add(Del);
                   
                    frame6.setSize(1000,200);
                    frame6.setLayout(new FlowLayout());
                    frame6.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame6.setLocationRelativeTo(null);
                    

                   
                    
                    JFrame frame10=new JFrame("Products");
                    frame10.setSize(1000,200);
                    frame10.setLayout(new FlowLayout());
                    frame10.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame10.setLocationRelativeTo(null);
              

                    JFrame frame7 = new JFrame("Buy products");

                    frame7.setSize(1000,200);
                    frame7.setLayout(new FlowLayout());
                    frame7.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame7.setLocationRelativeTo(null);


                     JFrame frame8 = new JFrame("Buy products");

                    frame8.setSize(1000,200);
                    frame8.setLayout(new FlowLayout());
                    frame8.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame8.setLocationRelativeTo(null);

                     JFrame frame9 = new JFrame("Buy products");

                    frame9.setSize(1000,200);
                    frame9.setLayout(new FlowLayout());
                    frame9.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame9.setLocationRelativeTo(null);

                    JLabel enter=new JLabel("choose a product");
                    JTextField prod=new JTextField(10);
                    JLabel enter1=new JLabel("Product price");
                    JTextField prod1=new JTextField(10);
                    JLabel enter2=new JLabel("Product ID");
                    JTextField prod2=new JTextField(10);
                    JLabel enter3=new JLabel("Product amount");
                    JTextField prod3=new JTextField(10);
                    JButton submit = new JButton("submit");
                    
                    JLabel enterz4=new JLabel("Choose category:");
                    JTextField prodz4=new JTextField(10);
                     JLabel enterz=new JLabel("Product :");
                    JTextField prodz=new JTextField(10);
                    JLabel enterz1=new JLabel("Product price:");
                    JTextField prodz1=new JTextField(15);
                    JLabel enterz2=new JLabel("Product ID:");
                    JTextField prodz2=new JTextField(15);
                    JLabel enterz3=new JLabel("Product amount:");
                    JTextField prodz3=new JTextField(10);
                    JButton submitz = new JButton("submit");

                     frame12.add(enterz4);
                    frame12.add(prodz4);
                    frame12.add(enterz);
                    frame12.add(prodz);
                    frame12.add(enterz1);
                    frame12.add(prodz1);
                    frame12.add(enterz2);
                    frame12.add(prodz2);
                    
                    frame12.add(enterz3);
                    frame12.add(prodz3);
                    frame12.add(submitz);
                    
                    JPanel p1=new JPanel(new FlowLayout());
                    p1.add(enter);
                    p1.add(prod);
                    p1.add(enter1);
                    p1.add(prod1);
                    p1.add(enter2);
                    p1.add(prod2);
                    p1.add(enter3);
                    p1.add(prod3);
                    p1.add(submit);


                    JFrame rec=new JFrame("Receipt");
                    rec.setSize(1000,200);
                    rec.setLayout(new FlowLayout());
                    rec.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    rec.setLocationRelativeTo(null);

                    





                    frame1.setVisible(true);
                    Done.addActionListener((ActionEvent actionEvent) -> {
                        if (user1.getText().equals(UserName)&& pass1.getText().equals(Passwords) )
                            frame6.setVisible(true);
                        else
                            JOptionPane.showMessageDialog(null,Warning);
                    });



                    
                    String text=s.Display("Laptops.bin");
                    JLabel te=new JLabel(text);
                    frame2.add(te,BorderLayout.WEST);


                    Lap.addActionListener((ActionEvent actionEvent) -> {
                        frame2.add(p1,BorderLayout.EAST);
                        frame2.setVisible(true);
                    });



                      String text1=s.Display("Mobiles.bin");
                    JLabel te1=new JLabel(text1);
                    frame7.add(te1,BorderLayout.WEST);



                    Mob.addActionListener((ActionEvent actionEvent) -> {
                        frame7.add(p1,BorderLayout.EAST);
                        frame7.setVisible(true);
                    });


                       String text2=s.Display("Headphones.bin");
                    JLabel te2=new JLabel(text2);
                    frame8.add(te2,BorderLayout.WEST);


                    Pods.addActionListener((ActionEvent actionEvent) -> {
                        frame8.add(p1,BorderLayout.EAST);
                        frame8.setVisible(true);
                    });



                       String text3=s.Display("Playstations.bin");
                    JLabel te3=new JLabel(text3);
                    frame9.add(te3,BorderLayout.WEST);


                    PS.addActionListener((ActionEvent actionEvent) -> {
                        frame9.add(p1,BorderLayout.EAST);

                        frame9.setVisible(true);
                    });
                    Man.addActionListener((ActionEvent actionEvent) -> {
                       frame5.setVisible(true);
                    });

                    Use.addActionListener((ActionEvent actionEvent) -> {
                        frame3.setVisible(true);
                    });


                         JButton finish = new JButton("Finish");

                    JPanel pf=new JPanel();
                    pf.add(finish);




                     finish.addActionListener((ActionEvent actionEvent) -> {
                         System.exit(0);
                    });
                    rec.setLayout(new FlowLayout());
                    submit.addActionListener((ActionEvent actionEvent) -> {
                        rec.add(new JLabel("Your Product : "));
                        rec.add(new JLabel(prod.getText()));
                        rec.add(new JLabel("    "));

                        rec.add(new JLabel("With ID : "));
                        rec.add(new JLabel(prod1.getText()));
                        rec.add(new JLabel("    "));

                        rec.add(new JLabel("Having a price : "));
                        rec.add(new JLabel(prod2.getText()));
                        rec.add(new JLabel("    "));

                        rec.add(new JLabel("And Amount : "));
                        rec.add(new JLabel(prod3.getText()));
                        rec.add(new JLabel("            "));

                        rec.add(finish);

                        rec.setVisible(true);
        });


                    
                    
                    
                     Dis .addActionListener((ActionEvent actionEvent) -> {
                        frame4.setVisible(true);
                    });
                     
                    
                    String text11=s.Display("Laptops.bin");
                    JLabel te11=new JLabel(text11);
               


                    Lap1.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te11);
                        frame10.setVisible(true);
                    });
                    
                   
                    String text111=s.Display("Mobiles.bin");
                    JLabel te111=new JLabel(text111);
               


                    Mob1.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te111);
                        frame10.setVisible(true);
                    });
                    
                    
                    String text112=s.Display("Playstations.bin");
                    JLabel te112=new JLabel(text112);
               


                    PS1.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te112);
                        frame10.setVisible(true);
                    });
                    
                    String text113=s.Display("Headphones.bin");
                    JLabel te113=new JLabel(text113);
               


                    Pods1.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te113);
                        frame10.setVisible(true);
                    });
                    
                    
                    
                    
                    
                    
                    
                    
                    
                      add .addActionListener((ActionEvent actionEvent) -> {
                        frame12.setVisible(true);
                    });
                       Del.addActionListener((ActionEvent actionEvent) -> {
                           frame13.setVisible(true);
              });
                    String text14=s.Display("Laptops.bin");
                    JLabel te14=new JLabel(text14);
               


                    Lap2.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te14);
                        frame10.setVisible(true);
                    });
                    
                   
                    String text12=s.Display("Mobiles.bin");
                    JLabel te12=new JLabel(text12);
               


                    Mob2.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te12);
                        frame10.setVisible(true);
                    });
                    
                    
                    String text13=s.Display("Playstations.bin");
                    JLabel te13=new JLabel(text13);
               


                    PS2.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te13);
                        frame10.setVisible(true);
                    });
                    
                    String text15=s.Display("Headphones.bin");
                    JLabel te15=new JLabel(text15);
               


                    Pods2.addActionListener((ActionEvent actionEvent) -> {
                             frame10.add(te15);
                        frame10.setVisible(true);
                    });
                    
                    submitz.addActionListener((ActionEvent actionEvent) -> {
                             frame121.add(new JLabel(" Category: "+prodz.getText()));
                             frame121.add(new JLabel(" Product name : "+prodz1.getText()));
                             frame121.add(new JLabel(" Price: "+prodz2.getText()));
                             frame121.add(new JLabel(" ID : "+prodz3.getText()));
                             frame121.add(new JLabel(" Amount: "+prodz4.getText()));
                             frame121.add(new JLabel("                 Submitted and added to the file "));
                  try {
                      m.addProduct(prodz.getText().concat(".bin"), prodz1.getText(), prodz2.getText(), prodz3.getText(), prodz4.getText());
                  } catch (IOException ex) {
                      Logger.getLogger(Graphic.class.getName()).log(Level.SEVERE, null, ex);
                  }
                             
                        frame121.setVisible(true);
                    });
                    
                    submitz1.addActionListener((ActionEvent actionEvent) -> {
                             frame131.add(new JLabel(" Category: "+prodz5.getText()));
                             frame131.add(new JLabel(" Product name : "+prodz6.getText()));
                             frame131.add(new JLabel("                 Submitted and deleted from the file "));
                  try {
                      m.deleteProduct(prodz5.getText().concat(".bin"), text);
                  } catch (IOException ex) {
                      Logger.getLogger(Graphic.class.getName()).log(Level.SEVERE, null, ex);
                  }
                             
                        frame131.setVisible(true);
                    });
                    
                    
    }
}
