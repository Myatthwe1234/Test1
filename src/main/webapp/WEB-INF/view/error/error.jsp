<%@include file="/WEB-INF/view/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:import url="../common/headMetaData.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Error</title>
</head>
<body>
下記のいずれかの理由により、操作を続行できません。<br/>
<ul style="color: red">
<li>セッション切れ</li>
<li>ログインしていません</li>
<li>権限がありません</li>
</ul>
再ログインするには<a href="${pageContext.request.contextPath}/login/"  target="_top">こちら</a>
</body>
</html>