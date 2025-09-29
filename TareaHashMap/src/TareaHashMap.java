import java.util.HashMap;
import java.util.Map;

public class TareaHashMap {
    public static void main(String[] args) {
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        
        informacionPersonal.put("nombre", "Alexandra Alvarado");
        informacionPersonal.put("edad", "19");
        informacionPersonal.put("ciudad", "Orellana");

        System.out.println("Mapa inicial:");
        System.out.println(informacionPersonal);

        informacionPersonal.put("ciudad", "Orellana");
        System.out.println("\nCiudad actualizada a: " + informacionPersonal.get("ciudad"));

        informacionPersonal.put("profesion", "Ingeniera en Tecnologias de la Informacion");
        System.out.println("Profesion agregada: " + informacionPersonal.get("profesion"));

        if (!informacionPersonal.containsKey("telefono")) {
            System.out.println("\nLa clave 'telefono' no existe. Agregando numero ficticio...");
            informacionPersonal.put("telefono", "0992246617");
        }

        informacionPersonal.remove("edad");
        System.out.println("\nClave 'edad' eliminada.");

        System.out.println("\nContenido final del HashMap:");
        for (Map.Entry<String, Object> entry : informacionPersonal.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nRecuerda: El orden de impresion en HashMap no esta garantizado.");
    }
}