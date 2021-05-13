package com.aimerneige.homework.part12;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JTabbedPane p;

    public MyFrame() {
        setBounds(100, 100, 500, 300);
        setVisible(true);
        p = new JTabbedPane(JTabbedPane.LEFT);
        p.add("观看 FlowLayout", new FlowLayoutJPanel());
        p.add("观看 GridLayout", new GridLayoutJPanel());
        p.add("观看 BorderLayout", new BorderLayoutJPanel());
        p.validate();
        add(p, BorderLayout.CENTER);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
