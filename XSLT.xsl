<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
version="1.0">
<xsl:template match="/">
<html>
<head><title>XML Developer´s Guide</title></head>
<body>
<table border="1">
<tr>
<th>Author</th>
<th>Buchtitel</th>
</tr>
<xsl:for-each select="catalog/book">
<tr>
<td><xsl:value-of select="author"/></td>
<td><xsl:value-of select="title"/></td>
</tr>
</xsl:for-each>
</table>
</body></html>
</xsl:template>
</xsl:stylesheet> 
