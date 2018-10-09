package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QuanxianDao;
@WebServlet("/QuanxianServlet")
public class QuanxianServlet extends HttpServlet{
	 private static final long serialVersionUID=1L;
		
	 public QuanxianServlet(){
		super();
	 }
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String method = request.getParameter("method");
		if("list".equals(method)){
			list(request,response);
		}else if("updateqx".equals(method)){
			updateqx(request,response);
		}else if("yhm".equals(method)){
			yhm(request,response);
		}
	 }
	 protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			QuanxianDao quanxianDao=new QuanxianDao();
			request.getSession().setAttribute("quanxianBean", quanxianDao.list() );
			request.getRequestDispatcher("quanxian.jsp").forward(request, response);
			request.getSession().setAttribute("quanxianBean", null );
	 }
	 protected void updateqx(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			QuanxianDao quanxianDao=new QuanxianDao();
			String name=request.getParameter("name");
			String tianbao=request.getParameter("tianbao");
			String shenhe=request.getParameter("shenhe");
			String liulan=request.getParameter("liulan");
			String chaxun=request.getParameter("chaxun");
			String gerenxinxi=request.getParameter("gerenxinxi");
			String quanxianguanli=request.getParameter("quanxianguanli");
			String yonghu=request.getParameter("yonghu");
			quanxianDao.updateqx(name,tianbao,shenhe,liulan,chaxun,gerenxinxi,quanxianguanli,yonghu);
			response.sendRedirect("update.jsp?status=1");
	 }
	 protected void yhm(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		QuanxianDao quanxianDao=new QuanxianDao();
		request.getSession().setAttribute("quanxianBean11", quanxianDao.list1());
		request.getRequestDispatcher("liulan.jsp").forward(request, response);
	 }
}
