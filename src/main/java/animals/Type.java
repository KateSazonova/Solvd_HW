package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Type {ADULT(50),CHILD(25),PREFERENTIAL(30),PROMOTIONAL(20);
    private static final Logger LOGGER = LogManager.getLogger(Type.class);
    private int price;

    Type(int price) {this.price=price;}
    public int getPrice(){return price;}

    @Override
    public String toString() {
        LOGGER.info(getPrice());
        return null;
    }
}
