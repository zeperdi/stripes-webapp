<%@include file="../../../includes/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax page</title>
</head>
<body>
	<h4>Ajax example</h4>
	<p>This example shows how ajax works with stripes.</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.ajax.AjaxActionBean">
		<fieldset>
			<legend>Ajax form</legend>
			<p>
				<s:label for="car.brand" class="mandatory" />
				<br />
				<s:select id="car.brand" name="car.brand">
					<s:option value="">--- Brand ---</s:option>
					<s:option value="mercedes" label="Mercedes" />
					<s:option value="bmw" label="BMW" />
					<s:option value="audi" label="Audi" />
					<s:option value="jaguar" label="Jaguar" />
				</s:select>
			</p>
			<p id="model">
				<s:label for="car.model" class="mandatory" />
				<br />
				<s:select id="car.model" name="car.model">
					<s:option value="">--- Model ---</s:option>
				</s:select>
			</p>
			<p>
				<s:label for="car.fuel" class="mandatory" />
				<br />
				<s:select id="car.fuel" name="car.fuel">
					<s:options-enumeration enum="com.zeperdi.demo.webapp.entity.Fuel" />
				</s:select>
			</p>
			<s:submit name="submit" />
		</fieldset>
	</s:form>
</body>
</html>