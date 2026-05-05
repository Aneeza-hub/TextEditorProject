import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class GUI implements ActionListener {

    JFrame frame;
    JTextArea textArea;
    JScrollPane scrollPane;

    Stack<String> stack = new Stack<>();
    boolean wordWrapOn = false;

    Edit edit;
    Format format;
    FileManager fileManager;
    Colour colour;

    JMenuItem copy, cut, paste;

    public GUI() {

        frame = new JFrame("Java Text Editor");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu formatMenu = new JMenu("Format");
        JMenu colorMenu = new JMenu("Color");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(colorMenu);

        // Edit items
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");

        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);

        editMenu.add(copy);
        editMenu.add(cut);
        editMenu.add(paste);

        frame.setJMenuBar(menuBar);

        edit = new Edit(this);
        format = new Format(this);
        fileManager = new FileManager(this);
        colour = new Colour(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == copy) {
            edit.copy();
        }
        if (e.getSource() == cut) {
            edit.cut();
        }
        if (e.getSource() == paste) {
            edit.paste();
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
