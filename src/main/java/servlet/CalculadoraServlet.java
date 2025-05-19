package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalculadoraServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Se entró en doGet()");
		
		String strNum1 = request.getParameter("numero1");
		String strNum2 = request.getParameter("numero2");
		String operation = request.getParameter("opcion");
		
		if (strNum1 == null || strNum2 == null || operation == null)  {
			response.getWriter().append("<h1>No has indicado algún dato.</h1>");
		} else {
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			switch (operation) {
				case "suma": response.sendRedirect("form.jsp?op=" + operation + "&resultado=" + (num1 + num2)); break;
				case "resta": response.sendRedirect("form.jsp?op=" + operation + "&resultado=" + (num1 - num2)); break;
				case "multiplicacion": response.sendRedirect("form.jsp?op=" + operation + "&resultado=" + (num1 * num2)); break;
				case "division": response.sendRedirect("form.jsp?op=" + operation + "&resultado=" + (num1 / num2)); break;
			}
		}
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
