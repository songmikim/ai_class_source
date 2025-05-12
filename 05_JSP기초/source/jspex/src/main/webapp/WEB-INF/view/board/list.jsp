<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>게시글 목록</h1>
<ul>
<c:forEach var="item" items="${items}">
    <li>${item.subject}</li>
</c:forEach>
</ul>