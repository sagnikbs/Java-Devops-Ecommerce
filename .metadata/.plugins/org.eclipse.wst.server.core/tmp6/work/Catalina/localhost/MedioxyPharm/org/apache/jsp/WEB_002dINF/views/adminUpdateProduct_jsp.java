/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-22 14:29:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.*;

public final class adminUpdateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/EclipseOxygenNew/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp6/wtpwebapps/MedioxyPharm/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1507560585847L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(request.getContextPath());
      out.write("/assets/img/favicon.ico\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\r\n");
      out.write("\t<title>Admin Panel-MedioxyPharm</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS     -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Animation library for notifications   -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/assets/css/animate.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/assets/css/light-bootstrap-dashboard.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/assets/css/demo.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--     Fonts and icons     -->\r\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<center>  \r\n");
      out.write("       <h2><span style=\"color:#a442f4\">Update Product</span></h2>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src='");
      out.print(request.getContextPath());
      out.write("/tinymce/js/tinymce/jquery.tinymce.min.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" src='");
      out.print(request.getContextPath());
      out.write("/tinymce/js/tinymce/tinymce.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" src='");
      out.print(request.getContextPath());
      out.write("/tinymce/js/tinymce/tinymce.min.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" src='");
      out.print(request.getContextPath());
      out.write("/tinymce\\src\\plugins\\autoresize\\src\\main\\js\\Plugin.js'></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  tinymce.init({\r\n");
      out.write("    selector: '#myTextarea2',\r\n");
      out.write("    theme: 'modern',\r\n");
      out.write("    //width: 600,\r\n");
      out.write("    //height: 200,\r\n");
      out.write("    plugins: \"autoresize\",\r\n");
      out.write("    \r\n");
      out.write("    plugins: [\r\n");
      out.write("      'advlist anchor autolink link image lists charmap print preview hr anchor pagebreak spellchecker',\r\n");
      out.write("      'searchreplace wordcount visualblocks visualchars code fullscreen fullpage colorpicker insertdatetime media nonbreaking',\r\n");
      out.write("      'save table contextmenu directionality emoticons template paste textcolor textpattern imagetools'\r\n");
      out.write("    ],\r\n");
      out.write("    content_css: 'css/content.css',\r\n");
      out.write("    toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons'\r\n");
      out.write("  });\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<style> \r\n");
      out.write("select {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px 15px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    heidht:5px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    background-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"header\">\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"content\">\r\n");
      out.write("                                <form action=\"");
      out.print(request.getContextPath());
      out.write("/adminUpdateProduct/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"POST\" id=\"product\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                    <div class=\"\">\r\n");
      out.write("                                       \r\n");
      out.write("                                        \r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-2\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product ID</label>\r\n");
      out.write("                                                <div class=\"form-control\" placeholder=\"\" name=\"proId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Name</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"proName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Category</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"proCatg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proCatg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Supplier</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"proSupp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proSupp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-md-8\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Description</label>\r\n");
      out.write("                                                <textarea id=\"myTextarea2\" class=\"form-control\" placeholder=\"\" name=\"proDesp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proDesp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Stock</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"proStock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proStock}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Price</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"proPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.proPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Product Image</label>\r\n");
      out.write("                                                <input type=\"file\" class=\"form-control\" placeholder=\"\" name=\"file\" accept=\".png,.gif,.jpeg,.jpg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.file}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info btn-fill pull-right\" value=\"Update Product\"/>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("    <!--   Core JS Files   -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--  Checkbox, Radio & Switch Plugins -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/bootstrap-checkbox-radio-switch.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--  Charts Plugin -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/chartist.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Notifications Plugin    -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/bootstrap-notify.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Google Maps Plugin    -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/light-bootstrap-dashboard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/assets/js/demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
