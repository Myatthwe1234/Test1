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
<div style="color: red;margin-bottom:40px;">
大変申し訳ございません、ただいま、未知なエラーが発生致しました。<br/>
お手数ですが、管理者にご連絡くださいますようお願い致します。<br/>
連絡先は03-6863-3268またはinfo@socio-diversity.co.jp<br/>
</div>
再ログインするには<a href="${pageContext.request.contextPath}/login/"  target="_top">こちら</a>
<!-- 再ログインするには<a href="#" target="_top">こちら</a> -->
</body>
</html>