<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>my login </title>

 <link rel="stylesheet" href="style.css">


</head>
<body>
<div  class="login-page">
  <div class="form">
   
    <form action="Login" name="myform" class="login-form" method="post" onsubmit="return validateLogin()">
      <div style="color: #FF0000;">${errorMessage}</div>
      <div style="color: #008000;">${successMessage}</div>
      <input type="text"placeholder="name" name="username" />
      <input type="password" placeholder="password" name="pass"/>
      <button>login</button>
      <p class="message">Not registered? <a href = "#" id = "To" onclick='myFunction()'>Create an account</a></p>
    </form>
  </div>
</div>
<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <div class="modal-header">
      <span class="close">&times;</span>
      <h2>Select Role</h2>
    </div>
    <div class="modal-body">
     <form  action="Role" method="post" > 
  <input type="radio" name="role" value="staff" checked> Staff<br>
  <input type="radio" name="role" value="student"> Student<br>
  <input type="radio" name="role" value="delivery"> Delivery 

    </div>
    <div class="modal-footer">
      <!-- <a href="" onclick='myFunction()' id="myLink">Submit</a> -->
      <input type = "submit" value = "Submit"/> 
      
      </form> 
      
    </div>
  </div>

</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script type="text/javascript" >


var modal = document.getElementById('myModal');
var btn = document.getElementById("To");
var span = document.getElementsByClassName("close")[0];

btn.onclick = function() {

    modal.style.display = "block";
//}*/
}
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

/* function myFunction() {
	   
    if(document.getElementById('staff').checked) {
        document.getElementById('myLink').href = "/Login";
    }
} */

	function validateLogin(){  
		var name=document.myform.username.value;  
		var password=document.myform.pass.value;  
		  
		if (name==null || name==""){  
		  alert("Name can't be blank");  
		  return false;  
		}else if(password.length<6){  
		  alert("Password must be at least 6 characters long.");  
		  return false;  
		  }  
		}  
	
	 
    </script>

</body>
</html>