class Zoo {
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
    public void setAvairy(int avairy) {
        this.avairy = avairy;
    }
}

