/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author norma
 */
public class PlaceHolderTextField extends JTextField {
    
    private String placeHolder = "Place Holder";
    
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (getText().length() == 0) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int bg = getBackground().getRGB();
            int fg = getForeground().getRGB();
            int m = 0xfefefefe;
            int c = ((bg&m)>>>1)+((fg&m)>>>1);
            g.setColor(new Color(c, true));
            g.drawString(getPlaceHolder(), ins.left, h/2+fm.getAscent()/2-2);
        }
    }
    
    /**
     * @return the placeHolder
     */
    public String getPlaceHolder() {
        return placeHolder;
    }

    /**
     * @param placeHolder the placeHolder to set
     */
    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }
    
    
}
