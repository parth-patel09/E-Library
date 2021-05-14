

$('#registration').click(function(e){
	
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