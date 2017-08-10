import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//import webprueba.Aleatorio;


@WebServlet("/HelloWorld")
// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 2L;
  private String message;
  private String message2;
  
  //private String aleto;
//private Integer a;
  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
      message2 ="Hola";
     // aleto = new Aleatorio();
  }
  
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)//RESPONSE Y REQUEST SE PUEDE SUSTITUIR POR CUALQUIER COSA
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");
     //request.setAttribute("unEntero", new Integer(22));
      Integer valor1 = (Integer) request.getAttribute("PRUEBA");
      Integer valor2 = (Integer) request.getAttribute("PRUEBA2	");
      String variable = request.getParameter("variable");
     /* request.setAttribute("valor1", "valor2");
      request.getRequestDispatcher("HelloWorld").forward(request, response);*/
      //String valor1 = request.getParameter("valor1");
      //String valor2 = request.getParameter("valor2");
     //Integer a = valor1 + valor2;
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
      out.println("<h1>" + message2 + "</h1>");
      //out.println("<img src=\"http://25.16.12.204:8081/\" border=\"0\" width=\"45%\"/>");
      response.getWriter().print("<p> La variable vale " + variable + "</p>");
      //out.println("<p> el resultado es" + a +"</p>");
      response.getWriter().print("<p> La variable vale " + valor1 + "</p>");
      response.getWriter().print("<p> La variable vale " + valor2 + "</p>");
     // out.println(a);
      
  }

  public void destroy()
  {
      // do nothing.
  }
}
