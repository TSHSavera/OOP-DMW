package uiComponents;
//Import customFunctions
import customFunctions.gridElementProperties;
//Import ui essentials
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class footer extends JPanel {
    //Create footer
    public footer() {
        //Elements to be added to the footer
        JLabel footerText = new JLabel("Footer Text");
        //Change JLabel Text Color
        footerText.setForeground(themeColors.ON_SURFACE);
        //Set the layout manager
        setLayout(new GridBagLayout());
        //Use gridElementProperties to set the properties of the elements
        gridElementProperties footerGridElementsConstraints = new gridElementProperties();
        //Set the same default properties for all the elements
        footerGridElementsConstraints.resizeMode = GridBagConstraints.NONE;
        footerGridElementsConstraints.horizontalPadding = 10;
        footerGridElementsConstraints.verticalPadding = 10;
        footerGridElementsConstraints.marginTop = 10;
        footerGridElementsConstraints.marginBottom = 10;
        footerGridElementsConstraints.marginLeft = 10;
        footerGridElementsConstraints.marginRight = 10;
        //footerGridElementsConstraints.position = GridBagConstraints.NONE;

        //Set the properties of the elements then add them to the footer
        //footerText
        footerGridElementsConstraints.gridColumnPosition = 0;
        add(footerText, footerGridElementsConstraints.toGridBagConstraints());

        //Set the properties of the footer
        //Inside padding
        setBorder(new EmptyBorder(1,1, 1, 1));
        setBackground(themeColors.SURFACE_CONTAINER);
        //setLocation(100,100);
        //Set the JPanel width to be the same as the window width even when the window is resized
    }
}
