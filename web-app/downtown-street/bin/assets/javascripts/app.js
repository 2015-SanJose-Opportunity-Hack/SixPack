jQuery(document).ready(function(){
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").hide();
	
	jQuery(".dashboard-content").fadeIn();
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").has('.active').show();
	
	jQuery(".dashboard-menu .list-group .main-category").click(function(){
		
		jQuery(this).parent().find(".list-group").slideToggle();
		
	});
	
	setTimeout(fadeAlertMessage, 5000);
	
});

function fadeAlertMessage(){
	jQuery(".alert-success").slideUp();
}