/**
 * Created by usuario on 16/04/2017.
 */
public class Factory {
    //Objeto privado
    private static Factory f;

    //constructor privado
    private Factory(){}

    //método para obtener el objeto privado f
    public static Factory getFactory(){
        if (f==null){//si no ha sido instanciado lo crea
            f= new Factory();
        }
        return f;//devuelve f
    }

    //Crea y devuleve un objeto Coche
    public Coche crearCoche(String tipo) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException{

        Class clase = Class.forName(tipo);//obtiene la clase de nombre "tipo"
        Coche c = (Coche) clase.newInstance();//Interpreta el objeto anterior como objeto coche
        return c;//devuelve c
    }
}