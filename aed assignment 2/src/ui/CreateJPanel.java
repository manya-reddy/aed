/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.House;
import model.DataService;

/**
 *
 * @author harshinichandrika
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
    }

    
    
    DataService history;
    
    public CreateJPanel(DataService history) {
        initComponents();
        this.history=history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public boolean isHouse(String s) {  
    return s != null && s.matches("^[a-zA-Z][a-zA-Z\\s-]+[a-zA-Z]$");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHouseName = new javax.swing.JLabel();
        lblHouseId = new javax.swing.JLabel();
        lblCommunityId = new javax.swing.JLabel();
        txtHouseName = new javax.swing.JTextField();
        txtCommunityId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtHouseId = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create");

        lblHouseName.setText("House Name:");

        lblHouseId.setText("Community Id:");

        lblCommunityId.setText("House Id:");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHouseId)
                    .addComponent(lblCommunityId)
                    .addComponent(lblHouseName))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtHouseName)
                        .addComponent(txtCommunityId, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(txtHouseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseName)
                    .addComponent(txtHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityId)
                    .addComponent(txtHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseId)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnSave)
                .addContainerGap(287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name= txtHouseName.getText();
         if(!isHouse(txtHouseName.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter a valid House name.");
            return;

        }
        if(name.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "House Name is empty.");
            return;

        }
        
        String houseId=txtHouseId.getText();
        
        if(houseId.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "City ID is empty.");
            return;
        }
       String communityId = txtCommunityId.getText();
       
       House hs= history.addNewHouses();
       
       hs.setHouseName(name);
       hs.setHouselId(houseId);
       hs.setCommunityId(communityId);
       
       
       JOptionPane.showMessageDialog(this,"New House Added!");
       
       txtHouseName.setText("");
       txtHouseId.setText("");
       txtCommunityId.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblHouseId;
    private javax.swing.JLabel lblHouseName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtHouseId;
    private javax.swing.JTextField txtHouseName;
    // End of variables declaration//GEN-END:variables
}