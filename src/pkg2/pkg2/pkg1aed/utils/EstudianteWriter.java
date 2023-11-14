
package pkg2.pkg2.pkg1aed.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import pkg2.pkg2.pkg1aed.modelos.Estudiante;

public class EstudianteWriter {

    // Método para escribir una lista de estudiantes en un archivo .dat
    public static void escribirEstudiantesEnArchivo(List<Estudiante> listaEstudiantes, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            // Escribe la lista de estudiantes en el archivo
            oos.writeObject(listaEstudiantes);
            System.out.println("Lista de estudiantes escrita en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
