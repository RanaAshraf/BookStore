
<!DOCTYPE HTML>
<html>
<head>
<title>Ketabi</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- start slider -->		
	<link href="css/slider.css" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="js/modernizr.custom.28468.js"></script>
	<script type="text/javascript" src="js/jquery.cslider.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#da-slider').cslider();
		});
	</script>
		<!-- Owl Carousel Assets -->
		<link href="css/owl.carousel.css" rel="stylesheet">
		     <!-- Owl Carousel Assets -->
		    <!-- Prettify -->
		    <script src="js/owl.carousel.js"></script>
		        <script>
		    $(document).ready(function() {
		
		      $("#owl-demo").owlCarousel({
		        items : 4,
		        lazyLoad : true,
		        autoPlay : true,
		        navigation : true,
			    navigationText : ["",""],
			    rewindNav : false,
			    scrollPerPage : false,
			    pagination : false,
    			paginationNumbers: false,
		      });
		
		    });
		    </script>
		   <!-- //Owl Carousel Assets -->
		<!-- start top_js_button -->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		   <script type="text/javascript">
				jQuery(document).ready(function($) {
					$(".scroll").click(function(event){		
						event.preventDefault();
						$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
					});
				});
			</script>
</head>

<body>
<!-- start main1 -->
<div class="main_bg1">
<div class="wrap">	
	<div class="main1">
		 
         <span class="h_search">
    		<form>
    			<select>
  				  <option value="volvo">Demorcy</option>
                  <option value="saab">Art</option>
                  <option value="opel">programming</option>
                </select>
    			<input type="submit" value="">
    		</form>
		</span>
       <span> <h2>Category</h2> </span>
       
	</div>
</div>
</div>
<!-- start main -->
<div class="main_bg">
<div class="wrap">	
	<div class="main">
		<!-- start grids_of_3 -->
        	<div class="grids_of_3">
			<div class="grid1_of_3">
                            
				<a href="Details.jsp">
					<img src="images/pic1.jpg" alt=""/>
					<h3>branded shoes</h3>
					<div class="price">
						<h4>$300<span>Buy</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="Details.jsp">
					<img src="images/pic2.jpg" alt=""/>
					<h3>branded t-shirts</h3>
					<div class="price">
						<h4>$300<span>Buy</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="Details.jsp">
					<img src="images/pic3.jpg" alt=""/>
					<h3>branded tees</h3>
					<div class="price">
						<h4>$300<span>Buy</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="clear"></div>
		</div>
        
			
		<!-- end grids_of_3 -->
	</div>
</div>
</div>	
</body>
</html>	
      