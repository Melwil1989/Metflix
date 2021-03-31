public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How I met your mother y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");

        Temporada temporada = serieBuscada.buscarTemporada(5);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

        Pelicula pelicula = miMetflix.buscarPelicula("Cinema Paradiso");

        Director director = pelicula.buscarDirector("Giuseppe Tornatore");

        System.out.println("El director buscado es: " + director.nombre);

        Serie serie = miMetflix.buscarSerie("The BigBang Theory");

        Actor actor = serie.buscarActor("Kaley Cuoco");

        System.out.println("El actor buscado es: " + actor.nombre);

        Pelicula peliculaBuscada = miMetflix.buscarPelicula("Batman: el caballero de la noche");

        peliculaBuscada.reproducir();

    }
}
