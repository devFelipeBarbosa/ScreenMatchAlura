package br.com.alura.sreenmatch.calculate;
import br.com.alura.sreenmatch.models.Movie;
import br.com.alura.sreenmatch.models.Series;
import br.com.alura.sreenmatch.models.Title;

public class timeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }


//    public void include(Movie m){
//        totalTime += m.getMovieDuration();
//    }
//
//    public void include(Series s){
//        totalTime += s.getMovieDuration();
//    }

    public void include(Title t){
        this.totalTime += t.getMovieDuration();
    }
}
