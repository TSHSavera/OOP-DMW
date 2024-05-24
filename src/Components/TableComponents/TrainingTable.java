/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components.TableComponents;
import API.Auth;
import API.SQLHandler;
import Components.TableComponents.TableActionCellRenderer;
import Components.TableComponents.TableActionCellEditor;
import Components.TableComponents.TableActionEvent;
import Utilities.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class TrainingTable extends javax.swing.JPanel {

    /**
     * Creates new form ExperiencePanel
     */
    public TrainingTable() {
        initComponents();
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                //Release a prompt to confirm the deletion
                int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete this entry?", "Warning", JOptionPane.YES_NO_OPTION);
                //Check if the user clicked yes
                if (dialogResult == JOptionPane.YES_OPTION) {
                    //Delete the data from the database
                    SQLHandler sqlHandler = new SQLHandler();
                    String query = "DELETE FROM trainings WHERE UserID = " + Auth.userId + " AND CertificateNo = '" + jTable1.getValueAt(row, 1) + "' AND TrainingName = '" + jTable1.getValueAt(row, 2) + "' AND DurationHours = '" + jTable1.getValueAt(row, 3) + "'";
                    sqlHandler.createQuery(query).executeQuery();
                    //If the data is deleted, update the table
                    if (sqlHandler.getAffectedRows() > 0) {
                        if(jTable1.isEditing()) {
                            jTable1.getCellEditor().stopCellEditing();
                        }
                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                        model.removeRow(row);
                        updateTable();
                    }
                }
            }
        };
        
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new TableActionCellRenderer());
        jTable1.getColumnModel().getColumn(0).setCellEditor(new TableActionCellEditor(event));
        
        JTableHeader header = jTable1.getTableHeader();
        header.setBackground(ThemeColors.SURFACE_CONTAINER_HIGH);
        header.setForeground(ThemeColors.ON_SURFACE);
        
    }

    public static void updateTable() {
            //Create a new SQLResultParser object
            SQLResultParser sqlResultParser = new SQLResultParser() {
                @Override
                public ArrayList<Map> sqlQuery() {
                    //Create a new SQLHandler object
                    SQLHandler sqlHandler = new SQLHandler();
                    //Create a new query
                    String query = "SELECT * FROM trainings WHERE UserID = " + Auth.userId;
                    //Execute the query
                    sqlHandler.createQuery(query).executeQuery();
                    //Return the results
                    return sqlHandler.getResults();
                }
            };
            //Get the size of the results
            int size = sqlResultParser.getResultsSize();
            //Get the table model
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //Clear the table
            model.setRowCount(0);
            //Loop through the results and add them to the table
            for (int i = 0; i < size; i++) {
                model.addRow(new Object[]{null, sqlResultParser.parseResults(i).getValueByKey("CertificateNo"), sqlResultParser.parseResults(i).getValueByKey("TrainingName"), sqlResultParser.parseResults(i).getValueByKey("DurationHours")});
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(600, 650));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 650));

        jTable1.setBackground(ThemeColors.BACKGROUND);
        jTable1.setForeground(ThemeColors.ON_SURFACE);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Action", "Training Name", "Certificate Number", "Number of Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(ThemeColors.ON_SURFACE);
        jTable1.setPreferredSize(new java.awt.Dimension(600, 650));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(90);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}