<%@ page session="true"
	import="de.htwg_konstanz.ebus.wholesaler.demo.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<form name="xmlExportForm" method="post"
	action="<%=response.encodeURL("controllerservlet?action=" + Constants.ACTION_EXPORT)%>">

	<select id="format" name="format" style="display: none">
		<option value="XHTML">Simple XHTML</option>
		<option value="XML">Simple BMECat</option>
	</select> 
	<select id="version" name="version" style="display: none">
		<option>Whole Catalogue</option>
		<option>Matching Short Description</option>
	</select>

	<%--<input id="export" type="BUTTON" value="Export Data!"
		style="display: none" onclick="exportData()"> --%>
		
	<input id="export" type="submit" value="Export Data!"
		style="display: none">
		

</form>