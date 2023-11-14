package pkg2.pkg2.pkg1aed.modelos;

public class Estudiante extends Alumnado {

    private Fecha fechaMatricula;

    public Estudiante(Fecha fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public Estudiante(String dni, String nombre, int edad, Fecha fechaMatricula) {
        super(dni, nombre, edad);
        this.fechaMatricula = fechaMatricula;
    }

    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
    
    @Override
    public String toString() {
        return String.format(" Fecha Matrícula: %02d/%02d/%04d",fechaMatricula.getDia(), fechaMatricula.getMes(), fechaMatricula.getAnno());
    }

}
