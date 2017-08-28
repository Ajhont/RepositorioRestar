package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indexServlet
 */
@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.procesarPeticion(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.procesarPeticion(request, response);
	}

	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		try
		{
			int param1 = Integer.parseInt(request.getParameter("param1"));
			int param2 = Integer.parseInt(request.getParameter("param2"));
			
			 RestadorBeans restadorBeans = new RestadorBeans();
			 
			 int result = restadorBeans.restar(param1, param2);
			 
			 request.setAttribute("resultado", result);
			 
			 request.getRequestDispatcher("/result.jsp").forward(request, response);
			
		}
		catch(NumberFormatException ex)
		{
			request.setAttribute("error", "Alguno de los números no contenía dígitos válidos...");
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}	
}
