

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class MenuPanel extends JPanel
{
    public static JButton createNewButton;




    public MenuPanel()
    {

        //Layout
        setLayout(null);


        //Buttons: Local styling variables
        int buttonWidth = 300;
        int buttonHeight = 100;
        int buttonXPos = Frame.width/2 - buttonWidth/2;
        int buttonYPos = Frame.height/2;


        //Button "Create new": Styling & Functionality
        createNewButton = new JButton("Create new");
        createNewButton.setBackground(Color.ORANGE);
        createNewButton.setBorder(new RoundedBorder(20));
        createNewButton.setBounds(buttonXPos, buttonYPos - buttonHeight, buttonWidth, buttonHeight);


        //Button "My Files": Styling & Functionality
        JButton myFilesButton = new JButton("My Files");
        myFilesButton.setBackground(Color.ORANGE);
        myFilesButton.setBorder(new RoundedBorder(20));
        myFilesButton.setBounds(buttonXPos, buttonYPos + 20, buttonWidth, buttonHeight);

        //Button "Quit": Styling & Functionality
        JButton quitButton = new JButton("Quit");
        quitButton.setBackground(Color.ORANGE);
        quitButton.setBorder(new RoundedBorder(20));
        quitButton.setBounds(buttonXPos, buttonYPos + buttonHeight + 40, buttonWidth, buttonHeight);
        quitButton.addActionListener(e -> System.exit(0)); //using new lambda expression


        //Adding to menu panel
        add(createNewButton);
        add(myFilesButton);
        add(quitButton);


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
