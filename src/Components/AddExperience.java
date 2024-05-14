/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;
import Utilities.*;

/**
 *
 * @author Admin
 */
public class AddExperience extends javax.swing.JPanel {

    /**
     * Creates new form AddExperience
     */
    public AddExperience() {
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

        saveButton = new javax.swing.JButton();
        workPreferenceDetails = new javax.swing.JPanel();
        workDetailsLabel = new javax.swing.JLabel();
        companyTab = new javax.swing.JPanel();
        companyLabel = new javax.swing.JLabel();
        company = new Components.PlaceHolderTextField();
        positionTab = new javax.swing.JPanel();
        positionLabel = new javax.swing.JLabel();
        position = new Components.PlaceHolderTextField();
        dateStartedTab = new javax.swing.JPanel();
        dateStartedLabel = new javax.swing.JLabel();
        placeHolderTextField3 = new Components.PlaceHolderTextField();
        dateEndedTab = new javax.swing.JPanel();
        dateEndedLabel = new javax.swing.JLabel();
        placeHolderTextField4 = new Components.PlaceHolderTextField();
        presentWork = new javax.swing.JCheckBox();
        countryTab = new javax.swing.JPanel();
        countryLabel = new javax.swing.JLabel();
        chooseCountry = new javax.swing.JComboBox<>();

        saveButton.setBackground(ThemeColors.PRIMARY);
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setForeground(ThemeColors.ON_PRIMARY);
        saveButton.setText("SAVE");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        setBackground(ThemeColors.BACKGROUND);

        workPreferenceDetails.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);
        workPreferenceDetails.setForeground(ThemeColors.ON_SURFACE);

        workDetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        workDetailsLabel.setForeground(ThemeColors.ON_SURFACE);
        workDetailsLabel.setText("Work Experience Details");

        javax.swing.GroupLayout workPreferenceDetailsLayout = new javax.swing.GroupLayout(workPreferenceDetails);
        workPreferenceDetails.setLayout(workPreferenceDetailsLayout);
        workPreferenceDetailsLayout.setHorizontalGroup(
            workPreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPreferenceDetailsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(workDetailsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workPreferenceDetailsLayout.setVerticalGroup(
            workPreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPreferenceDetailsLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(workDetailsLabel)
                .addGap(14, 14, 14))
        );

        companyTab.setBackground(ThemeColors.BACKGROUND);

        companyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        companyLabel.setForeground(ThemeColors.ON_BACKGROUND);
        companyLabel.setText("Company:");

        company.setFocusable(false);
        company.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        company.setPlaceHolder("Ilagay ang kompanya");

        javax.swing.GroupLayout companyTabLayout = new javax.swing.GroupLayout(companyTab);
        companyTab.setLayout(companyTabLayout);
        companyTabLayout.setHorizontalGroup(
            companyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(companyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(companyLabel)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        companyTabLayout.setVerticalGroup(
            companyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(companyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        positionTab.setBackground(ThemeColors.BACKGROUND);

        positionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionLabel.setForeground(ThemeColors.ON_BACKGROUND);
        positionLabel.setText("Position:");

        position.setFocusable(false);
        position.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        position.setPlaceHolder("Ilagay ang posisyon");

        javax.swing.GroupLayout positionTabLayout = new javax.swing.GroupLayout(positionTab);
        positionTab.setLayout(positionTabLayout);
        positionTabLayout.setHorizontalGroup(
            positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionLabel)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        positionTabLayout.setVerticalGroup(
            positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(positionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        dateStartedTab.setBackground(ThemeColors.BACKGROUND);

        dateStartedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateStartedLabel.setForeground(ThemeColors.ON_BACKGROUND);
        dateStartedLabel.setText("Date Started");

        placeHolderTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout dateStartedTabLayout = new javax.swing.GroupLayout(dateStartedTab);
        dateStartedTab.setLayout(dateStartedTabLayout);
        dateStartedTabLayout.setHorizontalGroup(
            dateStartedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateStartedTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dateStartedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeHolderTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateStartedLabel))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        dateStartedTabLayout.setVerticalGroup(
            dateStartedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateStartedTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateStartedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeHolderTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateEndedTab.setBackground(ThemeColors.BACKGROUND);

        dateEndedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateEndedLabel.setForeground(ThemeColors.ON_BACKGROUND);
        dateEndedLabel.setText("Date Ended");

        placeHolderTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout dateEndedTabLayout = new javax.swing.GroupLayout(dateEndedTab);
        dateEndedTab.setLayout(dateEndedTabLayout);
        dateEndedTabLayout.setHorizontalGroup(
            dateEndedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateEndedTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dateEndedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeHolderTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEndedLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        dateEndedTabLayout.setVerticalGroup(
            dateEndedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateEndedTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateEndedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeHolderTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        presentWork.setBackground(ThemeColors.BACKGROUND);
        presentWork.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        presentWork.setForeground(ThemeColors.ON_BACKGROUND);
        presentWork.setText("Present Work");
        presentWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentWorkActionPerformed(evt);
            }
        });

        countryTab.setBackground(ThemeColors.BACKGROUND);

        countryLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        countryLabel.setForeground(ThemeColors.ON_BACKGROUND);
        countryLabel.setText("Country");

        chooseCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Philippines", "USA", "etc" }));
        chooseCountry.setBorder(null);

        javax.swing.GroupLayout countryTabLayout = new javax.swing.GroupLayout(countryTab);
        countryTab.setLayout(countryTabLayout);
        countryTabLayout.setHorizontalGroup(
            countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryLabel))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        countryTabLayout.setVerticalGroup(
            countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(countryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workPreferenceDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(positionTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(companyTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateStartedTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateEndedTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))
                                .addGap(0, 4, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(presentWork)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workPreferenceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(companyTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dateEndedTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateStartedTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(countryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(presentWork)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void presentWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentWorkActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Save Info to Database or something
        // also return to MyExperience
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseCountry;
    private Components.PlaceHolderTextField company;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JPanel companyTab;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JPanel countryTab;
    private javax.swing.JLabel dateEndedLabel;
    private javax.swing.JPanel dateEndedTab;
    private javax.swing.JLabel dateStartedLabel;
    private javax.swing.JPanel dateStartedTab;
    private Components.PlaceHolderTextField placeHolderTextField3;
    private Components.PlaceHolderTextField placeHolderTextField4;
    private Components.PlaceHolderTextField position;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JPanel positionTab;
    private javax.swing.JCheckBox presentWork;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel workDetailsLabel;
    private javax.swing.JPanel workPreferenceDetails;
    // End of variables declaration//GEN-END:variables
}
