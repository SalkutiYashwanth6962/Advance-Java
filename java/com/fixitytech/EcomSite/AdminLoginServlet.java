package com.fixitytech.EcomSite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fixitytech.EcomSite.DAO.UserDAO;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("uname1");
		String password=request.getParameter("upassword1");
		
		//boolean b = new UserDAO().validate(userName,password);
		if(userName.equals("admin")&&password.equals("admin")) {
			HttpSession hs = request.getSession();
			
			hs.setAttribute("adminid", userName);
			
				response.sendRedirect("admin");
			
		}else {
			request.setAttribute("err", "Entered username or password are wrong.");
			doGet(request, response);

		}
		
		
		
			}
	
	}


