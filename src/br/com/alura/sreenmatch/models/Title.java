package br.com.alura.sreenmatch.models;

public class Title {
    private String name;
    private int yearRelease;
    private boolean includeAccount;
    private double sumOfRating;
    private int totalRating;
    private int movieDuration;

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludeAccount() {
        return includeAccount;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setIncludeAccount(boolean includeAccount) {
        this.includeAccount = includeAccount;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public void displaysTechnicalSheet(){
        System.out.println("Nome do filme: " + name + ".");
        System.out.println("Ano de lançamento: " + yearRelease + ".");

    }

    public void evaluate(double note){
        sumOfRating += note;
        totalRating++;
    }

    public double getAverage(){
        return sumOfRating / totalRating;
    }

}
