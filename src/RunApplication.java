


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
    static MenuTextPanel menuTextPanel;
    static DocumentPanel documentPanel;



    public static void main(String args[])
    {

        frame = new Frame();
        cardLayout = new CardLayout();
        menuPanel = new MenuPanel();
        menuTextPanel = new MenuTextPanel();
        contentPanel = new JPanel();
        documentPanel = new DocumentPanel();


        contentPanel.setLayout(cardLayout);
        contentPanel.add(menuPanel, "1");
        contentPanel.add(menuTextPanel, "2");
        contentPanel.add(documentPanel, "3");

        cardLayout.show(contentPanel, "1");

        frame.contentPane.add(contentPanel);

        menuPanel.createNewButton.addActionListener(new ClearAndFill());

        documentPanel = new DocumentPanel();
        contentPanel.add(documentPanel, "4");
        documentPanel.comboBoxFonts.addActionListener(new ChangeFont());




        //Pack & Visibility
        frame.pack();
        frame.setVisible(true);


    }


    static class ClearAndFill implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            cardLayout.show(contentPanel, "3");
            frame.setTitle("iWrite TextEditor - New Text Document");





        }
    }

    static class ChangeFont implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            documentPanel.comboBoxFonts = (JComboBox) e.getSource();
            String command = e.getActionCommand();
            if("SansSerif".equals(command)) {
                documentPanel.textArea.setText("FUCK OFF");
            }

        }

    }





}










