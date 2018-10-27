
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/interest.do"})
public class InterestServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        request.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {

            //取得表單資料
            String[] interest = request.getParameterValues("interest");

            //寄放到請求櫃台
            request.setAttribute("interest", interest);

            //寄放到全域櫃台
            ServletContext sc = getServletContext();
            sc.setAttribute("interest", interest);

            //寄放到會話櫃台
            HttpSession session = request.getSession();
            session.setAttribute("interest", interest);

            String target;
            if (request.getParameter("isHtml") != null) {
                target = "/programmingForm.html";
            } else {
                target = "/programming.form";
            }

            RequestDispatcher rd = request.getRequestDispatcher(target);
            //※注意! 若後續網頁有「submit」動作 即會建立「新的request」 原本舊request內寄放的資料會消失
            //※若轉送到HTML 編碼很容易出錯 建議統一使用JSP維持編碼一致性
            rd.forward(request, response);
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
