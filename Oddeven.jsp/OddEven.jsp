<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3> Even Number</h3>
<ul>
<%
for(int i = 1; i<=20;i++){
	if (i%2==0){
		
		out.println("<li>"+  i  +"</li>");
	}
		
}

%>
</ul>

<h3> Odd Number</h3>
<ul>
<%
for(int i = 1; i<=15;i++){
	if (i%2!=0){
		
		out.println("<li>"+  i  +"</li>");
	}	
} 

%>
</ul>


</body>
</html>