/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudiciaryServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author student
 */
public class ViewCaseRR extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String cin=request.getParameter("cin");
        int c=Integer.parseInt(cin);
        String judge=request.getParameter("Judge");
        String judgeid=request.getParameter("Judgeid");
        String lawyer=request.getParameter("Lawyer");
        String lawyerid=request.getParameter("Lawyerid");

        String dstart=request.getParameter("dstart");
        String dcomplt=request.getParameter("dcomplt");
        String dhear=request.getParameter("dhear");
        String status=request.getParameter("status");
        
        if(request.getParameter("save")!=null){
            int i=0;
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
                String s="insert into RegistrarAssignDetails(CIN,AssigningJudge,AssigningLawyer,DateOfStart,DateOfComplt,DateOfHearing,Status,JudgeId,LawyerId) values(?,?,?,?,?,?,?,?,?);";
                ps=con.prepareStatement(s);
                
                ps.setInt(1,c);
                ps.setString(2,judge);
                ps.setString(3,lawyer);
                ps.setString(4,dstart);
                ps.setString(5,dcomplt);
                ps.setString(6,dhear);
                ps.setString(7,status);
                ps.setString(8,judgeid);
                ps.setString(9,lawyerid);
               
                i=ps.executeUpdate();
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewCaseRR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ViewCaseRR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(i>0){
                
                RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);
            }
            
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewCaseRR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewCaseRR at " + request.getContextPath() + "</h1>");
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
