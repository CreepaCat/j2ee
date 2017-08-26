import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  java.util.Date;

import java.io.IOException;

@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            response.getWriter().println("<h1>Hello, Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        }catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
