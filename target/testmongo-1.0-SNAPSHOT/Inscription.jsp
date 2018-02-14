<%-- 
    Document   : ListFilmBycat
    Created on : Feb 9, 2018, 3:17:15 PM
    Author     : TOHX
--%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.MongoException"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="com.mongodb.QueryBuilder"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="controller.*"%>
<%@page import="com.mycompany.testmongo.DAO.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mycompany.testmongo.*"%>
<%@page import="com.mongodb.DB"%>
<%@page import="model.*"%>
<%@page import="com.mongodb.DBCursor"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%
    UserDAO dao=new UserDAO();
    MongoConnect mon = new MongoConnect();
    String username=request.getParameter("un");
    String mail=request.getParameter("email");
    String pw=request.getParameter("pw");
    String iduser=new Tools().getPredicat("User");
    User user=new User(iduser,username,pw,mail,0,0,1,"new",new Date(2015,1,1),new Date(2015,1,1));
    dao.insert(user);  
%>

