package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Employee;
import com.Test;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Test t=new Test();
		Employee l=new Employee();
		System.out.println("hello");
		String s=request.getParameter("source");
		if(s.equals("add")){
			l.setId(Integer.parseInt(request.getParameter("id")));
			l.setName(request.getParameter("name"));
			l.setEmail(request.getParameter("email"));
			l.setTechnology(request.getParameter("technology"));
		int k=0;
		try{
			k=t.add(l);
			System.out.println("hello");
		}catch(SQLException s1){
				s1.printStackTrace();
				}
			catch(ClassNotFoundException s1){
				s1.printStackTrace();
			}
		RequestDispatcher rd=request.getRequestDispatcher("searching.jsp");
		rd.forward(request, response);
		}
		else if(s.equals("search")){
			String v=request.getParameter("name");
			try{
				ArrayList<Employee> list=new ArrayList<Employee>();
				list=t.search(v);
				request.setAttribute("list1", list);
				RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
				rd.forward(request, response);
				
			}catch(SQLException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
	}
	
	
		
	
} 


