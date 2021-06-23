<%@page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"	errorPage="/WEB-INF/view/common/error_page.jsp"%>
<html>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<c:import url="../common/headMetaData.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<style>
body {
  font-family: "Lato", sans-serif;
}

</style>
</head>
<body>
<input type="hidden" id="contextId" value="${pageContext.request.contextPath}"/>


	<div class="sidenav" style="float: left;">
		<!-- <s:link href="/menu/" target="_top" title="Menu">
			<label style="font-size: 16px;cursor: pointer;">MENU</label>
		</s:link> -->
		<br><hr style="border: 0.02em solid;">

<c:if test="${!userDto.admin}">

<!-- 企業登録 画面 -->
		<c:if test="${userAuthTypeHonbu}">
		<hr class="dashed">
		<s:link href="/tblCompany/" target="f2" title="Company">0
			<bean:message key="labels_page_name_company" />
		</s:link>
		</c:if>

<!-- キャンペーン  -->
		<c:choose>
		<c:when test="${userAuthTypeKanrisha}">
		<hr class="dashed">
		<s:link href="/tblCampaign/" target="f2" title="Campaign">
			<bean:message key="labels_page_compaign" />
		</s:link>
		</c:when>

		<c:when test="${userAuthTypeHonbu}">
		<hr class="dashed">
		<s:link href="/tblCampaign/" target="f2" title="Campaign">
			<bean:message key="labels_page_compaign" />
		</s:link>
		</c:when>
		</c:choose>

<!-- アクション  -->
		<c:choose>
		<c:when test="${userAuthTypeHonbu}">
				<hr class="dashed">
				<s:link href="/tblAction/" target="f2" title="Action">
				<bean:message key="labels_page_action" />
				</s:link>
		</c:when>

		<c:when test="${userAuthTypeKanrisha}">
			<hr class="dashed">
			<s:link href="/tblAction/" target="f2" title="Action">
			<bean:message key="labels_page_action" />
		</s:link>
		</c:when>

			<c:when test="${userAuthTypeSv}">
				<hr class="dashed">
			<s:link href="/tblAction/" target="f2" title="Action">
			<bean:message key="labels_page_action" />
				</s:link>
			</c:when>
</c:choose>

<!-- シフト管理  -->
	<c:choose>
		<c:when test="${userAuthTypeHonbu}">
				<hr class="dashed">
		<s:link href="/tblShiftMng/" target="f2" title="ShiftMng">
			<bean:message key="labels_page_shift_mng" />
		</s:link>
		</c:when>

		<c:when test="${userAuthTypeKanrisha}">
			<hr class="dashed">
		<s:link href="/tblShiftMng/" target="f2" title="ShiftMng">
			<bean:message key="labels_page_shift_mng" />
		</s:link>
		</c:when>

			<c:when test="${userAuthTypeSv}">
				<hr class="dashed">
		<s:link href="/tblShiftMng/" target="f2" title="ShiftMng">
			<bean:message key="labels_page_shift_mng" />
		</s:link>
			</c:when>
</c:choose>

<!-- 架電画面 -->

<c:choose>
<c:when test="${userAuthTypeKanrisha}">
<hr class="dashed">
		<s:link href="/callScreen/" target="f2" title="MstSystem" style="display:block;">
			<bean:message key="labels_page_call_screen" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeSv}">
<hr class="dashed">
		<s:link href="/callScreen/" target="f2" title="MstSystem" style="display:block;">
			<bean:message key="labels_page_call_screen" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeOp1}">
<hr class="dashed">
		<s:link href="/callScreen/" target="f2" title="MstSystem" style="display:block;">
			<bean:message key="labels_page_call_screen" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeOp2}">
<hr class="dashed">
		<s:link href="/callScreen/" target="f2" title="MstSystem" style="display:block;">
			<bean:message key="labels_page_call_screen" />
		</s:link>
</c:when>

</c:choose>

<!-- 再電話	一覧 -->
<c:choose>

<c:when test="${userAuthTypeKanrisha}">
<hr class="dashed">
		<s:link href="/secondCall/" target="f2" title="SecondCall" style="display:block;">
			<bean:message key="labels_page_name_secondCall" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeSv}">
<hr class="dashed">
		<s:link href="/secondCall/" target="f2" title="SecondCall" style="display:block;">
			<bean:message key="labels_page_name_secondCall" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeOp1}">
<hr class="dashed">
		<s:link href="/secondCall/" target="f2" title="SecondCall" style="display:block;">
			<bean:message key="labels_page_name_secondCall" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeOp2}">
<hr class="dashed">
		<s:link href="/secondCall/" target="f2" title="SecondCall" style="display:block;">
			<bean:message key="labels_page_name_secondCall" />
		</s:link>
</c:when>
</c:choose>

<!-- ２ｎｄ割当 -->

<c:choose>
<c:when test="${userAuthTypeKanrisha}">
	<hr class="dashed">
		<s:link href="/secondCallDistribution/" target="f2" title="SecondCallDistribution">
		<bean:message key="labels_page_second_call_distribution" />
		</s:link>
		</c:when>

		<c:when test="${userAuthTypeSv}">
	<hr class="dashed">
		<s:link href="/secondCallDistribution/" target="f2" title="SecondCallDistribution">
		<bean:message key="labels_page_second_call_distribution" />
		</s:link>
		</c:when>
