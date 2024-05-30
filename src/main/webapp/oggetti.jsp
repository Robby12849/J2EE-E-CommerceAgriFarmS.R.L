<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
<html lang="en">

<head>
    <!-- ========== Meta Tags ========== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Agrul - Organic Farm Agriculture Template">

    <!-- ========== Page Title ========== -->
    <title>AGRIFARM S.R.L | Catalogo</title>

    <!-- ========== Favicon Icon ========== -->
    <link rel="shortcut icon" href="assets/img/favicon.png" type="image/x-icon">

    <!-- ========== Start Stylesheet ========== -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/css/themify-icons.css" rel="stylesheet">
    <link href="assets/css/elegant-icons.css" rel="stylesheet">
    <link href="assets/css/flaticon-set.css" rel="stylesheet">
    <link href="assets/css/magnific-popup.css" rel="stylesheet">
    <link href="assets/css/swiper-bundle.min.css" rel="stylesheet">
    <link href="assets/css/animate.css" rel="stylesheet">
    <link href="assets/css/validnavs.css" rel="stylesheet">
    <link href="assets/css/helper.css" rel="stylesheet">
    <link href="assets/css/shop.css" rel="stylesheet">
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/unit-test.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    <!-- ========== End Stylesheet ========== -->

</head>

<body>

    <!--[if lte IE 9]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
    <![endif]-->

    <!-- Preloader Start -->
    <div class="se-pre-con"></div>
    <!-- Preloader Ends -->

    <!-- Header 
    ============================================= -->
    <header>
        <!-- Start Navigation -->
        <nav class="navbar mobile-sidenav inc-shape navbar-common navbar-sticky navbar-default validnavs">

            <div class="container-full d-flex justify-content-between align-items-center">            
                

                <!-- Start Header Navigation -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                        <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand" href="index.html">
                        <img src="assets/img/logo.png" class="logo" alt="Logo">
                    </a>
                </div>
                <!-- End Header Navigation -->

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-menu">

                    <img src="assets/img/logo.png" alt="Logo">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                        <i class="fa fa-times"></i>
                    </button>


<ul class="nav navbar-nav navbar-left" data-in="fadeInDown" data-out="fadeOutUp">
    <li class="dropdown"><a href="index.html">Home</a></li>
    <li class="dropdown"><a href="catalogo.jsp">Catalogo</a></li>
    <li class="dropdown"><a href="visualallogg">Catalogo completo</a></li>
    <li class="dropdown"><a href="orariap.jsp">Orari apertura</a></li>
    <li class="dropdown"><a href="login.jsp">Storico Ordini</a></li>
    <li class="dropdown"><a href="contatti.jsp">Contatti</a></li>
    <li class="dropdown"><a href="visualizzafeedback">Feedback</a></li>
    <li class="dropdown"><a href="visualizzacarrello">Carrello</a></li>
                            </ul>
                    
                </div><!-- /.navbar-collapse -->
                </div>
                <!-- Main Nav -->
            </div> 

            <!-- Overlay screen for menu -->
            <div class="overlay-screen"></div>
            <!-- End Overlay screen for menu -->
            
        </nav>
        <!-- End Navigation -->
    </header>
    <!-- End Header -->
    
    
         <!-- Start Breadcrumb 
    ============================================= -->
    <div class="breadcrumb-area text-center shadow dark bg-fixed text-light" style="background-image: url(assets/img/image/redsfondo.jpg);">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 offset-lg-2">
                    <h1>Prodotti</h1>
                </div>
            </div>
        </div>
    </div>
    <!-- End Breadcrumb -->
    
    <!-- Start Contact Us 
    ============================================= -->
    <div class="contact-area default-padding" style="background-image: url(assets/img/shape/28.png);">
        <div class="container">
            <div class="row align-center">
                
                <table class="styled-table">
                    <thead>
                        <tr>
    <th>Famiglia</th>
    <th>Marca</th>
    <th>Descrizione</th>
    <th>Potenza(cv)</th>
    <th>Costo</th>
    <th>Foto</th>
    <th>Acquisto</th>
                        </tr>
<c:forEach var="strumento" items="${strumenti}">
    <tr>
        <td>${strumento.famiglia}</td>
        <td>${strumento.marca}</td>
        <td>${strumento.modello}</td>
        <td>${strumento.potenza}</td>
        <td>${strumento.costo}</td>
        <td><img src='${strumento.linkfoto}' width=10% /></td>
        <td><a href="insertpagapp?id_strumento=${strumento.id_strumento}">Acquista</a></td>
    </tr>
</c:forEach>
                    </thead>
                    <tbody>
                       
                    </tbody>
                </table>
   

            </div>
        </div>
    </div>
    <!-- End Contact -->
    
    


    <!-- Start Footer 
    ============================================= -->
    <footer class="bg-dark text-light" style="background-image: url(assets/img/shape/brush-down.png);">
        <div class="container">
            <div class="f-items default-padding">
                <div class="row">
                    
                    <!-- Single Itme -->
                    <div class="col-lg-4 col-md-6 item">
                        <div class="footer-item about">
                            <img class="logo" src="assets/img/logo.png" alt="Logo">
                        </div>
                    </div>
                    <!-- End Single Itme -->

            

                                       <!-- Single Itme -->
                                       <div class="col-lg-3 col-md-6 item">
                                        <div class="footer-item contact">
                                            <h4 class="widget-title">Contattaci</h4>
                                            <ul>
                                                <li>
                                                    <div class="icon">
                                                        <i class="fas fa-home"></i>
                                                    </div>
                                                    <div class="content">
                                                        <strong>Indirizzo:</strong>
                                                         Via Manzoni, 15
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="icon">
                                                        <i class="fas fa-envelope"></i>
                                                    </div>
                                                    <div class="content">
                                                        <strong>Email:</strong>
                                                        <a href="mailto:agrifarm@gmail.com">agrifarm@gmail.com</a>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="icon">
                                                        <i class="fas fa-phone"></i>
                                                    </div>
                                                    <div class="content">
                                                        <strong>Phone:</strong>
                                                        <a href="tel:347 710 3873">+39 347 710 3873</a>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <!-- Single Itme -->
                    
                </div>
            </div>
        </div>
    </footer>
    <!-- End Footer -->
    
    <!-- jQuery Frameworks
    ============================================= -->
    <script src="assets/js/jquery-3.6.0.min.js"></script>
    <script src="assets/js/bootstrap.bundle.min.js"></script>
    <script src="assets/js/jquery.appear.js"></script>
    <script src="assets/js/jquery.easing.min.js"></script>
    <script src="assets/js/jquery.magnific-popup.min.js"></script>
    <script src="assets/js/modernizr.custom.13711.js"></script>
    <script src="assets/js/swiper-bundle.min.js"></script>
    <script src="assets/js/wow.min.js"></script>
    <script src="assets/js/progress-bar.min.js"></script>
    <script src="assets/js/circle-progress.js"></script>
    <script src="assets/js/isotope.pkgd.min.js"></script>
    <script src="assets/js/imagesloaded.pkgd.min.js"></script>
    <script src="assets/js/jquery.nice-select.min.js"></script>
    <script src="assets/js/count-to.js"></script>
    <script src="assets/js/jquery.scrolla.min.js"></script>
    <script src="assets/js/YTPlayer.min.js"></script>
    <script src="assets/js/TweenMax.min.js"></script>
    <script src="assets/js/validnavs.js"></script>
    <script src="assets/js/main.js"></script>

</body>
</html>