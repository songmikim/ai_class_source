<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String text1 = (String)pageContext.getAttribute("text1");
    String text2 = (String)request.getAttribute("text2");
    String text3 = (String)application.getAttribute("text3");
%>
<h1>ex02.jsp</h1>
pageContext : <%=text1%><br>
request : <%=text2%><br>
application : <%=text3%><br>