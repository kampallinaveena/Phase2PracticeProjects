package java_fsd1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
 PrintWriter out= resp.getWriter();
		
		String username= req.getParameter("uname");
		String password= req.getParameter("pass");
		
		if(username != null && username.equals("ABC") && password != null && password.equals("Abc123")) {
          
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("uname", username);
            RequestDispatcher rd = req.getRequestDispatcher("dis");
            rd.forward(req, resp);
        }
		else {
			out.print("Sorry, Invalid Login ! ");
		}
	}

}
