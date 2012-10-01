<%@include file="../../includes/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Captcha page</title>
</head>
<body>
	<h4>Captcha example</h4>
	<p>This example shows how to use captcha.</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.CaptchaActionBean">
		<fieldset>
			<legend>Captcha form</legend>
			<p>
				<s:label for="name" class="mandatory" />
				<br />
				<s:text id="name" name="name" />
			</p>
			<p>
				<s:label for="email" class="mandatory" />
				<br />
				<s:text id="email" name="email" />
			</p>
			<p>
				<s:label for="message" class="mandatory" />
				<br />
				<s:textarea id="message" name="message" />
			</p>
			<p>${actionBean.captcha}</p>
			<s:submit name="submit" />
		</fieldset>
	</s:form>
</body>
</html>