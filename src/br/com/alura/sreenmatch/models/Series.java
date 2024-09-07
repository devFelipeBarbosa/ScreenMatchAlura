package br.com.alura.sreenmatch.models;

public class Series extends Title {

    private int season;
    private boolean active;
    private int chapterPerSeason;
    private int minutesChapterPerSeason;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesChapterPerSeason() {
        return minutesChapterPerSeason;
    }

    public void setMinutesChapterPerSeason(int minutesChapterPerSeason) {
        this.minutesChapterPerSeason = minutesChapterPerSeason;
    }

    public int getChapterPerSeason() {
        return chapterPerSeason;
    }

    public void setChapterPerSeason(int chapterPerSeason) {
        this.chapterPerSeason = chapterPerSeason;
    }

    @Override
    public int getMovieDuration() {
        return season * chapterPerSeason * minutesChapterPerSeason;
    }
}
