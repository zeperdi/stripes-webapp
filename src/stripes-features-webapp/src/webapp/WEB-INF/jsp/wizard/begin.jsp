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
			<legend>Wizard - user form</legend>
			<p>
				<s:label for="user.name" class="mandatory" />
				<br />
				<s:text id="user.name" name="user.name" />
			</p>
			<p>
				<s:label for="user.username" class="mandatory" />
				<br />
				<s:text id="user.username" name="user.username" />
			</p>
			<p>
				<s:label for="user.password" class="mandatory" />
				<br />
				<s:password id="user.password" name="user.password" />
			</p>
			<s:submit name="accountForm" value="Next" />
			&nbsp;|&nbsp;
			<s:submit name="cancel" />
		</fieldset>
	</s:form>
</body>
</html>