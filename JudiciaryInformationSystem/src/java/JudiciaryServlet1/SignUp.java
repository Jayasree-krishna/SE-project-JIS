/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudiciaryServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class SignUp extends HttpServlet {

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
        String uid=request.getParameter("uid");
        String pswd=request.getParameter("pswd");
        String type=request.getParameter("type");
        String security=request.getParameter("que");
        String ans=request.getParameter("ans");
        String uname=request.getParameter("uname");
      
      
        if(request.getParameter("create")!=null){
            if(type.matches("Lawyer")==true)
            {
                if(uid.startsWith("LW")==true){
                    LogInCheck.PasswordValidation(pswd);
                    if(LogInCheck.CreateAccount(uname,pswd,type,security,ans,uid)){
                    RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);}
                }
                else{
                  JOptionPane.showMessageDialog(null, "UserName starts with LW");
                  RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
                    rd.forward(request, response);
                }
                
            }
            if(type.matches("Defendant")==true)
            {
                if(uid.startsWith("DF")==true){
                    LogInCheck.PasswordValidation(pswd);
                    if(LogInCheck.CreateAccount(uname,pswd,type,security,ans,uid)){
                    RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);}
                }
                else{
                  JOptionPane.showMessageDialog(null, "UserName starts with DF");
                  RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
                    rd.forward(request, response);
                }
                
            }
             if(type.matches("Registrar")==true)
            {
                if(uid.startsWith("RR")==true){
                    LogInCheck.PasswordValidation(pswd);
                    if(LogInCheck.CreateAccount(uname,pswd,type,security,ans,uid)){
                    RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);}
                }
                else{
                  JOptionPane.showMessageDialog(null, "UserName starts with RR");
                  RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
                    rd.forward(request, response);
                }
                
            }
             if(type.matches("Judge")==true)
            {
                if(uid.startsWith("JG")==true){
                    LogInCheck.PasswordValidation(pswd);
                    if(LogInCheck.CreateAccount(uname,pswd,type,security,ans,uid)){
                    RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);}
                }
                else{
                  JOptionPane.showMessageDialog(null, "UserName starts with JG");
                  RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
                    rd.forward(request, response);
                }
                
            }
            
             
            
            
        }
        if(request.getParameter("back")!=null)
        {
            RequestDispatcher rd=request.getRequestDispatcher("RegistrarHome.jsp");
                    rd.forward(request, response);
        }
            
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp at " + request.getContextPath() + "</h1>");
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
