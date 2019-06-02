<%@ page import="Entity.Seat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SelectSeat.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  <script type="text/javascript" src="<%=path %>/js/jquery.js"></script>
	<style type="text/css">
	#allDiv{
			width: 100%;
			height: 100%；
			
		}
		#allDiv #Div1{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:100px;
			margin-left:100px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div2{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:160px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div3{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:220px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div4{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:280px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div5{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:340px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div6{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:12px;
			margin-left:100px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div7{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:160px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div8{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:220px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div9{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:280px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div10{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:340px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div11{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:12px;
			margin-left:100px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div12{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:160px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div13{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:220px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div14{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:280px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div15{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:340px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div16{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:12px;
			margin-left:100px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div17{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:160px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div18{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:220px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div19{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:280px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div20{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:340px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div21{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:12px;
			margin-left:100px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div22{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:160px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div23{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:220px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div24{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:280px;
			text-align:center;
			border:1px solid black;
			
		}
		#allDiv #Div25{
			width:50px;
			height:50px;
			background-color:red;
			margin-top:-52px;
			margin-left:340px;
			text-align:center;
			border:1px solid black;
			
		}
	</style>
	<script type="text/javascript">
	   $(function(){
	
	     $(".seat div").on("click",function(){
	     
	        $(this).css("background-color","green");
	    
	     })
	     	     
	   })
	   
	   
	
	
	</script>
</head>
  
  <body>
  <div id="allDiv" class="seat">
  <div id="Div1">座位1</div>
  <div id="Div2">座位2</div>
  <div id="Div3">座位3</div>
  <div id="Div4">座位4</div>
  <div id="Div5">座位5</div>
  <div id="Div6">座位6</div>
  <div id="Div7">座位7</div>
  <div id="Div8">座位8</div>
  <div id="Div9">座位9</div>
  <div id="Div10">座位10</div>
  <div id="Div11">座位11</div>
  <div id="Div12">座位12</div>
  <div id="Div13">座位13</div>
  <div id="Div14">座位14</div>
  <div id="Div15">座位15</div>
  <div id="Div16">座位16</div>
  <div id="Div17">座位17</div>
  <div id="Div18">座位18</div>
  <div id="Div19">座位19</div>
  <div id="Div20">座位20</div>
  <div id="Div21">座位21</div>
  <div id="Div22">座位22</div>
  <div id="Div23">座位23</div>
  <div id="Div24">座位24</div>
  <div id="Div25">座位25</div>
  <br>
  <br>
  <a href="Booking2.jsp"><input type="button" value="登陆"></a>
  </div>
  </body>
</html>
