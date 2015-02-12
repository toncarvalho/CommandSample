package samples;

/**
 * Created by ton on 12/02/15.
 */
public class OpenCommand implements Command {

    private Myapplication myapplication;

    public OpenCommand(Myapplication myapplication) {
        this.myapplication = myapplication;
    }

    protected String askUser() {
        return "File2.doc";
    }


    @Override
    public void execute() {
        String name = askUser();

        if (name.length() != 0){
            Document document = new Document(name);
            this.myapplication.add(document);
            document.open();
        }
    }
}
