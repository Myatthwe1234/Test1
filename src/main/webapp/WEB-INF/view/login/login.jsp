<%@ page contentType="text/html; charset=UTF-8" errorPage="/WEB-INF/view/common/error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<!-- <link href="@/css/bootstrap/bootstrap.css" type="text/css" rel="stylesheet" /> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/global.css"/>" />
<title>Login</title>
</head>
<body>
    <font color="red">${errorMessage}</font>
    <form method="post" class="px-4 py-3" >
    <div align="center">
    <div>
		<header>
			<h2 class="header">佐賀銀行</h2>
		</header>
	</div>
	<div class="mb-3">
	<table>
	<tr>
		<th><bean:message code="labels.loginId" />　:</th>
		<td><input type="text" name="loginId" /></td>
	</tr>
	<tr>
		<th><bean:message code="labels.loginPassword" />　: </th>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr><td><input type="submit" value="<bean:message code="button_login" />"/></td></tr>
	</table>
	</div>   
	</div>
    </form>
</body>
</html>