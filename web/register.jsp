<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
    <head>
        <title>The Aditii Website Template | Contact :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700' rel='stylesheet' type='text/css'>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script> 
        <!-- start top_js_button -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function($) {
                $(".scroll").click(function(event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1200);
                });
            });
        </script>
    </head>
    <body>
        <!-- start main -->
        <div class="main_bg">
            <div class="wrap">	
                <div class="main">
                    <span class="contact">
                        <span class="contact-form">
                            <h2>Register</h2>


                            <form method="get" action="jsp_project/RegistrationHandler">
                                <div>
                                    <span><label>Email</label></span>
                                    <span><input name="email" type="email"  required class="textbox"></span>
                                </div>
                                <div>
                                    <span><label>Password</label></span>
                                    <span><input name="password" type="password" required class="textbox"></span>
                                </div>
                                <div>
                                    <span><label>Confirm Password</label></span>
                                    <span><input name="confirmPassword" type="password" required  class="textbox"></span>
                                </div>

                                <div>

                                    <span><label>Mobile Number </label></span>
                                    <span><input name="mobileNumber" type="tel" pattern="\d+[13]" class="textbox"></span>
                                </div>

                                <div>
                                    <span><label>Birthday</label></span>
                                    <span><input name="birthday" type="date" placeholder="yyyy-mm-dd" required></span>
                                </div>
                                <div>
                                    <span><label>Name </label></span>
                                    <span><input name="userFullName" type="text"  required class="textbox"></span>
                                </div>
                                <div>
                                    <span><label>Job</label></span>
                                    <span><input name="userJob" type="text"  maxlength="20" class="textbox"></span>
                                </div>
                                <div>
                                    <span><label>Address</label></span>
                                    <span><input name="userAddress" type="text" maxlength="100" class="textbox"></span>
                                </div>
                                <div>
                                    <span><label>Credit</label></span>
                                    <span><input name="credit" type="text" required pattern = "[0-9]{1,4}" maxlength="4" class="textbox"></span>
                                </div>


                                <div>
                                    <span>
                                        <label>Interests</label></span>
                                    <span><select name="categories" multiple>

                                           
                                        </select>
                                    </span>
                                </div>
                                <div>
                                    <span><input type="submit" class="" value="Register"></span>
                                </div>
                            </form>
                        </span>
                        <div class="clear"></div>		
                    </span>

                </div>
            </div>
        </div>
    </body>
</html> 