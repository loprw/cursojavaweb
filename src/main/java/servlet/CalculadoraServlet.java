package servlet;

import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.CalculadoraDTO;
import enums.OperationsEnum;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.Service;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(CalculadoraServlet.class);
	private Service service = new Service();

    public CalculadoraServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("Se entró en doGet()");
		
		String strNum1 = request.getParameter("numero1");
		String strNum2 = request.getParameter("numero2");
		String operation = request.getParameter("opcion");
		
		if (strNum1 == null || strNum2 == null || operation == null)  {
			response.getWriter().append("<h1>No has indicado alguno de los datos requeridos.</h1>");
		} else {
			
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			OperationsEnum oper;
			double result;
			Date date = null;
			
			switch (operation) {
				case "sum" -> {
					oper = OperationsEnum.SUM;
					result = num1 + num2;
				}
				case "subtract" -> {
					oper = OperationsEnum.SUBTRACT;
					result = num1 - num2;
				}
				case "multiply" -> {
					oper = OperationsEnum.MULTPIPLY;
					result = num1 * num2;
				}
				case "divide" -> {
					oper = OperationsEnum.DIVIDE;
					result = num1 / num2;
				}
				default -> {
					oper = OperationsEnum.NULL;
					result = 0;
				}
			}
				
				service.insertOperation(new CalculadoraDTO(num1, num2, result, oper, date));
			}
		}
		


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
