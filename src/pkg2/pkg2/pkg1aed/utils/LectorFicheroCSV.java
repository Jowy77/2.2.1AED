package pkg2.pkg2.pkg1aed.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pkg2.pkg2.pkg1aed.modelos.Estudiante;
import pkg2.pkg2.pkg1aed.modelos.Fecha;

public class LectorFicheroCSV {

    public static List<String[]> leerArchivoCSV(String rutaArchivo) throws IOException {
        List<String[]> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en campos usando la coma como delimitador
                String[] campos = linea.split(",");
                datos.add(campos);
            }
        }

        return datos;
    }

    public static List<Estudiante> crearEstudiantes(List<String[]> datosCSV) {

        List<Estudiante> estudiantesCSV = new ArrayList<>();
        String dni = "";
        String nombre = "";
        int edad = 0;

        for (String[] fila : datosCSV) {
            dni = fila[0];
            nombre = fila[1];
            edad = Integer.valueOf(fila[2]);

            estudiantesCSV.add(new Estudiante(dni, nombre, edad, new Fecha(Integer.valueOf(fila[3]),
                    Integer.valueOf(fila[4]), Integer.valueOf(fila[5]))));
        }

        return estudiantesCSV;
    }

}
