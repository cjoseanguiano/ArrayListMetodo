/*
    Método que recibe un ArrayList de String y lo modifica invirtiendo su contenido

 */
package arraylistmetodo;

import java.util.ArrayList;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayListMetodo {

    public static void main(String[] args) {

        ArrayList<String> nombre = new ArrayList<String>();

        nombre.add("Carlos");
        nombre.add("Jose");
        nombre.add("Gael");
        nombre.add("Magaly");

        System.out.println(nombre);
        nombre = invertir(nombre);
        System.out.println(nombre);
    }
    
    public static ArrayList<String>invertir(ArrayList<String>nomm){
        
        ArrayList<String>resultado = new ArrayList<String>();
        
        for (int i = nomm.size()- 1; i >= 0; i--) {
            resultado.add(nomm.get(i));
        }
        return resultado;
    }

}
