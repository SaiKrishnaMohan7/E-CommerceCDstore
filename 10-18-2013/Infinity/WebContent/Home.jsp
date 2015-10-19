<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.webservices.productcatalogws.*"%>
<%@ page import="org.infinity.model.buisobjects.*"%>
<%@include file="/WEB-INF/view/jspf/header.jspf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/InfinityStyle.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/960_16.css">

</head>
<body>
	<div id="main">

		<div id="indexLeftColumn">
			<table>
				<%
					Category[] categoryarray = (Category[]) session
							.getAttribute("ALL_CATEGORYS");
					for (Category item : categoryarray) {
						String y = "showcategory?" + item.getCategory_id();
				%>
				<tr>
					<td height="65px" width="340px" align="center" bgcolor="#FFFFFF"><a
						href="showcategory?category_id=<%=item.getCategory_id()%>"> <%=item.getName()%></a>
					</td>
				</tr>
				<%
					}
				%>
				<tr>
					<td height="65px" width="340px" align="center" bgcolor="#FFFFFF"><a
						href="showall"> Show All</a></td>
				</tr>

			</table>
		</div>
		<div>
			<table>
				<%
					Product[] prodarray = (Product[]) session
							.getAttribute("ALL_PRODUCTS");
					for (int i = 0; i < prodarray.length; i = i + 1) {
				%>
				<tr>
					<td><img
						src="C:/Users/yashveerbeni/workspace/Infinity/WebContent/WEB-INF/images/<%=prodarray[i].getImage()%>"
						height="150px" width="150px" /></td>
					<td><%=prodarray[i].getName()%></td>
					<td><%=prodarray[i].getDescription()%> Price : <%=prodarray[i].getUnit_price() %>
					</td>
					<td><form METHOD="GET" ACTION="addtocart">
							<input type="hidden" value="<%=prodarray[i].getProduct_id()%>"
								name="ProductID" /> <input type="submit" value="Add to Cart">
						</form></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
		<div id="footer">footer</div>
	</div>
</body>
</html>