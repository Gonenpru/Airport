<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="left-side sticky-left-side">
	<div class="logo">
		<h1>
			<a href="index.jsp">Index</a>
		</h1>
	</div>
	<div class="logo-icon text-center">
		<a href="index.jsp"><i class="lnr lnr-home"></i> </a>
	</div>
	<div class="left-side-inner">
		<ul class="nav nav-pills nav-stacked custom-nav">
			<li class="active"><s:a name="action" value="main">
					<i class="fa fa-play"></i>
					<span>Dashboard</span>
				</s:a></li>
			<li><s:a name="action" value="depart">
					<i class="fa fa-plane" aria-hidden="true"></i>
					<span>Departures</span>
				</s:a></li>
			<li><s:a name="action" value="arrive">
					<i class="fa fa-plane fa-rotate-90" aria-hidden="true"></i>
					<span>Arrivals</span>
				</s:a></li>
			<li><s:a name="action" value="find">
					<i class="lnr lnr-magnifier"></i>
					<span>Finder</span>
				</s:a></li>
		</ul>
	</div>
</div>