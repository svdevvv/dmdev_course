package com.dmdev.cs.homework.collectionsHM.Films;

import java.util.*;

public class Cinema {
    Map<Integer, List<Film>> cinemaList = new TreeMap<>();

    public List<Film> getFilmsByGenre(String genre){
        ArrayList<Film> filmList = new ArrayList<>();
        for (List<Film> value : cinemaList.values()) {
            for (Film film : value) {
                if(film.getGenre().equalsIgnoreCase(genre)){
                    filmList.add(film);
                }
            }
        }
        return filmList;
    }

    public List<Film> getTop10Films(){
        ArrayList<Film> filmList = new ArrayList<>();
        for (List<Film> value : cinemaList.values()) {
            filmList.addAll(value);
        }
        filmList.sort((o1, o2) -> Double.compare(o2.getRating(), o1.getRating()));
        ArrayList<Film> top10List = new ArrayList<>();
        for (int i = 0; i < filmList.size() && i < 10; i++) {
            top10List.add(filmList.get(i));
        }
        return top10List;
    }

    public List<Film> getFilmsByYearAndMonth(int year, int month){
        List<Film> ListOfFilmsByYear = cinemaList.getOrDefault(year, Collections.emptyList());
        ArrayList<Film> filmList = new ArrayList<>();
        for (Film film : ListOfFilmsByYear) {
            if(film.getMonth() == month){
                filmList.add(film);
            }
        }
        return filmList;
    }

    public List<Film> getFilmsByYear(int year){
        return cinemaList.getOrDefault(year, Collections.emptyList());
    }

    public void addFilm(Film film){
        if(!isCinemaContains(film)){
            if(!cinemaList.containsKey(film.getYear())){
                cinemaList.put(film.getYear(), new ArrayList<>());
            }
        }else{
            System.out.println("Фильм " + film.getId() + ", выпущенное в  " + film.getYear() + " году, уже добавлен.");
        }
        cinemaList.get(film.getYear()).add(film);
        System.out.println("Фильм под номером " + film.getId() + " и выпущенный в " + film.getYear() + " году, добавлен.");
    }

    public boolean isCinemaContains(Film film){
        List<Film> list = cinemaList.get(film.getYear());
        if(list != null){
            return list.contains(film);
        }
        return false;
    }

}
