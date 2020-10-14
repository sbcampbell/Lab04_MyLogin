/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author 816590
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String logoutMessage = "";
        HttpSession session = request.getSession();
     
        if(request.getParameter("logout") != null){
            session.invalidate();
            logoutMessage = "You have successfully logged out.";
             request.setAttribute("message", logoutMessage);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String loginMessage = "";
        
        AccountService account = new AccountService();
        User user =account.login(username, password);
        
        if(user != null){
            request.setAttribute("user", username);
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            
        }else{
            loginMessage = "Invalid username or password";
            request.setAttribute("message", loginMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);            
        }
    }

}
