

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter pw=response.getWriter();
		int a=Integer.parseInt(request.getParameter("n1"));
		String b=request.getParameter("n2");

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aa","root","suriya443");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from reg where rno="+a+" and DATEOFBIRTH='"+b+"' ");
			if(rs.next())
			{  
		
				pw.println("TAMIL:" + rs.getInt(2));
				pw.println("ENGLISH:" + rs.getInt(3));
				pw.println("MATHS:" + rs.getInt(4));
				pw.println("SCIENCE:" + rs.getInt(5));
				pw.println("SOCIAL SCIENCE:" + rs.getInt(6));
				pw.println("total:" + rs.getInt(7));
				pw.println("RESULT:" + rs.getString(8));
				pw.println("STUDENT:" + rs.getString(9));
	
			}
			else
			{
				pw.println("<script>alert('please select your reg no & DOB')</script>;");
			}
		}
		catch(Exception e1)
		{
			pw.println(e1);
		}
		
	}

}
