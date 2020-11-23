<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
	<xsl:output method="html" include-content-type="no" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
    <xsl:include href="/org/takes/facets/flash/flash.xsl"/>
	<xsl:template match="/page">
	    <html lang="en">
		    <head>
			    <xsl:apply-templates select="." mode="head"/>
			    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
			    <meta charset="utf-8"/>
			
			    <link rel="icon" href="/img/favicon.ico" type="image/x-icon"/>
			    
			    <!-- External CSS libraries -->
			    <link rel="stylesheet" type="text/css" href="/css/jquery.mb.YTPlayer.min.css" />
	   		
			    <!-- Custom stylesheet -->
			    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
			
			    <!-- Google fonts -->
			    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=B612+Mono|Cabin:400,700&amp;display=swap"/>
			</head>			
			<body>				
				<div class="site-wrap">
					<div class="header-top">
						<div class="container">
							<div class="row align-items-center">
								<div class="col-12 col-lg-6 d-flex">
									<a href="https://www.minlessika.com" class="site-logo" target="_blank">
										Minlessika
									</a>
									<a href="#"
										class="ml-auto d-inline-block d-lg-none site-menu-toggle js-menu-toggle text-black">
										<span class="icon-menu h3"></span>
									</a>
								</div>
								<div class="col-12 col-lg-6 ml-auto d-flex">
									<div class="ml-md-auto top-social d-none d-lg-inline-block">
										<a href="https://web.facebook.com/minlessika" class="d-inline-block p-3" target="_blank">
											<span class="icon-facebook"></span>
										</a>
										<a href="https://twitter.com/minlessika" class="d-inline-block p-3" target="_blank">
											<span class="icon-twitter"></span>
										</a>
										<a href="https://www.linkedin.com/company/minlessika2" class="d-inline-block p-3" target="_blank">
											<span class="icon-linkedin"></span>
										</a>
									</div>
								</div>
							</div>
						</div>
						<div id="sticky-wrapper" class="sticky-wrapper"
							style="height: 54px;">
							<div
								class="site-navbar py-2 js-sticky-header site-navbar-target d-none pl-0 d-lg-block"
								role="banner" style="">
								<div class="container">
									<div class="d-flex align-items-center">
										<div class="mr-auto">
											<nav class="site-navigation position-relative text-right"
												role="navigation">
												<ul
													class="site-menu main-menu js-clone-nav mr-auto d-none pl-0 d-lg-block">
													<li class="active">
														<a href="/home" class="nav-link text-left">Accueil</a>
													</li>
												</ul>
											</nav>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- Body Start-->
					<xsl:apply-templates select="." mode="body"/>
					<!-- Body End -->
				</div>
								
				<!-- Footer Start -->
				<div class="footer">
					<div class="container">
						<div class="row">
							<div class="col-12">
								<div class="copyright">
								<p>
								Copyright ©  2020 Minlessika Corporation, All rights reserved
								</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- Footer End -->				
				
				<script src="/js/jquery-3.3.1.min.js"></script>
				<script src="/js/jquery-migrate-3.0.1.min.js"></script>
				<script src="/js/jquery-ui.js"></script>
				<script src="/js/popper.min.js"></script>
				<script src="/js/bootstrap.min.js"></script>
				<script src="/js/owl.carousel.min.js"></script>
				<script src="/js/jquery.stellar.min.js"></script>
				<script src="/js/jquery.countdown.min.js"></script>
				<script src="/js/bootstrap-datepicker.min.js"></script>
				<script src="/js/jquery.easing.1.3.js"></script>
				<script src="/js/aos.js"></script>
				<script src="/js/jquery.fancybox.min.js"></script>
				<script src="/js/jquery.sticky.js"></script>
				<script src="/js/jquery.mb.YTPlayer.min.js"></script>
				<script src="/js/main.js"></script>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>