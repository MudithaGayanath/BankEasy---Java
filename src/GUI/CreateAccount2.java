package GUI;
// For get user address details

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modal.Mysql;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateAccount2 extends javax.swing.JFrame {

    public HashMap<String, String> userData;


    public CreateAccount2(HashMap map) {
        initComponents();
        subHeading.requestFocusInWindow();
        this.userData = map;
        String val = userData.get("line1");
        if (val != null) {
            setup();
        }
        try {
            loadPros();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to load Province");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        }

    }

    private void setup() {
        line1.setText(String.valueOf(userData.get("line1")));
        line2.setText(String.valueOf(userData.get("line2")));
        pro.setSelectedItem(userData.get("pro"));
        distric.setSelectedItem(userData.get("distric"));
        city.setSelectedItem(userData.get("city"));
        zipCoed.setText(String.valueOf(userData.get("zipCode")));
    }

    private void loadPros() throws SQLException, ClassNotFoundException {
        ResultSet rs = Mysql.search("SELECT * FROM `province`");
        Vector<String> pros = new Vector<>();
        pros.add("Province");
        while (rs.next()) {
            pros.add(rs.getString("province_name"));
        }
        pro.setModel(new DefaultComboBoxModel(pros));
    }

    private void loadDistrict(String name) throws SQLException, ClassNotFoundException {
        ResultSet rs = Mysql.search("SELECT * FROM `district` WHERE `province_id` IN ( SELECT `province_id` FROM `province` WHERE  `province_name`='" + name + "')");
        Vector<String> dis = new Vector<>();
        dis.add("District");
        while (rs.next()) {
            dis.add(rs.getString("district_name"));
        }
        distric.setModel(new DefaultComboBoxModel(dis));
    }

    private void loadCity(String name) throws SQLException, ClassNotFoundException {
        ResultSet rs = Mysql.search("SELECT * FROM `city` WHERE `district_id` IN ( SELECT `district_id` FROM `district` WHERE  `district_name`='" + name + "')");
        Vector<String> cty = new Vector<>();
        cty.add("City");
        while (rs.next()) {
            cty.add(rs.getString("city_name"));
        }
        city.setModel(new DefaultComboBoxModel(cty));
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
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        distric.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        distric.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "District" }));
        distric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districActionPerformed(evt);
            }
        });

        city.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City" }));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        zipCoed.setEditable(false);
        zipCoed.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city, 0, 225, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addComponent(distric, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zipCoed, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (validFilds()) {
        } else {
            userData.put("line1", line1.getText());
            userData.put("line2", line2.getText());
            userData.put("pro", String.valueOf(pro.getSelectedItem()));
            userData.put("distric", String.valueOf(distric.getSelectedItem()));
            userData.put("city", String.valueOf(city.getSelectedItem()));
            userData.put("zipCode", zipCoed.getText());
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
        if (line1.getText().isEmpty() || line1.getText().equals(" ")) {
            line1.setText("Line 1");
        } else {
            line1.setText(line1.getText());
        }
    }//GEN-LAST:event_line1FocusLost

    private void line2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_line2FocusGained
        if (line2.getText().equals("Line 2")) {
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
        if (zipCoed.getText().equals("Zip Code")) {
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

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        try {
            loadDistrict(String.valueOf(pro.getSelectedItem()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to load district");
            System.out.println(ex);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_proActionPerformed

    private void districActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districActionPerformed
        try {
            loadCity(String.valueOf(distric.getSelectedItem()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to load city");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_districActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        try {
            ResultSet rs = Mysql.search("SELECT `zip_code` FROM `city` WHERE `city_name`='" + String.valueOf(city.getSelectedItem()) + "'");
            if ( rs.next()){
            zipCoed.setText(rs.getString("zip_code"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateAccount2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccount2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cityActionPerformed
    private boolean validFilds() {
        if (line1.getText().equals("Line 1") || line1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Line 1 requerd");
            line1.grabFocus();
            return true;
        } else if (line2.getText().equals("Line 2") || line2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Line 2 requerd");
            line2.grabFocus();
            return true;
        } else if (zipCoed.getText().isEmpty() || zipCoed.getText() == " " || zipCoed.getText().equals("Zip Code")) {
            JOptionPane.showMessageDialog(this, "Zip Code requerd");
            zipCoed.grabFocus();
            return true;
        } else {
            return false;
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
