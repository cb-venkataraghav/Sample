package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SignUp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 35%; height: 50%\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>SignUp Form</legend>\n");
      out.write("            <form method=\"POST\" action=\"newUser.jsp\"  name=\"signupForm\" onsubmit=\"return checkForm()\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Name\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"fname\" required=\"true\" placeholder=\"First Name\"  pattern=\"[A-Za-z]{1,}\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"lname\" required=\"true\" placeholder=\"Last Name\" pattern=\"[A-Za-z]{1,}\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Email\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" name=\"mailId\"  required=\"true\" placeholder=\"Email\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                         Confirm Email\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" name=\"c_mailId\"  required=\"true\" placeholder=\"Confirm Email\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Password\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"pass\"  required=\"true\" placeholder=\"Password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Confirm Password\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"c_pass\"  required=\"true\" placeholder=\"Confirm Password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr align = \"center\">\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input type=\"submit\" value=\"Sign Up\">\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" \n");
      out.write("    function checkForm(){\n");
      out.write("     \n");
      out.write("     var ps = document.getElementsByName(\"pass\")[0].value;\n");
      out.write("     var c_ps = document.getElementsByName(\"c_pass\")[0].value;\n");
      out.write("     \n");
      out.write("     if(! (ps === c_ps) ){\n");
      out.write("         alert(\"Passwords do not match\");\n");
      out.write("         return false;\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     var mail = document.getElementsByName(\"mailId\")[0].value;\n");
      out.write("     var c_mail = document.getElementsByName(\"c_mailId\")[0].value;\n");
      out.write("     \n");
      out.write("     if(! (mail === c_mail) ){\n");
      out.write("         alert(\"MailID's do not match\");\n");
      out.write("         return false;\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     return true;\n");
      out.write("     \n");
      out.write("     \n");
      out.write(" }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
