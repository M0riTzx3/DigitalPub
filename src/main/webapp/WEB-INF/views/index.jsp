<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html id="content" lang="de">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta charset="utf-8">
  <title>DigitalPub</title>
  <meta name="description" content="">
  <meta name="author" content="">
  <meta name="keywords" content="">
  <link href="<c:url value="/resources/Startseite.css" />" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-latest.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <script src="<c:url value="/resources/index.js" />"></script>

</head>
<body>
<div class="container-full">
  <nav>
    <ul class="nav nav-pills float-right" style="float: right">
      <li class="nav-item ">
        <a class=" nav-link active" href="#"> <span class="glyphicon glyphicon-home"></span> Home</a>
      </li>
      <li  class="nav-item">
        <a id="signUpLink" href="${pageContext.request.contextPath}/signUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
      </li>
      <li class="nav-item">
        <a id="logInLink" href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a>
      </li>
    </ul>

  </nav>

  <div class="row">

    <div class="col-md-4 text-center v-center">
    </div>
    <div class="col-md-4 text-center v-center">
      <br>
      <h1>DigitalPub</h1>
      <p class="lead">A place to meet online</p>

      <br>
    </div>
    <div class="col-md-4 text-center v-center">
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
    <div class="col-md-4">
      <div class="panel panel-default">
        <div class="panel-heading"><h3>Communication</h3></div>
        <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate.
          Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis
          dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan.
          Aliquam in felis sit amet augue.
        </div>
      </div>
    </div>
    <div class="col-md-4">
      <div class="panel panel-default">
        <div class="panel-heading"><h3>Games</h3></div>
        <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate.
          Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis
          dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan.
          Aliquam in felis sit amet augue.
        </div>
      </div>
    </div>
    <div class="col-md-4">
      <div class="panel panel-default">
        <div class="panel-heading"><h3>Hello.</h3></div>
        <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate.
          Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis
          dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan.
          Aliquam in felis sit amet augue.
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
