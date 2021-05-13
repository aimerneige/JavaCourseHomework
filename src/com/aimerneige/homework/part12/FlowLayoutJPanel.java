package com.aimerneige.homework.part12;

import javax.swing.*;

public class FlowLayoutJPanel extends JPanel {
    FlowLayoutJPanel() {
        add(new JLabel("FlowLayout 布局面板"));
        add(new JButton(new ImageIcon("dog.jpg")));
        add(new JScrollPane(new JTextArea(12, 15)));
    }
}
