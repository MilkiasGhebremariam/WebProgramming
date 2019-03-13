import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  super.doGet(req, resp);
        //resp.getWriter().println("Hello, World!");
        req.getRequestDispatcher("/WEB-INFForm/index2.jsp").forward(req, resp);
        PrintWriter out = resp.getWriter();

//        out.print("<html><head><title>Test</title></head><body>");
//        out.print("<form method='post'>");
//        out.print("<p>Please click the button</p>");
//       out.print("<input type='submit' value='Click me'/>");
//        //out.print();
//        out.print("</form>");
//        out.print("</body></html>");
//    }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        out.print("<p> Thank you! "+req.getParameter("name") +"for contacting us. We should receive reply from us" +
                " with in 24 hrs in your email address"+req.getParameter("email")+". Let us know in our support email"
                +" mum.edu "+" "+"if you don’t receive reply within 24 hrs." +
                " Please be sure to attach your reference " +" "+Math.random()+" in your email.</p>");
        out.print("</body></html>");

    }
}
