

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class DrawingPanel extends JPanel implements MouseMotionListener
{

    public static Graphics g;


    public DrawingPanel() {

        addMouseMotionListener(this);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));


        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton colorButton = new JButton("Red");
        colorButton.addActionListener(new ClickToChangeColor());
        JButton sizeButton = new JButton("Bigger");
        buttonPanel.add(colorButton);
        buttonPanel.add(sizeButton);


        JPanel paintPanel = new JPanel();


        add(buttonPanel);
        add(paintPanel);


    }

    public void mouseDragged(MouseEvent e)
    {
        g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);

    }

    public void mouseMoved(MouseEvent e)
    {

    }

}


class ClickToChangeColor implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        DrawingPanel.g.setColor(Color.RED);

    }





}









