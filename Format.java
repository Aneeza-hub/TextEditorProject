import java.awt.*;

public class Format {

    GUI gui;

    public Format(GUI gui) {
        this.gui = gui;
    }

    public void setFont(String font, int size) {
        gui.textArea.setFont(new Font(font, Font.PLAIN, size));
    }

    public void wordWrap() {
        gui.wordWrapOn = !gui.wordWrapOn;
        gui.textArea.setLineWrap(gui.wordWrapOn);
        gui.textArea.setWrapStyleWord(gui.wordWrapOn);
    }
}
