public class Client {
    private int number;
    private static String nameClient;
    public Client(int number) {
        this.number = number;
    }
    public Client(String nameClient) {
        this.nameClient = nameClient;
    }
    public int getNumber() {
        return number;
    }
    public static String getNameClient() {
        return nameClient;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public static void visited() {
        System.out.println("Visiter "+ getNameClient()+" visited Zoo "+ Zoo.getNameZoo());
    }
    public static void main(String[] args) {
        Client jon=new Client("Jon");
        Zoo africa=new Zoo("Africa");
        visited ();
    }
}
