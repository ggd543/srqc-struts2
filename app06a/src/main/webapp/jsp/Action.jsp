<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-5-19
  Time: 上午10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
<s:set name="date">${date}</s:set>
<s:property value="#date"/>
<%--<s:action name="doAction" executeResult="true" var="doActionOne"  />--%>
<s:action name="doAction" executeResult="true"/>
<s:property value="#doActionOne"/>
<h1> i want to die</h1>
</body>
</html>