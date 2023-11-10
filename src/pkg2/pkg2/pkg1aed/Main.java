
package pkg2.pkg2.pkg1aed;

import java.io.IOException;
import java.util.List;
import pkg2.pkg2.pkg1aed.modelos.Estudiante;
import pkg2.pkg2.pkg1aed.utils.LectorFicheroCSV;


public class Main {

    
    public static void main(String[] args) {
        try{
            
            List<String[]> datosCSV = LectorFicheroCSV.leerArchivoCSV("src\\recursos\\alumnado.csv");
            
            List<Estudiante> listaEstudiantesCSV = LectorFicheroCSV.crearEstudiantes(datosCSV);
            
            for (Estudiante estudiante : listaEstudiantesCSV) {
                System.out.println(estudiante.getNombre()+"\n");
                System.out.println(estudiante.getDni()+"\n");
                System.out.println(estudiante.getEdad()+"\n");
                
                System.out.println(estudiante.getFechaMatricula().getDia()+"/"+
                                        estudiante.getFechaMatricula().getMes()+"/"+
                                            estudiante.getFechaMatricula().getAnno()+"\n");
                
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
