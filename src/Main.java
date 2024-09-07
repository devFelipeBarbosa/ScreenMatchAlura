import br.com.alura.sreenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setYearRelease(1970);
        myMovie.setMovieDuration(180);

        myMovie.displaysTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total de avaliações: " + myMovie.getTotalRating() + ".");
        System.out.println(myMovie.getAverage());

    }
}
