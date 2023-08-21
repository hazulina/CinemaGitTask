package com.example.cinema;

public class Cinema {
    private String movieName;
    private String movieGenre;
    private double movieDuration;

    public Cinema() {
    }

    public Cinema(String movieName, String movieGenre, double movieDuration) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public double getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(double movieDuration) {
        this.movieDuration = movieDuration;
    }
}
