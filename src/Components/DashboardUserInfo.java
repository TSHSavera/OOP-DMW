/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Utilities.ThemeColors;
/**
 *
 * @author norma
 */
public class DashboardUserInfo extends javax.swing.JPanel {

    /**
     * Creates new form DashboardUserInfo
     */
    public DashboardUserInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userDetails = new javax.swing.JPanel();
        accountNumber = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        passportPicturePanel = new javax.swing.JPanel();
        passportPictureIMG = new javax.swing.JLabel();
        profilePicturePanel = new javax.swing.JPanel();
        profilePictureIMG = new javax.swing.JLabel();
        attachProfile = new javax.swing.JButton();
        attachPassport = new javax.swing.JButton();

        setBackground(ThemeColors.BACKGROUND);

        userDetails.setBackground(ThemeColors.SURFACE);

        accountNumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        accountNumber.setForeground(ThemeColors.ON_BACKGROUND);
        accountNumber.setText("Account no.");

        userName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userName.setForeground(ThemeColors.ON_BACKGROUND);
        userName.setText("Lastname, Firstname MI.");

        javax.swing.GroupLayout userDetailsLayout = new javax.swing.GroupLayout(userDetails);
        userDetails.setLayout(userDetailsLayout);
        userDetailsLayout.setHorizontalGroup(
            userDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountNumber)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userDetailsLayout.setVerticalGroup(
            userDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDetailsLayout.createSequentialGroup()
                .addComponent(accountNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        passportPicturePanel.setBackground(ThemeColors.ON_SURFACE);
        passportPicturePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        passportPicturePanel.setPreferredSize(new java.awt.Dimension(165, 165));

        passportPictureIMG.setForeground(new java.awt.Color(0, 0, 0));
        passportPictureIMG.setText("passport picture");

        javax.swing.GroupLayout passportPicturePanelLayout = new javax.swing.GroupLayout(passportPicturePanel);
        passportPicturePanel.setLayout(passportPicturePanelLayout);
        passportPicturePanelLayout.setHorizontalGroup(
            passportPicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passportPicturePanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(passportPictureIMG)
                .addGap(36, 36, 36))
        );
        passportPicturePanelLayout.setVerticalGroup(
            passportPicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passportPicturePanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(passportPictureIMG)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        profilePicturePanel.setBackground(ThemeColors.ON_SURFACE);
        profilePicturePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        profilePicturePanel.setPreferredSize(new java.awt.Dimension(165, 165));

        profilePictureIMG.setForeground(new java.awt.Color(0, 0, 0));
        profilePictureIMG.setText("profile picture");

        javax.swing.GroupLayout profilePicturePanelLayout = new javax.swing.GroupLayout(profilePicturePanel);
        profilePicturePanel.setLayout(profilePicturePanelLayout);
        profilePicturePanelLayout.setHorizontalGroup(
            profilePicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePicturePanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(profilePictureIMG)
                .addGap(44, 44, 44))
        );
        profilePicturePanelLayout.setVerticalGroup(
            profilePicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePicturePanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(profilePictureIMG)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        attachProfile.setBackground(ThemeColors.PRIMARY);
        attachProfile.setForeground(ThemeColors.ON_PRIMARY);
        attachProfile.setText("Attach Picture");
        attachProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attachProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachProfileActionPerformed(evt);
            }
        });

        attachPassport.setBackground(ThemeColors.PRIMARY);
        attachPassport.setForeground(ThemeColors.ON_PRIMARY);
        attachPassport.setText("Attach Picture");
        attachPassport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attachPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPassportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passportPicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profilePicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(attachProfile)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(attachPassport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(profilePicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attachProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passportPicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attachPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void attachProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachProfileActionPerformed
        // replace jlabel "profilePictureIMG" with profile picure
    }//GEN-LAST:event_attachProfileActionPerformed

    private void attachPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPassportActionPerformed
        // replace jlabel "passportPictureIMG" with passport picture
    }//GEN-LAST:event_attachPassportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNumber;
    private javax.swing.JButton attachPassport;
    private javax.swing.JButton attachProfile;
    private javax.swing.JLabel passportPictureIMG;
    private javax.swing.JPanel passportPicturePanel;
    private javax.swing.JLabel profilePictureIMG;
    private javax.swing.JPanel profilePicturePanel;
    private javax.swing.JPanel userDetails;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
