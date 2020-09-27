import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class listas {
    public static void main(String[] args){
    //public listas(){
    
    ArrayList<String> mensajes1 = new ArrayList<String>();
    mensajes1.add("40000");
    mensajes1.add("Hola Juan");
    mensajes1.add("Hola María");
    mensajes1.add("Buenas noches");
    mensajes1.add("Buenas. ¿Cómo has estado?");
    mensajes1.add("Bien, ¿y tú?");

    System.out.println("Puerto en mensajes1: " + Integer.parseInt(mensajes1.get(0)));

    ArrayList<String> mensajes2 = new ArrayList<String>();
    mensajes2.add("40001");
    mensajes2.add("Oye, me debes dinero, ¿sabes?");
    mensajes2.add("Hala, ¿qué dices? Yo no le debo nada a nadie.");
    mensajes2.add("Sí, me debes dos euros, cara de cebolla.");

    System.out.println("Puerto en mensajes2: " + Integer.parseInt(mensajes2.get(0)));

    Map<String, ArrayList<String>> diccionarioxd = new HashMap<>();

    diccionarioxd.put(mensajes1.get(0), mensajes1);
    diccionarioxd.put(mensajes2.get(0), mensajes2);

    //diccionarioxd.put(mensajes1.get(0), mensajes2);

    //diccionarioxd.entrySet().stream().forEach(System.out::println);

    String picha[] = {"hola", "qué picha"};
    System.out.println(picha[1]);

    }
}
