<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- DATATABLES  -->
<script	src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<link
	href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css"
	rel="stylesheet">

<script>
	$(document).ready(function() {

		$('#myTable').DataTable();

	});
</script>
<div class="contentform col-md-12">
	<table id="myTable" class="display" style="margin:10px;" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>Flight</th>
				<th>Plane</th>
				<th>Baggage</th>
				<th>Gate</th>
				<th>Route</th>
				<th>Duration</th>
				<th>Delay</th>
				<th>Arrival</th>
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
