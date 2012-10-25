<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>

	<s:form action="empAdd">
			<s:textfield name="emp.empCode"  label="Employee Code"/>
			<s:textfield name="emp.username" label="UserName"/>
		<s:textfield name="emp.name"  label="Name"/>
		<s:password name="emp.password" label="Password" />
		<s:textfield name="emp.grade" label="Grade"/>
		<s:submit value="Save"></s:submit>
		
	</s:form>

	<table width="70%" border="1">
		<thead>
			<tr>
				<td>Emp. Code</td>
				<td>UserName</td>
				<td>Name</td>
				<td>Band</td>
				<td>#</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="empList" value="empList">
				<tr>
					<td><s:property value="empCode" /></td>
					<td><s:property value="username" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="grade" /></td>
					<td></td>

				</tr>

			</s:iterator>
		</tbody>
	</table>
</body>
</html>