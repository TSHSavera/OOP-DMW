import uiComponents.themeColors;

import javax.swing.*;
import java.awt.*;

public class window extends JFrame{
    JFrame frame = new JFrame();
    //Start JFrame
    void newWindow(int width, int height, boolean closeAllOnExit, String title, JPanel layout) {
        this.frame.setSize(width, height);//Width 400 and Height 500
        this.frame.setLayout(new GridBagLayout()); //set layout
        this.frame.setResizable(true); //prevent resizing
        this.frame.setLocationRelativeTo(null); //center the window
        //Put the JPanel on the page start
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_START;
        this.frame.add(layout, constraints);


        if (closeAllOnExit) {
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        this.frame.setTitle(title); //set window title
        this.frame.getContentPane().setBackground(themeColors.BACKGROUND); //set window background color
        this.frame.setVisible(true); //making the frame visible
    }

}

class elementProperties {
    int x;
    int y;
    int width;
    int height;

    elementProperties(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}


