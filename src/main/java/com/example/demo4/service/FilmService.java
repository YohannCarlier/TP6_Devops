package com.example.demo4.service;

import com.example.demo4.entity.Film;

import java.util.ArrayList;

public class FilmService {

    private ArrayList<Film> listFilm;

    public FilmService() {
        listFilm= new ArrayList<>();
    }

    public void ajouterFilm(Film Film){
        listFilm.add(Film);
    }

    public ArrayList<Film> getListLivre() {
        return listFilm;
    }
}

