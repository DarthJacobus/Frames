


import javax.swing.*;
import java.awt.*;



public class Frame extends JFrame
{

    static final int width = 1400;
    static final int height = 800;
    public static Container contentPane;




    public Frame()
    {

        //JFrame
        setPreferredSize(new Dimension(width, height));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("iWrite TextEditor - Main Menu");

        //ContentPane
        contentPane = getContentPane();


        //JMenuBar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(openItem);
        fileMenu.add(quitItem);


        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem deleteItem = new JMenuItem("Delete");
        JMenuItem locationItem = new JMenuItem("Location address");
        editMenu.add(copyItem);
        editMenu.add(deleteItem);
        editMenu.add(locationItem);



    }





}
