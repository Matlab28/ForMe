package ShopTime;

import Shopping.OutOfStock;

public class Items {
    private String name;
    private int quantity;

    public Items(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    private void customerBuys(int requestedQuantity) throws OutOfStock {
        if (requestedQuantity > quantity) {
            throw new OutOfStock("We don't have enough '" + name + "' in our store...");
        }
        quantity -= requestedQuantity;
        System.out.println("Your request '" + name + "' added your bag.");
    }
}
