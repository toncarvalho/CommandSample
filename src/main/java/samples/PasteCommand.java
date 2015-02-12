package samples;

/**
 * Created by ton on 12/02/15.
 */
public class PasteCommand implements Command {

    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {

        this.document.paste();
    }
}
