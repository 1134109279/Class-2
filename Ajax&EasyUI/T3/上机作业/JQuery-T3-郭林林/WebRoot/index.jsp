<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.9.1.js"> </script>
	<script>
	function user(name){
		var url="<%=basePath%>";
		$.post(url
			,{reqType:"user"
			,uname:name.value}
		,function(msg){
			$("#msg1").empty().html(msg);
			alert(msg)
		});
	}
	</script>
  </head>
  <body>
     用户名：<input type="text" name="name" onblur="user(this)">
     <span id="msg1"></span>
  </body>
</html>
