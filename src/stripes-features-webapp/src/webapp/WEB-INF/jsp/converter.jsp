<%@include file="../../includes/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Converter page</title>
</head>
<body>
	<h4>Phone number Converter</h4>
	<p>This example provide facilities for converting from String to a
		specific object type.</p>
	<p>The input in field "Phone number" should be something like that:</p>
	<p>654-456-4567</p>
	<p>(654) 567-5678</p>
	<p>654 234.2345</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.ConverterActionBean">
		<fieldset>
			<legend>Converter phone number</legend>
			<p>
				<s:label for="phoneNumber" class="mandatory" />
				<br />
				<s:text id="phoneNumber" name="phoneNumber" />
			</p>
			<p>
				<s:submit name="submit" />
			</p>
		</fieldset>
	</s:form>
</body>
</html>