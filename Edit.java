import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class Edit {

    GUI gui;

    public Edit(GUI gui) {
        this.gui = gui;
    }

    public void copy() {
        String text = gui.textArea.getSelectedText();
        if (text != null) {
            gui.stack.push(text);
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new StringSelection(text), null);
        }
    }

    public void cut() {
        String text = gui.textArea.getSelectedText();
        if (text != null) {
            gui.stack.push(text);
            gui.textArea.replaceSelection("");
        }
    }

    public void paste() {
        if (!gui.stack.isEmpty()) {
            gui.textArea.insert(gui.stack.pop(), gui.textArea.getCaretPosition());
        }
    }
}
