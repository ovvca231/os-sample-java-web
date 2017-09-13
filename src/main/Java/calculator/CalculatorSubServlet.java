package main.Java.calculator;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorSubServlet() {
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
        calculator.Binaries calc = new calculator.Binaries();
        calc.setLeft(left);
        calc.setRight(right);

        calculator.Substraction substraction = new calculator.Substraction();
        String sum = substraction.sub(calc.getLeft(), calc.getRight() );
	    request.setAttribute("sum", sum); // It'll be available as ${sum}.
        request.setAttribute("left", left); // It'll be available as ${sum}.
        request.setAttribute("right", right); // It'll be available as ${sum}.

        request.getRequestDispatcher("index.jsp").forward(request, response); // Redisplay JSP.
	}

}