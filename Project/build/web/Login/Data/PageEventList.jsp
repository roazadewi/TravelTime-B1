<%-- 
    Document   : PageEventList
    Created on : Nov 28, 2017, 12:15:34 PM
    Author     : Hari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
  body{
    background-image: url(img/backweb.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
<body>

<div class="flex-container">
<div class="headbar">
<header>
  <center><img class="logoweb" src="img/L210.png"></center>
</header>
</div>

<nav class="nav">
<ul>
   <br><br><br>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</li></a>
    <a href="pageinput.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="pagelist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="contentlist">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Event List</h1>
   <table class="tableeventlist">
      <tr>
          <th>NO</th>
          <th>Event Name</th>
          <th>Event Location</th>
          <th>Date & Time</th>
          <th>Edit</th>
      </tr>
      <tr>
          <td style="font-size: 14px;">1</td>
          <td style="font-size: 14px;">Pengawasan dan Pelatihan</td>
          <td style="font-size: 14px;">SMAN 20 BANDUNG</td>
          <td style="font-size: 14px;">21-09-2017, 17.00</td>
          <td><a href="edit.html"><input type="submit" name="" value="EDIT" style="background-color: grey; width: 50%; height: 5px; line-height: 2px;"></a><a href="pageedit.html"><input type="submit" name="" value="DELETE" style="background-color: red; width: 50%; height: 5px; line-height: 2px;"></a></td>
      </tr>
      <tr>
          <td style="font-size: 14px;">2</td>
          <td style="font-size: 14px;">Pengawasan dan Pelatihan</td>
          <td style="font-size: 14px;">SMpN 14 BANDUNG</td>
          <td style="font-size: 14px;">21-09-2017, 07.00</td>
          <td><a href="edit.html"><input type="submit" name="" value="EDIT" style="background-color: grey; width: 50%; height: 5px; line-height: 2px;"></a><a href="pageedit.html"><input type="submit" name="" value="DELETE" style="background-color: red; width: 50%; height: 5px; line-height: 2px;"></a></td>
      </tr>
      <tr>
          <td style="font-size: 14px;">3</td>
          <td style="font-size: 14px;">Pengawasan dan Pelatihan</td>
          <td style="font-size: 14px;">SMAN 21 BANDUNG</td>
          <td style="font-size: 14px;">21-09-2017, 12.00</td>
          <td><a href="edit.html"><input type="submit" name="" value="EDIT" style="background-color: grey; width: 50%; height: 5px; line-height: 2px;"></a><a href="pageedit.html"><input type="submit" name="" value="DELETE" style="background-color: red; width: 50%; height: 5px; line-height: 2px;"></a></td>
      </tr>
      </table>
  </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
