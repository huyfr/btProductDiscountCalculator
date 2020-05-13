import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculateDiscountServlet", urlPatterns = "/display-discount")
public class calculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDesc = request.getParameter("productDescription");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountPrice = listPrice * discountPercent * 0.01;

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<p>Product description: " + productDesc+ "</p>");
        pw.println("<br>");
        pw.println("<p>Discount amount: " + discountPercent+ "</p>");
        pw.println("<br>");
        pw.println("<p>Discount price: " + discountPrice+ "<p>");
        pw.println("</html>");
    }
}
