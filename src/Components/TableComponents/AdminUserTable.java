/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components.TableComponents;
import API.Auth;
import API.SQLHandler;
import Components.Resume;
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
public class AdminUserTable extends javax.swing.JPanel {

    /**
     * Creates new form ExperiencePanel
     * @param jTable1
     */
    public AdminUserTable() {
        initComponents();
        TableAdminActionEvent event = new TableAdminActionEvent() {
            @Override
            public void onDelete(int row) {
                //Release a prompt to confirm the deletion
                int dialogResult = JOptionPane.showConfirmDialog(null, "This will remove every record of the user. Proceed?", "Warning", JOptionPane.YES_NO_OPTION);
                //Check if the user clicked yes
                if (dialogResult == JOptionPane.YES_OPTION) {
                    //Delete the data from the database
                    SQLHandler sqlHandler = new SQLHandler();
                    //Delete the other records of the user
                    String query = "DELETE FROM educational WHERE UserID = " + jTable1.getValueAt(row, 1);
                    sqlHandler.createQuery(query).executeQuery();
                    query = "DELETE FROM work_experience WHERE UserID = " + jTable1.getValueAt(row, 1);
                    sqlHandler.createQuery(query).executeQuery();
                    query = "DELETE FROM trainings WHERE UserID = " + jTable1.getValueAt(row, 1);
                    sqlHandler.createQuery(query).executeQuery();
                    query = "DELETE FROM profile WHERE UserID = " + jTable1.getValueAt(row, 1);
                    sqlHandler.createQuery(query).executeQuery();

                    //Delete the user
                    query = "DELETE FROM user WHERE UserID = " + jTable1.getValueAt(row, 1);
                    sqlHandler.createQuery(query).executeQuery();
                    //If the data is deleted, update the table
                    if (sqlHandler.getAffectedRows() > 0) {
                        if(jTable1.isEditing()) {
                            jTable1.getCellEditor().stopCellEditing();
                        }
                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                        model.removeRow(row);
                        updateTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete user", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            @Override
            public void onView(int row) {
                //Open the resume of the user
                Auth.userId = Integer.parseInt(jTable1.getValueAt(row, 1).toString());
                Resume resume = new Resume();
                resume.setVisible(true);
                resume.pack();
                resume.setLocationRelativeTo(null);
                resume.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                resume.loadData();


            }
        };
        
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new TableAdminActionCellRenderer());
        jTable1.getColumnModel().getColumn(0).setCellEditor(new TableAdminActionCellEditor(event));
        
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
                String query = "SELECT * FROM user";
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
            model.addRow(new Object[]{null, sqlResultParser.parseResults(i).getValueByKey("UserID"), sqlResultParser.parseResults(i).getValueByKey("FirstName"), sqlResultParser.parseResults(i).getValueByKey("MiddleName"), sqlResultParser.parseResults(i).getValueByKey("LastName"), sqlResultParser.parseResults(i).getValueByKey("Suffix"), sqlResultParser.parseResults(i).getValueByKey("Gender"), sqlResultParser.parseResults(i).getValueByKey("Birthdate"), sqlResultParser.parseResults(i).getValueByKey("EmailAddress")});
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

        setBackground(ThemeColors.BACKGROUND);
        setForeground(ThemeColors.BACKGROUND);
        setDoubleBuffered(false);
        setPreferredSize(new java.awt.Dimension(600, 650));

        jScrollPane1.setBackground(ThemeColors.BACKGROUND);
        jScrollPane1.setForeground(ThemeColors.BACKGROUND);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 650));

        jTable1.setBackground(ThemeColors.BACKGROUND);
        jTable1.setForeground(ThemeColors.ON_SURFACE);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Action", "UserID", "FirstName", "MiddleName", "LastName", "Suffix", "Gender", "Birthdate", "EmailAddress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(ThemeColors.ON_SURFACE);
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        jTable1.setPreferredSize(new java.awt.Dimension(600, 650));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(180);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

//    //Update table on load
//    @Override
//    public void addNotify() {
//        super.addNotify();
//        updateTable();
//    }
}
