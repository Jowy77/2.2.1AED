
package pkg2.pkg2.pkg1aed.utils;

import java.util.List;
import pkg2.pkg2.pkg1aed.modelos.Estudiante;


public class ImpresorEstudiantes {
    
    private static int contadorAlumnos = 0;
        
    public static String imprimirEstudiantes(List<Estudiante> listaEstudiantes){
        StringBuilder resultado = new StringBuilder();
        
        listaEstudiantes.forEach(estudiante -> {
            resultado.append("Alumnado nº ").append(++contadorAlumnos).append(" --> ");
            resultado.append(String.format("DNI: %s", estudiante.getDni()));
            resultado.append(String.format(" Nombre: %s", estudiante.getNombre()));
            resultado.append(String.format(" Edad: %d", estudiante.getEdad()));
            resultado.append(estudiante.toString());
            resultado.append("\n-------------------------------------------------------------------------\n");
        });
        resultado.append("[i]Numero de estudiantes matriculados para alñmacenar en fichero externo: " + contadorAlumnos);

        return resultado.toString();
    }
    
}
