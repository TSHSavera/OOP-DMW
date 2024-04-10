package uiComponents;

import customFunctions.gridElementProperties;

import javax.swing.*;
import java.awt.*;

public class uiLayout extends JPanel {
    //This will be the main grid container that handles how the elements are placed
    //uiElements must be added to this container then this container must be added to the window
    public uiLayout() {
        //Set the layout manager
        setLayout(new GridBagLayout());
        //Set background color
        setBackground(themeColors.BACKGROUND);

        //Use gridElementProperties to set the properties of the elements
        gridElementProperties gridElementsConstraints = new gridElementProperties();

        //Set the same default properties for all the elements
        gridElementsConstraints.resizeMode = GridBagConstraints.HORIZONTAL;
        gridElementsConstraints.horizontalPadding = 0;
        gridElementsConstraints.verticalPadding = 0;
        gridElementsConstraints.marginTop = 0;
        gridElementsConstraints.marginBottom = 10;
        gridElementsConstraints.marginLeft = 0;
        gridElementsConstraints.marginRight = 0;
        gridElementsConstraints.horizontalStretch = 1;

        //Set the properties of the elements then add them to the uiLayout
        //Add the elements here
        //Example:
        //gridElementsConstraints.gridColumnPosition = 0;
        //add(element, gridElementsConstraints.toGridBagConstraints());
        gridElementsConstraints.gridColumnPosition = 0;
        gridElementsConstraints.gridRowPosition = 0;
        gridElementsConstraints.position = GridBagConstraints.LINE_START;
        add(new topnav(), gridElementsConstraints.toGridBagConstraints());

        gridElementsConstraints.gridColumnPosition = 0;
        gridElementsConstraints.gridRowPosition = 1;
        gridElementsConstraints.horizontalStretch = 1;
        gridElementsConstraints.position = GridBagConstraints.SOUTH;
        gridElementsConstraints.marginBottom = 0;
        add(new footer(), gridElementsConstraints.toGridBagConstraints());

    }
}
