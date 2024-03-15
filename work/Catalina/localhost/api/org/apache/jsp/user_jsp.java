/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-03-15 11:24:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <img src=\"tech.jpg\" alt=\"Logo\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("              <a href=\"index.jsp\">Home</a>\r\n");
      out.write("              <a href=\"boek.jsp\">Books</a>\r\n");
      out.write("              <a href=\"user.jsp\">Users</a>\r\n");
      out.write("              <a href=\"uitlening.jsp\">Uitlening</a>\r\n");
      out.write("              <a href=\"about.jsp\">About</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Users Overview</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"book.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("        <h1 style=\"color: #fff;\">User Overview</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-6 text-md-end\">\r\n");
      out.write("        <button id=\"createUserBtn\" class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#createUserModal\">Create User</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <table class=\"table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>naam</th>\r\n");
      out.write("            <th>adres</th>\r\n");
      out.write("            <th>telefoonnummer</th>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody id=\"UsersTableBody\"></tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"goToIndex()\">Back to Index</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Edit User Modal -->\r\n");
      out.write("<div class=\"modal\" id=\"editUserModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("    <!-- Modal content -->\r\n");
      out.write("    <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\">Edit User</h5>\r\n");
      out.write("        <!-- Corrected close button attributes for Bootstrap 5 -->\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Modal body with corrected form ids and labels -->\r\n");
      out.write("    <div class=\"modal-body\">\r\n");
      out.write("        <form id=\"editUserForm\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"editNaam\">Naam:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"editNaam\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"editAdres\">Adres:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"editAdres\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"editTelefoonnummer\">Telefoonnummer:</label>\r\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"editTelefoonnummer\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"hidden\" id=\"editLidID\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" onclick=\"saveLidChanges()\">Update</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Confirmation Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"confirmationModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"confirmationModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"confirmationModalLabel\">Confirm Deletion</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <p>Are you sure you want to delete this Book?</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" id=\"confirmDeleteBtn\">Delete</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"alertPlaceholder\"></div>\r\n");
      out.write("<!-- Create User Modal -->\r\n");
      out.write("<div class=\"modal\" id=\"createUserModal\" tabindex=\"-1\" aria-labelledby=\"createUserModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"createUserModalLabel\">Create User</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <!-- User create form -->\r\n");
      out.write("                <form id=\"createUserForm\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"createNaam\">Naam:</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"createNaam\" name=\"naam\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"createAdres\">Adres:</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"createAdres\" name=\"adres\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"createTelefoonnummer\">Telefoonnummer:</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"createTelefoonnummer\" name=\"telefoonnummer\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- Submit button -->\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\" onclick=\"saveLid()\">Save</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"lid.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/mixpanel-browser@latest/dist/mixpanel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function goToIndex() {\r\n");
      out.write("        window.location.href = 'http://localhost:8080/api/library';\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
