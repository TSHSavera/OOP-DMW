import uiComponents.*;

public class Main {
    public static void main(String[] args) {
        //Instantiate the window class
        window window = new window();

        //Instantiate the main grid container
        uiLayout uiLayout = new uiLayout();

        //Create a new JFrame
        window.newWindow(1000, 500, true, "App", uiLayout);

    }
}