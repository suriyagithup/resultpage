

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class marklist
 */
@WebServlet("/marklist")
public class marklist extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String h=request.getParameter("nn");
		String g=request.getParameter("n");
		int a=Integer.parseInt(request.getParameter("n1"));
		int b=Integer.parseInt(request.getParameter("n2"));
		int c=Integer.parseInt(request.getParameter("n3"));
		int d=Integer.parseInt(request.getParameter("n4"));
		int e=Integer.parseInt(request.getParameter("n5"));
		int f=Integer.parseInt(request.getParameter("n6"));
        int	total=b+c+e+d+f;
        String result="";
        if(b>=35 && c>=35 && d>=35 && e>=35 && f>=35)
        {
        	result="PASS";
        }
        else
        {
        	result="FAIL";
        }
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aa","root","suriya443");
        	Statement st=con.createStatement();
        	st.executeUpdate("insert into reg values ("+a+","+b+","+c+","+d+","+e+","+f+","+total+",'"+result+"','"+h+"','"+g+"')");
        	pw.println("Insert successfully");
        }
        catch(Exception e1)
        {
        	pw.println(e1);
        }
		
		
	}

}
