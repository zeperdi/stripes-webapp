<%@include file="../../../includes/taglibs.jsp"%>
<s:form partial="true"
	beanclass="com.zeperdi.demo.webapp.action.ajax.AjaxActionBean">
	<s:label for="car.model" class="mandatory" />
	<br />
	<s:select id="car.model" name="car.model">
		<s:option value="">--- Model ---</s:option>
		<s:options-collection collection="${actionBean.models}" />
	</s:select>
</s:form>