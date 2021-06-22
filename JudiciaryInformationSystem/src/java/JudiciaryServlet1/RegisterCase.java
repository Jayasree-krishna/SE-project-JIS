/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudiciaryServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
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
public class RegisterCase extends HttpServlet {

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
 
       
        
        String dname=request.getParameter("dname");
        String daddress=request.getParameter("daddress");
        String tcrime=request.getParameter("tcrime");
        String lcrime=request.getParameter("lcrime");
        String officer=request.getParameter("officer");
        String dcrime=request.getParameter("dcrime");
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
        Date startDate=null;
        try{
         startDate= (Date) sdf.parse(dcrime);}catch(ParseException e){}
        String darrest=request.getParameter("darrest");
        String cin=request.getParameter("cin");
        String slot=request.getParameter("slot");
        String did=request.getParameter("did");
       
        
        if(request.getParameter("register")!=null)
        {
            int i=0;
            PreparedStatement ps=null;
            ResultSet rs=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
                String s="insert into CaseHistory(DefendantName,DefendantAddress,CrimeType,LocationOfCrime,NameOfArrestingOfficer,DateOfCrime,DateOfArrest,CIN,slot,DefendantId) values(?,?,?,?,?,?,?,?,?,?);";
                ps=con.prepareStatement(s);
                
                ps.setString(1,dname);
                ps.setString(2,daddress);
                ps.setString(3,tcrime);
                ps.setString(4,lcrime);
                ps.setString(5,officer);
                ps.setDate(6,(java.sql.Date) startDate);
                ps.setString(7,darrest);
                ps.setString(8,cin);
                ps.setString(9,slot);
                ps.setString(10,did);
                i=ps.executeUpdate();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterCase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(RegisterCase.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i>0){
                HttpSession session=request.getSession();
                    session.setAttribute("cin",cin);
                    session.setAttribute("registercase","true");
                RequestDispatcher rd=request.getRequestDispatcher("ViewCaseRR.jsp");
                    rd.forward(request, response);
            }
        }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterCase</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterCase at " + request.getContextPath() + "</h1>");
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
