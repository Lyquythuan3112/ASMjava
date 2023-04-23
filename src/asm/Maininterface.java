/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class Maininterface extends javax.swing.JFrame {

    /**
     * Creates new form Maininterface
     */
    public Maininterface() {
        initComponents();
        fillYearComboBox();
        fillMonthComboBox();
    }
private void fillYearComboBox() {
           int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
        for (int i = 1970; i <= currentYear; i++) {
            yearModel.addElement(String.valueOf(i));
        }
        Year.setModel(yearModel);
    }
private void fillMonthComboBox() {
        DefaultComboBoxModel monthModel = new DefaultComboBoxModel();
        monthModel.addElement("January");
        monthModel.addElement("February");
        monthModel.addElement("March");
        monthModel.addElement("April");
        monthModel.addElement("May");
        monthModel.addElement("June");
        monthModel.addElement("July");
        monthModel.addElement("August");
        monthModel.addElement("September");
        monthModel.addElement("October");
        monthModel.addElement("November");
        monthModel.addElement("December");
        Month.setModel(monthModel);
    }
private void fillDayComboBox(int daysInMonth) {
        DefaultComboBoxModel dayModel = new DefaultComboBoxModel();
    for (int i = 1; i <= daysInMonth; i++) {
        dayModel.addElement(String.valueOf(i));
    }
    Day.setModel(dayModel);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Major = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Male = new javax.swing.JCheckBox();
        Female = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Day = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Classes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit(evt);
            }
        });

        jButton3.setText("Delete");

        jLabel1.setText("Name");

        jLabel2.setText("Class");

        jLabel3.setText("Major");

        jLabel4.setText("Address");

        jLabel5.setText("Email");

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Male(evt);
            }
        });

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Female(evt);
            }
        });

        jLabel6.setText("Gender");

        jLabel8.setText("Month");

        jLabel9.setText("Year");

        jLabel10.setText("Day");

        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Class", "Major", "Gender", "Address", "Email", "Year", "Month", "Day"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Table(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Classes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5", "E1", "E2", "E3", "E4", "E5", "F1", "F2", "F3", "F4", "F5" }));
        Classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Classes(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Male)
                        .addGap(18, 18, 18)
                        .addComponent(Female))
                    .addComponent(Name)
                    .addComponent(Major)
                    .addComponent(Classes, 0, 281, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Address)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Male)
                                    .addComponent(Female)
                                    .addComponent(jLabel6))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
          String selectedMonth = (String) Month.getSelectedItem();
        int daysInMonth = 0;
        switch (selectedMonth) {
            case "February" -> {
                int selectedYear = Integer.parseInt((String) Year.getSelectedItem());
                if ((selectedYear % 4 == 0 && selectedYear % 100 != 0) || selectedYear % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }
            case "April", "June", "September", "November" -> daysInMonth = 30;
            default -> daysInMonth = 31;
        }
        fillDayComboBox(daysInMonth);
    }//GEN-LAST:event_YearActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
        String selectedMonth = (String) Month.getSelectedItem();
        int daysInMonth = 0;
        switch (selectedMonth) {
            case "February" -> {
                int selectedYear = Integer.parseInt((String) Year.getSelectedItem());
                if ((selectedYear % 4 == 0 && selectedYear % 100 != 0) || selectedYear % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }
            case "April", "June", "September", "November" -> daysInMonth = 30;
            default -> daysInMonth = 31;
        }
        fillDayComboBox(daysInMonth);
    }//GEN-LAST:event_MonthActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayActionPerformed

    private void Classes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Classes
        // TODO add your handling code here:
    }//GEN-LAST:event_Classes

    private void Male(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Male
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Male

    private void Female(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Female
        // TODO add your handling code here:
    }//GEN-LAST:event_Female

    private void Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add
        // TODO add your handling code here:
    try {
        FileWriter fw = new FileWriter("students.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
        String name = Name.getText();
        String studentClass = Classes.getSelectedItem().toString();
        String major = Major.getText();
        String address = Address.getText();
        String email = Email.getText();
        String year = Year.getSelectedItem().toString();
        String month = Month.getSelectedItem().toString();
        String day = Day.getSelectedItem().toString();

        pw.println(name + "," + studentClass + "," + major + "," + address + "," + email + "," + year + "," + month + "," + day);
        pw.flush();
        pw.close();
        JOptionPane.showMessageDialog(null, "Student added to file successfully.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
    }
    // clear the form
    Name.setText("");
    Male.setSelected(true);
    Year.setSelectedIndex(0);
    Month.setSelectedIndex(0);
    Day.setSelectedIndex(0);
    Classes.setSelectedIndex(0);
    }//GEN-LAST:event_Add

    private void Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit
        // TODO add your handling code here:
         try {
        File file = new File("students.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        
        // Find the student record to be edited and update it
        String studentName = Name.getText();
        boolean found = false;
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            if (parts[0].equals(studentName)) {
                parts[1] = Classes.getSelectedItem().toString();
                parts[2] = Major.getText();
                parts[3] = Address.getText();
                parts[4] = Email.getText();
                parts[5] = Year.getSelectedItem().toString();
                parts[6] = Month.getSelectedItem().toString();
                parts[7] = Day.getSelectedItem().toString();
                lines.set(i, String.join(",", parts));
                found = true;
                break;
            }
        }
        
        if (found) {
            // Write the updated ArrayList back to the file
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            for (String line : lines) {
                pw.println(line);
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Record updated successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Student not found.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
    }
    }//GEN-LAST:event_Edit

    private void Table(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table
        // TODO add your handling code here:
        File file = new File("Students.txt");

    try {
        // Create a Scanner object to read data from the file
        Scanner scanner = new Scanner(file);

        // Create a DefaultTableModel object to hold the data for the JTable
        DefaultTableModel model = new DefaultTableModel();

        // Add the columns to the DefaultTableModel object
        model.addColumn("Name");
        model.addColumn("Class");
        model.addColumn("Major");
        model.addColumn("Address");
        model.addColumn("Email");
        model.addColumn("Year");
        model.addColumn("Month");
        model.addColumn("Day");

        // Loop through each line of the file, splitting the data using a delimiter
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");

            // Add each row of data to the DefaultTableModel object
            model.addRow(data);
        }

        // Set the JTable's model to the DefaultTableModel object
        jTable1.setModel(model);

        // Close the Scanner object
        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_Table

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
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maininterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Address;
    private javax.swing.JComboBox<String> Classes;
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JTextField Email;
    private javax.swing.JCheckBox Female;
    private javax.swing.JTextField Major;
    private javax.swing.JCheckBox Male;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
