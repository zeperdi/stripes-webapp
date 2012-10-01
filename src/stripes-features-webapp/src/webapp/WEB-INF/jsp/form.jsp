<%@include file="../../includes/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User form</title>
</head>
<body>
	<h4>Captcha example</h4>
	<p>This example shows how to build a form. Also, this example shows
		how to validate fields and how to bind fields to resources.</p>
	<s:form beanclass="com.zeperdi.demo.webapp.action.FormsActionBean">
		<fieldset>
			<legend>User info</legend>
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
			<p>
				<s:label for="confirmPassword" class="mandatory" />
				<br />
				<s:password id="confirmPassword" name="confirmPassword" />
			</p>
			<p>
				<s:label for="user.email" class="mandatory" />
				<br />
				<s:text id="user.email" name="user.email" />
			</p>
			<p>
				<s:label for="user.phone" class="mandatory" />
				<br />
				<s:text id="user.phone" name="user.phone" />
			</p>
			<p>
				<s:label for="user.gender" class="mandatory" />
			</p>
			<ul>
				<li><s:radio name="user.gender" value="male" />Male</li>
				<li><s:radio name="user.gender" value="female" />Female</li>
			</ul>

			<p>
				<s:label for="user.preferences" />
			</p>
			<ul>
				<c:forEach items="${actionBean.preferencesList}" var="preference">
					<li><s:label for="id_${preference}">
							<s:checkbox id="id_${preference}" name="user.preferences"
								value="${preference}" />
							<span></span>
									${preference}
								</s:label>
					</li>
				</c:forEach>
			</ul>
			<s:submit name="submit" />
		</fieldset>
	</s:form>
</body>
</html>