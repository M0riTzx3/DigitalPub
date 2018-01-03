<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html id="content" lang="de">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta charset="utf-8">
    <title>Success :)</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="keywords" content="">
    <link href="<c:url value="/resources/Startseite.css" />" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script src="<c:url value="/resources/index.js" />"></script>

</head>
<body>
<div class="container-full">
    <nav>
        <ul class="nav nav-pills float-right" style="float: right">
            <li class="nav-item ">
                <a class="nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
                <a id="logInLink"><span class="glyphicon glyphicon-log-in"></span> Login</a>
            </li>
        </ul>
        <form id="loginForm"  class="form-signin">
            <h2 id="loginHeader" class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input id="inputEmail" name="email" class="form-control" placeholder="Email address" required="" autofocus="" type="email">
            <label for="inputPassword" class="sr-only">Password</label>
            <input id="inputPassword" name="password" class="form-control" placeholder="Password" required="" type="password">
            <div class="checkbox">
                <label>
                    <input value="remember-me" type="checkbox"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </nav>

    <div class="row">

        <div class="col-lg-12 text-center v-center">
            <h1>DigitalPub</h1>
            <p class="lead">A place to meet online</p>

            <br>
        </div>

    </div> <!-- /row -->

    <div class="row">

        <div class="col-lg-12 text-center v-center" style="font-size:39pt;">
            <a href="#"><i class="icon-google-plus"></i></a> <a href="#"><i class="icon-facebook"></i></a>  <a href="#"><i class="icon-twitter"></i></a> <a href="#"><i class="icon-github"></i></a> <a href="#"><i class="icon-pinterest"></i></a>
        </div>

    </div>

    <br><br><br><br><br>

</div> <!-- /container full -->

<div class="container">

    <hr>

    <div class="row">
        <div class="col-md-4 v-center">
            <div class="panel panel-default">
                <div class="panel-heading"><h3>Successful signed up</h3></div>
                <div class="panel-body">User was created. Please Log in now!
                </div>
            </div>
        </div>
    </div>
    <hr>
</div>
</body>
<footer>
    <p class="float-right"><a href="#">Back to top</a></p>
    <p>© 2017 DigitalPub, Inc. · <a href="/privacy">Privacy</a> · <a href="/terms">Terms</a></p>
</footer>

</html>
