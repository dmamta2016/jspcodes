/*
 * AgeServlet.jsp
 * The Servlet acts as a controller and invokes a model class to
 * validate the username and password data.
 *  Copyright (C) 2015 Aptech Software Limited. All right reserved.
 */
 
 //package controller;

//import Model.ValidateUser;
//import helper.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vincent
 */
public class AgeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Retrieve request parameters 
            String name = request.getParameter("name");
            int age=Integer.parseInt(request.getParameter("age"));
		String result;
		if (age>=25) {
			result= "success";
		} else {
			result= "failure";
                }
            // Depending on the result, dispatching the request and response objects
            
            if (result.equals("success")) {
               
                System.out.println("Success");
                 request.setAttribute("name", name);
                 RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
                 rd.forward(request, response);
            } else {
                System.out.println("Error");
               RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
               rd.forward(request, response);
            }
            

        }finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
