
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/AtmController"})
public class AtmController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String target = "/WEB-INF/doAtm.jsp";
            String operation = (String) request.getParameter("operation");

            HttpSession session = request.getSession();
            Account account = (Account) session.getAttribute("account");
            if (account == null) {
                account = new Account();
                session.setAttribute("account", account);
            }

            switch (operation) {
                case "Deposit":
                    session.setAttribute("doAtmTitle", "Deposit");
                    break;
                case "Withdraw":
                    session.setAttribute("doAtmTitle", "Withdraw");
                    break;
                case "doAtm":
                    String doAtmTitle = (String) session.getAttribute("doAtmTitle");
                    long amount = Long.parseLong(request.getParameter("amount"));

                    if (doAtmTitle.equals("Deposit")) {
                        account.deposit(amount);
                    } else if (doAtmTitle.equals("Withdraw")) {
                        account.withdraw(amount);
                    }

                    session.setAttribute("amount", amount);
                    target = "/WEB-INF/doAtmResult.jsp";
                default:
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
