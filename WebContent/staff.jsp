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
    <form action="StaffController" method="post" onsubmit="return validateRegister()" > <!-- name="myform2" class="register-form"    -->
      
      <input type="text" placeholder="Staff ID" name="staff_id"/><span id="sid"></span>
      <input type="text" placeholder="First Name" name="first_name"/><span id="n1"></span>
      <input type="text" placeholder="Last Name" name="last_name"/><span id="n2"></span>
      <input type="text" placeholder="Designation" name="designation"/><span id="n3"></span>
      <input type="text" placeholder="Department" name="dept_name"/><span id="n4"></span>
      <input type="text" placeholder="Department no" name="dept_no"/><span id="n5"></span>
      <input type="text" placeholder="Address Line 1" name="address1"/>
      <input type="text" placeholder="Address Line 2" name="address2"/><span id="aid"></span>
      <input type="text" placeholder="Mobile No" name="mobile_no"/><span id="mid"></span>
      <input type="password" placeholder="Password" name="password"/><span id="pass1id"></span>
      <input type="password" placeholder="Confirm Password" name="password2"/><span id="passid"></span>
      <button>create</button>
      <p class="message">Already registered? <a href="login.jsp">Sign In</a></p>
    </form>
    
  </div>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script type="text/javascript" >


	
	
	
	function validateRegister(){  
		var k = 0;
		var num=document.myform2.mobile_no.value;
		var sid=document.myform2.staff_id.value; 
		var name1=document.myform2.first_name.value;
		var name2=document.myform2.last_name.value;
		var desig = document.myform2.designation.value;
		var dept_no2 = document.myform2.dept_no.value;
		var dept_name2 = document.myform2.dept_name.value;
		var ad=document.myform2.address1.value;
		var firstpassword=document.myform2.password.value;  
		var secondpassword=document.myform2.password2.value;  
		
		if (sid==null || sid=="")
			{
			 document.getElementById("sid").innerHTML="Staff Id can't be blank";k=1; 
			}
		if (name1==null || name1=="")
		{
		 document.getElementById("n1").innerHTML="First Name can't be blank";k=1; 
		}
		if (desig==null || desig=="")
		{
		 document.getElementById("n3").innerHTML="Designation can't be blank";k=1; 
		}
		if (dept_name2==null || dept_name2=="")
		{
		 document.getElementById("n4").innerHTML="First Name can't be blank";k=1; 
		}
		if (name2==null || name2=="")
		{
		 document.getElementById("n2").innerHTML="Last Name can't be blank";k=1; 
		}
		if (ad==null || ad=="")
		{
		 document.getElementById("aid").innerHTML="Address can't be blank";k=1; 
		}
		if(isNan(dept_no2))
			{
			document.getElementById("n5").innerHTML="Enter Numeric value only"; k=1;
			}
		if (isNaN(num)){  
		  document.getElementById("mid").innerHTML="Enter Numeric value only"; k=1; 
		} 
		
	    if(firstpassword.length<6){  
			document.getElementById("pass1id").innerHTML="Password must be at least 6 characters long."; k=1; 
		}
		if(firstpassword!=secondpassword){  
			document.getElementById("passid").innerHTML="Password doesn't match"; k=1; 
			}
		
		
		if(k==1) return false;
		else return true;
		   
		}  
    </script>

</body>
</html>