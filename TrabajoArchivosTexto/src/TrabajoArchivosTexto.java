import java.io.*;

public class TrabajoArchivosTexto {

    public static void main(String[] args) {
        // Definimos el nombre del archivo que vamos a crear y leer
        String nombreArchivo = "mis_notas.txt";

        // BLOQUE 1: ESCRITURA DEL ARCHIVO
        // Usamos try-with-resources para asegurar que el archivo se cierre automaticamente
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Escribimos tres lineas de notas personales usando println()
            writer.println("Esta semana aprendi a manejar archivos en Java. Es muy util!");
            writer.println("Me costo entender como cerrar los recursos, pero ahora lo tengo claro.");
            writer.println("La proxima vez quiero probar con archivos binarios o JSON.");
            // Confirmamos que el archivo fue creado
            System.out.println("Archivo 'mis_notas.txt' creado y escrito con exito.");
        } catch (IOException e) {
            // Si ocurre un error al escribir, lo mostramos en consola
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // BLOQUE 2: LECTURA DEL ARCHIVO
        // Abrimos el archivo para leerlo linea por linea
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1; // Contador para numerar las notas
            // Mostramos un encabezado antes de imprimir las notas
            System.out.println("\nLeyendo el archivo 'mis_notas.txt':\n");
            // Leemos cada linea hasta que sea null (fin del archivo)
            while ((linea = reader.readLine()) != null) {
                // Imprimimos cada linea precedida por "Nota X: "
                System.out.println("Nota " + numeroLinea + ": " + linea);
                numeroLinea++; // Incrementamos el contador
            }
        } catch (IOException e) {
            // Si hay un error al leer, lo mostramos en consola
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mensaje final para indicar que la tarea termino
        System.out.println("\nTarea completada exitosamente.");
    }
}