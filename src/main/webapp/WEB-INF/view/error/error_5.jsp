<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Error</title>
</head>
<body>
下記のいずれかの理由により、操作を続行できません。<br/>
<ul style="color: red">
<li>出勤していません</li>
</ul>
出勤するにはシフト表を開いて、出勤ボタンを押します。<br/>
シフト表は　
<%-- <s:link href="/tsrUserShift/?historyURI=${forwardURL}">こちら</s:link> --%>
<a href="/tsrUserShift/?historyURI=${forwardURL}">こちら</a>
</body>
</html>