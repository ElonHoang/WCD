package HW1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calculator"})
public class Calculator extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double num1 = Double.valueOf(req.getParameter("txtNum1"));
		double num2 = Double.valueOf(req.getParameter("txtNum2"));
//		Map<String,String> error = new HashMap<String,String>();
//		String regex = "\\d+";
//		if(!txt1.matches(regex) || txt1.length() == 0) {
//			error.put("Num1","Number 1 not match !");
//
//		}
//		if(!txt2.matches(regex) || txt2.length() == 0) {
//			error.put("Num2","Number 2 not match !");
//		}
//		
//		double num1 = Double.valueOf(txt1);
//		double num2 = Double.valueOf(txt2);
		String cal = req.getParameter("btnCal");
		double result = 0.0;
		switch (cal) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + cal);
		}
//		req.setAttribute("errors", error);
		req.setAttribute("result", result);
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);

	}

}
