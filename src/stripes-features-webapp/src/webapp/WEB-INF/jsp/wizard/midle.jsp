<%@include file="../../../includes/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wizard page</title>
</head>
<body>
	<h4>Work with wizard</h4>
	<p>This examples shows how to make a wizard.</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.WizardActionBean">
		<fieldset>
			<legend>Wizard - account form</legend>
			<p>
				<s:label for="account.number" class="mandatory" />
				<br />
				<s:text id="account.number" name="account.number" />
			</p>
			<p>
				<s:label for="account.currency" class="mandatory" />
				<br />
				<s:select name="account.currency">
					<s:options-enumeration enum="com.zeperdi.demo.webapp.util.Currency" />
				</s:select>
			</p>
			<p>
				<s:label for="account.open" class="mandatory" />
				<br />
				<s:text id="account.open" name="account.open"
					formatPattern="yyyy-mm-dd" />
			</p>
			<s:submit name="begin" value="Previous" />
			&nbsp;|&nbsp;
			<s:submit name="carForm" value="Next" />
			&nbsp;|&nbsp;
			<s:submit name="cancel" />
		</fieldset>
	</s:form>
</body>
</html>