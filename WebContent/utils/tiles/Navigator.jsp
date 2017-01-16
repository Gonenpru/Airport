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
			<li id="main" class="nav-item"><s:a action="main">
					<i class="fa fa-play"></i>
					<span>Dashboard</span>
				</s:a></li>
			<li id="depart" class="nav-item"><s:a action="depart">
					<i class="fa fa-plane" aria-hidden="true"></i>
					<span>Departures</span>
				</s:a></li>
			<li id="arrive" class="nav-item"><s:a action="arrive">
					<i class="fa fa-plane fa-rotate-90" aria-hidden="true"></i>
					<span>Arrivals</span>
				</s:a></li>
			<li id="finder" class="nav-item"><s:a action="finder">
					<i class="lnr lnr-magnifier"></i>
					<span>Finder</span>
				</s:a></li>
		</ul>
	</div>
</div>