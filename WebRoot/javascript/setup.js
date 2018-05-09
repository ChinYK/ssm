function setSidebarHeight() {
	setTimeout(function() {
		var height = $(document).height();
		$('.grid_12').each(function() {
			height -= $(this).outerHeight();
		});
		height -= $('#site_info').outerHeight();
		height -= 1;
		// salert(height);
		$('.sidemenu').css('height', height);
	}, 100);
}
function setupLeftMenu() {
	jQuery('#section-menu').accordion({
	    active: false,
	    header: 'a.menuitem',
	    navigation: true,
	    event: 'click',
	    fillSpace: false,
	    animated: 'easeslide'
	})
	$('#section-menu .submenu').css('height', 'auto');
}
