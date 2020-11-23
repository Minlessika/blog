<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
	<xsl:output method="html" include-content-type="no" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
    <xsl:include href="/xsl/layout.xsl"/>
	<xsl:template match="page" mode="head">
		<title>
			<xsl:text>Minlessika - Accueil</xsl:text>
		</title>
	</xsl:template>
	<xsl:template match="page" mode="body">
		
		<div class="site-section">
			<div class="container">
				<div class="half-post-entry d-block d-lg-flex bg-light">
					<div class="img-bg"
						style="background-image: url('/img/account_article_1.png')"></div>
					<div class="contents">
						<span class="caption">ACCOUNTING</span>
						<h2>
							<a href="/accounting-article-1">Une Comptabilité Mobile et Collaborative Qui Vous Rend Efficace</a>
						</h2>
						<p class="mb-3">L'outil qu'il vous faut pour plus de mobilité, de collaborativité et d'agilité dans votre gestion comptable et dans le management de votre entreprise. Actuellement disponible pour le système comptable SYSCOHADA version 2018.</p>
						<div class="post-meta">
							<span class="d-block">
								<a href="#">Olivier B. OURA</a>
								dans
								<a href="#"><![CDATA[R&D]]></a>
							</span>
							<span class="date-read">
								Déc 19
								<span class="mx-1">•</span>
								3 minutes de lecture
								<span class="icon-star2"></span>
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</xsl:template>
</xsl:stylesheet>