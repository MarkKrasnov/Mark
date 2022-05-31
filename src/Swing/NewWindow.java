package Swing;

import javax.swing.*;

public class NewWindow extends JFrame {
    public NewWindow() {
        setTitle("Моё окно");
        setVisible(true);
        setSize(640, 480);
        setLocation(320, 240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        NewWindow newWindow = new NewWindow();


    }

}
