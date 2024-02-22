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
<h1>비밀번호를 잘못 입력했습니다. </h1>
</body>
</html>