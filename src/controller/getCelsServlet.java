package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ToCelsius;
import model.ToFahrenheit;

/**
 * Servlet implementation class getCelsServlet
 */
@WebServlet("/getCelsServlet")
public class getCelsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String celsTemp = request.getParameter("celsTemp");

		ToFahrenheit convertedTemp = new ToFahrenheit (Double.parseDouble(celsTemp));
		
		request.setAttribute("toFahrenheit", convertedTemp);
		getServletContext().getRequestDispatcher("/fahr_result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(convertedTemp.toString());
		//writer.close();
	}

}
