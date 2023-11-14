
package pkg2.pkg2.pkg1aed;

import java.io.IOException;
import java.util.List;
import pkg2.pkg2.pkg1aed.modelos.Estudiante;
import pkg2.pkg2.pkg1aed.utils.EstudianteWriter;
import pkg2.pkg2.pkg1aed.utils.ImpresorEstudiantes;
import pkg2.pkg2.pkg1aed.utils.LectorFicheroCSV;


public class Main {

    
    public static void main(String[] args) {
        try{
            
            List<String[]> datosCSV = LectorFicheroCSV.leerArchivoCSV("src\\recursos\\alumnado.csv");
            
            List<Estudiante> listaEstudiantesCSV = LectorFicheroCSV.crearEstudiantes(datosCSV);
            
            System.out.println(ImpresorEstudiantes.imprimirEstudiantes(listaEstudiantesCSV));
            
            EstudianteWriter.escribirEstudiantesEnArchivo(listaEstudiantesCSV, "src\\recursos\\alumnado.dat");
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
