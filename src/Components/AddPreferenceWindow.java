/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Components;
import Utilities.ThemeColors;
/**
 *
 * @author Admin
 */
public class AddPreferenceWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddExperienceWindow
     */
    public AddPreferenceWindow() {
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

        PreferenceDetails = new javax.swing.JPanel();
        workPreferenceDetails = new javax.swing.JPanel();
        workDetailsLabel = new javax.swing.JLabel();
        classTab = new javax.swing.JPanel();
        classLabel = new javax.swing.JLabel();
        chooseClass = new javax.swing.JComboBox<>();
        IndustryTab = new javax.swing.JPanel();
        industryLabel = new javax.swing.JLabel();
        industryBox = new javax.swing.JComboBox<>();
        presentWork = new javax.swing.JCheckBox();
        countryTab = new javax.swing.JPanel();
        countryLabel = new javax.swing.JLabel();
        chooseCountry = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        categoryTab = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        chooseCategory = new javax.swing.JComboBox<>();
        positionTab = new javax.swing.JPanel();
        positionLabel = new javax.swing.JLabel();
        positionBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PreferenceDetails.setBackground(ThemeColors.BACKGROUND);

        workPreferenceDetails.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);
        workPreferenceDetails.setForeground(ThemeColors.ON_SURFACE);

        workDetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        workDetailsLabel.setForeground(ThemeColors.ON_SURFACE);
        workDetailsLabel.setText("Work Preference Details");

        javax.swing.GroupLayout workPreferenceDetailsLayout = new javax.swing.GroupLayout(workPreferenceDetails);
        workPreferenceDetails.setLayout(workPreferenceDetailsLayout);
        workPreferenceDetailsLayout.setHorizontalGroup(
            workPreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPreferenceDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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

        classTab.setBackground(ThemeColors.BACKGROUND);

        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classLabel.setForeground(ThemeColors.ON_BACKGROUND);
        classLabel.setText("Class:");

        chooseClass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Land Based (Sa Lupa)", "Sea Based (Sa Dagat)" }));
        chooseClass.setBorder(null);

        javax.swing.GroupLayout classTabLayout = new javax.swing.GroupLayout(classTab);
        classTab.setLayout(classTabLayout);
        classTabLayout.setHorizontalGroup(
            classTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(classTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classLabel)
                    .addComponent(chooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        classTabLayout.setVerticalGroup(
            classTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(classLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        IndustryTab.setBackground(ThemeColors.BACKGROUND);

        industryLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        industryLabel.setForeground(ThemeColors.ON_BACKGROUND);
        industryLabel.setText("Industry:");

        industryBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        industryBox.setBorder(null);

        javax.swing.GroupLayout IndustryTabLayout = new javax.swing.GroupLayout(IndustryTab);
        IndustryTab.setLayout(IndustryTabLayout);
        IndustryTabLayout.setHorizontalGroup(
            IndustryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndustryTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(IndustryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(industryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(industryLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IndustryTabLayout.setVerticalGroup(
            IndustryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndustryTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(industryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(industryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
        countryLabel.setText("Preferred Country:");

        chooseCountry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chooseCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Philippines", "USA", "etc" }));
        chooseCountry.setBorder(null);

        javax.swing.GroupLayout countryTabLayout = new javax.swing.GroupLayout(countryTab);
        countryTab.setLayout(countryTabLayout);
        countryTabLayout.setHorizontalGroup(
            countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel)
                    .addComponent(chooseCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        countryTabLayout.setVerticalGroup(
            countryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        save.setBackground(ThemeColors.PRIMARY);
        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setForeground(ThemeColors.ON_PRIMARY);
        save.setText("Save");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        categoryTab.setBackground(ThemeColors.BACKGROUND);

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        categoryLabel.setForeground(ThemeColors.ON_BACKGROUND);
        categoryLabel.setText("Category:");

        chooseCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POEA Government Hiring", "Agency Hire", "Direct Hire", "EPS" }));
        chooseCategory.setBorder(null);

        javax.swing.GroupLayout categoryTabLayout = new javax.swing.GroupLayout(categoryTab);
        categoryTab.setLayout(categoryTabLayout);
        categoryTabLayout.setHorizontalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryLabel)
                    .addComponent(chooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        categoryTabLayout.setVerticalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        positionTab.setBackground(ThemeColors.BACKGROUND);

        positionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionLabel.setForeground(ThemeColors.ON_BACKGROUND);
        positionLabel.setText("Position:");

        positionBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionBox.setBorder(null);

        javax.swing.GroupLayout positionTabLayout = new javax.swing.GroupLayout(positionTab);
        positionTab.setLayout(positionTabLayout);
        positionTabLayout.setHorizontalGroup(
            positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        positionTabLayout.setVerticalGroup(
            positionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(positionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PreferenceDetailsLayout = new javax.swing.GroupLayout(PreferenceDetails);
        PreferenceDetails.setLayout(PreferenceDetailsLayout);
        PreferenceDetailsLayout.setHorizontalGroup(
            PreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreferenceDetailsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(presentWork)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreferenceDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreferenceDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreferenceDetailsLayout.createSequentialGroup()
                        .addComponent(countryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(PreferenceDetailsLayout.createSequentialGroup()
                .addGroup(PreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreferenceDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IndustryTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreferenceDetailsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(workPreferenceDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PreferenceDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(positionTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PreferenceDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(classTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PreferenceDetailsLayout.setVerticalGroup(
            PreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreferenceDetailsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(workPreferenceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(positionTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IndustryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PreferenceDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(presentWork)
                .addGap(9, 9, 9)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PreferenceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PreferenceDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void presentWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentWorkActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        //Save data to table
        
        //Close window
        dispose();
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(AddPreferenceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPreferenceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPreferenceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPreferenceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPreferenceWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IndustryTab;
    private javax.swing.JPanel PreferenceDetails;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JPanel categoryTab;
    private javax.swing.JComboBox<String> chooseCategory;
    private javax.swing.JComboBox<String> chooseClass;
    private javax.swing.JComboBox<String> chooseCountry;
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel classTab;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JPanel countryTab;
    private javax.swing.JComboBox<String> industryBox;
    private javax.swing.JLabel industryLabel;
    private javax.swing.JComboBox<String> positionBox;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JPanel positionTab;
    private javax.swing.JCheckBox presentWork;
    private javax.swing.JButton save;
    private javax.swing.JLabel workDetailsLabel;
    private javax.swing.JPanel workPreferenceDetails;
    // End of variables declaration//GEN-END:variables
}