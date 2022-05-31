package Swing;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow  extends JFrame{
    public static void main(String[] args) {
        JFrame simpleWindow = new JFrame();
        simpleWindow.setVisible(true);
        simpleWindow.setTitle("Simple window");
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        simpleWindow.setBounds( dimension.width / 2 - 320, dimension.height / 2 - 240,  640, 480);
    }
}
