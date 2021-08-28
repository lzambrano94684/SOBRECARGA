package Tarea6;

public class Metodos1 {

    private String nombre, dpi;
    private String direcion;

    public Metodos1(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
    }

    public Metodos1(String direcion) {
        this.direcion = direcion;
    }
    // metodo
    public void persona (){

        System.out.println("Su nombre es: "+nombre+" su dpi es: "+dpi);
    }

    public void persona (String vecino){
        System.out.println("Su direccion es: "+direcion);
        System.out.println("Tiene " + vecino+ " vecinos");
    }
}
