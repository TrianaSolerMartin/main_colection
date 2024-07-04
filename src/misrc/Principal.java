
package misrc;

// @author Administrator

import java.util.ArrayList;
import java.util.List;
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
    
 //filtra y elimina los duplicados ademas de ordenado alfabetica o numericamente
    for(Integer elemento: enteros_ts){
        System.out.print(elemento + "a ");
    }

    ////recorre el treeset elemento por elemento 
    List<Integer> enteros_al =new ArrayList<>(enteros_ts);
    
    for (Integer elemento: enteros_al){
        System.out.print(elemento +"b ");
    }
    
    for (int i=0; i<enteros_ts.size(); i++){
    System.out.print(enteros_al.get(i)+"c ");
    }
    }

}