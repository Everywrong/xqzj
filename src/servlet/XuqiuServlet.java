package servlet;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DemandtypeBean;
import bean.XuqiuBean;
import dao.QuanxianDao;
import dao.XuqiuDao;
@WebServlet("/XuqiuServlet")
public class XuqiuServlet extends HttpServlet{
    private static final long serialVersionUID=1L;
	
	public XuqiuServlet(){
		super();
	}
	//通过service调用各种方法
	protected void service (HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		String method=request.getParameter("method");
		if("zhuce".equals(method)){
			zhuce(request,response);
		}else if("select".equals(method)){
			select(request,response);
		}else if("ck".equals(method)){
			ck(request,response);
		}else if("delete".equals(method)){
			delete(request,response);
		}else if("baocun".equals(method)){
			baocun(request,response);
		}else if("jiansuo1".equals(method)){
			jiansuo1(request,response);
		}else if("tree1".equals(method)){
			tree1(request,response);
		}else if("ck1".equals(method)){
			ck1(request,response);
		}else if("tg".equals(method)){
			tg(request,response);
		}else if("wtg".equals(method)){
			wtg(request,response);
		}else if("fenlei".equals(method)){
			fenlei(request,response);	
		}else if ("detail".equals(method)) {
			Detail(request, response);
		}
	}
	//方法具体实现
	protected void zhuce(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String jigouname=request.getParameter("name");
		String bumen=request.getParameter("bumen");
    	String address=request.getParameter("address");
    	String diyu=request.getParameter("diyu");
    	String dwurl=request.getParameter("dwweb");
    	String daibiao=request.getParameter("represent");
    	String email=request.getParameter("email");
    	String youbian=request.getParameter("zipcode");
    	String contact=request.getParameter("lianxiren");
    	String phone=request.getParameter("phone");
    	String telphone=request.getParameter("telphone");
    	String chuanzhen=request.getParameter("chuanzhen");
    	String shuxing=request.getParameter("shuxing");
    	String mingcheng=request.getParameter("xuqiuname");
    	String start=request.getParameter("start");
    	String finish=request.getParameter("finish");
    	String problem=request.getParameter("theme");
    	String guanjian1=request.getParameter("key1");
    	String guanjian2=request.getParameter("key2");
    	String guanjian3=request.getParameter("key3");
    	String guanjian4=request.getParameter("key4");
    	String guanjian5=request.getParameter("key5");
    	String guanjian=guanjian1+guanjian2+guanjian3+guanjian4+guanjian5;
    	String zijin=request.getParameter("zijin");
    	String leixing=request.getParameter("type");
    	String moshi=request.getParameter("model1");
    	String fenlei=request.getParameter("firstSubjects");
    	String fenlei1=request.getParameter("secondSubjects");
    	String fenlei2=request.getParameter("thirdSubjects");
    	String lingyu=request.getParameter("servics");
    	String lingyuu=null;
    	if(lingyu=="其他技术")
    		lingyuu=request.getParameter("other");
    	String usehangye=null;
    	String jianjie=request.getParameter("jianjie");
    	Date date=new Date();
    	DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String shijian=format.format(date);
		XuqiuDao xuqiuDao=new XuqiuDao();
		XuqiuBean xuqiuBean=new XuqiuBean();
		xuqiuBean.setName(name);
		xuqiuBean.setJigou(jigouname);
		xuqiuBean.setBumen(bumen);
		xuqiuBean.setTxadd(address);
		xuqiuBean.setDiyu(diyu);
		xuqiuBean.setDwUrl(dwurl);
		xuqiuBean.setDaibiao(daibiao);
		xuqiuBean.setChuanzhen(chuanzhen);
		xuqiuBean.setContact(contact);
		xuqiuBean.setEmail(email);
		xuqiuBean.setFenlei(fenlei);
		xuqiuBean.setFenlei1(fenlei1);
		xuqiuBean.setFenlei2(fenlei2);
		xuqiuBean.setMingcheng(mingcheng);
		xuqiuBean.setStart(start);
		xuqiuBean.setFinish(finish);
		xuqiuBean.setZijin(zijin);
		xuqiuBean.setGuanjian(guanjian);
		xuqiuBean.setJianjie(jianjie);
		xuqiuBean.setLingyu(lingyu);
		xuqiuBean.setLingyuu(lingyuu);
		xuqiuBean.setLeixing(leixing);
		xuqiuBean.setMoshi(moshi);
		xuqiuBean.setPhone(phone);
		xuqiuBean.setProblem(problem);
		xuqiuBean.setTelphone(telphone);
		xuqiuBean.setShuxing(shuxing);
		xuqiuBean.setYoubian(youbian);
		xuqiuBean.setUsehangye(usehangye);
		xuqiuBean.setShijian(shijian);
		xuqiuBean.setStatus("已提交");
		xuqiuDao.zhuce(xuqiuBean);
		request.getSession().setAttribute("xuqiuBean", xuqiuBean);
	    response.sendRedirect("tianbao.jsp?status=1");
	}
	protected void baocun(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String jigouname=request.getParameter("name");
		String bumen=request.getParameter("bumen");
    	String address=request.getParameter("address");
    	String diyu=request.getParameter("diyu");
    	String dwurl=request.getParameter("dwweb");
    	String daibiao=request.getParameter("represent");
    	String email=request.getParameter("email");
    	String youbian=request.getParameter("zipcode");
    	String contact=request.getParameter("lianxiren");
    	String phone=request.getParameter("phone");
    	String telphone=request.getParameter("telphone");
    	String chuanzhen=request.getParameter("chuanzhen");
    	String shuxing=request.getParameter("shuxing");
    	String mingcheng=request.getParameter("xuqiuname");
    	String start=request.getParameter("start");
    	String finish=request.getParameter("finish");
    	String problem=request.getParameter("theme");
    	String guanjian1=request.getParameter("key1");
    	String guanjian2=request.getParameter("key2");
    	String guanjian3=request.getParameter("key3");
    	String guanjian4=request.getParameter("key4");
    	String guanjian5=request.getParameter("key5");
    	String guanjian=guanjian1+guanjian2+guanjian3+guanjian4+guanjian5;
    	String zijin=request.getParameter("zijin");
    	String leixing=request.getParameter("type");
    	String moshi=request.getParameter("model1");
    	String fenlei=request.getParameter("firstSubjects");
    	String fenlei1=request.getParameter("secondSubjects");
    	String fenlei2=request.getParameter("thirdSubjects");
    	String lingyu=request.getParameter("servics");
    	String lingyuu=null;
    	if(lingyu=="其他技术")
    		lingyuu=request.getParameter("other");
    	String usehangye=null;
    	String jianjie=request.getParameter("jianjie");
    	Date date=new Date();
    	DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String shijian=format.format(date);
		XuqiuDao xuqiuDao=new XuqiuDao();
		XuqiuBean xuqiuBean=new XuqiuBean();
		xuqiuBean.setName(name);
		xuqiuBean.setJigou(jigouname);
		xuqiuBean.setBumen(bumen);
		xuqiuBean.setTxadd(address);
		xuqiuBean.setDiyu(diyu);
		xuqiuBean.setDwUrl(dwurl);
		xuqiuBean.setDaibiao(daibiao);
		xuqiuBean.setChuanzhen(chuanzhen);
		xuqiuBean.setContact(contact);
		xuqiuBean.setEmail(email);
		xuqiuBean.setFenlei(fenlei);
		xuqiuBean.setFenlei1(fenlei1);
		xuqiuBean.setFenlei2(fenlei2);
		xuqiuBean.setMingcheng(mingcheng);
		xuqiuBean.setStart(start);
		xuqiuBean.setFinish(finish);
		xuqiuBean.setZijin(zijin);
		xuqiuBean.setGuanjian(guanjian);
		xuqiuBean.setJianjie(jianjie);
		xuqiuBean.setLingyu(lingyu);
		xuqiuBean.setLingyuu(lingyuu);
		xuqiuBean.setLeixing(leixing);
		xuqiuBean.setMoshi(moshi);
		xuqiuBean.setPhone(phone);
		xuqiuBean.setProblem(problem);
		xuqiuBean.setTelphone(telphone);
		xuqiuBean.setShuxing(shuxing);
		xuqiuBean.setYoubian(youbian);
		xuqiuBean.setUsehangye(usehangye);
		xuqiuBean.setShijian(shijian);
		xuqiuBean.setStatus("已保存");
		xuqiuDao.zhuce(xuqiuBean);
		request.getSession().setAttribute("xuqiuBean", xuqiuBean);
	    response.sendRedirect("tianbao.jsp?statusz=1");
	}
	protected void jiansuo1(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		request.getSession().setAttribute("jsxqmc",xuqiuDao.list1());
		request.getRequestDispatcher("shenhe.jsp?").forward(request, response);
	}
	protected void select(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		int m=Integer.parseInt(request.getParameter("i"));
		String tj[]=new String[m];
		String tj1[]=new String[m];
		String tj2[]=new String[m];
		String xx1[]=new String[m];;
		xx1[0]="and";
		for(int i=0;i<m;i++){
			if(request.getParameter("tiaojian"+i)!=null){
				tj[i]=request.getParameter("tiaojian"+i);
				tj1[i]=request.getParameter("chx"+i);
				tj2[i]=request.getParameter("fs"+i);
			}
		}
		if(m>1){
			for(int i=1;i<m;i++)
				xx1[i]=request.getParameter("xx"+i);
		}
		String username=request.getParameter("yh");
		String type=request.getParameter("cx");
		//String typelx=request.getParameter("fs");
		//String type2=request.getParameter("mc");
		//String lxr=request.getParameter("chx");
		String sj1=request.getParameter("sj1");
		String sj2=request.getParameter("sj2");
		request.getSession().setAttribute("xuqiuBean1",xuqiuDao.list(username,xx1,tj2,type,tj,tj1,sj1,sj2));
		request.getRequestDispatcher("liulan.jsp?status=1").forward(request, response);
		request.getSession().setAttribute("xuqiuBean1",null);
	}
	private void fenlei(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String typeid=request.getParameter("id");
		int typeid1=Integer.parseInt(typeid);
		XuqiuDao demandDao=new XuqiuDao();
		List<DemandtypeBean> typeList=demandDao.gettype(typeid1);
		List<XuqiuBean> list=demandDao.findbyType(typeid1);
		for(int i=0;i<typeList.size();i++){
			List<XuqiuBean> list1=demandDao.findbyType(typeList.get(i).getId());
			list.addAll(list1);
		}
		//System.out.println("List:"+list);
		request.setAttribute("demandBeans", list);
		request.getRequestDispatcher("classify.jsp?status=1").forward(request, response);
	}
	protected void Detail(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("mingcheng");
		XuqiuDao demandDao = new XuqiuDao();
		XuqiuBean demandBean = demandDao.chakan(id);
		//System.out.println("..........//" + demandBean);
			if (demandBean != null) {
				request.setAttribute("demandbean", demandBean);
				response.sendRedirect("chakan.jsp?status=1");
			} else {
				response.sendRedirect("chakan.jsp?status=2");
			}
	}
	protected void ck(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String xqname=request.getParameter("xuqiuname");
		request.getSession().setAttribute("xuqiuBean",xuqiuDao.chakan(xqname));
		response.sendRedirect("chakan.jsp?status=1");
	}
	protected void delete(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String xqname=request.getParameter("xuqiuname");
		xuqiuDao.delete(xqname);
		response.sendRedirect("liulan.jsp?status1=1");
	}
	protected void tree1(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String username=request.getParameter("username");
		request.getSession().setAttribute("xkfl",xuqiuDao.tree1(username));
		request.getRequestDispatcher("tree.jsp?").forward(request, response);
	}
	protected void ck1(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String username=request.getParameter("username");
		String xqname=request.getParameter("mc");
		request.getSession().setAttribute("xuqiuBean12",xuqiuDao.shenhe1(username,xqname));
		response.sendRedirect("shenhe.jsp?status=1");
	}
	protected void tg(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String xqname=request.getParameter("xuqiuname");
		String status=null;
		status="已通过审核";		
		xuqiuDao.tg(xqname,status);
		response.sendRedirect("shenhe.jsp?statustg=1");
	}
	protected void wtg(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		XuqiuDao xuqiuDao=new XuqiuDao();
		String xqname=request.getParameter("xuqiuname");
		String status=null;
		status="未通过审核";		
		xuqiuDao.tg(xqname,status);
		response.sendRedirect("shenhe.jsp?statustg=1");
	}
}
