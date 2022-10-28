<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>ToyStore</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8" />
    <meta name="keywords" content="Palette Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />

   

    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- Custom Theme files -->
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
    <!-- color switch -->
    <link href="css/blast.min.css" rel="stylesheet" />
    <!-- lightbox -->
    <link rel="stylesheet" href="css/lightbox.min.css">
    <!-- portfolio -->
    <link rel="stylesheet" href="css/portfolio.css">
    <!-- font-awesome icons -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- //Custom Theme files -->
    <!-- online-fonts -->
    <link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

        <style>
            table,td,th{
                
                padding: 15px;
                padding-left: 20px;
                margin-left: 300px;
                
            }
            tr:nth-child(even) {
                background-color: #99ebff;
            }
            th,td{
                border-bottom: 1px solid #99ebff;
            }
        </style>
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
    <div class="blast-box">
        <div class="blast-frame">
            <p>color schemes</p>
            <div class="blast-colors d-flex justify-content-center">
                <div class="blast-color">#25e0ff</div>
                <div class="blast-color">#feb800</div>
                <div class="blast-color">#f25050</div>
                <div class="blast-color">#18e7d3</div>
                <!-- you can add more colors here -->
            </div>
            <p class="blast-custom-colors">Choose Custom color</p>
            <input type="color" name="blastCustomColor" value="#cf2626">

        </div>
        <div class="blast-icon"><i class="fa fa-cog" aria-hidden="true"></i></div>

    </div>
    <div id="home" class="banner" data-blast="bgColor">
        <!-- header -->
        <nav class="navbar fixed-top navbar-expand-lg navbar-light navbar-fixed-top">
            <div class="container">
                <div class="bnr-img">
                    <img src="images/toystory.png" alt="" class="img-fluid " width="120px" height="50px" />
                </div>
                <h1 class="wthree-logo">
                    <a href="welcomeAdmin.jsp" id="logoLink" data-blast="color">ToyStory</a>
                </h1>
                
                <div class="nav-item  position-relative">
                    <a href="#menu" id="toggle">
                        <span></span>
                    </a>
                    <div id="menu">
                        <ul>
                            <li><a data-blast="color" href="/admin">Home</a></li>
                            <li><a data-blast="color" href="/addproduct">Add Product</a></li>
                            <li><a data-blast="color" href="/deleteproduct">Delete Product</a></li>
                            <li><a data-blast="color" href="/updateproduct">Update Product</a></li>
                            <li><a data-blast="color" href="/viewdata">View all products</a></li>
                            <li><a data-blast="color" href="/viewfeedback">Feedbacks</a></li>
                            <li><a data-blast="color" href="/index">Logout</a></li>
                        </ul>
                    </div>
                    
                </div>
            </div>
        </nav>
        <!-- //header -->
        <!-- banner -->
        <div class="container-fluid">
            
                <div class="bg-img text-center">
                   <h3>&#128420 Customer Feedback &#128420</h3>
                   <hr>
                   
                   <table>
                    <tr>
                        
                        <th>Mail ID</th>
                        <th>Name</th>
                        <th>Message</th>
                        <th>Delete</th>
                        
                    </tr>
                    
                        <c:forEach items ="${feedbacks}" var = "element">
                        <tr>
                            
                            <td>${element.name}</td>
                            <td style="word-wrap:break-word ;">${element.mail}</td>
                            <td style="word-wrap:break-word; max-width: 300px;">${element.message}</td>
                          <td><form method="post" action="/deletefeedback/${element.fid}">
                            <input type="hidden" name="_method" value="delete">
                            <a onclick="this.parentNode.submit();">
                            <button style="border: none; font-size: 20px;"> &#10060</button>
                            </a>
							</form></td>
                            </tr>
                            </c:forEach>
                    
                   </table>
                   <br>
                   <br>
                </div>
                
                
                    
                    
                </div>
            </div>
    
    
    <!-- //contact -->
  
    <!-- footer -->
    <footer class="py-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <h2 class="agile-title"><a href="WelcomeAdmin.jsp" class="text-capitalize" data-blast="color">ToyStory</a></h2>
                </div>
                <div class="col-lg-3  mt-lg-0 mt-4">
                    <ul class="list-agileits">
                        <li>
                            <a href="WelcomeAdmin.jsp" class="text-secondary">
                                Home
                            </a>
                        </li>
                        <li class="my-3">
                            <a href="aboutus.jsp" class="text-secondary">
                                About Us
                            </a>
                        </li>
                        <li>
                            <a href="#contact" class="scroll text-secondary">
                                Contact Us
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-3 mt-lg-0 my-4">
                    <div class="fv3-contact">
                        <span class="fa fa-envelope-open mr-2" data-blast="color"></span>
                        <p>
                            <a href="mailto:example@email.com" class="text-secondary">info@example.com</a>
                        </p>
                    </div>
                    <div class="fv3-contact my-3">
                        <span class="fa fa-phone mr-2" data-blast="color"></span>
                        <p class="text-secondary">+1234567890</p>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="subscribe-grid">
                        <h6 class="footer-wthree text-secondary">Subscribe to newsletter</h6>
                        <form action="#" method="post" class="form-inline mt-3 border-bottom">
                            <input type="email" placeholder="Your Email" name="Subscribe" required="">
                            <button class="btn1">
                                <i class="fa fa-paper-plane" data-blast="color"></i>
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- //footer -->
    <div class="cpy-right text-center py-2" data-blast="bgColor">
        <p class="text-dark">All rights reserved | Design by
            <a href="#" class="text-white"> Harshita T.</a>
        </p>
    </div>
    <!-- js -->
    <script src="js/jquery-2.2.3.min.js"></script>
    <!-- //js -->
    <!--  menu toggle -->
    <script src="js/menu.js"></script>
    <!-- color switch -->
    <script src="js/blast.min.js"></script>
    <!-- light box -->
    <script src="js/lightbox-plus-jquery.min.js"></script>
    <!-- Scrolling Nav JavaScript -->
    <script src="js/scrolling-nav.js"></script>
    <!-- start-smooth-scrolling -->
    <script src="js/move-top.js"></script>
    <script src="js/easing.js"></script>
    <script>
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();

                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!-- //end-smooth-scrolling -->
    <!-- smooth-scrolling-of-move-up -->
    <script>
        $(document).ready(function () {
            /*
            var defaults = {
                containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear' 
            };
            */

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <script src="js/SmoothScroll.min.js"></script>
    <!-- //smooth-scrolling-of-move-up -->
    <!-- Bootstrap core JavaScript
================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>