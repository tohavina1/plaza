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
          <script type='text/javascript'>
               function videoplay()
               {
                   var video = document.getElementById ( "stream" );
                   var busy=false;
                   var i=0;
                   var source="../video/Plaza/pub.MP4";
                   var process=setInterval(function()
                   {
                     if(!busy)
                        {
                            busy=true;
                            if(!video.paused)
                                {
                                    console.log("mande n film")
                                }
                            else
                                {
                                    video.src=source;
                                    video.play();
                                    console.log("pause n film")
                                }
                        }
                        i++;
                        busy=false;
                    }
                   ,1000);
               }
      </script>
<!-- header -->
	<%@include file="../inc/header.jsp" %>
<!-- //header -->

<!-- navigation -->
	<%@include file="../inc/menu.jsp" %>
<!-- //navigation -->

	<!-- main-slider -->
	<div class="row" style="background-color:black;">
		<div class="col-md-10 col-md-offset-1" style="background-color:white;">
			<video id="stream" style=" width: 100%; height: 56%;" controls>
			</video>
		</div>
	</div>
      
		
	<!-- //main-slider -->
	<!-- //top-header and slider -->
	<!-- top-brands -->
	<div class="top-brands">
		<div class="container">
		<h2>Top films list</h2>
			<div class="grid_3 grid_5">
				<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
					<ul id="myTab" class="nav nav-tabs" role="tablist">
						<li role="presentation" class="active"><a href="#latest" id="expeditions-tab" role="tab" data-toggle="tab" aria-controls="expeditions" aria-expanded="true">Latest films</a></li>
						<li role="presentation"><a href="#viewed" role="tab" id="tours-tab" data-toggle="tab" aria-controls="tours">Most viewed</a></li>
					</ul>
					<div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade in active" id="latest" aria-labelledby="expeditions-tab">
							<div class="agile-tp">
								<h5>Top 5 latest films</h5>
								<p class="w3l-ad">This is the list of our latest film, have a fun.</p>
							</div>
                                              
							<div class="agile_top_brands_grids">
                                                                  <%  for(Film f : listes)
                                                    {
                                                        Categorie cat=daoc.findById(f.getIdcat());
                                                        Image img =daoi.findById(f.getImage());    
                                                  
                                                 %>
                                                 <div class="col-md-4 top_brand_left" style="margin-top: 20px">
									<div class="hover14 column">
										<div class="agile_top_brand_left_grid">
											<div class="agile_top_brand_left_grid_pos">
                                                                                            
                                                                                            <img src="../assets/images/offer.png" alt=" " class="img-responsive"  />
											</div>
											<div class="agile_top_brand_left_grid1">
												<figure>
													<div class="snipcart-item block" >
														<div class="snipcart-thumb">
															<a href="fiche.jsp?id=<%=f.getId()%>"><img title=" " alt=" " src="../assets/images/imagefilm/<%out.println(cat.getType());%>/<%=img.getImage1()%>" Style="width: 150px ; height: 150px"/></a>		
															<p><%=f.getTitre()%></p>
															<h4>$<%=f.getPrix()%> </h4>
														</div>
                                                                                                                	<div class="snipcart-details top_brand_home_details">
                                                                                                                      	<form action="subscribe.jsp" method="post">
													<fieldset>
														<input type="hidden" name="cmd" value="_cart">
														<input type="hidden" name="add" value="1">
														<input type="hidden" name="business" value=" ">
														<input type="hidden" name="item_name" value="Pepsi soft drink">
														<input type="hidden" name="amount" value="80.00">
														<input type="hidden" name="discount_amount" value="1.00">
														<input type="hidden" name="currency_code" value="USD">
														<input type="hidden" name="return" value=" ">
														<input type="hidden" name="cancel_return" value=" ">
														<input type="submit" name="submit" value="View" class="button">
													</fieldset>
												</form>
													
														</div>
													</div>
												</figure>
											</div>
										</div>
									</div>
								</div>
                                                                 <% } %>
								<!-- Element 3 de aveo clearfix-->
								<div class="clearfix"> </div>
                                                                  
							</div>
                                                    
						</div>
						<div role="tabpanel" class="tab-pane fade" id="viewed" aria-labelledby="tours-tab">
							<div class="agile-tp">
								<h5>Top 6 film ever</h5>
								<p class="w3l-ad">Here is the list of top 6 film ever in our chanel, try it.</p>
							</div>
							<div class="agile_top_brands_grids">
								<div class="col-md-4 top_brand_left">
									<div class="hover14 column">
										<div class="agile_top_brand_left_grid">
											<div class="agile_top_brand_left_grid_pos">
												<img src="../assets/images/offer.png" alt=" " class="img-responsive" />
											</div>
											<div class="agile_top_brand_left_grid1">
												<figure>
													<div class="snipcart-item block" >
														<div class="snipcart-thumb">
															<a href="products.html"><img title=" " alt=" " src="../assets/images/7.png" /></a>		
															<p>Sona-masoori-rice</p>
															<div class="stars">
																<i class="fa fa-star blue-star" aria-hidden="true"></i>
																<i class="fa fa-star blue-star" aria-hidden="true"></i>
																<i class="fa fa-star blue-star" aria-hidden="true"></i>
																<i class="fa fa-star blue-star" aria-hidden="true"></i>
																<i class="fa fa-star gray-star" aria-hidden="true"></i>
															</div>
															<h4>$35.99 <span>$55.00</span></h4>
														</div>
														<div class="snipcart-details top_brand_home_details">
															<form action="#" method="post">
																<fieldset>
																	<input type="hidden" name="cmd" value="_cart" />
																	<input type="hidden" name="add" value="1" />
																	<input type="hidden" name="business" value=" " />
																	<input type="hidden" name="item_name" value="Fortune Sunflower Oil" />
																	<input type="hidden" name="amount" value="35.99" />
																	<input type="hidden" name="discount_amount" value="1.00" />
																	<input type="hidden" name="currency_code" value="USD" />
																	<input type="hidden" name="return" value=" " />
																	<input type="hidden" name="cancel_return" value=" " />
																	<input type="submit" name="submit" value="Add to cart" class="button" />
																</fieldset>
															</form>
														</div>
													</div>
												</figure>
											</div>
										</div>
									</div>
								</div>
								<!-- Element 3 de aveo clearfix-->
								<div class="clearfix"> </div>
							</div>
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
   <script>
		videoplay();
        </script>
</body>
</html>