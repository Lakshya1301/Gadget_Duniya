package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .tdtheme\n");
      out.write("        {\n");
      out.write("            width:13%;\n");
      out.write("            background-color: white;\n");
      out.write("            height:10px;\n");
      out.write("            font-size:15px;\n");
      out.write("            font-family: arial;\n");
      out.write("        }\n");
      out.write("        .tdtheme:hover\n");
      out.write("        {\n");
      out.write("            background-color:#8FC1E3;\n");
      out.write("        }\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("            background-position:center bottom;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .ask\n");
      out.write("        {\n");
      out.write("            font-size: 17px;\n");
      out.write("            font-family: arial;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        a{\n");
      out.write("          text-decoration:none;  \n");
      out.write("          color: darkblue;\n");
      out.write("          font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body background=\"background.jpg\">\n");
      out.write("        <form>   \n");
      out.write("            <input type=\"text\" placeholder=\" Search....\" name=\"search\" style='margin-left:810px;'>   \n");
      out.write("            <button type=\"submit\">Search</button>   \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div style=\"width:57%;height:20px;margin-left:650px;margin-top:78px;background-color:white;\">\n");
      out.write("            <table width= \"80%\" height=\"30px\" border=\"0\" style='margin-top:-80px;background-color: white;margin-left: 150px'>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\">Home</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"services.jsp\">Services</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"products.jsp\">Products</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"askit.jsp\">Ask it</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"offers.jsp\">Offers</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"feeds.jsp\">Feeds</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"login.jsp\">Login</a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\".jsp\"><img src='microphone.jpg' width='30px' height='30px'></a></td>\n");
      out.write("                    <td class=\"tdtheme\"><a href=\"home.jsp\"><img src='cart.jpg' width='52px' height='52px'></a></td>\n");
      out.write("                    <td><select style=\"width: 80px; height: 30px;margin-right: 60px\">\n");
      out.write("                        <option><a href=\"home.jsp\">More</a></option>\n");
      out.write("                        <option><a href=\"aboutus.jsp\">About Us</a></option>\n");
      out.write("                        <option><a href=\"expertiseprofiles.jsp\">Expertise Profiles</a></option>\n");
      out.write("                        <option><a href=\"location.jsp\">Location</a></option>\n");
      out.write("                        <option><a href=\"reviews.jsp\">Reviews</a></option>\n");
      out.write("                        <option><a href=\"complaints.jsp\">Complaints</a></option>\n");
      out.write("                        <option><a href=\"contactus.jsp\">Contact Us</a></option>\n");
      out.write("                </tr>\n");
      out.write("           </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"width:40%;height:80px;margin-left:20px;margin-top:-45px;background-color:white;\">\n");
      out.write("            <table width=\"100%\" border=\"0\" style='margin-left: 11%; font-size: 40px;font-weight: bold;'>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        GADGET DUNIYA\n");
      out.write("                        <img src=\"logo.jpg\" style=\"width: 80px; height: 75px; margin-left: -435px; margin-bottom:-25px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <form action=\"signuptable.jsp\">\n");
      out.write("        <div style=\"width: 50%; height: 60%; background-color: white; margin-top: 2%; margin-left: 25%;\">\n");
      out.write("            <table width=\"100%\" height=\"100%\" border=\"1\" cellspacing=\"2\" style=\"background-color: lightblue; color: darkblue; font-weight: bold;\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\" style=\"font-size: 20px; color: darkblue; font-weight: bold; text-decoration: underline;\">\n");
      out.write("                        SIGN UP\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\" >\n");
      out.write("                    <td class=\"ask\" width=\"30%\" style=\" text-align: center\">Full Name</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter full name...\" name=\"fullN\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">E-mail ID</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter e-mail id...\" name=\"email\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\"  text-align: center;\">Contact Number</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter contact number...\" name=\"contactN\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">Address</td>\n");
      out.write("                    <td> <textarea input type=\"text\" placeholder=\"Enter address...\" name=\"address\" style=\"width: 80%\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">PIN Code</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter PIN code...\" name=\"pin\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">City/Town</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter your city/town...\" name=\"city\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">New Password</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter new password...\" name=\"npass\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">Confirm New Password</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Enter new password again...\" name=\"cnpass\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td class=\"ask\" width=\"50%\" style=\" text-align: center;\">Which is your favorite  word?</td>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Your Answer...\" name=\"ques\" style=\"width: 80%\"</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <button type=\"submit\" style=\"height: 30px; width: 80px; margin-left: 47.5%; margin-top: 10px; font-weight: bold; background-color: lightblue;font-size: 18px;color: darkblue;\">Submit</button>   \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 45%; height: 11%; background-color: white; margin-top: 10px; margin-left: 27.5%;\">\n");
      out.write("            <table width=\"100%\" height=\"100%\" border=\"1\" cellspacing=\"2\" style=\"background-color: lightblue; color: darkblue; font-weight: bold;\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\" style=\"font-size: 23px; color: darkblue; font-weight: bold;\">\n");
      out.write("                        Already have an account?\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"center\" >\n");
      out.write("                    <td class=\"ask\" width=\"30%\" style=\" text-align: center;  text-decoration: underline;\"><a href=\"log.jsp\">Login</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html> ");
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
