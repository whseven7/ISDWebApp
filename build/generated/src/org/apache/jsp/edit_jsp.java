package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.Customer;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PageComponents/CommonMeta.jsp", out, false);
      out.write("\n");
      out.write("        <title>Edit Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Customer customer = (Customer)session.getAttribute("customer");
            String updated = request.getParameter("updated");
        
      out.write("\n");
      out.write("        <h1 class=\"align-center\">Edit User Details <span>");
      out.print( (updated !=null) ? "Update was successful":"");
      out.write("</span></h1>\n");
      out.write("        <form class=\"align-center\" action=\"edit.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <label for=\"firstName\">First Name:</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"First Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label  for=\"lastName\">Last Name:</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"Last Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label for=\"username\">Username:</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("            <input type=\"hidden\" name=\"updated\" value=\"updated\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            ");

                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String email = request.getParameter("email");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                
                customer = new Customer(firstName, lastName, email, username, password);
                session.setAttribute("customer", customer);
            
      out.write("\n");
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
