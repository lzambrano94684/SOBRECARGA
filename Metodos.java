package Tarea6;

public class Metodos {

    private String nombre, dpi;
    private String direcion;

    public Metodos(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
    }

    public Metodos(String direcion) {
        this.direcion = direcion;
    }

    public void persona (){

        System.out.println("Su nombre es: "+nombre+" su dpi es: "+dpi);
    }

    public void persona (String vecino){
        System.out.println("Su direccion es: "+direcion);
        System.out.println("Tiene " + vecino+ " vecinos");
    }
}
