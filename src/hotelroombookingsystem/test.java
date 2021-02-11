/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelroombookingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
class Customer
{
protected String name, icpp, email;
protected int phnum;
Customer(String n, String i, int p, String e)
{
    name = n;
    icpp = i;
    email = e;
    phnum = p;
}
}
class Booking extends Customer
{
    protected String daytostay, roomid, date, dateafter;
    Booking(String n, String i, int p, String e,String r, String d,String dts, String da)
    {
        super(n,i,p,e);
        date = d;
        dateafter = da;
        daytostay = dts;
        roomid = r;
    }
    public String getName()
    {
        return name;
    }
    public String geticpp()
    {
        return icpp;
    }
    public int getphnum()
    {
        return phnum;
    }
    public String getemail()
    {
        return email;
    }
    public String getroomid()
    {
        return roomid;
    }
    public String getdateafter()
    {
        return dateafter;
    }
    public String getdate()
    {
        return date;
    }public String getdaytostay()
    {
        return daytostay;
    }   
}
/**
 *
 * @author Jordan
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Booking.txt");
      try
      {
          Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext())
        {
              String n = inputFile.nextLine();
              String i = inputFile.nextLine();
              int p = inputFile.nextInt();
              inputFile.nextLine();
              String e = inputFile.nextLine();
              String r = inputFile.nextLine();
              String d = inputFile.nextLine();
              String dts = inputFile.nextLine();
              String da = inputFile.nextLine();
              inputFile.nextLine();
              Booking room = new Booking(n,i,p,e,r,d,dts,da);
         for (int z =1; z<21; z++){
             System.out.println("Room available for :"+z );
        if (room.getroomid().equals("Room "+z))
        {     
                 System.out.println("Room not available for :"+z );        
        }
        else
        {
            break;
        }
        continue;
         }
        }
          inputFile.close();
        }
      
      catch(FileNotFoundException  ex)
      {
           System.out.println("Unable to open file due to "+ex);
                    
    }
      
    

    }
}
