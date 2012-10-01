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
			<legend>Wizard - credit card form</legend>
			<p>
				<s:label for="car.brand" class="mandatory" />
				<br />
				<s:select id="car.brand" name="car.brand">
					<s:option value="mercedes" label="Mercedes" />
					<s:option value="bmw" label="BMW" />
					<s:option value="audi" label="Audi" />
					<s:option value="jaguar" label="Jaguar" />
				</s:select>
			</p>
			<p>
				<s:label for="car.model" class="mandatory" />
				<br />
				<s:text id="car.model" name="car.model" />
			</p>
			<p>
				<s:label for="car.fuel" class="mandatory" />
				<br />
				<s:select id="car.fuel" name="car.fuel">
					<s:options-enumeration enum="com.zeperdi.demo.webapp.entity.Fuel" />
				</s:select>
			</p>
			<s:submit name="submit" />
			&nbsp;|&nbsp;
			<s:submit name="cancel" />
		</fieldset>
	</s:form>
</body>
</html>