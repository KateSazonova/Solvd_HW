package main.java;

class Zoo implements IInfo {
    private static String nameZoo;
    private static int avairy;

    public Zoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public Zoo(int avairy) {
        this.avairy = avairy;
    }

    public static String getNameZoo() {
        return nameZoo;
    }

    public static int getAvairy() {
        return avairy;
    }

    public void setNameZoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public void setAvairy(int avairy) throws AvairyException {
        if (avairy<=0){
            throw new AvairyException("incorrect");
        }

        this.avairy = avairy;
    }

    public static void addAvairy() {
        System.out.println(getAvairy() + 1);
    }

    @Override
    public void showInfo() {
        System.out.println(getNameZoo());
    }

    public static void main(String[] args) {
        Zoo happy = new Zoo(3);
        happy.addAvairy();
    }
}

