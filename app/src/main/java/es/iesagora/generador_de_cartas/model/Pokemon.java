package es.iesagora.generador_de_cartas.model;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private int numero;
    private String nombre;
    private int image;
    private String detalles;
    private int generacion;
    private String tipo1;
    private String tipo2;

    public Pokemon(int numero, String nombre, int image, String detalles,
                   int generacion, String tipo1, String tipo2) {

        this.numero = numero;
        this.nombre = nombre;
        this.image = image;
        this.detalles = detalles;
        this.generacion = generacion;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImage() {
        return image;
    }

    public String getDetalles() {
        return detalles;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
}
