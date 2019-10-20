package pl.sda.zadanie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/Men", "/men"})

public class Men extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException
    {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String name = request.getParameter("name");

        writer.println("<h1>" + "Witaj, " + name + " Jestes mezczyzna !" + "</h1>");
    }


}
