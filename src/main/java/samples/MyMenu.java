package samples;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ton on 12/02/15.
 */
public class MyMenu {

    private Collection<MyMenuItem> menuItens;

    public MyMenu() {
        this.menuItens = new ArrayList<MyMenuItem>();
    }


    public void add(MyMenuItem menuItem) {
        this.menuItens.add(menuItem);
    }

}
