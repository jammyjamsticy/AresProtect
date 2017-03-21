import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

public class HelloWorld extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       req.setCharacterEncoding("utf8");
	  resp.setContentType("application/json");
      PrintWriter out = resp.getWriter();
      //JSONObject jsonObj = (JSONObject) JSONValue.parse(request.getParameter("para"));
      //System.out.println(jsonObj.get("message"));
	    	  System.out.println("request parameter :: "+req.getParameterNames());
	          Enumeration en=req.getParameterNames();
		while(en.hasMoreElements())
		{
			Object objOri=en.nextElement();
			String param=(String)objOri;
			String value=req.getParameter(param);
			System.out.println("Parameter Name is '"+param+"' and Parameter Value is '"+value+"'");
		}	
		JSONObject obj = new JSONObject();
		obj.put("speech", "hello from server");
		obj.put("displayText", "hello from server");
		obj.put("source", "java");
		out.print(obj);
    }

	   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       req.setCharacterEncoding("utf8");
	  resp.setContentType("application/json");
      PrintWriter out = resp.getWriter();
      //JSONObject jsonObj = (JSONObject) JSONValue.parse(request.getParameter("para"));
      //System.out.println(jsonObj.get("message"));
	  System.out.println(req.getParameter("result"));
    
    
		     
      JSONObject obj = new JSONObject();
      obj.put("speech", "hello from server");
      obj.put("displayText", "hello from server");
      obj.put("source", "java");
      out.print(obj);
    }
	
	  public static void main(String[] args) throws Exception{
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new HelloWorld()),"/*");
        server.start();
        server.join();   
    }

}
