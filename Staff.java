public class Staff {
    private int salary;
    private String surname;
    private String position;

    public Staff(String position, int salary) {
        this.salary = salary;
        this.position = position;
    }

    public Staff(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void feed() {
        System.out.println("Staffer " + getSurname() + " fed " + Animal.getKaind());
    }
    public static void main(String[] args) {
        Cat lion = new Cat("lion", "meat");
        Staff smith=new Staff("Smith");
        smith.feed();
        Zoo happy=new Zoo(3);
        System.out.print("Staffer "+smith.getSurname()+ " moved " + lion.getKaind() +" from avairy "+happy.getAvairy());
        happy.setAvairy(5);
        System.out.println(" to avairy "+ happy.getAvairy());
    }
}