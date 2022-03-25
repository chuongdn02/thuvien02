/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author chuon
 */
public class JSplitPaneDemo extends JFrame {

    private JPanel logoPane, loginPane;
    private JTextField tfs;
    private JSplitPane mainPane;
    private JMenuBar menuBar;
    private JMenu mainMenu, helpMenu, viewMenu;
    private JMenuItem login, logout, exit, edit, view, about, p1, p2, p3;
    private JPanel mainPanel;
    JLabel jlbLabel1;

    private JMenuItem createMenuItem(String name) {
        JMenuItem menuItem = new JMenuItem(name);
        return menuItem;
    }

    private void createLogoPane() {
        logoPane = new JPanel(new GridLayout(1, 2));
        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.setBackground(Color.YELLOW);
        northPanel.add(new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("tran.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
        northPanel.add(new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("Tranxinh.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
        logoPane.add(northPanel, BorderLayout.NORTH);
        northPanel.setLayout(new GridLayout(1, 2));
    }

    private void createMenu() {

        login = createMenuItem("Login");
        logout = createMenuItem("Logout");
        exit = createMenuItem("Exit");
        edit = createMenuItem("Edit");
        view = createMenuItem("View");
        about = createMenuItem("About");
        p1 = createMenuItem("picture1");
        p2 = createMenuItem("picture2");
        p3 = createMenuItem("picture3");

        menuBar = new JMenuBar();
        JPanel westPanel = new JPanel(new GridLayout(0, 3, 2, 5));
        westPanel.setBackground(Color.YELLOW);
        viewMenu = new JMenu("View");
        mainMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        menuBar.add(mainMenu);
        menuBar.add(helpMenu);
        menuBar.add(viewMenu);
        menuBar.add(westPanel, BorderLayout.WEST);
        mainMenu.add(login);
        mainMenu.add(logout);
        mainMenu.add(edit);
        mainMenu.add(view);
        mainMenu.add(exit);
        helpMenu.add(about);
        viewMenu.add(p1);
        viewMenu.add(p2);
        viewMenu.add(p3);
        setJMenuBar(menuBar);

    }

    private void MenuPane() {
        mainPanel = new JPanel(new GridLayout(0, 3, 2, 5));

        createMenu();
        setPreferredSize(new Dimension(800, 800));
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("EditPlus");
        pack();

    }
    //EAST
    //WEST

    private void createLoginPane() {
        loginPane = new JPanel();
        loginPane.setLayout(new BorderLayout());
        loginPane.setBackground(Color.YELLOW);
        JPanel headPane = new JPanel();
        JLabel tt = new JLabel("Login", JLabel.CENTER);
        tt.setFont(new javax.swing.plaf.FontUIResource("Arial", Font.BOLD, 18));
        headPane.add(tt);;
        JPanel bPane = new JPanel(new GridLayout(0, 2, 5, 5));
        bPane.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
        bPane.add(new JLabel("Username" + ":", JLabel.RIGHT));
        tfs = new JTextField(12);
        bPane.add(tfs);
        bPane.add(new JLabel("Password" + ":", JLabel.RIGHT));
        tfs = new JPasswordField(12);
        bPane.add(tfs);
        JPanel footPane = new JPanel();
        JButton button = new JButton("Login");
        JButton button1 = new JButton("Cancel");
        
        footPane.add(button);
        footPane.add(button1);
        footPane.setBackground(Color.white);
        bPane.add(footPane, BorderLayout.SOUTH);
        loginPane.add(headPane, BorderLayout.NORTH);
        loginPane.add(bPane, BorderLayout.CENTER);

    }
    public class AppMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object itemClicked = e.getSource();
            if (itemClicked == login) {
                mainPanel.add(new JLabel("Hello",JLabel.CENTER));
                pack();
            }
            if (itemClicked == p1) {
                jlbLabel1 = new JLabel("Ảnh 1", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("tran.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == p2) {
                jlbLabel1 = new JLabel("Ảnh 2", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("sttran.gif")).getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == p3) {
                jlbLabel1 = new JLabel("Ảnh 3", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("Tranxinh.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == exit) {
                dispose();
            }
        }
    }

    public JSplitPaneDemo() {
        
        createLogoPane();
        MenuPane();
        createLoginPane();
        setPreferredSize(new Dimension(500, 500));
        mainPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, logoPane, loginPane);
        setContentPane(mainPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Online Shopping");
        pack();

    }


    public static void main(String[] args) {
        JSplitPaneDemo s = new JSplitPaneDemo();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setSize(new Dimension(300, 300));
        s.setTitle("Nguyễn Văn Chương");
        s.setLayout(new BorderLayout());
        s.setVisible(true);
        s.pack();
        s.show();
    }
}
