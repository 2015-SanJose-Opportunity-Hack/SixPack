jQuery(document).ready(function(){
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").hide();
	
	jQuery(".dashboard-content").fadeIn();
	
	jQuery(".dashboard-menu .list-group .list-group-item .list-group").has('.active').show();
	
	jQuery(".dashboard-menu .list-group .main-category").click(function(){
		
		jQuery(this).parent().find(".list-group").slideToggle();
		
	});
	
	setTimeout(fadeAlertMessage, 5000);
	jQuery(".unresolved").hover(function(){
			jQuery(this).removeClass("amber accent-4");
			jQuery(this).addClass("green darken-1");
			jQuery(this).text("Resolve");
		},
		function(){
			jQuery(this).removeClass("green darken-1");
			jQuery(this).addClass("amber accent-4");
			jQuery(this).text("Unresolved");
		});
	
	jQuery(".resolved").hover(function(){
		jQuery(this).removeClass("green darken-1");
		jQuery(this).addClass("orange amber-4");
		jQuery(this).text("Unresolve");
	},
	function(){
		jQuery(this).removeClass("amber accent-4");
		jQuery(this).addClass("green darken-1");
		jQuery(this).text("Resolved");
	});
	
    // DataTable
    jQuery('#search-table').DataTable({
        "order": [[4, "desc"]]
    });
});

function fadeAlertMessage(){
	jQuery(".alert-success").slideUp();
}