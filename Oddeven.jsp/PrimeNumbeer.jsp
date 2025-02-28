<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	 int n = 10;
	int  d = 2;
	while (d<n)
	{
		if (n%d==0){
			
			out.println("<br>"+n+"is not a prime number..");
		break;
		}
	else {
		
		d++;	
	}
	}
	if (n==d)
		
			out.println("<br>"+n+"is a prime number..");	
	
	%>
	
</body>
</html>