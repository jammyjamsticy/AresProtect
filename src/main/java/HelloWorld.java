import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;
import org.json.simple.JSONObject;
public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       req.setCharacterEncoding("utf8");
	  resp.setContentType("application/json");
      PrintWriter out = resp.getWriter();
      //JSONObject jsonObj = (JSONObject) JSONValue.parse(request.getParameter("para"));
      //System.out.println(jsonObj.get("message"));
      JSONObject obj = new JSONObject();
      obj.put("speech", "hello from server");
      obj.put("displayText", "hello from server");
      obj.put("source", "java");
      out.print(obj);
    }

}
