package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int serial = 100;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(Integer.valueOf(card.getSerial()), card.getOwner());
    }
    public HashMap getDatabase() {
        return database;
    }
}
