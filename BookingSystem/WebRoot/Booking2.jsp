<%@ page import="Entity.Flight"%>

<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Booking2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    Flight flight=new Flight();
    flight=(Flight)session.getAttribute("flight1");
     %>
     
     
     
             订单详情   
     <br>
     出发时间：<%=flight.getDepatureTime() %>
     <br>
      到达时间: <%=flight.getArrivalTime() %>   
      <br>
      出发地点：<%=flight.getDepaturePlace() %>
      <br>
      到达地点：<%=flight.getArrivalPlace() %>
      <br>
      航空公司：<%=flight.getAirlineName() %>
      <br>
     飞机名称 ：<%=flight.getAirplaneName() %>
      <br>
      总费用：    <%=flight.getFare() %>
      <br>
      
      <form action="control?caozuo=Buy" method="post">
      
      
      
      <input type="submit" value="购买">
      </form>
  </body>
</html>
