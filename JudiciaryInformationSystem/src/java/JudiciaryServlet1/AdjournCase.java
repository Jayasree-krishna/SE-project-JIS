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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
public class AdjournCase extends HttpServlet {

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
        
        if(request.getParameter("save")!=null)
        {
            String dfcin="";
            int i=0,j=0;
            String c=request.getParameter("cin");
            int cin=Integer.parseInt(c);
            String adjourn=request.getParameter("adjourn");
            String dhear=request.getParameter("dhear");
            String dphear=request.getParameter("dphear");

            try {
                PreparedStatement ps=null;
                ResultSet resultset=null;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
                String s="insert into AdjournmentReason(CIN,AdjournDate,ReasonForAdjourn,NextDateOfHearing) values(?,?,?,?);";
                ps=con.prepareStatement(s);
                
                ps.setInt(1,cin);
                ps.setString(2,dphear);
                ps.setString(3,adjourn);
                ps.setString(4,dhear);
                
                j=ps.executeUpdate();
                
                Statement statement=con.createStatement();
                String sql= "UPDATE RegistrarAssignDetails SET DateOfHearing='"+dhear+"' WHERE CIN='"+cin+"'";
                i=statement.executeUpdate(sql);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdjournCase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AdjournCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i>0 && j>0){
                 RequestDispatcher rd=request.getRequestDispatcher("CaseManagement.jsp");
                        rd.forward(request, response);
            }
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdjournCase</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdjournCase at " + request.getContextPath() + "</h1>");
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
