package Resources;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Troy
 * 
 * How to use:
 * Resources.getIcon(Resources.ICON_POEA_NT)
 * 
 */
public class Resources {
  
  //String should be equal to the path name of your image
  public static final String ICON_POEA = "poea.png";
  public static final String ICON_POEA_NT = "poea_nt.png";
  

  public static ImageIcon getIcon(String name) {

    //Save og parameter
    String og_name = name;
    // Get resource path dynamically based on name
    String resourcePath = name.replace("ICON_", "");  

    ImageIcon icon = null;

    try {
        icon = new ImageIcon(Resources.class.getResource(resourcePath)); 
        //Auto scale icons
        Image a = icon.getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(a);
    } catch (Exception e) {
        System.out.println("Resource not found: " + name);
    }
    
    return icon;
  }

}
