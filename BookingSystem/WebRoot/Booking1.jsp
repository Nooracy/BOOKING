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
    
    <title>My JSP 'Booking1.jsp' starting page</title>
    
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
    接收的数据：
  			<%
  			
  			Flight flight1 = (Flight)session.getAttribute("flight");
  			%>
  			<table border="1">
   			<tr>
   				<th>出发时间</th><th>到达时间</th><th>出发地点</th>
   				<th>到达地点</th><th>航空公司</th><th>飞机名称</th>	
   				        <th>费用</th><th>操作</th>
   			</tr>
   			
   			
   			<tr>
   				<td><%=flight1.getDepatureTime()%></td>
   				<td><%=flight1.getArrivalTime() %></td>
   				<td><%=flight1.getDepaturePlace() %></td>
   				<td><%=flight1.getArrivalPlace() %></td>
   				<td><%=flight1.getAirlineName() %></td>
   				<td><%=flight1.getAirplaneName() %></td>
   				<td><%=flight1.getFare() %></td>
   				<td>
   				 <form action="control?caozuo=Buy" method="post">
   				    <%
   				      
   				       session.setAttribute("flight1",flight1);
   				    %>
   					<a href="SelectSeat.jsp"><input type="button" value="购买"></a>
   					</form>
   				</td>
   			</tr>
   			
   			
   				
   		</table>  
  </body>
</html>
