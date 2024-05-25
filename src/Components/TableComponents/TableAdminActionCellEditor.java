/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components.TableComponents;
import Utilities.*;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
/**
 *
 * @author Admin
 */
public class TableAdminActionCellEditor extends DefaultCellEditor {
    
    private TableAdminActionEvent event;
    
    public TableAdminActionCellEditor(TableAdminActionEvent event) {
        super(new JCheckBox());
        this.event=event;
    }
    
    
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAdminAction action = new PanelAdminAction();
        action.initEvent(event, row);
        return action;
        
    }
    
}
