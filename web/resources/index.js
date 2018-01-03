
$(document).ready(function(){


    var counter = 0;

  $("#logInLink").click(function(){

    if (counter === 0) {
        // language=JQuery-CSS
        $("#loginForm").css("display","block");
        counter = 1;
    }else{
      $("#loginForm").css("display","none");
      counter = 0;
    }
  })

});
