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
      <% 
           User m=(User)session.getAttribute("current");
           if(m!=null)
           {
                FilmDAO daof= new FilmDAO();
                CategorieDAO daoc=new CategorieDAO();
                ImageDAO daoi=new ImageDAO();
                ArrayList<Film>listes=daof.getTopfilm(5);   
    %>
        <%@include file="../inc/incindex.jsp" %>
    <% } 
    
        else
        {
                %>
        <%@include file="../inc/incerror.jsp" %>     
       <% } %>
    
</body>
</html>