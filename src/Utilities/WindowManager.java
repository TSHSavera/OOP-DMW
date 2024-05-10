package Utilities;

/**
 *
 * @author Troy
 */
import javax.swing.*;

public class WindowManager extends JFrame {
        //Start JFrame
    public void newWindow(int width, int height, boolean closeAllOnExit, String title, boolean isResizable, JFrame layout) {
        layout.setSize(width, height);//Width 400 and Height 500
        layout.setResizable(isResizable); //prevent resizing
        layout.setLocationRelativeTo(null); //center the customFunctions.gridElementProperties.window

        if (closeAllOnExit) {
            layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            layout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        layout.setTitle(title); //set customFunctions.gridElementProperties.window title
        layout.getContentPane().setBackground(ThemeColors.BACKGROUND); //set customFunctions.gridElementProperties.window background color//set the layout of the customFunctions.gridElementProperties.window
        layout.setVisible(true); //making the frame visible
    }
}
