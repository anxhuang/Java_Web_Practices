
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/HeaderServlet"})
public class HeaderServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HeaderServlet</title>");
            out.println("</head>");
            out.println("<body>");

            //取得本次請求所包含的全部Header名稱
            Enumeration<String> enums = request.getHeaderNames();
            StringBuffer result = new StringBuffer("<ul>");

            String name;
            String value;
            Boolean isChrome = false; //紀錄是否為Chrome瀏覽器

            while (enums.hasMoreElements()) { //是否還有Header名稱可以讀取

                name = enums.nextElement();  //讀取Header名稱

                value = request.getHeader(name); //取得名稱的值

                if (name.equals("user-agent") && value.contains("Chrome")) {
                    isChrome = true;
                }

                result.append("<li>" + name + " : " + value + "</li>");
            }
            result.append("</ul>");

            if (isChrome) {
                out.print(result);
            } else {
                out.println("不是Chrome，不給看");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
