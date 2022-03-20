public class Bilet {
    private int priсe;
    private String category;
    public Bilet(String category, int priсe) {
        this.category = category;
        this.priсe = priсe;
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
    public void setPriсe(int priсe) {
        this.priсe = priсe;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
