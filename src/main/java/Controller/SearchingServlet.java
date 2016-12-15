package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import Model.*;

import org.apache.log4j.*;

/**
 * Servlet implementation class SearchingServlet
 */
public class SearchingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("retailone");
    /**
     * Default constructor. 
     */
    public SearchingServlet() {
    	
    	// Comment
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String requestid = request.getRequestedSessionId().toString();
		logger.info("Getting into doGet" + requestid);		
		ArrayList<String> res = new ArrayList<String>();
		ApacheHttpClient obj = new ApacheHttpClient();
		//obj.createHotels();
		obj.getHotels(requestid);
		
		String str = request.getParameter("key");
		String output = "";
		Products pro = new Products();
		res = pro.results(str);		
		//PrintWriter pw = response.getWriter();
		
		//pw.println("<h4><font face=\"book antiqua\" color=#CFECEC>Search results found:"+res.size()+" matching items...</font></h4>");
		request.setAttribute("res", res);
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.include(request, response);
		logger.info("Getting out of doGet");
		
	}

	/**#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
