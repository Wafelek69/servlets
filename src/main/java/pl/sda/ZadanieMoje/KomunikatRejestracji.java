package pl.sda.ZadanieMoje;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/KomunikatRejestracji")
public class KomunikatRejestracji extends HttpServlet {


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
        {
            PrintWriter writer = response.getWriter();
            response.setContentType("text/html");

            writer.println("<h1>Dziekujemy za rejestracje!</h1>" );



        }
}
