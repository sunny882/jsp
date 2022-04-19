package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Testing")
public class Testing extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			String str1 = request.getParameter("n1");
			String str2 = request.getParameter("n2");
			Class.forName("com.mysql.cj.jdbc.Driver");//load driver
			String url="jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="";
			PrintWriter out= response.getWriter();
			out.print(str1);
			out.print(str2);
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement st=conn.createStatement();
			int x=st.executeUpdate("insert into student (name, password) values ('"+str1+"','"+str2+"')");
			if (x==0) {
				System.out.println("not ok");
			}
			else
			{
				System.out.println("ok");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
