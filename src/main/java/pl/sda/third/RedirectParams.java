package pl.sda.third;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectParams extends HttpServlet {

    public static final String REDIRECT_PARAMETER = "name2";

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        request.setAttribute(REDIRECT_PARAMETER, "Marcin");
        request.getRequestDispatcher("/finalServlet").forward(request, response);
    }
}
