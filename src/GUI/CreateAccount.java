package GUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modal.Mysql;

public class CreateAccount extends javax.swing.JFrame {

    public HashMap<String,String> userData = new HashMap<>();

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_REGEX = "^07[0-8][0-9]{3}[0-9]{4}$";
    private static final String NIC_OLD_REGEX = "^[0-9]{9}V$";
    private static final String NIC_NEW_REGEX = "^[0-9]{12}$";

    public CreateAccount() {
        initComponents();
        subHeading.requestFocusInWindow();
        try {
            loadGender();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to load genders");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CreateAccount(HashMap map) {
        this();
        this.userData = map;
        setup();
    }
    
    private void loadGender() throws SQLException,ClassNotFoundException{
        ResultSet rs = Mysql.search("SELECT * FROM `gender`");
        Vector<String> gen = new Vector<>();
        gen.add("Gender");
        while ( rs.next()){
            gen.add(rs.getString("gender_name"));
        }
        gender.setModel(new DefaultComboBoxModel(gen));
    }

    private void setup() {
        initials.setText(String.valueOf(userData.get("initials")));
        surName.setText(String.valueOf(userData.get("surName")));
        email.setText(String.valueOf(userData.get("email")));
        phoneNumber.setText(String.valueOf(userData.get("phoneNumber")));
        nic.setText(String.valueOf(userData.get("nic")));
        dob.setText(String.valueOf(userData.get("dob")));
        gender.setSelectedItem(userData.get("gender"));
        System.out.println(userData.get("line2"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        subHeading = new javax.swing.JLabel();
        initials = new javax.swing.JTextField();
        surName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account Step-1");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bank Easy");

        subHeading.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        subHeading.setText("Personal Details ");

        initials.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        initials.setText("Initials");
        initials.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                initialsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                initialsFocusLost(evt);
            }
        });
        initials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialsActionPerformed(evt);
            }
        });

        surName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        surName.setText("Surname");
        surName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surNameFocusLost(evt);
            }
        });

        email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        phoneNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        phoneNumber.setText("Phone Number");
        phoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberFocusLost(evt);
            }
        });

        nic.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nic.setText("NIC");
        nic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nicFocusLost(evt);
            }
        });

        dob.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob.setText("Date Of Birth");
        dob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobFocusLost(evt);
            }
        });
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        next.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(phoneNumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private boolean validFilds() {
        if (initials.getText().equals("Initials")) {
            JOptionPane.showMessageDialog(this, "Initials requerd");
            initials.grabFocus();
            return true;
        } else if (initials.getText().startsWith(" ") | initials.getText().startsWith(".")) {
            JOptionPane.showMessageDialog(this, "Initials invalid");
            initials.grabFocus();
            return true;
        } else if (surName.getText().equals("Surname")) {
            JOptionPane.showMessageDialog(this, "Surname requerd");
            surName.grabFocus();
            return true;
        } else if (surName.getText().startsWith(" ") | surName.getText().startsWith(".")) {
            JOptionPane.showMessageDialog(this, "Surname invalid");
            surName.grabFocus();
            return true;
        } else if (email.getText().equals("Email")) {
            JOptionPane.showMessageDialog(this, "Email requerd");
            email.grabFocus();
            return true;
        } else if (CreateAccount.isValidEmail(email.getText())) {
            JOptionPane.showMessageDialog(this, "Email invalid");
            email.grabFocus();
            return true;
        } else if (phoneNumber.getText().equals("Phone Number")) {
            JOptionPane.showMessageDialog(this, "Phone Number requerd");
            phoneNumber.grabFocus();
            return true;
        } else if (CreateAccount.isValidPhoneNumber(phoneNumber.getText())) {
            JOptionPane.showMessageDialog(this, "Phone Number invalid");
            phoneNumber.grabFocus();
            return true;
        } else if (nic.getText().equals("NIC")) {
            JOptionPane.showMessageDialog(this, "NIC requerd");
            nic.grabFocus();
            return true;
        } else if (nic.getText().length() <= 10) {
            if (CreateAccount.isValidOldNic(nic.getText())) {
                JOptionPane.showMessageDialog(this, "NIC invalid");
                nic.grabFocus();
                return true;
            }else{}
        } else if (nic.getText().length() >= 12) {
            if (CreateAccount.isValidNewNic(nic.getText())) {
                JOptionPane.showMessageDialog(this, "NIC invalid");
                nic.grabFocus();
                return true;
            }else{}
        } else if (dob.getText().equals("Date Of Birth")) {
            JOptionPane.showMessageDialog(this, "Date Of Birth requerd");
            dob.grabFocus();
            return true;
        }else if ( gender.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Gender requerd");
            gender.grabFocus();
            return true;
        }
        return false;
        
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return !matcher.matches();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return !matcher.matches();
    }

    public static boolean isValidOldNic(String oldNic) {
        Pattern pattern = Pattern.compile(NIC_OLD_REGEX);
        Matcher matcher = pattern.matcher(oldNic);
        return !matcher.matches();
    }

    public static boolean isValidNewNic(String newNic) {
        Pattern pattern = Pattern.compile(NIC_NEW_REGEX);
        Matcher matcher = pattern.matcher(newNic);
        return !matcher.matches();
    }

    private void putData() {
        userData.put("initials", initials.getText());
        userData.put("surName", surName.getText());
        userData.put("email", email.getText());
        userData.put("phoneNumber", phoneNumber.getText());
        userData.put("nic", nic.getText());
        userData.put("dob", dob.getText());
        userData.put("gender", String.valueOf(gender.getSelectedItem()));
        
    }
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (validFilds()) {} else {
            putData();
            new CreateAccount2(userData).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_nextActionPerformed

    private void initialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialsActionPerformed

    }//GEN-LAST:event_initialsActionPerformed

    private void initialsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initialsFocusGained

        if (initials.getText().equals("Initials")) {
            initials.setText("");
        } else {
            initials.setText(initials.getText());
        }
    }//GEN-LAST:event_initialsFocusGained

    private void surNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surNameFocusGained

        if (surName.getText().equals("Surname")) {
            surName.setText("");
        } else {
            surName.setText(surName.getText());
        }
    }//GEN-LAST:event_surNameFocusGained

    private void surNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surNameFocusLost
        if (surName.getText().isEmpty()) {
            surName.setText("Surname");
        } else {
            surName.setText(surName.getText());
        }
    }//GEN-LAST:event_surNameFocusLost

    private void initialsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initialsFocusLost
        if (initials.getText().isEmpty()) {
            initials.setText("Initials");
        } else {
            initials.setText(initials.getText());
        }

    }//GEN-LAST:event_initialsFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if (email.getText().equals("Email")) {
            email.setText("");
        } else {
            email.setText(email.getText());
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().isEmpty()) {
            email.setText("Email");
        } else {
            email.setText(email.getText());
        }
    }//GEN-LAST:event_emailFocusLost

    private void phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusGained
        if (phoneNumber.getText().equals("Phone Number")) {
            phoneNumber.setText("");
        } else {
            phoneNumber.setText(phoneNumber.getText());
        }
    }//GEN-LAST:event_phoneNumberFocusGained

    private void phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusLost
        if (phoneNumber.getText().isEmpty()) {
            phoneNumber.setText("Phone Number");
        } else {
            phoneNumber.setText(phoneNumber.getText());
        }
    }//GEN-LAST:event_phoneNumberFocusLost

    private void nicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusGained
        if (nic.getText().equals("NIC")) {
            nic.setText("");
        } else {
            nic.setText(nic.getText());
        }
    }//GEN-LAST:event_nicFocusGained

    private void nicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusLost
        if (nic.getText().isEmpty()) {
            nic.setText("NIC");
        } else {
            nic.setText(nic.getText());
        }
    }//GEN-LAST:event_nicFocusLost

    private void dobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusGained
        if (dob.getText().equals("Date Of Birth")) {
            dob.setText("");
        } else {
            dob.setText(dob.getText());
        }
    }//GEN-LAST:event_dobFocusGained

    private void dobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusLost
        if (dob.getText().isEmpty()) {
            dob.setText("Date Of Birth");
        } else {
            dob.setText(dob.getText());
        }
    }//GEN-LAST:event_dobFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField initials;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel subHeading;
    private javax.swing.JTextField surName;
    // End of variables declaration//GEN-END:variables
}
