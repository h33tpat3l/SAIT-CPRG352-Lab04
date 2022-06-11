/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Models.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author het
 */
public class noteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        Note note = new Note(br.readLine(),br.readLine());
        request.setAttribute("note",note);
        String edit = request.getParameter("editNote");
        if (edit != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        Note note = new Note(br.readLine(),br.readLine());
        request.setAttribute("note",note);

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        if (title != null || content != null) {
            pw.println(title);
            pw.println(content);
            pw.close();
        }

        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);

    }

}
