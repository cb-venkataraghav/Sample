package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html style=\"font-family: sans-serif; color:white; background-color: rgba(0, 153, 153, 0.02)\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Details</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        div{\n");
      out.write("            \n");
      out.write("            background-color: rgb(0, 153, 153);\n");
      out.write("            font-variant: small-caps;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        fieldset{\n");
      out.write("    \n");
      out.write("                    border-color: rgb(0, 153, 153);\n");
      out.write("                    height: 130px;\n");
      out.write("                    width: 300px;\n");
      out.write("                    margin-left: 100px;\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                    background-color: white;\n");
      out.write("        }\n");
      out.write("        legend\n");
      out.write("        {\n");
      out.write("                background-color: rgb(0, 153, 153);\n");
      out.write("                padding-top: 4px;\n");
      out.write("                padding-bottom: 2px;\n");
      out.write("                height: 25px;\n");
      out.write("                width: 70px;\n");
      out.write("                padding-left: 9px;\n");
      out.write("    \n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        h2{\n");
      out.write("            padding-left: 11px;\n");
      out.write("            padding-top: 7px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logOutButton {\n");
      out.write("            display: block;\n");
      out.write("            text-decoration: none;\n");
      out.write("            \n");
      out.write("            background: white;\n");
      out.write("            \n");
      out.write("            text-align: center;\n");
      out.write("            border-radius: 2px;\n");
      out.write("            color: rgb(0, 153, 153);\n");
      out.write("            margin-left: 1150px;\n");
      out.write("            padding-top: 4px;\n");
      out.write("            height: 20px;\n");
      out.write("            width: 80px;\n");
      out.write("         }   \n");
      out.write("         \n");
      out.write("         .button {\n");
      out.write("            display: block;\n");
      out.write("            text-decoration: none;\n");
      out.write("            text-align: center;\n");
      out.write("            background: white;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-color: rgb(0, 153, 153);\n");
      out.write("            border-radius: 16px;\n");
      out.write("            color: rgb(0, 153, 153);\n");
      out.write("            margin-left: 50px;\n");
      out.write("            padding-top: 4px;\n");
      out.write("            height: 20px;\n");
      out.write("            width: 180px;\n");
      out.write("         }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        <h2>Hi  ");
      out.print(session.getAttribute("uname"));
      out.write(" !!!</h2>\n");
      out.write("        <h4><a class=\"logOutButton\" href=\"index.html\">Log out</a></h4>\n");
      out.write("         </div>                                                               \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Choose</legend>\n");
      out.write("        <table border=\"0\" width=\"150px\">\n");
      out.write("        <tr><td><a class=\"button\" href=\"edit.jsp\">Edit detail</a></td></tr>\n");
      out.write("        <tr><td><a class=\"button\" href=\"deactivate.jsp\">Deactivate Account</a></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
