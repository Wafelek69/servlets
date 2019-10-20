package pl.sda.ZadanieMoje;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

import static pl.sda.ZadanieMoje.Wartosci.*;

@WebFilter(filterName = "Zaloguj", urlPatterns = {"/Registation"})
public class Registation implements javax.servlet.Filter {

    public static final String USER = "userName";
    private static final String PASS = "pass";



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException
    {

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        String attribute = request.getParameter(USER);
        String attribute2 = request.getParameter(PASS);


        if (USERList.contains(attribute) & PASSList.contains(attribute2))
                {
                    if (attribute.equals(getLoginAdmin()) && attribute2.equals(getPassAdmin()))
                    {
                        request.getRequestDispatcher("/KomunikatLogowaniaAdmin").forward(request, response);
                        filterChain.doFilter(request , response);
                    }
                    else
                        request.getRequestDispatcher("/KomunikatLogowania").forward(request, response);
                }
        else
            {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            writer.println("<h1>Nieprawidłowe dane</h1>");
            }


    }

}



