<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="contentform col-md-12">
	<table id="myTable" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>Flight</th>
				<th>Plane</th>
				<th>Baggage</th>
				<th>Gate</th>
				<th>Route</th>
				<th>Duration</th>
				<th>Delay</th>
				<th>Departure</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="flightsList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="plane_id" /></td>
					<td><s:property value="baggage_id" /></td>
					<td><s:property value="gate_id" /></td>
					<td><s:property value="route_id" /></td>
					<td><s:property value="duration" /></td>
					<td><s:property value="delay" /></td>
					<td><s:property value="dateDeparture" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</div>