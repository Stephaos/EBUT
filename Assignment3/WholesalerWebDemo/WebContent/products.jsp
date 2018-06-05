<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,java.math.BigDecimal,de.htwg_konstanz.ebus.framework.wholesaler.vo.util.PriceUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Product List</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">

<script type="text/javascript">
function showUploadElement() {
    var v_upload = document.getElementById("upload");
    var v_export = document.getElementById("export");
	
    if (v_upload.style.display = "none") {
		v_upload.style.display = "block";
		v_export.style.display = "none";
	}
}

function showExportElement() {
    var v_upload = document.getElementById("upload");
    var v_export = document.getElementById("export");
	
    if (v_export.style.display = "none") {
		v_export.style.display = "block";
		v_upload.style.display = "none";
	} 
}

</script>
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>


<label>What do you want to do?</label>
<form NAME="form1" METHOD="POST">
	<input TYPE="BUTTON" VALUE="Upload" ONCLICK="showUploadElement()">
	<input TYPE="BUTTON" VALUE="Export" ONCLICK="showExportElement()">
</form>

<form id="upload" name="upload" method="POST" enctype="multipart/form-data" action="fup.cgi" style="display: none">
	File to upload:	<input type="file" name="upfile"><br/>
	<input type="submit" value="Upload it!">
</form>

<input id="export" TYPE="BUTTON" VALUE="Export Data!" ONCLICK="exportData()" style="display: none">

<h1>Product Catalog</h1>

<table class="dataTable">
<thead>
<tr>
<th><b>Order No.</b></th>
<th><b>Title</b></th>
<th><b>Description</b></th>
<th><b>Price net</b></th>
<th><b>Price gross</b></th>
<th><b>Inventory</b></th>
</tr>
</thead>
<tbody>
<c:forEach var="product" items="${sessionScope.productList}">
<jsp:useBean id="product" type="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct" />
<tr valign="top">
<td><a href="<%= response.encodeURL("controllerservlet?action=showProductDetail&orderNumberCustomer="+product.getOrderNumberCustomer()) %>"><%= product.getOrderNumberCustomer() %></a></td>
<td><%= product.getShortDescription() %></td> 
<td width="400px"><%= product.getLongDescription() %></td> 

<%if(product.getDefaultSalesPrice()!=null) {%>
<% BigDecimal netPrice = product.getDefaultSalesPrice().getAmount(); %>
<% BigDecimal grossPrice = product.getDefaultSalesPrice().getAmountGross(); %>
<td align="right"><fmt:formatNumber value="<%= netPrice %>" type="currency" currencySymbol="<%= product.getDefaultSalesPrice().getCountry().getCurrency().getCode() %>"/></td>
<td align="right"><fmt:formatNumber value="<%= grossPrice %>" type="currency" currencySymbol="<%= product.getDefaultSalesPrice().getCountry().getCurrency().getCode() %>"/></td>
<%} else { %>
<td align="right">N/A</td>
<td align="right">N/A</td>
<%} %>

<% BOInventory inventory = InventoryBOA.getInstance().findByProduct(product); %>
<td align="right"><% if (inventory != null) 
{ %>
<%= inventory.getInventoryNumber() %> 
<% } else { %>
	N/A
<% } %> 
</td>
</tr>
</c:forEach>
</tbody>
</table>
<p>
<input type=button name=go-back value=" Back " onclick="javascript:history.back()">
</p>
</body>
</html>
