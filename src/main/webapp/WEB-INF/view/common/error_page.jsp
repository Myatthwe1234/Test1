<%@ page isErrorPage="true" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <html>
 <head>
  <title>エラー</title>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <script language="JavaScript" type="text/javascript" src="${f:url('/js/jquery/jquery.js')}"></script> --%>
 </head>
	 <body>
	 <h3>申し訳ありません、システムエラーが発生しました</h3>
		システム管理者にご連絡ください<br>
<div style="display: none;">
	 <b><%= request.getAttribute("javax.servlet.error.request_uri") %></b><br>
	 <b><%= exception %></b><br>
	 <hr>
	 <pre>
	 	<!-- % exception.printStackTrace(new java.io.PrintWriter(out)); % -->
	 </pre>
</div>
	 </body>
</html>
