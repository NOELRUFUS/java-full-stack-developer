package jdbc.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
@WebServlet("/addproduct")
public class AddProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Addprodindex.jsp").include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int productid = Integer.parseInt(request.getParameter("id"));
		String productName = request.getParameter("name");
		String productPrice = request.getParameter("quantity");
		
		//Step1: Gets session Factory
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		//Step 2: Gets Session object
		Session session = sf.openSession();
		
		//Step3: Gets Tx object and begin transaction
		Transaction tx =  session.beginTransaction();
		
		// Step 4: Create and populate entity object
		EProduct product = new EProduct();
		product.setId(productid);
		product.setName(productName);
		product.setPrice(Double.parseDouble(productPrice));
		
		session.save(product);
		
		tx.commit();
		
		out.print("<h3> Product is created successfully ! <h3>");
		session.close();
	}
}