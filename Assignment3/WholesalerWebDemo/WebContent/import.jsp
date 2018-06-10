<%@ page session="true"
	import="de.htwg_konstanz.ebus.wholesaler.demo.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form id="import" name="import" method="post" style="display: none"
	action="<%=response.encodeURL("controllerservlet?action=" + Constants.ACTION_IMPORT)%>"
	enctype="multipart/form-data">
	File to import: <input type="file" name="upfile"><br /> <input
		type="submit" value="Import it!">
</form>
