//
// THIS IS USED IN "DashboardHome" CARD
//
package Components;
import Utilities.*;

/**
 *
 * @author Admin
 */
public class DashboardExtras extends javax.swing.JPanel {

    /**
     * Creates new form DashboardExtras
     */
    public DashboardExtras() {
        initComponents();
        dashboardUserInfo1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        announcementsPanel = new javax.swing.JPanel();
        announcementTitleBar = new javax.swing.JPanel();
        announcments = new javax.swing.JLabel();
        links_etc = new javax.swing.JPanel();
        linksTitleBar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        remindersPanel = new javax.swing.JPanel();
        remindersTitleBar = new javax.swing.JPanel();
        reminders = new javax.swing.JLabel();
        reminder1_ph_2 = new javax.swing.JLabel();
        reminder1_us = new javax.swing.JLabel();
        reminder1_ph = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        showUserInfo = new javax.swing.JButton();
        dashboardUserInfo1 = new Components.DashboardUserInfo();

        setBackground(ThemeColors.BACKGROUND);

        announcementsPanel.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);

        announcementTitleBar.setBackground(ThemeColors.SURFACE_VARIANT);
        announcementTitleBar.setForeground(new java.awt.Color(255, 255, 255));

        announcments.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        announcments.setForeground(ThemeColors.ON_SURFACE);
        announcments.setText("Announcements");

        javax.swing.GroupLayout announcementTitleBarLayout = new javax.swing.GroupLayout(announcementTitleBar);
        announcementTitleBar.setLayout(announcementTitleBarLayout);
        announcementTitleBarLayout.setHorizontalGroup(
            announcementTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementTitleBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(announcments)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        announcementTitleBarLayout.setVerticalGroup(
            announcementTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(announcments)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout announcementsPanelLayout = new javax.swing.GroupLayout(announcementsPanel);
        announcementsPanel.setLayout(announcementsPanelLayout);
        announcementsPanelLayout.setHorizontalGroup(
            announcementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(announcementTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        announcementsPanelLayout.setVerticalGroup(
            announcementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(announcementsPanelLayout.createSequentialGroup()
                .addComponent(announcementTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 398, Short.MAX_VALUE))
        );

        links_etc.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);

        linksTitleBar.setBackground(ThemeColors.SURFACE_VARIANT);
        linksTitleBar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(ThemeColors.ON_SURFACE);
        jLabel5.setText("Links");

        javax.swing.GroupLayout linksTitleBarLayout = new javax.swing.GroupLayout(linksTitleBar);
        linksTitleBar.setLayout(linksTitleBarLayout);
        linksTitleBarLayout.setHorizontalGroup(
            linksTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linksTitleBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        linksTitleBarLayout.setVerticalGroup(
            linksTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linksTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout links_etcLayout = new javax.swing.GroupLayout(links_etc);
        links_etc.setLayout(links_etcLayout);
        links_etcLayout.setHorizontalGroup(
            links_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linksTitleBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        links_etcLayout.setVerticalGroup(
            links_etcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(links_etcLayout.createSequentialGroup()
                .addComponent(linksTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        remindersPanel.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);

        remindersTitleBar.setBackground(ThemeColors.SURFACE_VARIANT);
        remindersTitleBar.setForeground(new java.awt.Color(255, 255, 255));

        reminders.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reminders.setForeground(ThemeColors.ON_SURFACE);
        reminders.setText("Reminders");

        javax.swing.GroupLayout remindersTitleBarLayout = new javax.swing.GroupLayout(remindersTitleBar);
        remindersTitleBar.setLayout(remindersTitleBarLayout);
        remindersTitleBarLayout.setHorizontalGroup(
            remindersTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersTitleBarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(reminders)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        remindersTitleBarLayout.setVerticalGroup(
            remindersTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reminders)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reminder1_ph_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reminder1_ph_2.setForeground(ThemeColors.ON_SURFACE);
        reminder1_ph_2.setText("ise-save para sa pagproseso");

        reminder1_us.setBackground(ThemeColors.ON_SURFACE);
        reminder1_us.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reminder1_us.setForeground(ThemeColors.ON_SURFACE);
        reminder1_us.setText("Make sure all your information is correct and true because it will all be saved for processing ");

        reminder1_ph.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reminder1_ph.setForeground(ThemeColors.ON_SURFACE);
        reminder1_ph.setText("Siguraduhin na ang lahat ng iyong impormasyon ay tama at totoo dahil ang lahat ng ito ay");

        jSeparator1.setForeground(ThemeColors.ON_SURFACE_VARIANT);

        javax.swing.GroupLayout remindersPanelLayout = new javax.swing.GroupLayout(remindersPanel);
        remindersPanel.setLayout(remindersPanelLayout);
        remindersPanelLayout.setHorizontalGroup(
            remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remindersTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(remindersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reminder1_us)
                    .addComponent(reminder1_ph_2)
                    .addComponent(reminder1_ph))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        remindersPanelLayout.setVerticalGroup(
            remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersPanelLayout.createSequentialGroup()
                .addComponent(remindersTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminder1_us)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminder1_ph)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminder1_ph_2)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        jPanel1.setBackground(ThemeColors.BACKGROUND);

        showUserInfo.setBackground(ThemeColors.PRIMARY);
        showUserInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showUserInfo.setForeground(ThemeColors.ON_PRIMARY);
        showUserInfo.setText("Show User Information");
        showUserInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(showUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(showUserInfo)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardUserInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(announcementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remindersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(links_etc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(links_etc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remindersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(announcementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboardUserInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void showUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserInfoActionPerformed
        // TODO add your handling code here:
        if (dashboardUserInfo1.isVisible()) {
            dashboardUserInfo1.setVisible(false);
            showUserInfo.setText("Show User Information");
        } else {
            dashboardUserInfo1.setVisible(true);
            showUserInfo.setText("Hide User Information");
        }
    }//GEN-LAST:event_showUserInfoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel announcementTitleBar;
    private javax.swing.JPanel announcementsPanel;
    private javax.swing.JLabel announcments;
    private Components.DashboardUserInfo dashboardUserInfo1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel linksTitleBar;
    private javax.swing.JPanel links_etc;
    private javax.swing.JLabel reminder1_ph;
    private javax.swing.JLabel reminder1_ph_2;
    private javax.swing.JLabel reminder1_us;
    private javax.swing.JLabel reminders;
    private javax.swing.JPanel remindersPanel;
    private javax.swing.JPanel remindersTitleBar;
    private javax.swing.JButton showUserInfo;
    // End of variables declaration//GEN-END:variables
}
