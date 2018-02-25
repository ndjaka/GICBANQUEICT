package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu_client.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("    <title>GIC BANK</title>\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"MDB/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"MDB/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Material Design Bootstrap -->\n");
      out.write("    <link href=\"MDB/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"MDB/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style rel=\"stylesheet\">\n");
      out.write("        /* TEMPLATE STYLES */\n");
      out.write("\n");
      out.write("        .navbar {\n");
      out.write("            background-color: #392a3d;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer.page-footer {\n");
      out.write("            background-color: #392a3d;\n");
      out.write("            margin-top: 2rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .view {\n");
      out.write("            background: url(\".jpg\")no-repeat center center;\n");
      out.write("            -webkit-background-size: cover;\n");
      out.write("            -moz-background-size: cover;\n");
      out.write("            -o-background-size: cover;\n");
      out.write("            background-size: cover;\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .full-bg-img {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .payment .fa:not(:first-child) {\n");
      out.write("            margin-left: 10px;\n");
      out.write("            color: rgba(255, 255, 255, .8);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"]:focus:not([readonly]) {\n");
      out.write("            border-color: #ff3547;\n");
      out.write("            box-shadow: 0 1px 0 0 #ff3547;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"]:not([readonly])+label {\n");
      out.write("            color: rgba(255, 255, 255, 0.9);\n");
      out.write("            font-weight: 400;\n");
      out.write("            font-size: 1.2rem\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"]:focus:not([readonly])+label {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar .btn-group .dropdown-menu a:hover {\n");
      out.write("            color: #000 !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar .btn-group .dropdown-menu a:active {\n");
      out.write("            color: #fff !important;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--Navigation & Intro-->\n");
      out.write("    <header>\n");
      out.write("\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                    <strong>GIC <i class=\"fa fa-money fa-2x\">BANK</i> &nbsp&nbsp&nbsp&nbsp&nbsp</i></strong>\n");
      out.write("                    <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("                <button class=\" navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"  pull-right collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"  pull-right  navbar-nav mr-auto\">\n");
      out.write("                  \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#services\">Nos Services &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">A propos de Nous &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Nous contacter &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--/.Navbar-->\n");
      out.write("\n");
      out.write("        <!--Mask-->\n");
      out.write("        <!--Carousel Wrapper-->\n");
      out.write("<!--Carousel Wrapper-->\n");
      out.write("\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("<div class=\"container-fluid text-center\" style=\"top:99px;position: absolute\">\n");
      out.write("    <div class=\"row\" style=\"padding-bottom: 251px\">\n");
      out.write("        <div class=\"col-md-9\">\n");
      out.write("            <div class=\"card\" style=\"height: 159%\" >\n");
      out.write("               \n");
      out.write("\n");
      out.write("                <div class=\"card-header\" style=\" background: #3f51b5\">\n");
      out.write("                    <strong class=\"h3-responsive\" style=\"color: white\">Message</strong>\n");
      out.write("                </div>\n");
      out.write("                <!--Card content-->\n");
      out.write("                <div class=\"card-body\" style=\"top: 68px; \">\n");
      out.write("                    <form>\n");
      out.write("    <p class=\"h4 text-center mb-4\">Wite to us</p>\n");
      out.write("\n");
      out.write("    <!-- Material input text -->\n");
      out.write("    <div class=\"md-form\">\n");
      out.write("        <i class=\"fa fa-user prefix grey-text\"></i>\n");
      out.write("        <input type=\"text\" id=\"materialFormContactNameEx\" class=\"form-control\">\n");
      out.write("        <label for=\"materialFormContactNameEx\">Your name</label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Material input email -->\n");
      out.write("    <div class=\"md-form\">\n");
      out.write("        <i class=\"fa fa-envelope prefix grey-text\"></i>\n");
      out.write("        <input type=\"email\" id=\"materialFormContactEmailEx\" class=\"form-control\">\n");
      out.write("        <label for=\"materialFormContactEmailEx\">Your email</label>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Material input subject -->\n");
      out.write("    <div class=\"md-form\">\n");
      out.write("        <i class=\"fa fa-tag prefix grey-text\"></i>\n");
      out.write("        <input type=\"text\" id=\"materialFormContactSubjectEx\" class=\"form-control\">\n");
      out.write("        <label for=\"materialFormContactSubjectEx\">Subject</label>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Material textarea message -->\n");
      out.write("    <div class=\"md-form\">\n");
      out.write("        <i class=\"fa fa-pencil prefix grey-text\"></i>\n");
      out.write("        <textarea type=\"text\" id=\"materialFormContactMessageEx\" class=\"form-control md-textarea\" rows=\"3\"></textarea>\n");
      out.write("        <label for=\"materialFormContactMessageEx\">Your message</label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"text-center mt-4\">\n");
      out.write("        <button class=\"btn btn-outline-secondary\" type=\"submit\">Send<i class=\"fa fa-paper-plane-o ml-2\"></i></button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<!-- Material form contact -->\n");
      out.write("                      \n");
      out.write("<!--Textarea with icon prefix-->\n");
      out.write("<div class=\"md-form\">\n");
      out.write("    <i class=\"fa fa-pencil prefix\"></i>\n");
      out.write("    <textarea type=\"text\" id=\"textareaPrefix\" class=\"form-control md-textarea\" rows=\"3\"></textarea>\n");
      out.write("    <label for=\"textareaPrefix\">Icon Prefix</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\"> \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <div class=\"list-group text-center\">\n");
      out.write("                <a href=\"soldecli.jsp\" class=\"list-group-item active\">\n");
      out.write("                   consulter son\n");
      out.write("                        solde\n");
      out.write("                        <i class=\"fa fa-align-center\"></i>\n");
      out.write("               </a>\n");
      out.write("               <a href=\"#\" class=\"list-group-item \">\n");
      out.write("                   voir les dernieres transactions&nbsp;&nbsp;&nbsp;<i class=\"fa fa-arrow-up\"></i><i class=\"fa fa-arrow-down\"></i>\n");
      out.write("               </a>\n");
      out.write("               <a href=\"#\" class=\"list-group-item \">\n");
      out.write("                   envoyer un message &nbsp;&nbsp;&nbsp;<i class=\"fa fa-send \"></i>\n");
      out.write("               </a>\n");
      out.write("                <a href=\"#\" class=\"list-group-item \">\n");
      out.write("                 voir ces informations &nbsp;&nbsp;&nbsp;<i class=\"fa fa-info-circle \"></i>\n");
      out.write("               </a>\n");
      out.write("                <a href=\"#\" class=\"list-group-item \">\n");
      out.write("                    effectuer un virement &nbsp;&nbsp;&nbsp;<i class=\"fa fa-exchange \"></i>\n");
      out.write("               </a>\n");
      out.write("           </div>\n");
      out.write("       \n");
      out.write(" \n");
      out.write("   ");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("        <!--Footer-->\n");
      out.write("        <footer class=\"page-footer center-on-small-only\">\n");
      out.write("\n");
      out.write("            <!--Footer Links-->\n");
      out.write("            <div class=\"container mt-5 mb-4 text-center text-md-left\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!--First column-->\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3 mb-r\">\n");
      out.write("                        <h6 class=\"title font-bold\">\n");
      out.write("                            <strong>A propos</strong>\n");
      out.write("                        </h6>\n");
      out.write("                        <hr class=\"orange lighten-3 mb-4 pb-1 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                        <p>Here you can use rows and columns here to organize your footer content. Lorem ipsum dolor sit amet,\n");
      out.write("                            consectetur adipisicing elit.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.First column-->\n");
      out.write("\n");
      out.write("                    <!--Second column-->\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-r\">\n");
      out.write("                        <h6 class=\"title font-bold\">\n");
      out.write("                            <strong>Nos services</strong>\n");
      out.write("                        </h6>\n");
      out.write("                        <hr class=\"orange lighten-3 mb-4 pb-1 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">virement</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">versement</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">retrait\n");
      out.write("                          </a>\n");
      out.write("                        </p>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <!--/.Second column-->\n");
      out.write("\n");
      out.write("                    <!--Third column-->\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-r\">\n");
      out.write("                        <h6 class=\"title font-bold\">\n");
      out.write("                            <strong>equipe</strong>\n");
      out.write("                        </h6>\n");
      out.write("                        <hr class=\"orange lighten-3 mb-4 pb-1 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">Your Account</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">Become an Affiliate</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">Shipping Rates</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#!\">Help</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.Third column-->\n");
      out.write("\n");
      out.write("                    <!--Fourth column-->\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                        <h6 class=\"title font-bold\">\n");
      out.write("                            <strong>Nous contacter</strong>\n");
      out.write("                        </h6>\n");
      out.write("                        <hr class=\"orange lighten-3 mb-4 pb-1 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa fa-home mr-3\"></i> New York, NY 10012, US</p>\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa fa-envelope mr-3\"></i> info@example.com</p>\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa fa-phone mr-3\"></i> + 01 234 567 88</p>\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa fa-print mr-3\"></i> + 01 234 567 89</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.Fourth column-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Footer Links-->\n");
      out.write("\n");
      out.write("            <!-- Copyright-->\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    © 2018 Copyright:\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <strong> GICbank</strong>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Copyright -->\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!--/.Footer-->\n");
      out.write("\n");
      out.write("        <!-- SCRIPTS -->\n");
      out.write("\n");
      out.write("        <!-- JQuery -->\n");
      out.write("        <script type=\"text/javascript\" src=\"MDB/js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap dropdown -->\n");
      out.write("        <script type=\"text/javascript\" src=\"MDB/js/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"MDB/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- MDB core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"MDB/js/mdb.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            new WOW().init();\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("   \n");
      out.write("     \n");
      out.write("</div>\n");
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
