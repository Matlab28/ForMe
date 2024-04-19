package Shopping;

public class Items {
    private String name;
    private int quantity;

    public Items(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void buy(int requestedQuantity) throws OutOfStock {
        if (requestedQuantity > quantity) {
            throw new OutOfStock("Our-of-stock");
        }
        quantity -= requestedQuantity;
        System.out.println("Your request '" + requestedQuantity + "' was accepted");
        System.out.println("'" + name + "' added your bag ");
    }
}
