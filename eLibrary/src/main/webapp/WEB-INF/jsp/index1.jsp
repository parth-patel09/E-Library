<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>

<form action="/Registration">

Email Id: <input type = "text" id="emailId">

<br>

password : <input type="text" id="passWord">
<br>

Check : <input type ="text" id = "check">

<input type="submit" id="submit">

</form>

</body>

<script>
$("#registration").click(function(e){
	
	debugger;
	var dto = buildDTO();
	$.ajax({
		type : "POST",
		url: "/User/Registration",
		data : JSON.Stringify(dto),
		contentType : "application/json",
		success: function(result)
		{
			console.log(result);
		},
		failure : function(result)
		{
			conosole.log(result);
		},
		error: function(result)
		{
			console.log(result);
		}
	});
	
	
	function buildDTO()
	{
		debugger;
		var UserDTO = new Object();
		UserDTO.emailId = $("#emailId").val();
		UserDTO.password = $("#passWord").val();
	}
});
</script>

</html>