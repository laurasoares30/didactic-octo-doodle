import javax.swing.JFrame;

import app.menu.MenuComponent;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame a = new JFrame();
        a.setSize(500,500);
        a.setVisible(true);
        MenuComponent menu = new MenuComponent(a);
    }
}
