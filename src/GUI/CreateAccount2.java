package GUI;
// For get user address details

import java.util.HashMap;
import javax.swing.JOptionPane;

public class CreateAccount2 extends javax.swing.JFrame {

    public HashMap<String,String> userData;

    public CreateAccount2(HashMap map) {
        initComponents();
        subHeading.requestFocusInWindow();
        this.userData = map;
        String val = userData.get("line1");
        if ( val != null ){
            setup();
        }
        
    }
    
    private void setup(){
        line1.setText(String.valueOf(userData.get("line1")));
        line2.setText(String.valueOf(userData.get("line2")));
        pro.setSelectedItem(userData.get("pro"));
        distric.setSelectedItem(userData.get("distric"));
        city.setSelectedItem(userData.get("city"));
        zipCoed.setText(String.valueOf(userData.get("zipCode")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        subHeading = new javax.swing.JLabel();
        line1 = new javax.swing.JTextField();
        line2 = new javax.swing.JTextField();
        pro = new javax.swing.JComboBox<>();
        distric = new javax.swing.JComboBox<>();
        city = new javax.swing.JComboBox<>();
        zipCoed = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account Step-2");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bank Easy");

        subHeading.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        subHeading.setText("Address Details");

        line1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        line1.setText("Line 1");
        line1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                line1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                line1FocusLost(evt);
            }
        });

        line2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        line2.setText("Line 2");
        line2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                line2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                line2FocusLost(evt);
            }
        });
        line2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line2ActionPerformed(evt);
            }
        });

        pro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Westen Province", "Central Province", "Sabaragamuwa Province" }));

        distric.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        distric.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kandy", "Kegalle", "colombo" }));

        city.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kegalle", "Deraniyagala", "Kandy", "peradeniya" }));

        zipCoed.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zipCoed.setText("Zip Code");
        zipCoed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zipCoedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipCoedFocusLost(evt);
            }
        });

        next.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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
                    .addComponent(line1)
                    .addComponent(line2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(zipCoed)
                                .addComponent(distric, 0, 180, Short.MAX_VALUE))
                            .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distric, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(zipCoed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void line2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new CreateAccount(userData).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if( validFilds()){}else{
            userData.put("line1",line1.getText());
            userData.put("line2",line2.getText());
            userData.put("pro",String.valueOf(pro.getSelectedItem()));
            userData.put("distric",String.valueOf(distric.getSelectedItem()));
            userData.put("city",String.valueOf(city.getSelectedItem()));
            userData.put("zipCode",zipCoed.getText());
            new CreateAccount3(userData).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_nextActionPerformed

    private void line1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_line1FocusGained
         if (line1.getText().equals("Line 1")) {
            line1.setText("");
        } else {
            line1.setText(line1.getText());
        }
    }//GEN-LAST:event_line1FocusGained

    private void line1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_line1FocusLost
         if (line1.getText().isEmpty()|| line1.getText().equals(" ")) {
            line1.setText("Line 1");
        } else {
            line1.setText(line1.getText());
        }
    }//GEN-LAST:event_line1FocusLost

    private void line2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_line2FocusGained
        if (line2.getText().equals("Line 2") ) {
            line2.setText("");
        } else {
            line2.setText(line2.getText());
        }
    }//GEN-LAST:event_line2FocusGained

    private void line2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_line2FocusLost
         if (line2.getText().isEmpty() || line2.getText().equals(" ")) {
            line2.setText("Line 2");
        } else {
            line2.setText(line2.getText());
        }
    }//GEN-LAST:event_line2FocusLost

    private void zipCoedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCoedFocusGained
          if (zipCoed.getText().equals("Zip Code") ) {
            zipCoed.setText("");
        } else {
            zipCoed.setText(zipCoed.getText());
        }
    }//GEN-LAST:event_zipCoedFocusGained

    private void zipCoedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCoedFocusLost
        if (zipCoed.getText().isEmpty() || zipCoed.getText().equals(" ")) {
            zipCoed.setText("Zip Code");
        } else {
            zipCoed.setText(zipCoed.getText());
        }
    }//GEN-LAST:event_zipCoedFocusLost
    private boolean validFilds() {
        if (line1.getText().equals("Line 1") || line1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Line 1 requerd");
            line1.grabFocus();
            return  true;
        } else if (line2.getText().equals("Line 2") || line2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Line 2 requerd");
            line2.grabFocus();
            return  true;
        }else if ( zipCoed.getText().isEmpty() || zipCoed.getText() == " " || zipCoed.getText().equals("Zip Code")){
            JOptionPane.showMessageDialog(this, "Zip Code requerd");
            zipCoed.grabFocus();
            return  true;
        }
        else{
            return  false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> distric;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField line1;
    private javax.swing.JTextField line2;
    private javax.swing.JButton next;
    private javax.swing.JComboBox<String> pro;
    private javax.swing.JLabel subHeading;
    private javax.swing.JTextField zipCoed;
    // End of variables declaration//GEN-END:variables
}
