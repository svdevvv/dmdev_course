package com.dmdev.cs.homework.collectionsHM.Films;

import java.util.List;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id),
 * Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле:
 * отсортированный ассоциативный массив, где ключом является год издания,
 * а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм +
 * - получить все фильмы по переданному году +
 * - получить все фильмы по переданному году и месяцу +
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания +
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него
 * (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */

public class CinemaRunner {
    public static void main(String[] args) {

        Cinema cinema = getCinema();

        System.out.println();

        List<Film> filmsByYear = cinema.getFilmsByYear(1999);
        for (Film film : filmsByYear) {
            System.out.println(film);
        }
        System.out.println();
        List<Film> byYearAndMonth = cinema.getFilmsByYearAndMonth(1999, 5);
        for (Film film : byYearAndMonth) {
            if (!byYearAndMonth.contains(film)) {
                System.out.println("Нет фильма выпущенного в этом году!");
            }
            System.out.println(film);
        }
        System.out.println();
        List<Film> top10Films = cinema.getTop10Films();
        for (Film top10Film : top10Films) {
            System.out.println(top10Film);
        }
        System.out.println();

        List<Film> genre = cinema.getFilmsByGenre("Комедия");
        for (Film film : genre) {
            System.out.println(film);
        }

    }


    private static Cinema getCinema() {
        Film film1 = new Film(1, 2005, 5, "Комедия", 7.9);
        Film film2 = new Film(2, 2005, 5, "Ужасы", 6.5);
        Film film3 = new Film(3, 2005, 2, "Боевик", 5.0);
        Film film4 = new Film(4, 2007, 1, "Мелодрама", 6.9);
        Film film5 = new Film(5, 1999, 2, "Триллер", 7.9);
        Film film6 = new Film(6, 1961, 3, "Боевик", 9.5);
        Film film7 = new Film(7, 2012, 4, "Исторические", 7.8);
        Film film8 = new Film(8, 2020, 5, "Драма", 8.5);
        Film film9 = new Film(9, 1999, 3, "Драма", 9.3);
        Film film10 = new Film(10, 1999, 3, "Комедия", 7.8);
        Film film11 = new Film(11, 2012, 6, "Ужасы", 9.0);

        Cinema cinema = new Cinema();
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film4);
        cinema.addFilm(film3);
        cinema.addFilm(film5);
        cinema.addFilm(film7);
        cinema.addFilm(film6);
        cinema.addFilm(film8);
        cinema.addFilm(film10);
        cinema.addFilm(film9);
        cinema.addFilm(film11);
        return cinema;
    }
}
