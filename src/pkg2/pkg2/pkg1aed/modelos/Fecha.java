package pkg2.pkg2.pkg1aed.modelos;

import java.io.Serializable;

public class Fecha implements Serializable {

    private int dia;
    private int mes;
    private int anno; //a�o

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

}
