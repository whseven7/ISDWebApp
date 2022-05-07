package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.Customer;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PageComponents/CommonMeta.jsp", out, false);
      out.write("\r\n");
      out.write("        <title>Home Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    ");

        Customer customer = (Customer)session.getAttribute("customer");
        if (customer == null && request.getParameter("register") != null) {
            customer = new Customer(
                request.getParameter("firstname"),
                request.getParameter("lastname"),
                request.getParameter("email"),
                request.getParameter("username"),
                request.getParameter("password")
            );
            session.setAttribute("customer", customer);
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PageComponents/JSPHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
 if (customer != null) { 
      out.write("\r\n");
      out.write("            <h1>Welcome ");
      out.print( customer.getUsername() );
      out.write("!</h1>\r\n");
      out.write("        ");
 } else { 
      out.write("\r\n");
      out.write("            <h1>Welcome!</h1>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
 if (request.getParameter("register") != null) { 
      out.write("\r\n");
      out.write("            <p>Hello newly registered customer!</p>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
 if (request.getParameter("login") != null) { 
      out.write("\r\n");
      out.write("            <p>Welcome back registered customer!</p>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </body>\r\n");
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
