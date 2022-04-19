package animals.animalsintrface;

public interface Converter <T,N> {
    N convert(T t);
    static  <T> boolean isNotNull(T t){
        return t !=null;
    }
    boolean equals(Object obj);
}
