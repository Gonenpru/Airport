<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form action="find_flight" method="post" theme="simple">
	<h1>Find a flight by:</h1>
	<div class="contentform">
		<div class="form-group">
			<p>
				Find by ID: <span>*</span>
			</p>
			<span class="icon-case"><i class="fa fa-plane"></i></span>
			<s:textfield type="number" name="flights.plane_id" />
		</div>
	</div>
</s:form>