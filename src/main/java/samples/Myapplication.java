package samples;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ton on 12/02/15.
 */
public class Myapplication {

    private Collection<Document> documents;

    public Myapplication() {
        this.documents = new ArrayList<Document>();
    }

    public void add(Document document) {
        this.documents.add(document);
    }

    public MyMenuItem createMenuItem(String label, Command command) {
        return new MyMenuItem(label, command);
    }

    public MyMenu createMenu() {
        return new MyMenu();
    }

    public static void main(String[] args) {
        Myapplication application = new Myapplication();
        MyMenu menu = application.createMenu();

        Command openCommand = new OpenCommand(application);
        Command pasteCommand = new PasteCommand(new Document("File1.doc"));
        MacroCommand macroCommand = new MacroCommand();

        macroCommand.addCommand(openCommand);
        macroCommand.addCommand(pasteCommand);

        MyMenuItem openItem = application.createMenuItem("Open", openCommand);
        MyMenuItem pasteItem = application.createMenuItem("Paste", pasteCommand);
        MyMenuItem macroItem = application.createMenuItem("Macro", macroCommand);

        menu.add(openItem);
        menu.add(pasteItem);
        menu.add(macroItem);

        openItem.clicked();
        pasteItem.clicked();
        macroItem.clicked();


    }
}
