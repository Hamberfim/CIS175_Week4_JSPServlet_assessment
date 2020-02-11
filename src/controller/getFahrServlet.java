package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ToCelsius;


/**
 * Servlet implementation class getFahrServlet
 */
@WebServlet("/getFahrServlet")
public class getFahrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fahrTemp = request.getParameter("fahrTemp");

		ToCelsius convertedTemp = new ToCelsius(Double.parseDouble(fahrTemp));
		
		request.setAttribute("toCelsius", convertedTemp);
		getServletContext().getRequestDispatcher("/cels_result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(convertedTemp.toString());
		//writer.close();
	}

}
