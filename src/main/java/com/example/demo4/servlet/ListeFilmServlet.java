package com.example.demo4.servlet;

import com.example.demo4.entity.Film;
import com.example.demo4.singleinstance.SingleListFilm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "listeFilms", value = "/liste-film")
public class ListeFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Film> listFilm = SingleListFilm.FilmService.getListLivre();

        req.setAttribute("listeFilms", listFilm);

        req.getRequestDispatcher("WEB-INF/jsp/listeFilm.jsp").forward(req, resp);
    }
}
