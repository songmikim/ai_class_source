<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib profix="form" uri="http://www.springframework.org/tags/form" %>
<dl>
    <dt>좋아하는 언어</dt>
    <dd>
        <form:checkboxes items="${programmings}"    />
    </dd>
</dl>

