package ShopTime;

public class OutOfStock extends RuntimeException{
    public OutOfStock(String message){
        super(message);
    }
}
