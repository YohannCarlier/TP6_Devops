package com.example.demo4.service;

import com.example.demo4.entity.Livre;

import java.util.ArrayList;

public class LivreService {

    private ArrayList<Livre> listLivre;

    public LivreService() {
        listLivre= new ArrayList<>();
    }

    public void ajouterLivre(Livre livre){
        listLivre.add(livre);
    }

    public ArrayList<Livre> getListLivre() {
        return listLivre;
    }
}

