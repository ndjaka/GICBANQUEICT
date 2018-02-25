package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class soldecli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("           ");
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
      out.write("    <title>Material Design Bootstrap</title>\n");
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
      out.write("                    <strong>GIC BANK <i class=\"fa fa-money fa-2x\"></i></strong>\n");
      out.write("                </a>\n");
      out.write("               \n");
      out.write("                <div class=\"  pull-right collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"  pull-right  navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index.php\">Acceuil\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Features</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item btn-group\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-primary\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                            </div>\n");
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
      out.write("    </div>\n");
      out.write("    <div class=\"row\" >\n");
      out.write("        <div class=\"card col-md-8\" style=\"top:150px;position: absolute\">\n");
      out.write("\n");
      out.write("    <div class=\"card-header\">\n");
      out.write("        solde\n");
      out.write("    </div>\n");
      out.write("    <!--Card content-->\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <!--Title-->\n");
      out.write("        \n");
      out.write("        <!--Text-->\n");
      out.write("        <h3 class=\"card-text h3-responsive\">cette page permet au client de consulter leurs compte en ligne<br>\n");
      out.write("                             votre derniere connexion a ete effectue le 19/02/2018\n");
      out.write("        </h3>\n");
      out.write("                             \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
