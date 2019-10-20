package pl.sda.third;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static pl.sda.third.RedirectParams.REDIRECT_PARAMETER;

@WebServlet("/finalServlet")
public class finalServlet extends HttpServlet {


    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        String attributeValue = (String) request.getAttribute(REDIRECT_PARAMETER);


        if (attributeValue != null){
            writer.println("<h1>Hello, " + attributeValue + "!</h1>");
        }else {
            writer.println("<h1> Unauthorized!</h1>");
        }

    }


}
