package samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by ton on 12/02/15.
 */
public class MacroCommand implements Command {

    private Collection<Command> commands;

    public MacroCommand() {

        commands = new ArrayList<Command>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }


    public void removeCommand(Command command) {
        this.commands.remove(command);
    }

    @Override
    public void execute() {

        Iterator i = commands.iterator();
        Command cada;
        while (i.hasNext()) {
            cada = (Command) i.next();
            cada.execute();
        }

    }
}
