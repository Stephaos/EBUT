<%@ page session="true"
	import="de.htwg_konstanz.ebus.wholesaler.demo.util.*"%>

<form name="xmlExportForm" method="post"
	action="<%=response.encodeURL("controllerservlet?action=" + Constants.ACTION_EXPORT)%>">

	<select id="format" name="format" style="display: none">
		<option value="XHTML">XHTML</option>
		<option value="XML">XML</option>
		<option value="XHTML Download">XHTML Download</option>
		<option value="XML Download">XML Download</option>
	</select> 
	<select id="version" name="version" style="display: none" onchange="toggleShortDesc()">
		<option>Whole Catalogue</option>
		<option>Matching Short Description</option>
	</select>
	
	<input id="shortdesc" name="shortdesc" style="display: none"  type="text" placeholder="keyword">

	<input id="export" type="submit" value="Export Data!"
		style="display: none">
		

</form>

<script>

(function() {
	// your page initialization code here
	// the DOM will be available here
	var shortdesc = document.getElementById("shortdesc");
	var e = document.getElementById("version");
	var value = e.options[e.selectedIndex].text;
	if (value != "Matching Short Description") {
		shortdesc.style.display = "none";
		shortdesc.value = "";
	}
	})();

function toggleShortDesc() {
	var shortdesc = document.getElementById("shortdesc");
	var e = document.getElementById("version");
	var value = e.options[e.selectedIndex].text;
	
	if (value === "Matching Short Description") {
		shortdesc.style.display = "block";
	} else {
		shortdesc.style.display = "none";
		shortdesc.value = "";
	}
}

</script>