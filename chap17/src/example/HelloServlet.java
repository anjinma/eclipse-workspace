package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
서블릿 2.5 버전까지는 web.xml 파일에 서블릿으로 등록해야 했지만 3.0부터는 
애노테이션을 지원한다.
*/
@WebServlet(urlPatterns="/hello")
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>인사</title></head>");
		out.println("<body>");
		out.print("안녕하세요 ");
		out.print(req.getParameter("name"));
		out.print(" 님");
		out.println("</body></html>");
	}
}
