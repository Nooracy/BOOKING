<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HomePage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript">
  function test(){
  	document.getElementById("formId");
  }
  </script>
  <script language="javascript" type="text/javascript" src="<%=path%>/My97DatePicker/WdatePicker.js"></script>
 
 <form action="control?caozuo=Select" method="post" id="1">
 
 <table>
 <tr>

 <td>出发地点:</td>
 <td><select name="DepaturePlace" size="3">
 <option selected>武汉   </option>
 <option selected>上海</option>
 <option selected>随州   </option>
 <option selected>浙江</option>
 </select></td>
 
 <td>目标地点:</td>
 <td><select name="ArrivalPlace" size="3">
 <option selected>武汉   </option>
 <option selected>上海</option>
 <option selected>随州   </option>
 <option selected>浙江</option>
 </select></td>
 
 
  <td><input type="submit" id="button1" value="按地點查詢查询"></td>
 
 </tr>
 
 <br>
 <tr>
  
 <td>出发时间:</td>
 <td><input type=”text”  class="Wdate"   name="DepatureTime" onClick="WdatePicker({el:this,dateFmt:'yyyy.MM.dd'})" /></td>
 
 <td>到达时间:</td>
 <td><input type=”text” class="Wdate"  name="ArrivalTime"  onClick="WdatePicker({el:this,dateFmt:'yyyy.MM.dd'})"/></td>
 
 
 <td><input type="submit" id="button2" value="按時間查詢查询"></td>
 
 
 </tr>
 <br>
 <tr>
  <td><input type="submit" id="button3" value="查询"></td>
  <td><input type="reset"  value="重置"></td>
 </tr>
 </table>
 </form>

 
  </body>
</html>
