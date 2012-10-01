$(document).ready(function() {
	function loadModels() {
		$.post("AjaxModels.action", {
			brand : $("#car\\.brand").val(),
		}, function(data) {
			$("#model").html(data);
		});
	}
	
	/* Adds * character to HTML tag label with class "mandatory" */
	$('label.mandatory').append(' <sup class="req">*</sup>');

	/* Ajax section - Loads models when brand is changed */
	$('#car\\.brand').change(function() {
		loadModels();
	});
	
	/* Ajax section - Loads models when brand is set on main load */
	if($('#car\\.brand').val()) {
		loadModels();
	}
	
});