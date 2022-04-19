package animals;

import animals.exception.KaindException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Bilet {
    private final Logger LOGGER = LogManager.getLogger(Bilet.class);
    private final int priсe = 10;
    private String category;

    public Bilet(String category, int priсe) {
        this.category = category;
    }

    public Bilet(String category) {
        this.category = category;
    }

    public int getPriсe() {
        return priсe;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws KaindException {
        if (category.equals("preferential")) {
            throw new KaindException("out of stock");
        }
        this.category = category;
    }
}
