package com.example.cinema;

import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int viewedCinemaCount;
    private List<Cinema> movieList;

    public String getNickname() {
        return nickname;
    }

    public Viewer(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public Viewer(String nickname, int age, List<Cinema> movieList) {
        this.nickname = nickname;
        this.age = age;
        this.movieList = movieList;
        this.viewedCinemaCount = movieList.size();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getViewedCinemaCount() {
        return viewedCinemaCount;
    }

    public void setViewedCinemaCount(int viewedCinemaCount) {
        this.viewedCinemaCount = viewedCinemaCount;
    }

    public List<Cinema> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Cinema> movieList) {
        this.movieList = movieList;
    }
}
