package pl.sda.ZadanieMoje;

import com.google.common.base.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Rejestracja")
public class Rejestracja extends HttpServlet {
    protected static final String USER = "userName";
    protected static final String PASS = "pass";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        String attribute = request.getParameter(USER);
        String attribute2 = request.getParameter(PASS);

        if (Strings.isNullOrEmpty(attribute) | Strings.isNullOrEmpty(attribute2)) {
            request.getRequestDispatcher("/RejestracjaFail.html").forward(request, response);

        } else
            {

            Wartosci.USERList.add(attribute);
            Wartosci.PASSList.add(attribute2);
            request.getRequestDispatcher("/RejestracjaPass.html").forward(request, response);
        }


    }
}
