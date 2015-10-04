jQuery(document).ready(function(){
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").hide();
	
	jQuery(".dashboard-content").fadeIn();
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").has('.active').show();
	
	jQuery(".dashboard-menu .list-group .main-category").click(function(){
		
		jQuery(this).parent().find(".list-group").slideToggle();
		
	});
	
	setTimeout(fadeAlertMessage, 5000);
	jQuery(".unresolved").hover(function(){
			jQuery(this).removeClass("btn-warning");
			jQuery(this).addClass("btn-success");
			jQuery(this).text("Resolve");
		},
		function(){
			jQuery(this).removeClass("btn-success");
			jQuery(this).addClass("btn-warning");
			jQuery(this).text("Unresolved");
		});
	
	jQuery(".resolved").hover(function(){
		jQuery(this).removeClass("btn-success");
		jQuery(this).addClass("btn-warning");
		jQuery(this).text("Unresolve");
	},
	function(){
		jQuery(this).removeClass("btn-warning");
		jQuery(this).addClass("btn-success");
		jQuery(this).text("Resolved");
	});
	
	
});

function fadeAlertMessage(){
	jQuery(".alert-success").slideUp();
}