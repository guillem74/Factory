/**
 * Created by Guillem on 16/04/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Coche> coches = new ArrayList<Coche>();

        try {
            coches.add(Factory.getFactory().crearCoche("Coche1"));
            coches.add(Factory.getFactory().crearCoche("Coche2"));
            coches.add(Factory.getFactory().crearCoche("Coche3"));
            for (Coche c:coches) {
                c.arrancar();
            }
            for (Coche c:coches) {
                c.parar();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}