<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>

<html lang="en-US">
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- SITE META -->
	<title>YourCoupon | Responsive Coupon Code Site Templates</title>
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="keywords" content="">

	<!-- FAVICONS -->
	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
	<link rel="apple-touch-icon" sizes="57x57" href="images/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="images/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="images/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="images/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="images/apple-touch-icon-152x152.png">

	<!-- BOOTSTRAP STYLES -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<!-- TEMPLATE STYLES -->
	<link rel="stylesheet" type="text/css" href="../../../../resources/static/css/style.css">
	<!-- RESPONSIVE STYLES -->
	<link rel="stylesheet" type="text/css" href="css/responsive.css">
	<!-- COLORS -->
	<link rel="stylesheet" type="text/css" href="css/colors.css">
	<!-- CUSTOM STYLES -->
	<link rel="stylesheet" type="text/css" href="css/custom.css">

	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>

	<div class="page-wrapper">
		<header id="page-header">

			<!-- Header -->
			<tiles:insertAttribute name="header" />
		</header>
		<!-- Body -->
		<div id="page-content">
		<tiles:insertAttribute name="body" />
		</div>
		<footer id="page-footer">
			<!-- Footer -->
			<tiles:insertAttribute name="footer" />
		</footer>
	</div>
	<a href="#" class="to-top scroll" data-show-after-scroll="600"><i
		class="arrow_up"></i></a>

	<script src="js/all.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>