package uiComponents;

import javax.swing.*;
import java.awt.*;

public class button extends JButton {

    // Properties of the button
    button(String text) {

        // Set the text of the button
        this.setText(text);
        this.setFont(new Font("Consolas", Font.BOLD, 12));

        // Set the color of the button
        this.setForeground(themeColors.ON_PRIMARY);
        this.setBackground(themeColors.PRIMARY);

        // Set the border of the button
        this.setBorder(BorderFactory.createLineBorder(themeColors.OUTLINE, 2, false));

        // Set the focusable property of the button
        this.setFocusable(false);
    }
}
