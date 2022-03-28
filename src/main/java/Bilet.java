package main.java;

public final class Bilet {
    private static final int priсe = 10;
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
        if (category!="full") {
            throw new KaindException("out of stock");
        }
        this.category = category;
    }
    public static void main(String[] args) {
        Bilet bilet1 = new Bilet("simple", 18);
        System.out.println(bilet1.getCategory() + bilet1.getPriсe());
        Bilet bilet2 = new Bilet("full",10);
        try {
            bilet2.setCategory("preferential");
        } catch (KaindException e) {
            e.printStackTrace();
        }
    }
}
