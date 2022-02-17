package com.example.movies.models;

public class Movie implements Comparable<Movie> {
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean hasWonAward;

    public Movie(int year, int length, String title, String subject, int popularity, boolean hasWonAward) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.hasWonAward = hasWonAward;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setHasWonAward(boolean hasWonAward) {
        this.hasWonAward = hasWonAward;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean isHasWonAward() {
        return hasWonAward;
    }

    @Override
    public int compareTo(Movie o) {
        if (this.getPopularity() == o.getPopularity())
            return 0;
        else if (this.getPopularity() > o.getPopularity())
            return 1;
        else return -1;
    }
}
