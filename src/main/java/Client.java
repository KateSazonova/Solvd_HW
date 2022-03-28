package main.java;

public class Client implements IVisit, IInfo {
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

    public void setNameClient(String nameClient) throws NameException {
        if(nameClient.length()<1){
            throw new NameException("enter name");
        }
        this.nameClient = nameClient;
    }

    @Override
    public void takeFoto() {
        System.out.println(getNameClient() + " take foto");
    }

    @Override
    public void buy() {
        System.out.println(getNameClient() + " buy");
    }

    @Override
    public void showInfo() {
        System.out.println(getNumber());
    }

    public static void visited() {
        System.out.println("Visiter " + getNameClient() + " visited Zoo " + Zoo.getNameZoo());
    }

    public static void main(String[] args) {
        Client jon = new Client("Jon");
        Zoo africa = new Zoo("Africa");
        visited();
        Client sam = new Client ("Sam");
        try {
            sam.setNameClient("");
        } catch (NameException e) {
            e.printStackTrace();
        }
    }
}
