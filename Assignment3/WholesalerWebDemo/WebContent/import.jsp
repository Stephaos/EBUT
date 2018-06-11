<%@ page session="true"
	import="de.htwg_konstanz.ebus.wholesaler.demo.util.*"%>

<form id="import" name="import" method="post" style="display: none"
	action="<%=response.encodeURL("controllerservlet?action=" + Constants.ACTION_IMPORT)%>"
	enctype="multipart/form-data">
	File to import: <input type="file" name="upfile" required><br /> <input
		type="submit" value="Import it!">
</form>
