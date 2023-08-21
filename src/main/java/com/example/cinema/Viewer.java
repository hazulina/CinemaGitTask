package com.example.cinema;

public class Viewer {
    private String nickname;
    private int age;
    private int viewedCinemaCount;

    public String getNickname() {
        return nickname;
    }

    public Viewer(String nickname, int age, int viewedCinemaCount) {
        this.nickname = nickname;
        this.age = age;
        this.viewedCinemaCount = viewedCinemaCount;
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
}
