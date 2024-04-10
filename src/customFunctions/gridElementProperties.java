package customFunctions;
import java.awt.GridBagConstraints;
import java.awt.Insets;

//How to use:
//First, create a new gridElementProperties object.
//Then, set the properties of the object as needed.
//Finally, call the toGridBagConstraints() method to convert the object to a GridBagConstraints object.
public class gridElementProperties {
    //Expand the element when the window is resized according to the direction: HORIZONTAL, VERTICAL, BOTH (Default), NONE
    //Derived from fill
    public char resizeMode = GridBagConstraints.NONE;
    //Specify the position of the element in the grid by row. Default is 0.
    //Derived from gridX
    public int gridColumnPosition = 0;
    //Specify the position of the element in the grid by column. Default is 0.
    //Derived from gridY
    public int gridRowPosition = 0;
    //Specify the number of columns in the grid to be occupied by the element. Default is 1.
    //Derived from gridWidth
    public int gridColumnSpanCells = 1;
    //Specify the number of rows in the grid to be occupied by the element. Default is 1.
    //Derived from gridHeight
    public int gridRowSpanCells = 1;
    //Specify the top margin around the element. Default is 0.
    //Derived from insets.top
    public int marginTop = 0;
    //Specify the left margin around the element. Default is 0.
    //Derived from insets.left
    public int marginLeft = 0;
    //Specify the bottom margin around the element. Default is 0.
    //Derived from insets.bottom
    public int marginBottom = 0;
    //Specify the right margin around the element. Default is 0.
    //Derived from insets.right
    public int marginRight = 0;
    //Specify the horizontal space between the element and the edges of its cell. Default is 0.
    //Derived from ipadx
    public int horizontalPadding = 0;
    //Specify the vertical space between the element and the edges of its cell. Default is 0.
    //Derived from ipady
    public int verticalPadding = 0;
    //Specify where to position the grid element in the cell. Default is CENTER.
    //Derived from anchor
    public int position = GridBagConstraints.PAGE_START;
    //Specify if the element should be stretched to fill the cell. Default is NONE.
    //Derived from weightx
    public int horizontalStretch = 0;
    //Specify if the element should be stretched to fill the cell. Default is NONE.
    //Derived from weighty
    public int verticalStretch = 0;


    //Convert the gridElementProperties object to a GridBagConstraints object
    public GridBagConstraints toGridBagConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = this.resizeMode;
        gbc.gridx = this.gridColumnPosition;
        gbc.gridy = this.gridRowPosition;
        gbc.gridwidth = this.gridColumnSpanCells;
        gbc.gridheight = this.gridRowSpanCells;
        gbc.insets = new Insets(this.marginTop, this.marginLeft, this.marginBottom, this.marginRight);
        gbc.ipadx = this.horizontalPadding;
        gbc.ipady = this.verticalPadding;
        gbc.anchor = this.position;
        gbc.weighty = this.verticalStretch;
        gbc.weightx = this.horizontalStretch;
        return gbc;
    }
}
