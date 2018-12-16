<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>车脉</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/plugin/jquery/jquery-3.3.1.min.js"></script>
<script src="/plugin/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<#include "/index.html">
	
	<#if carLsit??>
	<#list carLsit as item>
		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center">
		<a href="#"><img src="/images/show.jpg"
			class="img-responsive center-block"></a> <a href="#"><p>
				<font color="black" size="4">${item.carName}</font><br> <font
					color="gray" size="3">${item.marketTime} ${item.tableShowMileage}  ${item.price}</font>
			</p></a>
		<p></p>
		</div>
	</#list>	
	</#if>
	
	<!-- 	<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3 " align="center"> -->
	<!-- 		<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 				<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 				<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 			</p></a> -->
	<!-- 		<p> -->

	<!-- 		</p> -->
	<!-- 	</div> -->
	<!-- 	<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 		<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 				<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 				<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 			</p></a> -->
	<!-- 		<p> -->

	<!-- 		</p> -->
	<!-- 	</div> -->
	<!-- 	</div> -->
	<!-- 	<div class="row"> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众 捷达 2018款 1.4 风尚版</font><br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 		<div class="col-xs-10 col-sm-10 col-md-4 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black" size="4">大众 捷达 2018款 1.4 风尚版</font> -->
	<!-- 					<br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div>	<div class="col-xs-10 col-sm-10 col-md-5 col-lg-3" align="center"> -->
	<!-- 			<a href="#"><img src="image/show.jpg" class="img-responsive center-block"></a> <a href="#"><p> -->
	<!-- 					<font color="black"  size="4">大众捷达 2018款  1.4L   2108</font> -->
	<!-- 					<br> -->
	<!-- 					<font color="gray"  size="3">2018年 3000公里 10.7万 12.3万</font> -->
	<!-- 				</p></a> -->
	<!-- 			<p> -->

	<!-- 			</p> -->
	<!-- 		</div> -->
	<!-- 	</div> -->
</body>
</html>