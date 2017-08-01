<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<title>Library Management System</title>
<meta charset="iso-8859-1">
<link rel="stylesheet" href="layout.css" type="text/css">

</head>
<body>
<div class="wrapper row1">
  <header id="header" class="clear">
<div id="hgroup">
      <h1><a href="HomeController">Library</a></h1>
      <h2><input type="text" name="search" placeholder="Search.."><h2>
    </div>
     <nav>
      <ul>

	<li><a href="#">Profile</a></li>
	<li><a href="#">Sign Out</a></li>

      </ul>
    </nav>
    <div class="clear"></div>
  </header>
</div>
<!-- change header names-->
<div class="wrapper row2">
  <div id="container">
    <!-- content body -->
    <aside id="left_column">
         <nav>
        <ul>
	<!-- cOLOUR CURRENT PAGE -->
	  <li><a href="HomeController"><h2>Home</h2></a></li>
	  <li><a href="ProfileController"><h2>Profile</h2></a></li>
          <li><a href="CurrentController"><h2>Current</h2></a></li>
          <li><a href="Return.html"><h2>Return</h2></a></li>
          <li><a href="Issue.html"><h2>Issue</h2></a></li>
	  <li><a href="New_arrivals.html"><h2>New Arrivals</h2></a></li>
	  <li><a href="Lost_book.html"><h2>Lost Book</h2></a></li>
	  <li><a href="donate_book.html"><h2>Donate Book</h2></a></li>
          <li class="last"><a href="#"><h2>Sign Out</h2></a></li>
        </ul>
      </nav>

    </aside>
    <!-- main content -->
    <div id="content">
      <!-- section 1 -->
      <section>
        <!-- article 1 -->
        <article>
          <h1><a href="#">Profile</a></h1>

        </article>
        <!-- article 2 -->

          <table>
            <tr>
              <td>
        <h4><br>First Name </h4></td><td><br>  <input type="text" name="first_name" value="Enter Your First Name" readonly></td></tr>
            <tr><td><br><h4>Last Name</h4></td><td><br>  <input type="text" name="last_name" value="Enter Your Last Name" readonly></td></tr>
          <tr><td><br><h4>Student ID</h4></td> <td> <br><input type="text" name="student_id" value="ID" readonly></td></tr>
            <tr><td><br><h4>Contact</h4></td><td><br>  <input type="text" name="mobile_no" value="Ph no" readonly></td></tr>
              <tr><td><br><h4>Address</h4></td><td> <br> <input type="text" name="address" value="Address" readonly></td></tr>
</table><br><br>
                <p><button type="button"><a href="editprofile">Edit</a></button>                             <button type="button"><a href="Password.html">Change Password</a></button></p>



        <!-- / articles -->
      </section>


    </div>
    <!-- / content body -->
    <div class="clear"></div>
  </div>
</div>
<!-- footer -->
<div class="wrapper row3">
  <footer id="footer">
    <p class="fl_left">Contact Us</p> <!--make block size absolute -->
    <p class="fl_right">By group_names</a></p>
    <div class="clear"></div>
  </footer>
</div>
</body>
</html>