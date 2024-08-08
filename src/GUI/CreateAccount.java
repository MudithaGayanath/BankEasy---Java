
package GUI;


public class CreateAccount extends javax.swing.JFrame {

   
    public CreateAccount() {
        initComponents();
       subHeading.requestFocusInWindow();
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
        jComboBox1 = new javax.swing.JComboBox<>();
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

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

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
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        new CreateAccount2().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_nextActionPerformed

    private void initialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialsActionPerformed
       
    }//GEN-LAST:event_initialsActionPerformed

    private void initialsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initialsFocusGained
        initials.setText("");
    }//GEN-LAST:event_initialsFocusGained

    private void surNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surNameFocusGained
       surName.setText("");
    }//GEN-LAST:event_surNameFocusGained

    private void surNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surNameFocusLost
        if ( surName.getText().isEmpty()){
            surName.setText("Surname");
        }else{
            surName.setText(surName.getText());
        }
    }//GEN-LAST:event_surNameFocusLost

    private void initialsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initialsFocusLost
      if ( initials.getText().isEmpty()){
          initials.setText("Initials");
      }else{
          initials.setText(initials.getText());
      }
            
    }//GEN-LAST:event_initialsFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
       email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
         if ( email.getText().isEmpty()){
          email.setText("Email");
      }else{
          email.setText(email.getText());
      }
    }//GEN-LAST:event_emailFocusLost

    private void phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusGained
       phoneNumber.setText("");
    }//GEN-LAST:event_phoneNumberFocusGained

    private void phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusLost
        if ( phoneNumber.getText().isEmpty()){
          phoneNumber.setText("Phone Number");
      }else{
          phoneNumber.setText(phoneNumber.getText());
      }
    }//GEN-LAST:event_phoneNumberFocusLost

    private void nicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusGained
       nic.setText("");
    }//GEN-LAST:event_nicFocusGained

    private void nicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusLost
           if ( nic.getText().isEmpty()){
          nic.setText("NIC");
      }else{
          nic.setText(nic.getText());
      }
    }//GEN-LAST:event_nicFocusLost

    private void dobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusGained
      dob.setText("");
    }//GEN-LAST:event_dobFocusGained

    private void dobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusLost
         if ( dob.getText().isEmpty()){
          dob.setText("Date Of Birth");
      }else{
          dob.setText(dob.getText());
      }
    }//GEN-LAST:event_dobFocusLost

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField initials;
    private javax.swing.JComboBox<String> jComboBox1;
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
