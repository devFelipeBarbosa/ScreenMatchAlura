import br.com.alura.sreenmatch.calculate.timeCalculator;
import br.com.alura.sreenmatch.models.Movie;
import br.com.alura.sreenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setYearRelease(1970);
        myMovie.setMovieDuration(180);
        System.out.println("Duração do filme: " + myMovie.getMovieDuration());

        myMovie.displaysTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total de avaliações: " + myMovie.getTotalRating() + ".");
        System.out.println(myMovie.getAverage());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setYearRelease(2000);
        lost.displaysTechnicalSheet();
        lost.setSeason(10);
        lost.setChapterPerSeason(10);
        lost.setMinutesChapterPerSeason(10);
        System.out.println("Duração para maratornar Lost (min): " + lost.getMovieDuration());

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setYearRelease(2023);
        otherMovie.setMovieDuration(100);

        timeCalculator calculator = new timeCalculator();
        calculator.include(myMovie);
        calculator.include(otherMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

    }
}
