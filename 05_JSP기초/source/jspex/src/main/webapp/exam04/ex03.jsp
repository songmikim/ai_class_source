<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("text", "pageContext에서 설정");
    request.setAttribute("text", "request에서 설정");
    application.setAttribute("text", "application에서 설정");

    //pageContext.setAttribute("text2", "pageContext에서 설정");
    request.setAttribute("text2", "request에서 설정");
    application.setAttribute("text2", "application에서 설정");

    //pageContext.setAttribute("text3", "pageContext에서 설정");
    //request.setAttribute("text3", "request에서 설정");
    application.setAttribute("text3", "application에서 설정");
%>

text : ${text}<br>
text2 : ${text2}<br>
text3 : ${text3}<br>

