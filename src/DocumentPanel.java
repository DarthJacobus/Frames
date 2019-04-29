

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.CardLayout;
import java.awt.event.*;


public class DocumentPanel extends JPanel
{

    public static JTextArea textArea;
    public static Font font;
    public static JComboBox comboBoxFonts;
    public static JComboBox comboBoxFontSizes;
    public static JComboBox comboBoxColors;


    public DocumentPanel()
    {

        setLayout(new BoxLayout(this, 1));


        String fonts[] = {"Verdana", "SansSerif", "Serif", "Monospaced"};
        comboBoxFonts = new JComboBox(fonts);
        comboBoxFonts.setBounds(10, 10, 90, 20);


        String fontSizes[] = {"Size 8", "Size 10", "Size 12", "Size 14", "Size 16", "Size 18", "Size 20", "Size 22", "Size 24", "Size 28", "Size 34"};
        comboBoxFontSizes = new JComboBox(fontSizes);
        comboBoxFontSizes.setBounds(10, 10, 90, 20);

        String fontColors[] = {"Black", "White", "Red", "Blue", "Green", "Yellow"};
        comboBoxColors = new JComboBox(fontColors);
        comboBoxFonts.setBounds(10, 10, 90, 20);
        comboBoxColors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Red")) {
                    textArea.setForeground(Color.RED);
                }
            }
        });



        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new FlowLayout());
        containerPanel.add(comboBoxFonts);
        containerPanel.add(comboBoxFontSizes);
        containerPanel.add(comboBoxColors);
        containerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(containerPanel);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100, 100, 100, 100);
        containerPanel.add(saveButton);



        JButton saveAsButton = new JButton("Save as");
        saveAsButton.setBounds(100, 100, 100, 100);
        saveAsButton.addActionListener(e -> saveAs());
        containerPanel.add(saveAsButton);


        textArea = new JTextArea("Write something..", 20, 20);
        font = new Font("Verdana", Font.PLAIN, 15);
        textArea.setFont(font);
        add(textArea);

        textArea.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e)
            {
                JTextArea source = (JTextArea) e.getComponent();
                source.setText("");
                source.removeFocusListener(this);
            }
        });


        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);



    }


    public void saveAs()
    {
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text File", "txt");
        final JFileChooser saveAsFileChooser = new JFileChooser();
        saveAsFileChooser.setApproveButtonText("Save");
        saveAsFileChooser.setFileFilter(extensionFilter);
        int actionDialog = saveAsFileChooser.showOpenDialog(this);
        if (actionDialog != JFileChooser.APPROVE_OPTION) {
            return;
        }


        File file = saveAsFileChooser.getSelectedFile();
        if (!file.getName().endsWith(".txt")) {
            file = new File(file.getAbsolutePath() + ".txt");
        }

        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(file));

            textArea.write(outFile);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {}
            }
        }






    }









}
