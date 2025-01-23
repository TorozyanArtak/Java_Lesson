package homework_19_01_24;

import java.util.List;

public class GenericMethod {

    public static  <T> boolean isIN(T o , List<T> ts) {
        return ts.contains(o);
    }

}
