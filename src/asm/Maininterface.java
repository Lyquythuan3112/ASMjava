/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    Students student; 

    /**
     * Creates new form Maininterface
     */
    public Maininterface() {
        initComponents();
        fillYearComboBox();
        fillMonthComboBox();
        Save.setVisible(false);
    }
    
    // method to save a student to file
    private void saveStudent() {
        try {
            FileWriter fw = new FileWriter("students.txt", true);
            String id;
            String name;
            String studentClass;
            String gender;
            String major;
            String address;
            String email;
            String year;
            String month;
            String day;
            try (PrintWriter pw = new PrintWriter(fw)) {
                id = ID.getText();
                name = Name.getText();
                studentClass = Classes.getSelectedItem().toString();
                gender = Gender.getSelectedItem().toString();
                major = Major.getText();
                address = Address.getText();
                email = Email.getText();
                {
                    if (!email.contains("@Gmail.com")) {
                        JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }  
                year = Year.getSelectedItem().toString();
                month = Month.getSelectedItem().toString();
                day = Day.getSelectedItem().toString();

                // check if ID already exists
                try (Scanner scanner = new Scanner(new File("students.txt"))) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");
                        if (parts[0].equals(id)) {
                            JOptionPane.showMessageDialog(null, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
                    return;
                }

                // write student to file
                pw.println(id + "," + name + "," + studentClass + "," + gender + "," + major + "," + address + "," + email + "," + year + "," + month + "," + day);
                pw.flush();
            }
            JOptionPane.showMessageDialog(null, "Student added to file successfully.");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
        }
    }


    public class Students{
        // Declare the fields
private String id;
private String name;
private String studentClass;
private String gender;
private String major;
private String address;
private String email;
private String year;
private String month;
private String day;

// Define the getters and setters
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getStudentClass() {
    return studentClass;
}

public void setStudentClass(String studentClass) {
    this.studentClass = studentClass;
}

public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}

public String getMajor() {
    return major;
}

public void setMajor(String major) {
    this.major = major;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getYear() {
    return year;
}

public void setYear(String year) {
    this.year = year;
}

public String getMonth() {
    return month;
}

public void setMonth(String month) {
    this.month = month;
}

public String getDay() {
    return day;
}

public void setDay(String day) {
    this.day = day;
}
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
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Major = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
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
        Refesh = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();

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

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Class");

        jLabel3.setText("Major");

        jLabel4.setText("Address");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel8.setText("Month");

        jLabel9.setText("Year");

        jLabel10.setText("Day");

        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Class", "Gender", "Major", "Address", "Email", "Year", "Month", "Day"
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
                ClassesActionPerformed(evt);
            }
        });

        Refesh.setText("Refesh");
        Refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefeshActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refesh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Classes, 0, 281, Short.MAX_VALUE)
                            .addComponent(Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Major, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Address, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(jButton2)
                    .addComponent(Delete)
                    .addComponent(Save)
                    .addComponent(Refesh))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add
        // Save the student
    saveStudent();
    
    // Clear the form
    ID.setText("");
    Name.setText("");
    Major.setText("");
    Gender.setSelectedIndex(0);
    Year.setSelectedIndex(0);
    Month.setSelectedIndex(0);
    Day.setSelectedIndex(0);
    Classes.setSelectedIndex(0);
    Address.setText("");
    Email.setText("");
    }//GEN-LAST:event_Add

    private void Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit
        // TODO add your handling code here:
        Save.setVisible(true);
    int selectedRow = jTable1.getSelectedRow();

    // Check if a row is actually selected
    if (selectedRow != -1) {
        // Get the values from each column of the selected row
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        String name = jTable1.getValueAt(selectedRow, 1).toString();
        String studentClass = jTable1.getValueAt(selectedRow, 2).toString();
        String gender = jTable1.getValueAt(selectedRow, 3).toString();
        String major = jTable1.getValueAt(selectedRow, 4).toString();
        String address = jTable1.getValueAt(selectedRow, 5).toString();
        String email = jTable1.getValueAt(selectedRow, 6).toString();
        String year = jTable1.getValueAt(selectedRow, 7).toString();
        String month = jTable1.getValueAt(selectedRow, 8).toString();
        String day = jTable1.getValueAt(selectedRow, 9).toString();

        // Populate the text fields in the form with the selected values
        ID.setText(id);
        Name.setText(name);
        Classes.setSelectedItem(studentClass);
        Gender.setSelectedItem(gender);
        Major.setText(major);
        Address.setText(address);
        Email.setText(email);
        Year.setSelectedItem(year);
        Month.setSelectedItem(month);
        Day.setSelectedItem(day);
    } else {
        // Show an error message if no row is selected
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
    }
    
    }//GEN-LAST:event_Edit

    private void Table(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table
        // TODO add your handling code here:
        
        File file = new File("Students.txt");

    try {
            // Create a DefaultTableModel object to hold the data for the JTable
            try ( // Create a Scanner object to read data from the file
                    Scanner scanner = new Scanner(file)) {
                // Create a DefaultTableModel object to hold the data for the JTable
                DefaultTableModel model = new DefaultTableModel();
                // Add the columns to the DefaultTableModel object
                model.addColumn("ID");
                model.addColumn("Name");
                model.addColumn("Class");
                model.addColumn("Gender");
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
                }       // Set the JTable's model to the DefaultTableModel object
                jTable1.setModel(model);
                // Disable editing of cells in the table
                jTable1.setDefaultEditor(Object.class, null);
                // Close the Scanner object
            }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_Table

    private void RefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefeshActionPerformed
        // TODO add your handling code here:
   File file = new File("Students.txt");

    try {
        // Create a Scanner object to read data from the file
        Scanner scanner = new Scanner(file);

        // Create a DefaultTableModel object to hold the data for the JTable
        DefaultTableModel model = new DefaultTableModel();

        // Add the columns to the DefaultTableModel object
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Class");
        model.addColumn("Gender");
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
    // clear the form
ID.setText("");
Name.setText("");
Major.setText("");
Year.setSelectedIndex(0);
Month.setSelectedIndex(0);
Day.setSelectedIndex(0);
Classes.setSelectedIndex(0);
    }//GEN-LAST:event_RefeshActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

    // If no row is selected, show an error message and return
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        return;
    }

    // Get the DefaultTableModel object from the JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Remove the selected row from the DefaultTableModel object
    model.removeRow(selectedRow);

    // Save the changes back to the file
    try {
        // Create a PrintWriter object to write data to the file
        PrintWriter writer = new PrintWriter(new FileWriter("Students.txt"));

        // Loop through each row of the DefaultTableModel object
        for (int i = 0; i < model.getRowCount(); i++) {
            // Loop through each column of the row
            for (int j = 0; j < model.getColumnCount(); j++) {
                // Write the value of the cell to the file, followed by a comma
                writer.print(model.getValueAt(i, j));

                if (j != model.getColumnCount() - 1) {
                    writer.print(",");
                }
            }

            // Write a new line character to separate the rows
            writer.println();
        }

        // Close the PrintWriter object
        writer.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error deleting row: " + e.getMessage());
    }
    }//GEN-LAST:event_DeleteActionPerformed
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow(); // get the selected row
    if (row == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
    } else {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String id = ID.getText();
        String name = Name.getText();
        String studentClass = Classes.getSelectedItem().toString();
        String gender = Gender.getSelectedItem().toString();
        String major = Major.getText();
        String address = Address.getText();
        String email = Email.getText();
        String year = Year.getSelectedItem().toString();
        String month = Month.getSelectedItem().toString();
        String day = Day.getSelectedItem().toString();

        // Check if the ID has been changed
        if (!id.equals(model.getValueAt(row, 0).toString())) {
            JOptionPane.showMessageDialog(null, "Sorry, you cannot change the ID.");
            ID.setText(model.getValueAt(row, 0).toString()); // Reset the ID fiel   d to the original value
            return; // Stop execution of the code
        }
        model.setValueAt(name, row, 1);
        model.setValueAt(studentClass, row, 2);
        model.setValueAt(gender, row, 3);
        model.setValueAt(major, row, 4);
        model.setValueAt(address, row, 5);
        if (!email.contains("@Gmail.com")) {
                        JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
        model.setValueAt(email, row, 6);}
        model.setValueAt(year, row, 7);
        model.setValueAt(month, row, 8);
        model.setValueAt(day, row, 9);

        // Write the updated data to the file
        try {
            File file = new File("students.txt");
            PrintWriter pw = new PrintWriter(file);

            for (int i = 0; i < model.getRowCount(); i++) {
                String rowData = "";
                for (int j = 0; j < model.getColumnCount(); j++) {
                    rowData += model.getValueAt(i, j).toString() + ",";
                }
                rowData = rowData.substring(0, rowData.length() - 1); // remove the last comma
                pw.println(rowData);
            }

            pw.close();
            JOptionPane.showMessageDialog(null, "Student information updated successfully.");
            Save.setVisible(false); // hide the save button
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
        }
Save.setVisible(false);
        // Clear the form
        ID.setText("");
        Name.setText("");
        Major.setText("");
        Year.setSelectedIndex(0);
        Month.setSelectedIndex(0);
        Day.setSelectedIndex(0);
        Classes.setSelectedIndex(0);
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        LoginInterface login = new LoginInterface();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void ClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesActionPerformed
        // TODO add your handling code here:
//        String[] classes = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5", "E1", "E2", "E3", "E4", "E5", "F1", "F2", "F3", "F4", "F5"};
//    DefaultComboBoxModel<String> classesModel =    new DefaultComboBoxModel<>(classes);
//    Classes.setModel(classesModel);
    }//GEN-LAST:event_ClassesActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

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
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Major;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Refesh;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
