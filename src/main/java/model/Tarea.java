package model;

public class Tarea {

    private String nombre;
    private String apellido;
    private long numero;

    public Tarea(){
    }

    public Tarea( String nombre, String apellido, Long numero) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }


    @Override
    public String toString(){
        return "Nombre: "+nombre+ "Apellido: "+apellido+ "Numero: "+numero;
    }
}
