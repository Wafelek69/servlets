package pl.sda.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Logger;

@WebServlet (name = "RandomJson",
    urlPatterns = {"/getRandomNumber", "/randomJson"})
public class RandomJson extends HttpServlet {
   private static final Logger logger = Logger.getLogger(RandomJson.class.getSimpleName());

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        logger.info("Someone's tried to connect with this endpoint!");
        logger.info(request.getRemoteAddr());

        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        Random random = new Random();
        writer.println(random.nextInt());
    }
}
