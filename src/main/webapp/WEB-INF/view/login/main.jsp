<%@ page contentType="text/html; charset=UTF-8" errorPage="/WEB-INF/view/common/error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<%-- taglibs common declaration --%>
<%-- <%@include file="/WEB-INF/view/common/common.jsp"%> --%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<%-- <link rel="stylesheet" type="text/css" href="<c:url value="\css\bootstrap\bootstrap.css"/>" /> --%>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
<div class="container">
	<%-- <a href="#" onclick="document.forms['logoutForm'].submit()">Logout</a>
	<form id="logoutForm" method="POST" action="${contextPath}/logout">
    </form> --%>
   	<a href="${pageContext.request.contextPath}/logout" target="_top" style="float:right;"><button>
	<bean:message code="button_logout"/></button></a>
	<h1>Logged In!!</h1>
	<%-- <p th:text="'id: ' + ${greeting.id}" />
    <p th:text="'content: ' + ${greeting.content}" /> --%>
    Welcome ${name}。
    <table class="table table-striped table-hover" border="1" cellpadding="10">
    <thead class="table table-hover">
    <tr>
    <th>ID</th>
  	<th>ユーザログインID</th>
  	<th>ユーザ名</th>
  	<th>グルプID</th>
    </tr>
    </thead>
    <c:forEach var="e" items="${list}">
     <tr>
    <td>${e.user_id }</td>
    <td>${e.user_login_id }</td>
    <td>${e.user_name }</td>
    <td>${e.user_group_id }</td>
    </tr>
    </c:forEach>  
    </table>
 </div>   ${list } 
   <%--  ${list } --%>
</body>
</html>