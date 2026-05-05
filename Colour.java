import java.awt.*;
import java.awt.event.*;

public class Colour {

    GUI gui;

    public Colour(GUI gui) {
        this.gui = gui;
    }

    public void setWhite() {
        gui.textArea.setBackground(Color.white);
        gui.textArea.setForeground(Color.black);
    }

    public void setBlack() {
        gui.textArea.setBackground(Color.black);
        gui.textArea.setForeground(Color.white);
    }

    public void setBlue() {
        gui.textArea.setBackground(Color.blue);
        gui.textArea.setForeground(Color.white);
    }
}
