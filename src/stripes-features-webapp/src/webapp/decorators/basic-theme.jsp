<?xml version="1.0" encoding="UTF-8" ?>
<%@ include file="../includes/taglibs.jsp"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><decorator:title default="stripes demo" />
</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/normalize.css"></link>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/styles/style.css"></link>
</head>
<body>
	<div id="wrapper">
		<a href="http://www.stripesframework.org/display/stripes/Home" target="_blank"> <img
			src="http://www.stripesframework.org/download/attachments/367/stripes?version=1&modificationDate=1290624770206"
			alt="stripes" /> </a>
		<div id="menu">
			<c:import
				url="${pageContext.request.contextPath}/../includes/menu.jsp"></c:import>
		</div>
		<div class="clear"></div>
		<div id="body">
			<s:messages />
			<s:errors />
			<hr />
			<decorator:body />
			<hr />
		</div>
		<div class="clear"></div>
		<div id="footer">
			<c:import
				url="${pageContext.request.contextPath}/../includes/footer.jsp"></c:import>
		</div>
	</div>
	<!-- Load scripts in the last place -->
	<script src="http://code.jquery.com/jquery-1.8.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/scripts/scripts.js"></script>
</body>
</html>