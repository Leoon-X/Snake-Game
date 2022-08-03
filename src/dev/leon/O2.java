package dev.leon;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class O2 extends JFrame {

    public O2() {
        initUI();
    }

    private void initUI() {

        add(new O1());

        setResizable(false);
        pack();

        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new O2();
            ex.setVisible(true);
        });
    }
}
