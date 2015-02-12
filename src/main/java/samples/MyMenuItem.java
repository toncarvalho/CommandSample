package samples;

/**
 * Created by ton on 12/02/15.
 */
public class MyMenuItem {

    private String label;
    private Command command;

    public MyMenuItem(String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public void clicked() {

        this.command.execute();
    }
}
