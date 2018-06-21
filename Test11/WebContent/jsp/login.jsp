<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script language="javascript" type="text/javascript" src="<%=path%>/js/jquery-1.4.4.min.js"></script>
<script>
	$(function(){
		$('#sub').click(function(){
			$('#tologin').submit();
		});
		
	});
</script>
</head>
<body>
	<form id='tologin' action="login!tologin.action" method="post">
		<input type='text' id='name' name='user.name' placeholder="请输入用户名"><br/><br/>
		<!--这种方式，当输入为空时，会把默认值提交，上面属性不会  -->
		<input type='text' id='pwd' name='user.pwd' value="你的提示文字" 
			onFocus="if(value==defaultValue){value='';this.style.color='#000'}" 
			onBlur="if(!value){value=defaultValue;this.style.color='#999'}" 
			style="color:#999999">
		<br/><br/>
		<!--这里id不能用submit，会造成表单不提交，可能原因是关键字吧  -->
		<input type='button' id='sub' value='登&nbsp;录'>
	</form>
	
</body>

</html>