package org.koreait.member.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //PrintWriter out = resp.getWriter();
        //resp.setContentType("text/html; charset=UTF-8");
        //out.print("<h1>상단</h1>");

        RequestDispatcher rd = req.getRequestDispatcher("/member/join.jsp");
        //rd.include(req, resp);
        rd.forward(req,resp);
        //out.print("<h1>상단</h1>");
    }
}
