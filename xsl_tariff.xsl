<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
		<body>
		<h1>Tariff</h1>
		<table border="1">
			<tr bgcolor="#FFF0F5">
				<th>tatiff_name</th>
				<th>operator</th>
				<th>payroll</th>
				<th>withinNetwork</th>
				<th>outsideNetwork</th>
				<th>fixedPhone</th>
				<th>sms_price</th>
				<th>favoriteNumber</th>
				<th>tariffication</th>
				<th>tariffication</th>
			</tr>
			<xsl:for-each select="Tariff/tatiff_name">
			<!-- Сортировка по возрастанию-->
            <xsl:sort select="payroll" order="ascending"/>
     		 	<tr>
       				<td><xsl:value-of select="@name"/></td>
       				<td><xsl:value-of select="operator"/></td>
       				<td><xsl:value-of select="payroll"/></td>
					<td><xsl:value-of select="call_prices/withinNetwork"/></td>
       				<td><xsl:value-of select="call_prices/outsideNetwork"/></td>
					<td><xsl:value-of select="call_prices/fixedPhone"/></td>
					<td><xsl:value-of select="sms_price"/></td>
					<td><xsl:value-of select="parameters/favoriteNumber"/></td>
       				<td><xsl:value-of select="parameters/tariffication"/></td>
					<td><xsl:value-of select="parameters/tariffication"/></td>
      			</tr>
      			</xsl:for-each>
   		 </table>
 	 </body>
  	</html>
</xsl:template>
</xsl:stylesheet>