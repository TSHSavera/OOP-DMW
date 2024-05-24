/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Cards;

import Components.AddExperienceWindow;
import Components.TableComponents.EducationTable;
import Components.TableComponents.ExperienceTable;
import Components.TableComponents.TrainingTable;
import Components.Trainings_FORM;
import Utilities.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class MyTrainings extends javax.swing.JPanel {

    /**
     * Creates new form MyExperience
     */
    public MyTrainings() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        AddTraining = new javax.swing.JButton();
        trainingTable1 = new Components.TableComponents.TrainingTable();

        setBackground(ThemeColors.BACKGROUND);

        jPanel5.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(ThemeColors.ON_SURFACE);
        jLabel7.setText("Trainings");

        AddTraining.setBackground(ThemeColors.PRIMARY);
        AddTraining.setForeground(ThemeColors.ON_PRIMARY);
        AddTraining.setText("Add Training");
        AddTraining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTrainingMouseClicked(evt);
            }
        });
        AddTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(trainingTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trainingTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddTrainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTrainingMouseClicked
        // TODO add your handling code here:
        //Open Add Training Dialog
        Trainings_FORM trainings = new Trainings_FORM();
        trainings.setVisible(true);
        trainings.pack();
        trainings.setLocationRelativeTo(null);
        trainings.setAlwaysOnTop(true);
        trainings.setResizable(false);
        trainings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AddTrainingMouseClicked

    private void AddTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddTrainingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTraining;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private Components.TableComponents.TrainingTable trainingTable1;
    // End of variables declaration//GEN-END:variables

    // At element load, populate the tables with the data from the database
    @Override
    public void addNotify() {
        super.addNotify();
        //Populate the tables with the data from the database
        TrainingTable.updateTable();
    }
}
