package com.deloitte.ecommerce.ui;
import com.deloitte.ecommerce.entity.AppUser;
import com.deloitte.ecommerce.service.CustomerService;

import java.io.IOException;
	import java.io.PrintWriter;

	@WebServlet("/second")
	public class Servlet1 extends HttpServlet {

	    private CustomerService service=new CustomerServiceImpl(new DaoImpl());

	    @Override
	    protected void doGet(HttpServletRequest req,
	                         HttpServletResponse resp)
	            throws ServletException, IOException {
	        resp.setContentType("text/html");
	        resp.setCharacterEncoding("UTF-8");
	        PrintWriter writer = resp.getWriter();
	        HttpSession session = req.getSession();
	        String signedOutVal = req.getParameter("signout");
	        boolean sessionDestroyed = false;
	        if (signedOutVal != null && signedOutVal.equals("true")) {
	            session.invalidate();
	            sessionDestroyed = true;
	        }
	        Object MobileObj=null;
	        if (!sessionDestroyed) {
	            MobileObj = session.getAttribute("Mobile");
	        }

	        if (MobileObj == null || MobileObj.toString().isEmpty()) {
	            resp.getWriter().println("you are not signed in yet");
	            String signInLink = "<a href='/html/form.html'>Sign In </a> ";
	            writer.println(signInLink);
	            return;
	        }
	        String Mobile=MobileObj.toString();
	        AppUser user=service.getUserByMobile(Mobile);
	       double balance=user.getBalance();
	        writer.println("Welcome " + Mobile +" balance="+balance);
	        String signoutLink = "<a href='/second?signout=true'>Sign out </a> ";
	        writer.println(signoutLink);

	    }


	}









