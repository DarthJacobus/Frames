

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MenuPanel extends JPanel
{
    public static JButton createDocumentButton;
    public static JButton createDrawingButton;
    public static JButton quitButton;
    public static JPanel buttonPanel;




    public MenuPanel()
    {

        //Layout
        setLayout(new BorderLayout());



        //Buttons: Creation
        createDocumentButton = new JButton("New Document");
        createDocumentButton.setBackground(Color.BLUE);
        createDrawingButton = new JButton("New Drawing");
        createDrawingButton.setBackground(Color.CYAN);
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.PINK);


        //Buttons: Loop that styles the buttons
        JButton[] stylingList = new JButton[] {createDocumentButton, createDrawingButton, quitButton};
        for(JButton element : stylingList) {
            element.setPreferredSize(new Dimension(Frame.width/3, Frame.height));
            element.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
            element.setForeground(Color.WHITE);
            element.setBorder(new LineBorder(Color.gray, 4));
        }


        //Buttons: Action Listeners using lambda expression
        createDocumentButton.addActionListener(e -> RunApplication.cardLayout.show(RunApplication.contentPanel, "documentPanel"));
        createDrawingButton.addActionListener(e -> RunApplication.cardLayout.show(RunApplication.contentPanel, "drawingPanel"));
        quitButton.addActionListener(e -> System.exit(0));


        //ButtonPanel: Creation, layout and adding sub panels
        add(createDocumentButton, BorderLayout.WEST);
        add(createDrawingButton, BorderLayout.CENTER);
        add(quitButton, BorderLayout.EAST);



    }





















}
