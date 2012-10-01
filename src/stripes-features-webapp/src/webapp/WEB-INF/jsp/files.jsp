<%@include file="../../includes/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Files page</title>
</head>
<body>
	<h4>Work with files</h4>
	<p>This examples shows how to make a file downloadable and how to
		create a input field, or several, for file(s) upload.</p>
	<h5>Download file</h5>
	<s:link beanclass="com.zeperdi.demo.webapp.action.FilesActionBean"
		event="download">
		<img alt="download"
			src="http://www.masteradvpl.com.br/images/jdownloads/downloadimages/download_harddisk.png" />
	</s:link>
	<s:form beanclass="com.zeperdi.demo.webapp.action.FilesActionBean">
		<fieldset>
			<legend>File upload form</legend>
			<c:forEach var="index" begin="0" end="3">
				<div>
					<s:file name="attachments[${index}]" />
				</div>
			</c:forEach>
			<s:submit name="upload" />
		</fieldset>
	</s:form>
</body>
</html>