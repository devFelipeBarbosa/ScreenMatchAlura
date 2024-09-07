package br.com.alura.sreenmatch.models;
import br.com.alura.sreenmatch.calculate.Sortable;

public class Movie extends Title implements Sortable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}