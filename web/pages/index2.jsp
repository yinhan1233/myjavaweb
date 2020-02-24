<%--
  Created by IntelliJ IDEA.
  User: Neuedu
  Date: 2020/2/24
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title1</title>
</head>
<body>
    <%=pageContext.getAttribute("key") %><br>
    <%=request.getAttribute("key") %><br>
    <%=session.getAttribute("key") %><br>
    <%=application.getAttribute("key") %><br>
</body>
</html>
