
package misrc;

// @author Administrator

import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        ejemplo1();
    }
    
    //CREAR UNA COLECCION TREESET
    
    public static void ejemplo1 (){
    Set<Integer> enteros_ts = new TreeSet<>();
    enteros_ts.add(2);
    enteros_ts.add(1);
    enteros_ts.add(3);
    enteros_ts.add(4);
    enteros_ts.add(4);
    
    for(Integer elemento: enteros_ts){
        System.out.print(elemento + "");
    }
    }

}
