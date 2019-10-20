package pl.sda.ZadanieMoje;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static pl.sda.ZadanieMoje.Wartosci.*;

@WebServlet("/Logowanie")
public class Logowanie extends HttpServlet {

    protected static final String USER = "userName";
    protected static final String PASS = "pass";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        String attribute = request.getParameter(USER);
        String attribute2 = request.getParameter(PASS);

//        if (attribute.equalsIgnoreCase(String.valueOf(Wartosci.USERList)) & (attribute2.equalsIgnoreCase(String.valueOf(Wartosci.PASSList))))
        if (USERList.contains(attribute) & PASSList.contains(attribute2))

        {
            request.getRequestDispatcher("/KomunikatLogowania").forward(request, response);

        }
        else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            writer.println("Nieprawidłowe dane");
        }
    }

}
