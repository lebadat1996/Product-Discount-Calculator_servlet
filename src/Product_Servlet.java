import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Product_Servlet", urlPatterns = "/display-discount")
public class Product_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Description = request.getParameter("Product Description");
        float Price = Float.parseFloat(request.getParameter("List Price"));
        float DiscountPercent = Float.parseFloat(request.getParameter("Discount Percent"));
        float DiscountPercent1 = (float) (DiscountPercent * 0.01);
        float DiscountAmount = (float) (Price * DiscountPercent1 * 0.1);
        float DiscountPrice = Price - DiscountAmount;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>" + "Product Description: " + Description + "</h1>");
        printWriter.println("<h1>" + "List Price: " + "$" + Price + "</h1>");
        printWriter.println("<h1>" + "Discount Percent: " + DiscountPercent1 + "%" + "</h1>");
        printWriter.println("<h1>" + "Discount Amount:: " + "$" + DiscountAmount + "</h1>");
        printWriter.println("<h1>" + "Discount Price: " + "$" + DiscountPrice + "</h1>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
