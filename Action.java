public interface Action {
    public default void drink() {
        System.out.println("I drink water");
    }

    public default void sleep(){
        System.out.println("I am sliping now");
    }
}
