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

	<li><a href="ProfileController">Profile</a></li>
	<li><a href="LogoutController">Sign Out</a></li>

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
          <li><a href="ReturnController"><h2>Return</h2></a></li>
          <li><a href="IssueController"><h2>Issue</h2></a></li>
	  <li><a href="NewArrController"><h2>New Arrivals</h2></a></li>
	<!--   <li><a href="Lost_book.html"><h2>Lost Book</h2></a></li>
	  <li><a href="donate_book.html"><h2>Donate Book</h2></a></li> -->
          <li class="last"><a href="LogoutController"><h2>Sign Out</h2></a></li>
        </ul>
      </nav>

    </aside>
    <!-- main content keep two contents -->
    <div id="content">
      <!-- section 1 -->
      <section>
        <!-- article 1 -->
        <article>
           <h2><a href='#'>Books to be returned</a></h2>
        </article>
        <!-- article 2 -->
      <br>
        </article>
<article>
          <!--link to the pending deliveries class-->
        <br>
        <br>
        <br>
        <br>
          <table>
            <tr>
              <th>Select</th>
              <th>Book Name</th>
              <th>Author</th>
              <th>Return date</th>

            </tr>
            <tr>
              <td><form action="">
<input type="checkbox">Create dialogBox to confirm removal
</form></td>
              <td>random</td>
              <td>random</td>
              <td>random</td>


            </tr>
            <tr>
              <td><form action="">
<input type="checkbox">Create dialogBox to confirm removal
</form></td>
              <td>random</td>
              <td>random</td>
              <td>random</td>


            </tr>
            <tr>
              <td><form action="">
  <input type="checkbox">Create dialogBox to confirm removal
  </form></td>
            <td>random</td>
            <td>random</td>
            <td>random</td>

            </tr>
            <tr>
              <td><form action="">
              <input type="checkbox">Create dialogBox to confirm removal
              </form></td>
              <td>random</td>
              <td>random</td>
              <td>random</td>

            </tr>
            <tr>
              <td><form action="">
              <input type="checkbox">Create dialogBox to confirm removal
              </form></td>
              <td>random</td>
              <td>random</td>
              <td>random</td>

            </tr>
            <tr>
              <td><form action="">
              <input type="checkbox">Create dialogBox to confirm removal
              </form></td>
              <td>random</td>
              <td>random</td>
              <td>random</td>

            </tr>
          </table>
          <br>
          <button type="button">Return</button>
          <p></p>
	  <p></p>
        </article>
<article>

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
