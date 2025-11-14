package es.iesagora.generador_de_cartas.model;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private int numero;
    private String nombre;
    private int image;
    private String detalles;
    private int generacion;

    public Pokemon(int numero, String nombre, int image, String detalles, int generacion) {
        this.numero = numero;
        this.nombre = nombre;
        this.image = image;
        this.detalles = detalles;
        this.generacion = generacion;
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

    public int getGeneracion(){
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

}
