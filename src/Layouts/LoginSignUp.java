
package Layouts;


import Components.Login;

import java.awt.*;

public class LoginSignUp {
    public static void main(String[] args) {
       Login LoginFrame = new Login();
       LoginFrame.setResizable(false);
       LoginFrame.setSize(400, 500);
       LoginFrame.setLocationRelativeTo(null);
       LoginFrame.setVisible(true);
       EventQueue.invokeLater(LoginSignUp::new);
    }
}
