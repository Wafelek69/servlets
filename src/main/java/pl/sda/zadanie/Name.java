package pl.sda.zadanie;

import com.google.common.base.Strings;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/nameServlet")
public class Name extends HttpServlet {

    protected static final String PARAMETER = "name";



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String name = request.getParameter(PARAMETER);
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

// z sendRedirect
//        if ((name.endsWith("a")))
//        {
//            response.sendRedirect("/servlets/Women");
//        }
//        else
//        {
//            response.sendRedirect("/servlets/Men");
//        }
        if (Strings.isNullOrEmpty(name))
        {
            String msg = "Podaj imie!";
            writer.println("<h1>" + msg + "</h1>");
        }
        else
            {

            if ((name.endsWith("a")))
            {
                writer.println(name);
                request.getRequestDispatcher("/Women")
                        .forward(request, response);
            }
            else
                {
                request.getRequestDispatcher("/Men")
                        .forward(request, response);
                }
            }



}
}
