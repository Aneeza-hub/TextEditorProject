import java.io.*;

public class FileManager {

    GUI gui;

    public FileManager(GUI gui) {
        this.gui = gui;
    }

    public void openFile() {
        FileDialog fd = new FileDialog(gui.frame, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        try {
            FileReader fr = new FileReader(fd.getDirectory() + fd.getFile());
            BufferedReader br = new BufferedReader(fr);

            gui.textArea.setText("");
            String line;

            while ((line = br.readLine()) != null) {
                gui.textArea.append(line + "\n");
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error opening file");
        }
    }

    public void saveFile() {
        FileDialog fd = new FileDialog(gui.frame, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        try {
            FileWriter fw = new FileWriter(fd.getDirectory() + fd.getFile());
            fw.write(gui.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }
}
