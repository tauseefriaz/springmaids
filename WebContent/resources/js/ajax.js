/**
 * 
 */
callAjax=function(status)
{
	$.ajax({
		url:'todo/admin/allusers' + status,
		type:"PUT",
		dataType:"json",
		success:function(response)
		{
			alert("Successfully changed the status");
		},
		error:function(){
			alert("Error for changing status")
		}
	})
	
	
	
	
	
}
	
	