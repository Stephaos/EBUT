<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  xmlns="http://www.w3.org/1999/xhtml">
<xsl:output method="xml" indent="yes"/>
	<xsl:template match="BMECAT">
	<xsl:text disable-output-escaping="yes">&lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" &gt;</xsl:text>
		<html>
			<head>
				<meta http-equiv="content-type" content="text/html; charset=utf-8"></meta>
				<title>Product catalog</title>
			</head>
			<body>
				<xsl:call-template name="Header"/>
				<table>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>EAN</th>
							<th>Price(s)</th>
						</tr>
						<xsl:call-template name="Articles"/>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template name="Header">
		<h1><xsl:value-of select="HEADER/SUPPLIER/SUPPLIER_NAME"/></h1>
		<br />
	</xsl:template>
	<xsl:template name="Articles">
		<xsl:for-each select="T_NEW_CATALOG/ARTICLE">
			<tr>
				<td>
					<xsl:value-of select="ARTICLE_DETAILS/DESCRIPTION_SHORT"/>
				</td>
				<td>
					<xsl:value-of select="ARTICLE_DETAILS/DESCRIPTION_LONG"/>
				</td>
				<td>
					<xsl:value-of select="ARTICLE_DETAILS/EAN"/>
				</td>
				<td>
					<table>
						<tbody>
							<xsl:for-each select="ARTICLE_PRICE_DETAILS/ARTICLE_PRICE">
								<tr>
									<td>
										<xsl:value-of select="PRICE_AMOUNT"/>
										<xsl:value-of select="PRICE_CURRENCY"/>
									</td>
									<td>
										<xsl:value-of select="TERRITORY"/>
									</td>
									<td>
										<xsl:value-of select="TAX * 100"/>%</td>
								</tr>
							</xsl:for-each>
						</tbody>
					</table>
				</td>
			</tr>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
