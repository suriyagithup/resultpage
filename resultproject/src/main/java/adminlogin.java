

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		 PrintWriter pw=response.getWriter();
			if(a.equals("admin") && b.equals("adminlogin"))
			{
				response.sendRedirect("studentinsert.jsp");
			}		
			else
			{
				pw.println("<script>alert('invalid user')</script>;");
			}
	}

}
