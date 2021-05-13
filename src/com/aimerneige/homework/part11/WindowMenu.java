package com.aimerneige.homework.part11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame {

    JMenuBar menuBar;
    JMenu menu;
    JMenu subMenu;
    JMenuItem item1;
    JMenuItem item2;

    JTextField text;
    JButton button;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JRadioButton radio1;
    JRadioButton radio2;
    ButtonGroup group;
    JComboBox<String> comboBox;
    JTextArea textArea;

    public WindowMenu() {
    }

    public WindowMenu(String s, int x, int y, int w, int h) {
        init(s);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);

        // 菜单
        menuBar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("软件项目");
        item1 = new JMenuItem("Java 话题", new ImageIcon("a.gif"));
        item2 = new JMenuItem("动画话题", new ImageIcon("b.gif"));
        item1.setAccelerator(KeyStroke.getKeyStroke("A"));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("汽车销售系统", new ImageIcon("c.gif")));
        subMenu.add(new JMenuItem("农场信息系统", new ImageIcon("d.gif")));
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // 界面
        setLayout(new FlowLayout());

        add(new JLabel("文本框"));
        text = new JTextField(10);
        add(text);

        add(new JLabel("按钮"));
        button = new JButton("确认");
        add(button);

        add(new JLabel("选择框："));
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        checkBox3 = new JCheckBox("喜欢篮球");
        add(checkBox1);
        add(checkBox1);
        add(checkBox1);

        add(new JLabel("单选按钮"));
        group = new ButtonGroup();
        radio1 = new JRadioButton("男");
        radio2 = new JRadioButton("女");
        group.add(radio1);
        group.add(radio2);
        add(radio1);
        add(radio2);

        add(new JLabel("下拉列表"));
        comboBox = new JComboBox<>();
        comboBox.addItem("音乐天地");
        comboBox.addItem("武术天地");
        comboBox.addItem("象棋乐园");
        add(comboBox);

        add(new JLabel("文本区："));
        textArea = new JTextArea(6, 12);
        add(new JScrollPane(textArea));
    }
}
