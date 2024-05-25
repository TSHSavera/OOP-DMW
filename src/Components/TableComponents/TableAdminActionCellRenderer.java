/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components.TableComponents;

import java.awt.Component;
import javax.swing.table.*;
import javax.swing.JTable;

/**
 *
 * @author Admin
 */
public class TableAdminActionCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        
        PanelAdminAction action = new PanelAdminAction();
        return action;
    }
}
