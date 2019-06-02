<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
    #allDiv{
			width: 100%;
			height: 100%;
			background:url(images/1.jpg);
			background-repeat:no-repeat;
			background-size:cover;
			overflow-x:hidden;
			display:block;
			box-sizing:border-box;
		}
		#allDiv #xxx{
		width:30%;
        height:30%;
        border:1px solid black;
        margin: 35% auto ;
		
		}
    </style>

  </head>
  
 <body>
  <div id="allDiv">
   <div id="xxx">
        <form action="control?caozuo=Login" method="post">
    		    <table align="center">
    			<tr>
    				<td>用户名</td>
    				<td colspan=4><input type="text" name="userName"></td>
    			</tr>
    			<tr>
    				<td>密码</td>
    				<td colspan=4><input type="password" name="userPassWord"></td>
    			</tr>
    			<tr>
    				<td><input type="submit" value="登陆"></td>
    				<td><input type="reset" value="重置"></td>
    			</tr>
    		</table>
    	
    	</form>
   </div>
   </div>
  </body>
</html>
