<!DOCTYPE html>
<html>
<head>
	<title>Super Market an Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
	<!-- for-mobile-apps -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
			function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- //for-mobile-apps -->
	<link href="../assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="../assets/css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- font-awesome icons -->
	<link href="../assets/css/font-awesome.css" rel="stylesheet"> 
	<!-- //font-awesome icons -->
	<!-- js -->
	<script src="../assets/js/jquery-1.11.1.min.js"></script>
	<!-- //js -->
	<link href='../assets/css/googlefont.css' rel='stylesheet' type='text/css'>
	<link href='../assets/css/googlefont1.css' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="../assets/js/move-top.js"></script>
	<script type="text/javascript" src="../assets/js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
	</script>
<!-- start-smoth-scrolling -->
</head>
	
<body>
<!-- header -->
	<%@include file="../inc/header.jsp" %>
<!-- //header -->

<!-- navigation -->
	<%@include file="../inc/menu.jsp" %>
<!-- //navigation -->

    <!-- Program table -->
    </br></br>
    <div class="col-md-10 col-md-offset-1">
        <table class="table table-hover">
            <caption class="text-center"><h2 style="color:darkorange;">PROGRAM</h2></caption>
            <thead>
                <tr>
                    <th class="active">Heure</th>
                    <th class="warning">Lundi</th>
                    <th class="warning">Mardi</th>
                    <th class="warning"Mercredi</th>
                    <th class="warning">Jeudi</th>
                    <th class="warning">Vendredi</th>
                    <th class="warning">Samedi</th>
                    <th class="warning">Dimanche</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="active">Test</td>
                    <td>Test</td>
                    <td>Test</td>
                    <td>Test</td>
                    <td>Test</td>
                    <td>Test</td>
                    <td>Test</td>
                    <td>Test</td>
                </tr>
            </tbody>
        </table>
    </div>
    <!-- //Program table -->

<!--banner-bottom-->
	<%@include file="../inc/pub.jsp" %>
<!--banner-bottom-->
<!-- //footer -->
	<%@include file="../inc/footer.jsp" %>
<!-- //footer -->	

<!-- Bootstrap Core JavaScript -->
<script src="../assets/js/bootstrap.min.js"></script>

<!-- top-header and slider -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
<script src="../assets/js/minicart.min.js"></script>
<script>
	// Mini Cart
	paypal.minicart.render({
		action: '#'
	});

	if (~window.location.search.indexOf('reset=true')) {
		paypal.minicart.reset();
	}
</script>
<!-- main slider-banner -->
<script src="../assets/js/skdslider.min.js"></script>
<link href="../assets/css/skdslider.css" rel="stylesheet">
<script type="text/javascript">
		jQuery(document).ready(function(){
			jQuery('#demo1').skdslider({'delay':5000, 'animationSpeed': 2000,'showNextPrev':true,'showPlayButton':true,'autoSlide':true,'animationType':'fading'});
						
			jQuery('#responsive').change(function(){
			  $('#responsive_wrapper').width(jQuery(this).val());
			});
			
		});
</script>	
<!-- //main slider-banner --> 
</body>
</html>