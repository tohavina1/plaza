<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.MongoException"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="com.mongodb.QueryBuilder"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="controller.UserControl"%>
<%@page import="com.mycompany.testmongo.DAO.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mongodb.DB"%>
<%@page import="model.*"%>
<%@page import="com.mongodb.DBCursor"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<html>
    <% FilmDAO daof= new FilmDAO();
        CategorieDAO daoc=new CategorieDAO();
        ImageDAO daoi=new ImageDAO();
        ArrayList<Film>listes=daof.getTopfilm(5);
    %>
<head>
	<title>Plaza</title>
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

	<!-- main-slider -->
		
	<!-- //main-slider -->
	<!-- //top-header and slider -->
	<!-- top-brands -->
	<div class="top-brands">
		<div class="container">
        <h2>My profil</h2>
        <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                        <div id="myTabContent" class="tab-content">
                <div id="image" class="row">
                    <div class="col-md-10 col-md-offset-2">
                        <div class="center" Style="margin-left: 250px">
                            <img src="../assets/images/pub4.jpg" alt="" class="img-circle" Style="width:150px;height:150px; align-items: center"> 
                        </div>
                       
                    </div>
                </div>
                  <div id="INFO" class="row">
                      <div class="col-md-10 col-md-offset-2" style="margin-top: 20px">
                          <P style="font-size: 30px">Name :</P>
                          <P style="font-size: 30px">Email :</P>
                          <P style="font-size: 30px">Pocket : $ 3</P>
                    </div>
                </div>
                   <div id="INFO" class="row">
                      <div class="col-md-10 col-md-offset-2" style="margin-top: 20px">
                    <h3>Disponibilities</h3>
			<ul class="info"> 
				<li><i class="fa fa-arrow-right" aria-hidden="true"></i><a href="#">List of my film</a></li>
						
			</ul>
                    </div>
                </div>
                 
		
            </div>
        </div>

			
			
		</div>
	</div>
<!-- //top-brands -->
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