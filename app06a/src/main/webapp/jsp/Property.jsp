<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <title>property Tag Example</title>
    <style type="text/css">@import url(/css/main.css);</style>
</head>
<body>
<div id="global" style="width:250px">
    Temperature:<s:property value="temperature"/>
    <%-- Default to Fahrenheit--%>
    <s:property value="#application.degreeSymbol"
                escape="false"
                default="&deg;F"
            />
    <s:a href="http://www.baidu.com">百度</s:a>
</div>
</body>
</html>
