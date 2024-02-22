<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
window.onload = function(e){ 
	var resultMsg = '${resultMsg}';
	if(resultMsg.length > 0){
		alert(resultMsg);
	}
}
</script>
</head>
<body>
<h1>Name = ${param.memberName}</h1>
<h1>Password = ${param.passwd}</h1>
<h1>Repeat Password = ${param.repeatPasswd}</h1>
</body>
</html>