
import java.util.HashMap;

public class Histogram<Type> extends HashMap<Type, Integer> {   //alt  enter en hashmap

    @Override
    public Integer get(Object Key) {    // un alt insert  e selecionar get
        if (containsKey(Key)) {
            return super.get(Key);  //control e para borrar linea
        }
        return 0;
    }

}
