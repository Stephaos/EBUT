<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>
				<style>
					table, th, td {
					    border: 1px solid black;
					}
				</style>
			</head>
			<body>
				<p><b>LANGUAGE: </b><xsl:value-of select="BMECAT/HEADER/CATALOG/LANGUAGE"></xsl:value-of></p>
				<p><b>CATALOG_ID: </b><xsl:value-of select="BMECAT/HEADER/CATALOG/CATALOG_ID"></xsl:value-of></p>
				<p><b>CATALOG_VERSION: </b><xsl:value-of select="BMECAT/HEADER/CATALOG/CATALOG_VERSION"></xsl:value-of></p>
				<p><b>CATALOG_NAME: </b><xsl:value-of select="BMECAT/HEADER/CATALOG/CATALOG_NAME"></xsl:value-of></p>
				<p><b>SUPPPLIER_NAME: </b><xsl:value-of select="BMECAT/HEADER/SUPPLIER/SUPPLIER_NAME"></xsl:value-of></p>				
				<table>
					<tr>
						<th>SUPPLIER_AID</th>
						<th>DESCRIPTION_SHORT</th>
						<th>DESCRIPTION_LONG</th>
						<th>RDER_UNIT</th>
						<th>CONTENT_UNIT</th>
						<th>NO_CU_PER_OU</th>
						<th>PRICE_AMOUNT</th>
						<th>PRICE_CURRENCY</th>
						<th>TAX</th>
						<th>TERRITORY</th>
					</tr>
					<xsl:for-each select="BMECAT/T_NEW_CATALOG/ARTICLE">
						<tr>
							<td><xsl:value-of select="SUPPLIER_AID"/></td>
							
							<td><xsl:value-of select="ARTICLE_DETAILS/DESCRIPTION_SHORT"/></td>
							<td><xsl:value-of select="ARTICLE_DETAILS/DESCRIPTION_LONG"/></td>
							
							<td><xsl:value-of select="ARTICLE_ORDER_DETAILS/ORDER_UNIT"/></td>
							<td><xsl:value-of select="ARTICLE_ORDER_DETAILS/CONTENT_UNIT"/></td>
							<td><xsl:value-of select="ARTICLE_ORDER_DETAILS/NO_CU_PER_OU"/></td>
							
							<td><xsl:value-of select="ARTICLE_PRICE_DETAILS/ARTICLE_PRICE/PRICE_AMOUNT"/></td>
							<td><xsl:value-of select="ARTICLE_PRICE_DETAILS/ARTICLE_PRICE/PRICE_CURRENCY"/></td>
							<td><xsl:value-of select="ARTICLE_PRICE_DETAILS/ARTICLE_PRICE/TAX"/></td>
							<td><xsl:value-of select="ARTICLE_PRICE_DETAILS/ARTICLE_PRICE/TERRITORY"/></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>