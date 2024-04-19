package ShopTime;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Items> clothes;

    public Store(List<Items> clothes) {
        this.clothes = clothes;
    }
    public Store(){
        clothes = new ArrayList<>();
    }
    public void addBag(Items gears){
        clothes.add(gears);
    }


}
