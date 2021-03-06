
<%--
  Created by IntelliJ IDEA.
  User: AA94272
  Date: 22.12.2017
  Time: 08:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<?php include('server.php') ?>
<html id="content" lang="de">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta charset="utf-8">
    <title>DigitalPub</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="<c:url value="/resources/login.css" />" rel="stylesheet">

    <meta name="keywords" content="">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script src="<c:url value="/resources/index.css" />"></script>
    <script src="jquery-ui.min.js"></script>
</head>
<body>
<div class="container-full">
    <nav>
        <ul class="nav nav-pills float-right" style="float: right">
            <li class="nav-item ">
                <a class="nav-link active" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a id="logInLink" href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a>
            </li>
        </ul>
        <form id="loginForm" class="form-signin">
            <h2 id="loginHeader" class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="" type="email">
            <label for="inputPassword" class="sr-only">Password</label>
            <input id="inputPassword" class="form-control" placeholder="Password" required="" type="password">
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




</div> <!-- /container full -->
<div>
    <br><br>
    <form action="/signUp" th:object="${user}" method="post">
        <div class="col-md-12 text-center" id="signUpWrapper">
            <div class="input-group input-group-md col-sm-offset-4 col-sm-4">
                <input th:field="*{username}" name="email" type="email" class="center-block form-control input-lg"  title="Enter you email." placeholder="Enter your email address">
            </div>
            <br>
            <div class="input-group input-group-md col-sm-offset-4 col-sm-4">
                <input th:field="*{nickname}" name="nickname" type="text" class="center-block form-control input-lg" title="Enter nickname" placeholder="Enter nickname">
            </div>
            <br>
            <div class="input-group input-group-md col-sm-offset-4 col-sm-4">
                <input th:field="*{password}" name="password" type="password" class="center-block form-control input-lg" title="Enter password" placeholder="Enter password">
            </div>
            <br>
            <div class="input-group input-group-md col-sm-offset-4 col-sm-4">
                <input th:field="*{repeatedPassword}" name="repeatedPassword" type="password" class="center-block form-control input-lg" title="Repeat password" placeholder="Repeat password">
            </div>
            <br>
            <span class="input-group-btn"><button class="btn btn-lg btn-primary" type="submit">Sign Up</button></span>
        </div>
    </form>

</div>
</body>
<br><hr>

<footer class="footer">
    <p class="float-right"><a href="#">Back to top</a></p>
    <p>© 2017 DigitalPub, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>
</footer>

</html>

