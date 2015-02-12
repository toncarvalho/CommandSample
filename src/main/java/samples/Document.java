package samples;

/**
 * Created by ton on 12/02/15.
 */
public class Document {
    private final String name;

    public Document(String name) {
        this.name = name;
    }


    public void open() {
        System.out.println("Documento " + this.name + " foi aberto.");
    }

    public void paste() {
        System.out.println("Algo colado no Documento " + this.name + ".");
    }


    public void cut() {

    }

    public void close() {

    }


    public void copy() {

    }
}
