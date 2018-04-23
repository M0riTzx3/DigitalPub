<?php
/**
 * Created by IntelliJ IDEA.
 * User: AA94272
 * Date: 15.01.2018
 * Time: 09:16
 */

session_start();
$username = "";
$email = "";
$errors = array();


$db = mysqli_connect('185.223.30.88:3306', 'digPubAdm', '8Dd6235lqdFXHdJN', 'userdatabase');

if(isset($_POST['reg_user'])){
    $username = mysqli_real_escape_string($db. $_POST['username']);
    $email = mysqli_real_escape_string($db. $_POST['email']);
    $password_1 = mysqli_real_escape_string($db. $_POST['password_1']);
    $password_2 = mysqli_real_escape_string($db. $_POST['password_2']);



    if (empty($username)) { array_push($errors, "Username is required"); }
    if (empty($email)) { array_push($errors, "Email is required"); }
    if (empty($password_1)) { array_push($errors, "Password is required"); }
    if ($password_1 != $password_2) {
        array_push($errors, "The two passwords do not match");
    }


    // register user if there are no errors in the form
    if (count($errors) == 0) {
        $password = md5($password_1);//encrypt the password before saving in the database
        $query = "INSERT INTO users (username, email, password) 
  			  VALUES('$username', '$email', '$password')";
        mysqli_query($db, $query);
        $_SESSION['username'] = $username;
        $_SESSION['success'] = "You are now logged in";
        header('location: index.php');
    }

}