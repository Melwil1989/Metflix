public class Pelicula extends Contenido {
    
    public int duracion; //en minutos
    public Director director;
    public boolean filmadaEnIMAX;

    public void reproducir(){
        System.out.println("Reproduciendo pelicula " + nombre);
    }
}
