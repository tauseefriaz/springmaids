/* Spring ToDo Manager Common JS file */
$( document ).ready(function() {
	$('.todo-details').click(function(){
		var todoID = $(this).attr("id");
	    $('#todo-desc-'+todoID).toggle();
	});
});