package uiComponents;
//Import customFunctions
import customFunctions.gridElementProperties;
//Import ui essentials
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class topnav extends JPanel{
    public topnav() {
        //Elements to be added to the topnav
        JButton home = new JButton("Home");
        JButton about = new JButton("About");
        JButton contact = new JButton("Contact");
        //Text to display the username of the user
        JLabel username = new JLabel("Username");
        //App Logo
        JLabel logo = new JLabel("App Logo");

        //Change JLabel Text Color
        username.setForeground(themeColors.ON_SURFACE);
        //Change logo text color
        logo.setForeground(themeColors.ON_SURFACE);

        //Set the layout manager
        setLayout(new GridBagLayout());
        //Use gridElementProperties to set the properties of the elements
        gridElementProperties topnavGridElementsConstraints = new gridElementProperties();
        //Set the same default properties for all the elements
        topnavGridElementsConstraints.resizeMode = GridBagConstraints.BOTH;
        topnavGridElementsConstraints.horizontalPadding = 10;
        topnavGridElementsConstraints.verticalPadding = 10;
        topnavGridElementsConstraints.marginTop = 10;
        topnavGridElementsConstraints.marginBottom = 10;
        topnavGridElementsConstraints.marginLeft = 10;
        topnavGridElementsConstraints.marginRight = 10;
        topnavGridElementsConstraints.position = GridBagConstraints.PAGE_END;
        topnavGridElementsConstraints.horizontalStretch = 1;

        //Set the properties of the elements then add them to the topnav
        //logo
        topnavGridElementsConstraints.gridColumnPosition = 0;
        add(logo, topnavGridElementsConstraints.toGridBagConstraints());
        //Modify the properties of the elements - only the position
        topnavGridElementsConstraints.gridColumnPosition = 1;
        add(home, topnavGridElementsConstraints.toGridBagConstraints());
        topnavGridElementsConstraints.gridColumnPosition = 2;
        add(about, topnavGridElementsConstraints.toGridBagConstraints());
        topnavGridElementsConstraints.gridColumnPosition = 3;
        add(contact, topnavGridElementsConstraints.toGridBagConstraints());
        topnavGridElementsConstraints.gridColumnPosition = 4;
        add(username, topnavGridElementsConstraints.toGridBagConstraints());

        //Set the properties of the topnav
        //Inside padding
        setBorder(new EmptyBorder(1,1, 1, 1));
        setBackground(themeColors.SURFACE_CONTAINER);
        //setLocation(100,100);
        //Set the JPanel width to be the same as the window width even when the window is resized


    }

}