</c:choose>


<!-- モニタリング 画面 -->

<c:choose>
<c:when test="${userAuthTypeKanrisha}">
<hr class="dashed">
		<s:link href="/monitoring/" target="f2" title="Company">
			<bean:message key="labels_page_name_monitoring" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeSv}">
<hr class="dashed">
		<s:link href="/monitoring/" target="f2" title="Company">
			<bean:message key="labels_page_name_monitoring" />
		</s:link>
</c:when>
</c:choose>

<!-- 顧客検索 画面 -->

<c:choose>
<c:when test="${userAuthTypeHonbu}">
		<hr class="dashed">
		<s:link href="/customerSearch/" target="f2" title="CustomerSearch">
			<bean:message key="labels_page_customer_search" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeKanrisha}">
		<hr class="dashed">
		<s:link href="/customerSearch/" target="f2" title="CustomerSearch">
			<bean:message key="labels_page_customer_search" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeSv}">
		<hr class="dashed">
		<s:link href="/customerSearch/" target="f2" title="CustomerSearch">
			<bean:message key="labels_page_customer_search" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeInbound}">
		<hr class="dashed">
		<s:link href="/customerSearch/" target="f2" title="CustomerSearch">
			<bean:message key="labels_page_customer_search" />
		</s:link>
</c:when>
</c:choose>

<!-- 出力 画面 -->

<c:choose>
<c:when test="${userAuthTypeHonbu}">
<hr class="dashed">
		<s:link href="/output/" target="f2" title="Output">
			<bean:message key="labels_page_name_output" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeKanrisha}">
<hr class="dashed">
		<s:link href="/output/" target="f2" title="Output">
			<bean:message key="labels_page_name_output" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeSv}">
<hr class="dashed">
		<s:link href="/output/" target="f2" title="Output">
			<bean:message key="labels_page_name_output" />
		</s:link>
</c:when>
</c:choose>

<!-- プロフィール 画面 -->
<hr class="dashed">
		<s:link href="/profileChange/" target="f2" title="Profile">
			<bean:message key="labels_page_name_profile" />
</s:link>

<!-- 設定 画面 -->

<c:choose>
<c:when test="${userAuthTypeHonbu}">
	<hr class="dashed">
		<s:link href="/mstUser/" target="f2" title="System">
			<bean:message key="labels_page_name_setting" />
		</s:link>
</c:when>

<c:when test="${userAuthTypeKanrisha}">
	<hr class="dashed">
		<s:link href="/mstUser/" target="f2" title="System">
			<bean:message key="labels_page_name_setting" />
		</s:link>
</c:when>
</c:choose>


</c:if>

		<c:if test="${userDto.admin}">

		<hr class="dashed">
		<s:link href="/tblCompany/" target="f2" title="Company">
			<bean:message key="labels_page_name_company" />
		</s:link>

		<hr class="dashed">
		<s:link href="/tblCampaign/" target="f2" title="Campaign">
			<bean:message key="labels_page_compaign" />
		</s:link>

		<hr class="dashed">
		<s:link href="/tblAction/" target="f2" title="Action">
			<bean:message key="labels_page_action" />
		</s:link>

		<hr class="dashed">
		<s:link href="/tblShiftMng/" target="f2" title="ShiftMng">
			<bean:message key="labels_page_shift_mng" />
		</s:link>

		<hr class="dashed">
		<s:link href="/callScreen/" target="f2" title="CallScreen" style="display:block;">
			<bean:message key="labels_page_call_screen" />
		</s:link>

		<hr class="dashed">
		<s:link href="/secondCall/" target="f2" title="SecondCall" style="display:block;">
			<bean:message key="labels_page_name_secondCall" />
		</s:link>

		<hr class="dashed">
		<s:link href="/secondCallDistribution/" target="f2" title="SecondCallDistribution">
		<bean:message key="labels_page_second_call_distribution" />
		</s:link>

		<hr class="dashed">
		<s:link href="/monitoring/" target="f2" title="Monitoring">
			<bean:message key="labels_page_name_monitoring" />
		</s:link>

			<hr class="dashed">
		<s:link href="/customerSearch/" target="f2" title="CustomerSearch">
			<bean:message key="labels_page_customer_search" />
		</s:link>

		<hr class="dashed">
		<s:link href="/output/" target="f2" title="Output">
			<bean:message key="labels_page_name_output" />
		</s:link>

		<hr class="dashed">
		<s:link href="/profileChange/" target="f2" title="Profile">
			<bean:message key="labels_page_name_profile" />
		</s:link>

		<hr class="dashed">
		<s:link href="/mstUser/" target="f2" title="System">
			<bean:message key="labels_page_name_setting" />
		</s:link>

		<hr class="dashed">
		<s:link href="/mstSystem/" target="f2" title="MstSystem">
		<bean:message key="labels.systemSetting" />
		</s:link>


		</c:if>


</div>
</body>
</html>