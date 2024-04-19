package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Items> item;

    public Store(List<Items> item) {
        this.item = item;
    }

    public Store() {
        item = new ArrayList<>();
    }

    public void addItems(Items itemss) {
        item.add(itemss);
    }


}
