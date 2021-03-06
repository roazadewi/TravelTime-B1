package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("   <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag\"></script>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("  body{\r\n");
      out.write("    background-image: url(img/backweb.jpg);/*call image*/\r\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\r\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\r\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\r\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"flex-container\">\r\n");
      out.write("<div class=\"headbar\">\r\n");
      out.write("<header>\r\n");
      out.write("  <center><img class=\"logoweb\" src=\"img/L210.png\"></center>\r\n");
      out.write("</header>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"nav\">\r\n");
      out.write("<ul>\r\n");
      out.write("   <br><br><br>\r\n");
      out.write("    <a href=\"#\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">home</i>Dashboard</li></a>\r\n");
      out.write("    <li class=\"pilih\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">add</i>Create Schedule</li>\r\n");
      out.write("    <a href=\"pagelist.html\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">done</i>Finished Task</li></a>\r\n");
      out.write("    <a href=\"pageeventlist.html\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">list</i>Event List</li></a>\r\n");
      out.write("    <a href=\"#\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">build</i>Manage</li></a>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<article class=\"article\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("  <div id=\"main\">                                         \r\n");
      out.write("  <br><br><br><br><br>\r\n");
      out.write("  <h1 class=\"judul\">Create Schedule</h1>\r\n");
      out.write("    <div class=\"widget\">\r\n");
      out.write("    <div class=\"title\"><b>Detail</b></div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Nama Event____________________________-->\r\n");
      out.write("    <div class=\"namaevent\">\r\n");
      out.write("      <h1 class=\"hnamaevent\">Event Name :</h1>\r\n");
      out.write("      <input type=\"text\" id=\"fname\" name=\"nama_event\" placeholder=\"Input Event Name\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Waktu Event____________________________-->\r\n");
      out.write("    <div class=\"waktu\">\r\n");
      out.write("      <h1 class=\"hwaktu\">Event Time :</h1>\r\n");
      out.write("      <!--____________________________Form input waktu awal____________________________-->\r\n");
      out.write("      <input type=\"datetime-local\" name=\"waktu_mulai\" placeholder=\"start time\"> <i>&nbsp;until&nbsp;</i>\r\n");
      out.write("      <!--____________________________Form input waktu akhir--> \r\n");
      out.write("      <input type=\"datetime-local\" name=\"waktu_selesai\" placeholder=\"End time\">   \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Awal____________________________-->\r\n");
      out.write("    <div class=\"LokasiAwal\">\r\n");
      out.write("      <div class=\"title\"><b><br>Location</b></div>\r\n");
      out.write("      <form id=\"calculate-route\" name=\"calculate-route\" action=\"#\" method=\"get\">\r\n");
      out.write("            <h1 class=\"hlokasiawal\">Start Location :</h1>\r\n");
      out.write("            <input type=\"text\" id=\"from\" name=\"from\" required=\"required\" placeholder=\"lokasi awal\" size=\"30\" />\r\n");
      out.write("            <a id=\"from-link\" href=\"#\">Posisi sekarang</a>\r\n");
      out.write("            <div class=\"LokasiAkhir\">\r\n");
      out.write("                <h1 class=\"hlokasiakhir\">End Location :</h1>\r\n");
      out.write("                <input type=\"text\" id=\"to\" name=\"to\" required=\"required\" placeholder=\"lokasi akhir\" size=\"30\" />\r\n");
      out.write("            <input type=\"text\" id=\"latAwal\">\r\n");
      out.write("            <input type=\"text\" id=\"longAwal\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" id=\"latAkhir\">\r\n");
      out.write("            <input type=\"text\" id=\"longAkhir\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" id=\"startName\">\r\n");
      out.write("            <input type=\"text\" id=\"endName\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"submit\" value=\"cari lokasi\" id=\"cari\"/>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div id=\"map\"></div>\r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Nama Event____________________________-->\r\n");
      out.write("    <div class=\"keteranganevent\">\r\n");
      out.write("      <h1 class=\"hketevent\">Event Description :</h1>\r\n");
      out.write("      <input type=\"text\" id=\"fname\" name=\"keterangan\" placeholder=\"Input Event Description\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--____________________________Form Inputan Transportasi____________________________-->   \r\n");
      out.write("    <div class=\"Transportasi\">\r\n");
      out.write("      <h1 class=\"htransportasi\">Transportation :</h1>\r\n");
      out.write("      <div class=\"tab\">\r\n");
      out.write("        <button class=\"tablinks\" onclick=\"openCity(event, 'Umum')\" id=\"defaultOpen\">Umum</button>\r\n");
      out.write("        <button class=\"tablinks\" onclick=\"openCity(event, 'Pribadi')\">Pribadi</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        var markerStart;\r\n");
      out.write("      var markerEnd;\r\n");
      out.write("      var messagewindow;\r\n");
      out.write("      function initMap() {\r\n");
      out.write("        var directionsService = new google.maps.DirectionsService;\r\n");
      out.write("        var directionsDisplay = new google.maps.DirectionsRenderer;\r\n");
      out.write("        var avoidToll = true;\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 13,\r\n");
      out.write("          center: {lat: -6.914744, lng: 107.609810}\r\n");
      out.write("        });\r\n");
      out.write("        //AutoComplete\r\n");
      out.write("        var inputStart = document.getElementById('start');\r\n");
      out.write("        var inputEnd = document.getElementById('end');\r\n");
      out.write("        var searchBoxStart = new google.maps.places.SearchBox(inputStart);\r\n");
      out.write("        var searchBoxEnd = new google.maps.places.SearchBox(inputEnd);\r\n");
      out.write("        \r\n");
      out.write("        map.addListener('bounds_changed', function() {\r\n");
      out.write("          searchBoxStart.setBounds(map.getBounds());\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        map.addListener('bounds_changed', function() {\r\n");
      out.write("          searchBoxEnd.setBounds(map.getBounds());\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        //--- end of auto complete --\r\n");
      out.write("        directionsDisplay.setMap(map);\r\n");
      out.write("\r\n");
      out.write("        messagewindow = new google.maps.InfoWindow({\r\n");
      out.write("          content: document.getElementById('message')\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        var geocoder = new google.maps.Geocoder();\r\n");
      out.write("          \r\n");
      out.write("        var onChangeHandler = function() {\r\n");
      out.write("          avoidToll = true;\r\n");
      out.write("          document.getElementById(\"avoidTolls\").value=avoidToll;\r\n");
      out.write("          calculateAndDisplayRoute(directionsService, directionsDisplay, avoidToll);\r\n");
      out.write("          geocodeAddressStart(geocoder, map);\r\n");
      out.write("          geocodeAddressEnd(geocoder, map);\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        var onChangeHandlerTolls = function() {\r\n");
      out.write("          avoidToll = false;\r\n");
      out.write("          document.getElementById(\"avoidTolls\").value=avoidToll;\r\n");
      out.write("          calculateAndDisplayRoute(directionsService, directionsDisplay, avoidToll);\r\n");
      out.write("          geocodeAddressStart(geocoder, map);\r\n");
      out.write("          geocodeAddressEnd(geocoder, map);\r\n");
      out.write("        };\r\n");
      out.write("        document.getElementById('cari').addEventListener('click', onChangeHandler);\r\n");
      out.write("        document.getElementById('With-Tolls').addEventListener('click', onChangeHandlerTolls);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function geocodeAddressStart(geocoder, resultsMap) {\r\n");
      out.write("        var address = document.getElementById('start').value;\r\n");
      out.write("        geocoder.geocode({'address': address}, function(results, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            resultsMap.setCenter(results[0].geometry.location);\r\n");
      out.write("            markerStart = new google.maps.Marker({\r\n");
      out.write("              position: results[0].geometry.location\r\n");
      out.write("            });\r\n");
      out.write("            document.getElementById(\"latAwal\").value=markerStart.getPosition().lat();\r\n");
      out.write("            document.getElementById(\"longAwal\").value=markerStart.getPosition().lng();\r\n");
      out.write("          } else {\r\n");
      out.write("            alert('Geocode was not successful for the following reason: ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function geocodeAddressEnd(geocoder, resultsMap) {\r\n");
      out.write("        var address = document.getElementById('end').value;\r\n");
      out.write("        geocoder.geocode({'address': address}, function(results, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            resultsMap.setCenter(results[0].geometry.location);\r\n");
      out.write("            markerEnd = new google.maps.Marker({\r\n");
      out.write("              position: results[0].geometry.location\r\n");
      out.write("            });\r\n");
      out.write("            document.getElementById(\"latAkhir\").value=markerEnd.getPosition().lat();\r\n");
      out.write("            document.getElementById(\"longAkhir\").value=markerEnd.getPosition().lng();\r\n");
      out.write("          } else {\r\n");
      out.write("            alert('Geocode was not successful for the following reason: ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function calculateAndDisplayRoute(directionsService, directionsDisplay, toll) {\r\n");
      out.write("        directionsService.route({\r\n");
      out.write("          origin: document.getElementById('from').value,\r\n");
      out.write("          destination: document.getElementById('to').value,\r\n");
      out.write("          travelMode: 'DRIVING'\r\n");
      out.write("        }, function(response, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            directionsDisplay.setDirections(response);\r\n");
      out.write("            //get distance\r\n");
      out.write("            var distanceKM = response.routes[0].legs[0].distance.value/1000;\r\n");
      out.write("            document.getElementById(\"distance\").value=distanceKM;\r\n");
      out.write("          } else {\r\n");
      out.write("            window.alert('Directions request failed due to ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("        var start = document.getElementById('from').value;\r\n");
      out.write("        var end = document.getElementById('to').value;\r\n");
      out.write("        document.getElementById(\"startName\").value=start;\r\n");
      out.write("        document.getElementById(\"endName\").value=end;\r\n");
      out.write("          \r\n");
      out.write("      </script>\r\n");
      out.write("        <!--____________________________isi option di kendaraan umum____________________________-->      \r\n");
      out.write("        <div id=\"Umum\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"UmumModa\" name=\"kd_moda\">\r\n");
      out.write("          <option value=\"Taksi\">Taksi</option>\r\n");
      out.write("          <option value=\"Bus\">Bus</option>\r\n");
      out.write("          <option value=\"Kereta\">Kereta</option>\r\n");
      out.write("          <option value=\"Pesawat\">Pesawat</option>\r\n");
      out.write("        </select>     \r\n");
      out.write("        </div>\r\n");
      out.write("        <!--____________________________isi option di kendaraan pribadi____________________________--> \r\n");
      out.write("        <div id=\"Pribadi\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"PribadiModa\" name=\"kd_transport_pribadi\">\r\n");
      out.write("          <option value=\"Sepeda\">Sepeda</option>\r\n");
      out.write("          <option value=\"Motor\">Motor</option>\r\n");
      out.write("          <option value=\"Mobil\">Mobil</option>\r\n");
      out.write("        </select>      \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--____________________________Tombol Submit or cancel____________________________--> \r\n");
      out.write("      <div class=\"col-12 enter\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"Cancel\" style=\"background-color: red;\">\r\n");
      out.write("        <input type=\"submit\" value=\"Create Schedule\">\r\n");
      out.write("      </div><br> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
