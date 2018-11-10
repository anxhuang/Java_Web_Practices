
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/ApplicationController"})
public class ApplicationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();

            String operation = (String) request.getParameter("operation");
            String target = "index.jsp";

            switch (operation) {
                case "Login":
                    target = "/WEB-INF/login.jsp";
                    break;
                case "LoginSubmit":
                    String user = (String) request.getParameter("user");
                    String pass = (String) request.getParameter("pass");
                    if ("Tom".equals(user) && "1234".equals(pass)) { //注意！ 這裡不能用 user == "Tom" 因為是不同型態
                        session.setAttribute("user", user);
                        request.setAttribute("welcome", "歡迎光臨<br>" + user + "<br>請選擇服務");
                    } else {
                        request.setAttribute("loginError", "帳號或密碼錯誤，請重新輸入");
                        target = "/WEB-INF/login.jsp";
                    }
                    break;
                case "ATM":
                    target = "/WEB-INF/atm.jsp";
                    break;
                case "Logout":
                    session.invalidate();
                    request.setAttribute("welcome", "您已登出，請重新登入");
                    target = "index.jsp";
                    break;
            }

            RequestDispatcher rd = request.getRequestDispatcher(target);
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
