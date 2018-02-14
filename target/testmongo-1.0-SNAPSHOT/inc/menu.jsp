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
<% CategorieDAO daoC1 =new CategorieDAO();
ArrayList<Categorie> listesc=daoC1.findAll();
%>
<div class="navigation-agileits">
    <div class="container">
        <nav class="navbar navbar-default">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header nav_2">
                            <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div> 
                        <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                            <ul class="nav navbar-nav">

                                <li class="active"><a href="index.jsp" class="act">Home</a></li>

                                <li class="active"><a href="program.jsp" class="act">Program</a></li>	
                                
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Category<b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="row">
                                            <div class="multi-gd-img">
                                                <ul class="multi-column-dropdown">
                                                    <h6>All category</h6>
                                                    <%
                                                        for(Categorie c : listesc)
                                                        {

                                                    %>
                                                    
                                                    <li><a href="listCategory.jsp?id=<%=c.getId()%>"><%=c.getType()%></a></li>
                                                    <% } %>
                                                </ul>
                                            </div>	
                                            
                                        </div>
                                    </ul>
                                </li>

                                <li class="active"><a href="profil.jsp" class="act">Profil</a></li>	
                            </ul>
                        </div>
                    </nav>
        </div>
    </div>