package Action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DaoService.SelectService;
import Entity.Passenger;
import Entity.Flight;

public class BookingServlet extends HttpServlet{
	public void doget(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			//判断用户的操作
			String caozuo = request.getParameter("caozuo");
			if (caozuo.equals("Login")) {
				loginSystem(request,response);
			}else if (caozuo.equals("Select")) {
				selectSystem(request, response);
			} else if (caozuo.equals("Buy")) {
				buySystem(request, response);
			}else if (caozuo.equals("SelectTime")) {
				selecttimeSystem(request, response);
			}else if (caozuo.equals("SelectPlace")) {
				selectplaceSystem(request, response);
			}
	}

	private void selectplaceSystem(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String DP=request.getParameter("DepaturePlace");
		String AP=request.getParameter("ArrivalPlace");
		String sql = "select * from flight where DepaturePlace=? and ArrivalPlace=?";
		Object obj[] = { DP,AP};
		Flight flight=new SelectService().selectFlight(sql,obj);
	    System.out.println(flight);
		HttpSession sess = request.getSession();
		sess.setAttribute("flight",flight);
		//转发到到指定页面
		request.getRequestDispatcher("Booking1.jsp").forward(request, response);
		
	}

	private void selecttimeSystem(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String DT=request.getParameter("DepatureTime");
		String AT=request.getParameter("ArrivalTime");
		String sql = "select * from flight where DepatureTime=? and ArrivalTime=?";
		Object obj[] = {DT,AT};
		Flight flight=new SelectService().selectFlight(sql,obj);
	    System.out.println(flight);
		HttpSession sess = request.getSession();
		sess.setAttribute("flight",flight);
		//转发到到指定页面
		request.getRequestDispatcher("Booking1.jsp").forward(request, response);
		
	}

	private void buySystem(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		//跳转到指定页面
    	response.sendRedirect("HadBought.html");
    	}

	private void selectSystem(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String DP=request.getParameter("DepaturePlace");
		String AP=request.getParameter("ArrivalPlace");
		String DT=request.getParameter("DepatureTime");
		String AT=request.getParameter("ArrivalTime");
		String sql = "select * from flight where DepaturePlace=? and ArrivalPlace=? and DepatureTime=? and ArrivalTime=?";
		Object obj[] = { DP,AP,DT,AT};
		
	    Flight flight=new SelectService().selectFlight(sql,obj);
	    System.out.println(flight);
		HttpSession sess = request.getSession();
		sess.setAttribute("flight",flight);
		//转发到到指定页面
		request.getRequestDispatcher("Booking1.jsp").forward(request, response);

	}

	private void loginSystem(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("userName");
		String pwd = request.getParameter("userPassWord");
		System.out.println(name+" "+pwd);
		String sql = "select * from passenger where Name=? and PassportNumber=?";
		Object obj[] = {name,pwd};
		Passenger passenger = new SelectService().selectNameAndPNM(sql, obj);
		
		//验证乘客是存在
		if (passenger!=null) {
			response.sendRedirect("HomePage.jsp");
		}else {
			response.sendRedirect("Login.html");
		}
	}
	


}
