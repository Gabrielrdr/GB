package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(new GridBagLayout());
        frame.setMaximumSize(new Dimension(1000, 1000));
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        frame.add(board);

        frame.setVisible(true);
    }
}