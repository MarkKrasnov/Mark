package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame implements ActionListener {
    JPanel panel = new JPanel();

    ImageIcon tick = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Swing\\9316cfb7-c011-4a77-aca3-54fa926f7e6a.jpg");
    ImageIcon cross = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Swing\\9fd85d62-9183-4dc4-98cc-111d4f0e8dc9.jpg");

    JButton btn1 = new JButton( cross);
    JButton btn2 = new JButton(tick);
    JTextArea textArea = new JTextArea(5, 38);

    public Action() {
        super("SWING WINDOW");
        setDefaultCloseOperation(3);
        add(panel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(  dimension.width / 2 - 320 ,dimension.height / 2 - 160  ,640 , 320);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(textArea);

        btn2.setEnabled(false);
        textArea.setText("Кнопка 2 диактивированна");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {Action action = new Action();}

    @Override
    public void actionPerformed(ActionEvent event) {
        textArea.setText(event.getActionCommand() + " Нажата и деактивирована");

        if (event.getSource() == btn1) {
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }

        if (event.getSource() == btn2) {
            btn2.setEnabled(false);
            btn1.setEnabled(true);
        }
    }
}
