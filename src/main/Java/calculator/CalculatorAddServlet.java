package Java.calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer left = Integer.valueOf(request.getParameter("left"));
		Integer right = Integer.valueOf(request.getParameter("right"));
	    //Integer sum = left + right;
        Java.calculator.Binaries calc = new Java.calculator.Binaries();
        calc.setLeft(left);
        calc.setRight(right);
        Java.calculator.Addition addition = new Java.calculator.Addition();
        String sum = addition.add(calc.getLeft(), calc.getRight() );
	    request.setAttribute("sum", sum);
        request.setAttribute("left", left);
        request.setAttribute("right", right);

        request.getRequestDispatcher("index.jsp").forward(request, response); // Redisplay JSP.
	}

}
