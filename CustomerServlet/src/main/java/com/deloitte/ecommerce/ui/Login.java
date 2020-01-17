package com.deloitte.ecommerce.ui;

import com.deloitte.ecommerce.service.CustomerService;
import com.deloitte.ecommerce.service.CustomerServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/first")
	public class Login extends HttpServlet {

	    private CustomerService service=new CustomerServiceImpl(new DaoImpl());

	    @Override
	    protected void doGet(HttpServletRequest req,
	                         HttpServletResponse resp)
	            throws ServletException, IOException {
	        resp.setContentType("text/html");
	        resp.setCharacterEncoding("UTF-8");
	        String username = req.getParameter("Mobile");
	        String password = req.getParameter("password");
	        boolean correct=service.credentialsCorrect(username,password);
	        if (correct) {
	            HttpSession session=req.getSession();
	            session.setAttribute("Mobile",Mobile);
	            resp.sendRedirect("/second");
	        }else {
	            resp.sendRedirect("html/form.html");
	        }
	    }


	}




