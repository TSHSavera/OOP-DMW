package Layouts;

/**
 *
 * @author Troy
 */

import Cards.*;
import Components.AdminTopNavigationBar;
import Components.SideNavigationBar;
import Components.TopNavigationBar;
import Utilities.ThemeColors;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class AdminDashboardLayout extends JFrame {
    //Create card container
    public static JPanel cardContainer = new JPanel(new CardLayout());
    public AdminDashboardLayout() {
        init();
    }
    
    private void init() {
        // Initialize components here
        setTitle("(DMW) POEA Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main panel
        JPanel mainPanel = new JPanel(new MigLayout("wrap, insets 0, fill", "[][][]", "[][]"));
        mainPanel.setBackground(ThemeColors.BACKGROUND);

        // Create top navigation bar
        AdminTopNavigationBar topNavigationBar = new AdminTopNavigationBar();
        mainPanel.add(topNavigationBar, "pushx, growx, span, wrap, dock north");


        //Instantiate the panels to be included in the card
        MyUsers b = new MyUsers();

        //MyDocuments e = new MyDocuments();
        //DashboardExtras a = new DashboardExtras();


        
        //Add the cards
        cardContainer.add(b, "users");

        //cardContainer.add(e, "documents");
        
        cardContainer.setBackground(ThemeColors.BACKGROUND);
        mainPanel.add(cardContainer, "wrap, dock center, grow, push, span");
        
        
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
               double width = screenSize.getWidth();
                if (width < 1500) {
                    setSize(new Dimension(1500, getHeight()));
                    super.componentResized(e);
                } 
            }

        });

        // Add main panel to the frame
        add(mainPanel);
        pack();
        
    }
    
     public static void main(String[] args) {
        EventQueue.invokeLater(() -> new AdminDashboardLayout().setVisible(true));
    }
    
}
