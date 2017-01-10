<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>There was a problem</title>
</head>
<body>
	<img alt="Error image"
		src="http://files.gamebanana.com/img/ss/sprays/4feddfb9a027d.jpg">
	<h1>A dónde fuiste, wey!</h1>
	<p>Error: <s:property value="%{exception.message}"/></p>
</body>
</html>