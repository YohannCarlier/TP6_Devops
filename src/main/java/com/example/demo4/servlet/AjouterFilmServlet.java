package com.example.demo4.servlet;

import com.example.demo4.entity.Film;
import com.example.demo4.service.FilmService;
import com.example.demo4.singleinstance.SingleListFilm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AjouterFilm", value = "/ajouter-Film")
public class AjouterFilmServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/ajouterFilm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String realisateur = req.getParameter("realisateur");
        String genre = req.getParameter("genre");
        String annee = req.getParameter("annee");

        Film film = new Film(realisateur, genre, annee, titre);
        SingleListFilm.FilmService.ajouterFilm(film);

        resp.sendRedirect("liste-film");
    }
}
