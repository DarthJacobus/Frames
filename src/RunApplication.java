


import javax.swing.*;
import java.awt.*;
import java.awt.CardLayout;
import java.awt.event.*;


public class RunApplication
{

    public static Frame frame;
    static MenuPanel menuPanel;
    static JPanel contentPanel;
    static CardLayout cardLayout;
    static DocumentPanel documentPanel;
    static DrawingPanel drawingPanel;



    public static void main(String args[])
    {

        frame = new Frame();
        cardLayout = new CardLayout();
        menuPanel = new MenuPanel();
        contentPanel = new JPanel();
        documentPanel = new DocumentPanel();
        drawingPanel = new DrawingPanel();



        contentPanel.setLayout(cardLayout);
        contentPanel.add(menuPanel, "menuPanel");
        contentPanel.add(documentPanel, "documentPanel");
        contentPanel.add(drawingPanel, "drawingPanel");

        cardLayout.show(contentPanel, "1");

        frame.contentPane.add(contentPanel);



        //Pack & Visibility
        frame.pack();
        frame.setVisible(true);


    }






}










