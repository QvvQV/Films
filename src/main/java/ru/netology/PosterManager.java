package ru.netology;

public class PosterManager {
    private String[] movies = new String[0]; // менеджер не содержит фильмы после создания
    private int defaultCountMovie; // значение количества фильмов по умолчанию

    public PosterManager(int defaultCountMovie) { // конструктор с изменяемым количеством фильмов
        this.defaultCountMovie = defaultCountMovie;
    }

    public PosterManager() { // конструктор со значением количества фильмов по умолчанию
        this.defaultCountMovie = 10;
    }

    public void add(String movie) { //массив для сохранения
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() { //метод для всех фильмов
        return movies;
    }

    public String[] findLast() { //метод для последнего фильма
        int resultLength;
        if (movies.length < defaultCountMovie) {
            resultLength = movies.length;
        } else {
            resultLength = defaultCountMovie;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
