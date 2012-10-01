<%@include file="../../includes/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formatter page</title>
</head>
<body>
	<h4>Phone number formatted</h4>
	<p>This example provide facilities to convert an object to String
		to be displayed to the user. Formatting is type conversion in the
		opposite direction.
	<p>
		Example with parens:
		<s:format formatType="parens" value="${actionBean.phoneNumber}" />
	</p>
	<p>
		Example with dashes:
		<s:format formatType="dashes" value="${actionBean.phoneNumber}" />
	</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.FormatterActionBean">
		<fieldset>
			<legend>Formatter form</legend>
			<p>
				<s:label for="phoneNumber" />
				<br />
				<s:text id="phoneNumber" name="phoneNumber" formatType="dashes"
					disabled="true" />
			</p>
		</fieldset>
	</s:form>
</body>
</html>