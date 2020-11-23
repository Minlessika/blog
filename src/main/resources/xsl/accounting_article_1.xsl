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
				<div class="row">
					<div class="col-lg-12 single-content">
						<p class="mb-5">
							<img src="/img/account_article_1.png" alt="Image" class="img-fluid"/>
						</p>
						<h1 class="mb-4">
							Une Comptabilité Mobile et Collaborative Qui Vous Rend Efficace
						</h1>
						<div class="post-meta d-flex mb-5">
							<div class="bio-pic mr-3">
								<img src="/img/logo.svg" alt="Image" class="img-fluidid"/>
							</div>
							<div class="vcard">
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
						<p>La comptabilité est une discipline essentielle pour votre activité dès le moment qu'il est fait mention de flux financier (Dépenses, Entrées etc.).
						Aujourd'hui, pour maitriser son activité et gagner plus de crédibilité auprès des entités bancaires, il est impératif de tenir une comptabilité saine et à jour.</p>
						<p>Cependant, la difficulté rencontrée par la plus part des PME est de s'octroyer un logiciel de comptabilité et d'une ressource interne pour 
						gérer les activités comptables. Elles s'attacheront donc aux services d'un cabinet comptable ou d'expert comptable pour le suivi comptable de leurs activités.</p>
						<p>Toutefois, la mise à disposition des états financiers de base se fera souvent une fois par mois ou les deux semaines, empêchant ainsi au gestionnaire de l'entreprise d'avoir une visibilité temps réel de l'état d'avancement 
						des activités de son entreprise.</p>
						<p>Minlessika met donc <span style="font-weight: bold">gratuitement</span> son module comptable Accounting à la disposition des PME évoluant actuellement dans le système SYCOHADA, de sorte 
						à leur faciliter la prise en charge de la comptabilité générale de leurs activités. </p>
						<p>Ce n'est pas tout !</p>
						<p>Minlessika permet à votre comptable ou votre cabinet comptable de travailler à distance sur votre plan comptable sur la base des pièces comptables 
						que vous lui présenterez, ou lors des bilans trimestrielles et annuelles ou lors de vos déclarations.
						Il suffit pour cela, de partager votre plan comptable avec lui. Non seulement, vous avez vos états financiers de base en temps réel, mais vous n'avez plus à craindre que vos données soit perdues lorsque vous déciderez
						plus tard de changer de cabinet comptable.</p>
						
						<p>Cette approche vous plaît-elle ? <a href="https://accounting.minlessika.com">Démarrez gratuitement maintenant.</a></p>
						<div class="pt-5">
							<p>
								Tags:
								<a href="#">#accounting</a>
								,
								<a href="#">#syscohada</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</xsl:template>
</xsl:stylesheet>