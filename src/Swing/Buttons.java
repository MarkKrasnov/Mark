package Swing;

import javax.swing.*;

public class Buttons extends JFrame{

    JPanel pnl = new JPanel(); // создали объект JPanel
    ImageIcon tick = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Swing\\9316cfb7-c011-4a77-aca3-54fa926f7e6a.jpg");
    ImageIcon cross = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Swing\\9fd85d62-9183-4dc4-98cc-111d4f0e8dc9.jpg");

    JButton btn = new JButton("Press Me");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton( cross);


    public Buttons() {
        super("Окно SWING");
        setSize(630, 480);
        setDefaultCloseOperation(3);
        setLocation(350, 240);
        add(pnl);
        setVisible(true);
        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);

    }

    public static void main(String[] args) {
        Buttons window = new Buttons();
    }
}
