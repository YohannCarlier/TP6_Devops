package com.example.demo4.entity;

public class Film {

    private String realisateur;
    private String genre;
    private String annee;
    private String titre;

    public Film(String realisateur, String genre, String annee, String titre) {
        this.realisateur = realisateur;
        this.genre = genre;
        this.annee = annee;
        this.titre = titre;
    }

    public String getAuteur() {
        return realisateur;
    }

    public void setAuteur(String auteur) {
        this.realisateur = realisateur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}

