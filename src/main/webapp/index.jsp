<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
                <h1 class="wthree-logo">
                    <a href="/index" id="logoLink" data-blast="color">ToyStory</a>
                </h1>
                <div class="nav-item  position-relative">
                    <a href="#menu" id="toggle">
                        <span></span>
                    </a>
                    <div id="menu">
                        <ul>
                            <li><a data-blast="color" href="index.html">Home</a></li>
                            
                            <!-- <li><a data-blast="color" href="#portfolio" class="scroll">Portfolio</a></li> -->
                            <li><a data-blast="color" href="#services" class="scroll">Bestseller Products</a></li>
                            <li><a data-blast="color" href="#testi" class="scroll">Testimonials</a></li>
                            <li><a data-blast="color" href="aboutus.html">About us</a></li>
                            <li><a data-blast="color" href="#contact" class="scroll">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <!-- //header -->
        <!-- banner -->
        <div class="container-fluid">
            <div class="row banner-row">
                <div class="col-lg-8 bg-img text-center">
                    <h3 class="agile-title">Pick the best toy for your kid.</h3>
                    <div class="bnr-img">
                        <img src="images/toystory.png" alt="" class="img-fluid m-auto" />
                    </div>

                </div>
                <div class="col-lg-4  my-auto p-0">

                    <div id="login-row">
                        <h4>Login now!</h4>
                        <div id="login-column">
                            <div class="box">
                                <div class="shape1 shape-bg"></div>
                                <div class="shape2 shape-bg"></div>
                                <div class="shape3 shape-bg"></div>
                                <div class="shape4 shape-bg"></div>
                                <div class="shape5 shape-bg"></div>
                                <div class="shape6 shape-bg"></div>
                                <div class="shape7 shape-bg"></div>
                                
                                <div class="float">
                                    <form class="form" action="/indexdata" method="post">
                                        <div class="form-group">
                                            <label for="user">Select User type</label>
                                            <select name="role" id="user" required>
                                             <option value="#">Select user type</option>
                                                <option value="admin">Admin</option>
                                                <option value="customer">Customer</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="username">Username</label><br>
                                            <input type="text" name="username" id="username" class="form-control"
                                                placeholder="your name" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="password">Password</label><br>
                                            <input type="password" name="password" id="password" class="form-control"
                                                placeholder="*****" required>
                                        </div>
                                        <table>
                                            <tr>
                                                <td>
                                        <div class="form-group btn-agile" >
                                            <input type="submit" name="submit" class="btn btn-primary btn-md" value="login">
                                        </div>
                                    </td>
                                   
                                    </tr>
                                    </table>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //banner -->
    </div>
    <!-- about -->
    <section class="wthree-row py-sm-5 py-4 about-top" id="services">
        <div class="container pt-lg-5">
            <div class="title-section py-lg-5">
                <!-- <h4 data-blast="color">easy to start</h4> -->
                <h3 class="w3ls-title text-uppercase">Our Bestseller Products</h3>
            </div>
            <div class="agileits-top-row row py-md-5">
                <div class="col-lg-4 col-md-6 my-md-0 my-4">
                    <div class="agileits-about-grids">
                        <div class="bnr-img">
                            <img src="images/a1.webp" alt="" class="img-fluid m-auto" />
                        </div>
                        <h4>Toy Story E BUZZ ROLE PLAY COMMUNICATOR  (Multicolor)
                           
                        </h4>
                        <p>Width x Height: 11.11 cm x 20.32 cm
							Material: Plastic
							Non Battery Operated
							Character: Cartoon</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6  mb-lg-0 mb-4">
                    <div class="agileits-about-grids">
                        <!-- <span class="fa fa-picture-o" aria-hidden="true" data-blast="color"></span> -->
                        <div class="bnr-img">
                            <img src="images/a2.webp" alt="" class="img-fluid m-auto" />
                        </div>
                        <h4>Jada Disney Pixar Buzz Lightyear Radio Control Vehicle,(Multicolor)
                           
                        </h4>
                        <p> Sales Package
						Disney Pixar Toy Story 4 Turbo Buggy W/ Buzz  1: 2</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mx-auto">
                    <div class="agileits-about-grids">
                        <!-- <span class="fa fa-users" aria-hidden="true" data-blast="color"></span> -->
                        <div class="bnr-img">
                            <img src="images/a3.webp" alt="" class="img-fluid m-auto" />
                        </div>
                        <h4>FISHER-PRICE Imaginext Toy Story Buzz Lightyear & Jessie, Multicolor  (Multicolor)
                        </h4>
                        <p>Width x Height: 16.1 cm x 4.3 cm
							Material: Plastic
							Non Battery Operated
							Character: Actin Figure</p>
                    </div>
                </div>
            </div>
            <div class="agileits-top-row row pb-md-5">
                <div class="col-lg-4 col-md-6 my-md-0 my-4">
                    <div class="agileits-about-grids">
                        <!-- <span class="fa fa-book" aria-hidden="true" data-blast="color"></span> -->
                        <div class="bnr-img">
                            <img src="images/a4.webp" alt="" class="img-fluid m-auto" />
                        </div>
                        <h4>The Simplifiers Space Boys-Woody   (Multicolor)
                            
                        </h4>
                        <p>
							Width x Height: 10 cm x 21 cm
							Material: Plastic
							Battery Operated</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6  mb-lg-0 mb-4">
                    <div class="agileits-about-grids">
                        <!-- <span class="fa fa-briefcase" aria-hidden="true" data-blast="color"></span> -->
                        <div class="bnr-img">
                            <img src="images/a5.webp" alt="" class="img-fluid m-auto" />
                        </div>
                        <h4>Trunkin Toy Story Sausage Pig Bobblehead
                        </h4>
                        <p>Width x Height: 6 cm x 10 cm
							Material: PVC (Polyvinyl Chloride)
							Non Battery Operated
							Character: Sausage Pig
							Age: 3+ Years
                            <br>
                            <br>
                            <br>

                        </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 mx-auto">
                    <div class="agileits-about-grids">
                        <!-- <span class="fa fa-phone" aria-hidden="true" data-blast="color"></span> -->
                        <div class="bnr-img">
                            <img src="images/a6.webp" alt="" class="img-fluid m-auto" style="height:400px" />
                        </div>
                        <h4>RVM Toys Woody Toy Story Bobble Head Action Figure Toy Bobblehead Car/Office  (Multicolor)
                        </h4>
                        <p>
                            
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="about-bottom-agileinfo pb-lg-5">
        <div class="row  no-gutters align-items-center abbot-main">
            <div class="col-lg-6 about-grid-agileits py-5" data-blast="bgColor">
                <div class="about-grid">
                    <div class="container">
                        <div class="d-flex">
                            <div class="mx-auto">
                                <div class="title-section py-lg-5 pb-4">
                                    <h4>Power Tools</h4>
                                    <h3 class="w3ls-title text-uppercase text-white">unique features</h3>
                                </div>
                                <div class="wthree-list-grid d-flex flex-wrap">
                                    <div class="wthree-list-icon">
                                        <span class="fa fa-thumbs-up" aria-hidden="true"></span>
                                    </div>
                                    <div class="wthree-list-desc">
                                        <h5>vision</h5>
                                        <p>Consectetur adipiscing elit estibulum nibh urna.</p>
                                    </div>
                                </div>
                                <div class="wthree-list-grid d-flex flex-wrap">
                                    <div class="wthree-list-icon">
                                        <span class="fa fa-money" aria-hidden="true"></span>
                                    </div>
                                    <div class="wthree-list-desc">
                                        <h5>affordable</h5>
                                        <p>Elit consectetur adipiscing estibulum nibh urna.</p>
                                    </div>
                                </div>
                                <div class="wthree-list-grid d-flex flex-wrap">
                                    <div class="wthree-list-icon">
                                        <span class="fa fa-picture-o" aria-hidden="true"></span>
                                    </div>
                                    <div class="wthree-list-desc">
                                        <h5>quality</h5>
                                        <p>Consectetur adipiscing elit estibulum nibh urna.</p>
                                    </div>
                                </div>
                                <div class="wthree-list-grid d-flex flex-wrap">
                                    <div class="wthree-list-icon">
                                        <span class="fa fa-phone" aria-hidden="true"></span>
                                    </div>
                                    <div class="wthree-list-desc">
                                        <h5>24*7 support</h5>
                                        <p>Adipiscing consectetur elit estibulum nibh urna.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-6  py-5">
                <div class="rgrid-agileits">
                    <h4>"The best quality and the highest safety standards are particularly important Our designers
                         and product developers put all their skills and love into it"</h4>
                    <span class="about-line" data-blast="bgColor"></span>
                </div>
            </div>
        </div>
        
    </section>  -->
    <!-- testimonials Carousel -->
    <!-- contact -->
    <section class="wthree-row  w3-contact" id="contact">
        <div class="container py-5">
            <div class="title-section py-lg-5 text-center">
                <h4>24*7 support</h4>
                <h3 class="w3ls-title text-uppercase">contact us</h3>
            </div>
            <div class="row contact-form pt-5">
                <div class="offset-lg-2"></div>
                <div class="col-lg-8 wthree-form-left"> 
                    <!-- contact form grid -->
                    <fieldset class="contact-top1" data-blast="borderColor">
                        <legend class="text-dark mb-4 text-capitalize" data-blast="bgColor">send us a
                            note</legend>
                        <form action="/feedback" method="post" class="f-color">
                            <div class="form-group">
                                <label for="contactusername">Name</label>
                                <input type="text" class="form-control" id="contactusername" name ="name" required placeholder="Enter your name">
                            </div>
                            <div class="form-group">
                                <label for="contactemail">Email</label>
                                <input type="email" class="form-control" id="contactemail" name ="mail"  required placeholder="Enter your Email">
                            </div>
                            <div class="form-group">
                                <label for="contactcomment">Your Message</label>
                                <textarea class="form-control" rows="5" id="contactcomment"  name ="message" required placeholder="your message"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">Send</button>
                        </form>
                    </fieldset>  
                    <!--  //contact form grid ends here -->
                 </div>
                <div class="offset-lg-2"></div>
            </div>
            <div class="contact-form pt-5">
                <div class="row contact-bottom">
                    <div class="col-md-4">
                        <div class="address">
                            <h5 class="pb-3 text-capitalize" data-blast="color">Address</h5>
                            <address>
                                <p class="c-txt">90 Street, City, State 34789.</p>
                                <p class="c-txt">76 Street, City, State 34789.</p>
                            </address>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="address my-md-0 my-4">
                            <h5 class="pb-3 text-capitalize" data-blast="color">phone</h5>
                            <p>
                                +10 234 5678</p>
                            <p>
                                +11 222 333</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="address mt-md-0 mt-3">
                            <h5 class="pb-3 text-capitalize" data-blast="color">Email</h5>
                            <p>
                                <a href="mailto:info@example.com">mail@toystory.com</a>
                            </p>
                            <p>
                                <a href="mailto:info@example.com">mail@toystoryinfo.com</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
  
    <!-- footer -->
    <footer class="py-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <h2 class="agile-title"><a href="index.html" class="text-capitalize" data-blast="color">ToyStory</a></h2>
                </div>
                <div class="col-lg-3  mt-lg-0 mt-4">
                    <ul class="list-agileits">
                        <li>
                            <a href="index.html" class="text-secondary">
                                Home
                            </a>
                        </li>
                        <li class="my-3">
                            <a href="aboutus.html" class="text-secondary">
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