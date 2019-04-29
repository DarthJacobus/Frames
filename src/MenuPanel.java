

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class MenuPanel extends JPanel
{
    public static JButton createNewButton;
    public static JButton myFilesButton;
    public static JButton quitButton;
    public static JPanel buttonPanel;




    public MenuPanel()
    {

        //Layout


        //Button "Create new": Styling & Functionality
        createNewButton = new JButton("Create new");
        createNewButton.setBackground(Color.ORANGE);
        createNewButton.setBorder(new RoundedBorder(20));
        createNewButton.setPreferredSize(new Dimension(600, 200));

        //Button "My Files": Styling & Functionality
        myFilesButton = new JButton("My Files");
        myFilesButton.setBackground(Color.ORANGE);
        myFilesButton.setBorder(new RoundedBorder(20));
        myFilesButton.setPreferredSize(new Dimension(600, 200));

        //Button "Quit": Styling & Functionality
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.ORANGE);
        quitButton.setBorder(new RoundedBorder(20));
        quitButton.addActionListener(e -> System.exit(0)); //using new lambda expression
        quitButton.setPreferredSize(new Dimension(600, 200));

        //ButtonPanel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 0, 20));
        buttonPanel.add(createNewButton);
        buttonPanel.add(myFilesButton);
        buttonPanel.add(quitButton);


        //Adding panels
        add(buttonPanel);



    }


    private static class RoundedBorder implements Border
    {

        private int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }




















}
