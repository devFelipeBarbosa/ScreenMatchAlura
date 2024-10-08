import br.com.alura.sreenmatch.calculate.FilterRecommendation;
import br.com.alura.sreenmatch.calculate.timeCalculator;
import br.com.alura.sreenmatch.models.Chapter;
import br.com.alura.sreenmatch.models.Movie;
import br.com.alura.sreenmatch.models.Series;

import java.util.ArrayList;

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

        FilterRecommendation filter = new FilterRecommendation();
        filter.filter(myMovie);

        Chapter chapter = new Chapter();
        chapter.setNumber(1);
        chapter.setSeries(lost);
        chapter.setTotalViews(300);
        filter.filter(chapter);

        Movie moviePaulo = new Movie();
        moviePaulo.setMovieDuration(200);
        moviePaulo.setName("Dogville");
        moviePaulo.setYearRelease(2003);
        moviePaulo.evaluate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(moviePaulo);
        movieList.add(myMovie);
        movieList.add(otherMovie);

        System.out.println("Tamanho da lista " + movieList.size());;
        System.out.println("Primeiro filme " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("to String do filme " + movieList.get(0).toString());

    }
}
