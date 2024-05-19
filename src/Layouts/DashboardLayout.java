package Layouts;

/**
 *
 * @author Troy
 */

import Cards.DashboardHome;
import Cards.MyExperience;
import Components.*;
import Utilities.ThemeColors;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;


public class DashboardLayout extends JFrame {
    public DashboardLayout() {
        init();
    }
    
    private void init() {
        // Initialize components here
        setTitle("(DMW) POEA Dashboard");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main panel
        JPanel mainPanel = new JPanel(new MigLayout("wrap, insets 0, fill", "[][][]", "[][]"));
        mainPanel.setBackground(ThemeColors.BACKGROUND);

        // Create top navigation bar
        TopNavigationBar topNavigationBar = new TopNavigationBar();
        mainPanel.add(topNavigationBar, "pushx, growx, span, wrap, dock north");

        // Create side navigation bar
        SideNavigationBar sideNavigationBar = new SideNavigationBar();
        mainPanel.add(sideNavigationBar, "pushy, growy, dock west, width 250");

        // Create card container
        JPanel cardContainer = new JPanel(new CardLayout());
        //Instantiate the panels to be included in the card
        DashboardHome CardDashboardHome = new DashboardHome();
        MyExperience a = new MyExperience();
        //DashboardExtras a = new DashboardExtras();
        
        //Add the cards
        cardContainer.add(a);
        
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
        EventQueue.invokeLater(() -> new DashboardLayout().setVisible(true));
    }
    
}
