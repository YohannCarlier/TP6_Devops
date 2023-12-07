package com.example.demo4.servlet;

import com.example.demo4.entity.Livre;
import com.example.demo4.singleinstance.SingleListLivre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "listelivres", value = "/liste-livre")
public class ListeLivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Livre> listLivre = SingleListLivre.livreService.getListLivre();

        req.setAttribute("listeLivres", listLivre);

        req.getRequestDispatcher("WEB-INF/jsp/listeLivre.jsp").forward(req, resp);
    }
}
