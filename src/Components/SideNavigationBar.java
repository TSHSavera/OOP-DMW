/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

/**
 *
 * @author Troy
 */

import Cards.DashboardHome;
import Cards.MyEducation;
import Cards.MyExperience;
import Utilities.*;
import Resources.*;
import Layouts.DashboardLayout;

import javax.swing.*;
import java.awt.*;


public class SideNavigationBar extends javax.swing.JPanel {

    /**
     * Creates new form SideNavigationBar
     */
    public SideNavigationBar() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        DashboardBtn = new javax.swing.JButton();
        ProfileBtn = new javax.swing.JButton();
        EducationBtn = new javax.swing.JButton();
        ExperienceBtn = new javax.swing.JButton();
        DocumentBtn = new javax.swing.JButton();
        ResumeBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(ThemeColors.SURFACE);
        setLayout(new java.awt.GridBagLayout());

        DashboardBtn.setBackground(ThemeColors.SURFACE);
        DashboardBtn.setForeground(ThemeColors.ON_BACKGROUND);
        DashboardBtn.setText("Dashboard");
        DashboardBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        DashboardBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DashboardBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DashboardBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DashboardBtnFocusLost(evt);
            }
        });
        DashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashboardBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashboardBtnMouseExited(evt);
            }
        });
        DashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(DashboardBtn, gridBagConstraints);

        ProfileBtn.setBackground(ThemeColors.SURFACE);
        ProfileBtn.setForeground(ThemeColors.ON_BACKGROUND);
        ProfileBtn.setText("My Profile");
        ProfileBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ProfileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfileBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProfileBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProfileBtnFocusLost(evt);
            }
        });
        ProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(ProfileBtn, gridBagConstraints);

        EducationBtn.setBackground(ThemeColors.SURFACE);
        EducationBtn.setForeground(ThemeColors.ON_BACKGROUND);
        EducationBtn.setText("My Education");
        EducationBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        EducationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EducationBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EducationBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EducationBtnFocusLost(evt);
            }
        });
        EducationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EducationBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EducationBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EducationBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(EducationBtn, gridBagConstraints);

        ExperienceBtn.setBackground(ThemeColors.SURFACE);
        ExperienceBtn.setForeground(ThemeColors.ON_BACKGROUND);
        ExperienceBtn.setText("My Experience");
        ExperienceBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ExperienceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExperienceBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ExperienceBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ExperienceBtnFocusLost(evt);
            }
        });
        ExperienceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExperienceBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExperienceBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExperienceBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(ExperienceBtn, gridBagConstraints);

        DocumentBtn.setBackground(ThemeColors.SURFACE);
        DocumentBtn.setForeground(ThemeColors.ON_BACKGROUND);
        DocumentBtn.setText("My Documents");
        DocumentBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        DocumentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DocumentBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DocumentBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DocumentBtnFocusLost(evt);
            }
        });
        DocumentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DocumentBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DocumentBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(DocumentBtn, gridBagConstraints);

        ResumeBtn.setBackground(ThemeColors.SURFACE);
        ResumeBtn.setForeground(ThemeColors.ON_BACKGROUND);
        ResumeBtn.setText("My Resume");
        ResumeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ResumeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResumeBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ResumeBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ResumeBtnFocusLost(evt);
            }
        });
        ResumeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResumeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResumeBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(ResumeBtn, gridBagConstraints);

        LogoutBtn.setBackground(ThemeColors.SURFACE);
        LogoutBtn.setForeground(ThemeColors.ON_BACKGROUND);
        LogoutBtn.setText("Logout");
        LogoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LogoutBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LogoutBtnFocusLost(evt);
            }
        });
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 10, 3);
        add(LogoutBtn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weighty = 0.1;
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardBtnActionPerformed

    private void DashboardBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseEntered
        // TODO add your handling code here:
        DashboardBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_DashboardBtnMouseEntered

    private void ProfileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileBtnMouseEntered
        // TODO add your handling code here:
        ProfileBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_ProfileBtnMouseEntered

    private void EducationBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EducationBtnMouseEntered
        // TODO add your handling code here:
        EducationBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_EducationBtnMouseEntered

    private void ExperienceBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExperienceBtnMouseEntered
        // TODO add your handling code here:
        ExperienceBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_ExperienceBtnMouseEntered

    private void DocumentBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentBtnMouseEntered
        // TODO add your handling code here:
        DocumentBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_DocumentBtnMouseEntered

    private void ResumeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResumeBtnMouseEntered
        // TODO add your handling code here:
        ResumeBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_ResumeBtnMouseEntered

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        // TODO add your handling code here:
        LogoutBtn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ThemeColors.PRIMARY, 2), BorderFactory.createEmptyBorder(8, 8, 8, 8)));
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void DashboardBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseExited
        // TODO add your handling code here:
        DashboardBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_DashboardBtnMouseExited

    private void ProfileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileBtnMouseExited
        // TODO add your handling code here:
        ProfileBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_ProfileBtnMouseExited

    private void EducationBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EducationBtnMouseExited
        // TODO add your handling code here:
        EducationBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_EducationBtnMouseExited

    private void ExperienceBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExperienceBtnMouseExited
        // TODO add your handling code here:
        ExperienceBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_ExperienceBtnMouseExited

    private void DocumentBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentBtnMouseExited
        // TODO add your handling code here:
        DocumentBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_DocumentBtnMouseExited

    private void ResumeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResumeBtnMouseExited
        // TODO add your handling code here:
        ResumeBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_ResumeBtnMouseExited

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        // TODO add your handling code here:
        LogoutBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }//GEN-LAST:event_LogoutBtnMouseExited

    private void DashboardBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DashboardBtnFocusGained
        // TODO add your handling code here:
        DashboardBtn.setBackground(ThemeColors.PRIMARY);
        DashboardBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_DashboardBtnFocusGained

    private void DashboardBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DashboardBtnFocusLost
        // TODO add your handling code here:
        DashboardBtn.setBackground(ThemeColors.SURFACE);
        DashboardBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_DashboardBtnFocusLost

    private void ProfileBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProfileBtnFocusGained
        // TODO add your handling code here:
        ProfileBtn.setBackground(ThemeColors.PRIMARY);
        ProfileBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_ProfileBtnFocusGained

    private void EducationBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EducationBtnFocusGained
        // TODO add your handling code here:
        EducationBtn.setBackground(ThemeColors.PRIMARY);
        EducationBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_EducationBtnFocusGained

    private void ExperienceBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExperienceBtnFocusGained
        // TODO add your handling code here:
        ExperienceBtn.setBackground(ThemeColors.PRIMARY);
        ExperienceBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_ExperienceBtnFocusGained

    private void DocumentBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DocumentBtnFocusGained
        // TODO add your handling code here:
        DocumentBtn.setBackground(ThemeColors.PRIMARY);
        DocumentBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_DocumentBtnFocusGained

    private void ResumeBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResumeBtnFocusGained
        // TODO add your handling code here:
        ResumeBtn.setBackground(ThemeColors.PRIMARY);
        ResumeBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_ResumeBtnFocusGained

    private void ProfileBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProfileBtnFocusLost
        // TODO add your handling code here:
        ProfileBtn.setBackground(ThemeColors.SURFACE);
        ProfileBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_ProfileBtnFocusLost

    private void EducationBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EducationBtnFocusLost
        // TODO add your handling code here:
        EducationBtn.setBackground(ThemeColors.SURFACE);
        EducationBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_EducationBtnFocusLost

    private void ExperienceBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExperienceBtnFocusLost
        // TODO add your handling code here:
        ExperienceBtn.setBackground(ThemeColors.SURFACE);
        ExperienceBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_ExperienceBtnFocusLost

    private void DocumentBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DocumentBtnFocusLost
        // TODO add your handling code here:
        DocumentBtn.setBackground(ThemeColors.SURFACE);
        DocumentBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_DocumentBtnFocusLost

    private void ResumeBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResumeBtnFocusLost
        // TODO add your handling code here:
        ResumeBtn.setBackground(ThemeColors.SURFACE);
        ResumeBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_ResumeBtnFocusLost

    private void LogoutBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LogoutBtnFocusGained
        // TODO add your handling code here:
        LogoutBtn.setBackground(ThemeColors.PRIMARY);
        LogoutBtn.setForeground(ThemeColors.ON_PRIMARY);
    }//GEN-LAST:event_LogoutBtnFocusGained

    private void LogoutBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LogoutBtnFocusLost
        // TODO add your handling code here:
        LogoutBtn.setBackground(ThemeColors.SURFACE);
        LogoutBtn.setForeground(ThemeColors.ON_SURFACE);
    }//GEN-LAST:event_LogoutBtnFocusLost

    private void DashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseClicked
        // TODO add your handling code here:
        //Instantiate Dashboard Card
        DashboardHome dl = new DashboardHome();
        //Switch layout to DashboardLayout
        switchLayout(DashboardLayout.cardContainer, "dashboard");

    }//GEN-LAST:event_DashboardBtnMouseClicked

    private void ExperienceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExperienceBtnMouseClicked
        // TODO add your handling code here:
        //Instantiate Experience Card
        MyExperience me = new MyExperience();
        //Switch layout to ExperienceLayout
        switchLayout(DashboardLayout.cardContainer, "experience");

    }//GEN-LAST:event_ExperienceBtnMouseClicked

    private void EducationBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EducationBtnMouseClicked
        // TODO add your handling code here:
        //Instantiate Education Card
        MyEducation me = new MyEducation();
        //Switch layout to EducationLayout
        switchLayout(DashboardLayout.cardContainer, "education");
    }//GEN-LAST:event_EducationBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DashboardBtn;
    private javax.swing.JButton DocumentBtn;
    private javax.swing.JButton EducationBtn;
    private javax.swing.JButton ExperienceBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton ResumeBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //Function to switch layouts - card layout
    public void switchLayout(JPanel panel, String layout){
        CardLayout cardLayout = (CardLayout) panel.getLayout();
        cardLayout.show(panel, layout);
    }
}
