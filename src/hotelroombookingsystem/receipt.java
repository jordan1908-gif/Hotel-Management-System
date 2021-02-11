/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelroombookingsystem;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;





/**
 *
 * @author Jordan
 */
public class receipt extends javax.swing.JFrame {
    public receipt() {
        initComponents();
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        TableColumn col = jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(150);
        col=jTable1.getColumnModel().getColumn(1);
        col.setPreferredWidth(220);
        col=jTable1.getColumnModel().getColumn(2);
        col.setPreferredWidth(150);
        col=jTable1.getColumnModel().getColumn(3);
        col.setPreferredWidth(160);
        col=jTable1.getColumnModel().getColumn(4);
        col.setPreferredWidth(100);
        col=jTable1.getColumnModel().getColumn(5);
        col.setPreferredWidth(120);
        col=jTable1.getColumnModel().getColumn(6);
        col.setPreferredWidth(140);
        col=jTable1.getColumnModel().getColumn(7);
        col.setPreferredWidth(140);
       
    }
    
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
    }
    public String getdaytostay()
    {
        return daytostay;
    }   
}
Calendar c = new GregorianCalendar();
Calendar cextra = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    /**
     * Creates new form receipt
     */
    
    
    void resafe()
{
    try
        {
	    File file = new File("Bookingnew.txt");
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

                receipt.Booking room = new receipt.Booking(n,i,p,e,r,d,dts,da);
               
                     FileWriter fw = new FileWriter("Booking.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(room.getName());
                    bw.newLine();
                    bw.write(room.geticpp());
                    bw.newLine();
                    bw.write(String.valueOf(room.getphnum()));
                    bw.newLine();
                    bw.write(room.getemail());
                    bw.newLine();
                    bw.write(room.getroomid());
                    bw.newLine();
                    bw.write(room.getdate());
                    bw.newLine();
                    bw.write(room.getdaytostay());
                    bw.newLine();
                    bw.write(room.getdateafter());
                    bw.newLine();
                    bw.newLine();
                    bw.close();
                    
                
            }
            inputFile.close();
            JOptionPane.showMessageDialog(null,"Record Deleted","SYSTEM",JOptionPane.INFORMATION_MESSAGE);
            file.delete();
        }
        catch( IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Error: "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cbICNO = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbDos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtCheckout = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttotalprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtICPP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menubar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuitemhomepage = new javax.swing.JMenuItem();
        menuitemcreatebooking = new javax.swing.JMenuItem();
        menuitemviewbooking = new javax.swing.JMenuItem();
        menuitemeditbooking = new javax.swing.JMenuItem();
        menuitemdeletebooking = new javax.swing.JMenuItem();
        menuitemreceipt = new javax.swing.JMenuItem();
        exitmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        jDateChooser1.setToolTipText("");
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(cextra.getTime());
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        cbICNO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer IC" }));
        cbICNO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbICNOItemStateChanged(evt);
            }
        });
        cbICNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbICNOActionPerformed(evt);
            }
        });

        txtEmail.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Room ID:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Days of stay:");

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Check In Date");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Receipt");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Price Per Day:");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("RM 350");

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Service Tax:");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("10%");

        cbDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "1 day", "2 days", "3 days", "4 days", "5 days", "6 days", "7 days" }));
        cbDos.setEnabled(false);
        cbDos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDosItemStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Tourism Tax(Per Night):");

        txtCheckout.setEditable(false);
        txtCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckoutActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("RM 10");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Final Price:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Check Out Date");

        txttotalprice.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("IC/ Passport:");

        txtICPP.setEditable(false);
        txtICPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtICPPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Contact No:");

        cbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Room1", "Room2", "Room3", "Room4", "Room5", "Room6", "Room7", "Room8", "Room9", "Room10", "Room11", "Room12", "Room13", "Room14", "Room15", "Room16", "Room17", "Room18", "Room19", "Room20" }));
        cbID.setEnabled(false);

        txtPhone.setEditable(false);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Print Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtReceipt.setEditable(false);
        txtReceipt.setColumns(20);
        txtReceipt.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        txtReceipt.setRows(5);
        jScrollPane2.setViewportView(txtReceipt);

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "IC/ Passport", "Contact No", "Room ID", "Check In Date", "Check Out Date", "Final Price"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtICPP)
                                .addComponent(txtPhone)
                                .addComponent(cbID, 0, 154, Short.MAX_VALUE)
                                .addComponent(txtName))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(cbICNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cbICNO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbDos)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtICPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbID)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txttotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        File file = new File("Booking.txt");
        try
        {
            Scanner inputFile = new Scanner(file);
            test: while (inputFile.hasNext())
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
                cbICNO.addItem(room.geticpp());
            }

            inputFile.close();
        }

        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file due to "+ex);

        }

        menu.setText("MENU");

        menuitemhomepage.setText("Homepage");
        menuitemhomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemhomepageActionPerformed(evt);
            }
        });
        menu.add(menuitemhomepage);

        menuitemcreatebooking.setText("Create Booking");
        menuitemcreatebooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcreatebookingActionPerformed(evt);
            }
        });
        menu.add(menuitemcreatebooking);

        menuitemviewbooking.setText("View Booking");
        menuitemviewbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemviewbookingActionPerformed(evt);
            }
        });
        menu.add(menuitemviewbooking);

        menuitemeditbooking.setText("Edit Booking");
        menuitemeditbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemeditbookingActionPerformed(evt);
            }
        });
        menu.add(menuitemeditbooking);

        menuitemdeletebooking.setText("Delete Booking");
        menuitemdeletebooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemdeletebookingActionPerformed(evt);
            }
        });
        menu.add(menuitemdeletebooking);

        menuitemreceipt.setText("Receipt");
        menuitemreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemreceiptActionPerformed(evt);
            }
        });
        menu.add(menuitemreceipt);

        menubar.add(menu);

        exitmenu.setText("EXIT");
        exitmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitmenuMouseClicked(evt);
            }
        });

        menubar.add(Box.createHorizontalGlue());

        menubar.add(exitmenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemhomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemhomepageActionPerformed
        //to go to home page
        homepage homepage = new homepage();//set homepage as homepage
        homepage.setVisible(true);//open homepage page
        this.setVisible(false);//close current page

    }//GEN-LAST:event_menuitemhomepageActionPerformed

    private void menuitemcreatebookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcreatebookingActionPerformed
        //to go to create booking page
        createbooking c = new createbooking();// set create booking as c
        c.setVisible(true);// open create booking page
        this.setVisible(false);// close current page
    }//GEN-LAST:event_menuitemcreatebookingActionPerformed

    private void menuitemviewbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemviewbookingActionPerformed
        //to go to view booking page
        viewbooking page = new viewbooking();// set view booking as page
        page.setVisible(true);//open view booking page
        this.setVisible(false);//close current page
    }//GEN-LAST:event_menuitemviewbookingActionPerformed

    private void menuitemeditbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemeditbookingActionPerformed
        //to go to edit booking page
        editbooking c = new editbooking();// set editbooking as c
        c.setVisible(true);// open edit booking page
        this.setVisible(false);// close this page
    }//GEN-LAST:event_menuitemeditbookingActionPerformed

    private void menuitemdeletebookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemdeletebookingActionPerformed
        //to go to delete booking page
        deletebooking c = new deletebooking();//set delete booking as c
        c.setVisible(true);//open delete booking page
        this.setVisible(false);//close this page
    }//GEN-LAST:event_menuitemdeletebookingActionPerformed

    private void menuitemreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemreceiptActionPerformed
        //to go to receipt page
        receipt c = new receipt();// set receipt as c
        c.setVisible(true);//open receipt page
        this.setVisible(false);//close this page
    }//GEN-LAST:event_menuitemreceiptActionPerformed

    private void exitmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitmenuMouseClicked
        int n = JOptionPane.showConfirmDialog(null,"Would you like to terminate?","Terminate System",JOptionPane.YES_NO_OPTION);//pop up box asking confirmation to exit the application
        if(n==JOptionPane.YES_OPTION)//if yes is clicked
        System.exit(0);//application exit

    }//GEN-LAST:event_exitmenuMouseClicked

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        char car = evt.getKeyChar();
        if(Character.isDigit(car) || car == KeyEvent.VK_BACK_SPACE)
        {
            txtPhone.setEditable(true);
        }
        else
        {
            txtPhone.setEditable(false);
        }
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckoutActionPerformed

    private void cbDosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDosItemStateChanged
        String dayofstay= cbDos.getSelectedItem().toString();
        if (dayofstay.equals("Please Select"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 0);
        }else if (dayofstay.equals("1 day"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 1);
        }else if (dayofstay.equals("2 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 2);
        }else if (dayofstay.equals("3 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 3);
        }else if (dayofstay.equals("4 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 4);
        }else if (dayofstay.equals("5 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 5);
        }else if (dayofstay.equals("6 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 6);
        }else if (dayofstay.equals("7 days"))
        {
            c.setTime(jDateChooser1.getDate());
            c.add(Calendar.DAY_OF_MONTH, 7);
        }
        txtCheckout.setText(sdf.format(c.getTime()));
    }//GEN-LAST:event_cbDosItemStateChanged

    private void cbICNOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbICNOItemStateChanged
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
                String checkicpp = String.valueOf(cbICNO.getSelectedItem());
                if (room.geticpp().equals(checkicpp))
                {
                    txtName.setText(room.getName());
                    txtICPP.setText(room.geticpp());
                    txtPhone.setText(Integer.toString(room.getphnum()));
                    txtEmail.setText(room.getemail());
                    cbID.setSelectedItem(room.getroomid());
                    jDateChooser1.setDate(sdf.parse(room.getdate()));
                    cbDos.setSelectedItem(room.getdaytostay());
                    txtCheckout.setText(room.getdateafter());
                    int day = 0;
                    if (room.getdaytostay().equals("1 day"))
                    {
                        day = 1;
                    } else if (room.getdaytostay().equals("2 days"))
                    {
                        day = 2;
                    }else if (room.getdaytostay().equals("3 days"))
                    {
                        day = 3;
                    }else if (room.getdaytostay().equals("4 days"))
                    {
                        day = 4;
                    }else if (room.getdaytostay().equals("5 days"))
                    {
                        day = 5;
                    }else if (room.getdaytostay().equals("6 days"))
                    {
                        day = 6;
                    }else if (room.getdaytostay().equals("7 days"))
                    {
                        day = 7;
                    }
                    DecimalFormat df2 = new DecimalFormat("#.##");
                    double price = 350 * day;
                    double tax = price * 10 /100;
                    double finalprice = price + tax + (10*day);
                    txttotalprice.setText("RM"+df2.format(finalprice));
                } else if (checkicpp.equals("Customer IC"))
                {
                    txtName.setText("");
                    txtICPP.setText("");
                    txtPhone.setText("");
                    txtEmail.setText("");
                    cbID.setSelectedIndex(0);
                    jDateChooser1.setDate(cextra.getTime());
                    cbDos.setSelectedIndex(0);
                    txtCheckout.setText("");
                    txttotalprice.setText("");
                }
            }

            inputFile.close();
        }

        catch(FileNotFoundException | ParseException ex)
        {
            System.out.println("Unable to open file due to "+ex);

        }
    }//GEN-LAST:event_cbICNOItemStateChanged

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        cbDos.setSelectedIndex(0);
        txtCheckout.setText("");
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void cbICNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbICNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbICNOActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtICPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtICPPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (String.valueOf(cbICNO.getSelectedItem()).equals("Customer IC"))
      {
          JOptionPane.showMessageDialog(null,"Please select a user to save receipt!","SYSTEM",JOptionPane.ERROR_MESSAGE);
      }
      else
      {
        
        String name = txtName.getText();
        String email = txtEmail.getText();
        String ic = txtICPP.getText();
        String phone = txtPhone.getText();
        String cbid = cbID.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String din = dateFormat.format(jDateChooser1.getDate());
        String dateafter = txtCheckout.getText();
        String totalprice = txttotalprice.getText();
        
        try 
        {
            FileWriter Writer = new FileWriter("receipt.txt",true);
            Writer.write(""+name+" "+email+" "+ic+" "+phone+" "+cbid+" "+din+" "+dateafter+" "+totalprice);
            Writer.write(System.getProperty("line.separator"));
            
            Writer.close();
            JOptionPane.showMessageDialog(null, "Successfully saved!");
            setVisible(false);
            new receipt().setVisible(true);
        }
        
         catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Error");
        }
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String filePath="C:\\Users\\Razer\\Documents\\NetBeansProjects\\hotelroombookingsystem\\receipt.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i=0; i< lines.length; i++) {
                String[] row= lines[i].toString().split(" ");
                model.addRow(row);
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (String.valueOf(cbICNO.getSelectedItem()).equals("Customer IC"))
      {
          JOptionPane.showMessageDialog(null,"Please select a user before printing receipt!","SYSTEM",JOptionPane.ERROR_MESSAGE);
      }
       else {
        try {
            txtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                 if (String.valueOf(cbICNO.getSelectedItem()).equals("Customer IC"))
      {
          JOptionPane.showMessageDialog(null,"Please select a user before resetting!","SYSTEM",JOptionPane.ERROR_MESSAGE);
      }
                 else {   
                    cbICNO.setSelectedIndex(0);
                    txtName.setText("");
                    txtICPP.setText("");
                    txtPhone.setText("");
                    txtEmail.setText("");
                    cbID.setSelectedIndex(0);
                    jDateChooser1.setDate(cextra.getTime());
                    cbDos.setSelectedIndex(0);
                    txtCheckout.setText("");
                    txttotalprice.setText("");
                    txtReceipt.setText("");
                 }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if (String.valueOf(cbICNO.getSelectedItem()).equals("Customer IC"))
      {
          JOptionPane.showMessageDialog(null,"Please select a user before previewing receipt!","SYSTEM",JOptionPane.ERROR_MESSAGE);
      }
else {
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtReceipt.append("\t BOOKING RECEIPT FOR HOTEL 123 \n\n" +
               
               "Customer IC No:\t\t" + txtICPP.getText()+ "\n\n"+
               "Customer Name:\t\t" + txtName.getText()+ "\n\n" +
               "Contact No:\t\t\t" + txtPhone.getText()+ "\n\n" +
               "Email:\t\t\t" + txtEmail.getText()+ "\n\n" +
               "Room ID:\t\t\t" + cbID.getSelectedItem()+ "\n\n" +
               "Check In Date:\t\t\t" + dateFormat.format(jDateChooser1.getDate())+ "\n\n" +
               "Days of stay:\t\t\t" + cbDos.getSelectedItem()+ "\n\n" +
               "Check Out Date:\t\t" + txtCheckout.getText()+ "\n\n" +
               "Price per day:\t\t\t RM350  \n\n" + 
               "Tourism tax per night:\t\t RM10 \n\n" +
               "Service tax:\t\t\t 10% \n" +
               "\n===================================================================\n"+
               "Final Price:\t\t\t" + txttotalprice.getText()+ "\n" 
               
               );
}
    }//GEN-LAST:event_jButton5ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox<String> cbDos;
    private javax.swing.JComboBox<String> cbICNO;
    protected javax.swing.JComboBox<String> cbID;
    private javax.swing.JMenu exitmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem menuitemcreatebooking;
    private javax.swing.JMenuItem menuitemdeletebooking;
    private javax.swing.JMenuItem menuitemeditbooking;
    private javax.swing.JMenuItem menuitemhomepage;
    private javax.swing.JMenuItem menuitemreceipt;
    private javax.swing.JMenuItem menuitemviewbooking;
    protected javax.swing.JTextField txtCheckout;
    protected javax.swing.JTextField txtEmail;
    protected javax.swing.JTextField txtICPP;
    protected javax.swing.JTextField txtName;
    protected javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtReceipt;
    protected javax.swing.JTextField txttotalprice;
    // End of variables declaration//GEN-END:variables
}
