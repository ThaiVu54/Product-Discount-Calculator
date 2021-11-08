import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculator")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("Description");
        Float price = Float.parseFloat(request.getParameter("price"));
        Float percent = Float.parseFloat(request.getParameter("percent"));

        double amount = price * percent * 0.1;
        double priceDis = price - amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Description: "+des+"</h1>");
        writer.println("<h1>Discount Amount: "+amount+"</h1>");
        writer.println("<h1>Discount Price: "+priceDis+"</h1>");
        writer.println("</html>");

    }
}
