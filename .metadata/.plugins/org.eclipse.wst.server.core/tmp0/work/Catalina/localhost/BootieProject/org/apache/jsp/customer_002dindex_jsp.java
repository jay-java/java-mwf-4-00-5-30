/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-21 12:23:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.WishListDao;
import model.WishList;
import model.Product;
import dao.ProductDao;
import java.util.List;
import model.Customer;

public final class customer_002dindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Product");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.Customer");
    _jspx_imports_classes.add("dao.WishListDao");
    _jspx_imports_classes.add("dao.ProductDao");
    _jspx_imports_classes.add("model.WishList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootie Ecommerce Bootstrap Responsive Web Template | Home\r\n");
      out.write("	:: W3layouts</title>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Bootie Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script>\r\n");
      out.write("	addEventListener(\"load\", function() {\r\n");
      out.write("		setTimeout(hideURLbar, 0);\r\n");
      out.write("	}, false);\r\n");
      out.write("	d\r\n");
      out.write("\r\n");
      out.write("	function hideURLbar() {\r\n");
      out.write("		window.scrollTo(0, 1);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- //Meta tag Keywords -->\r\n");
      out.write("\r\n");
      out.write("<!-- Custom-Files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<!-- Bootstrap-Core-CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Style-CSS -->\r\n");
      out.write("<!-- font-awesome-icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font-awesome-icons -->\r\n");
      out.write("<!-- /Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- //Fonts -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");

	Customer c = null;
	if (session.getAttribute("data") != null) {
		c = (Customer) session.getAttribute("data");
	} else {
		response.sendRedirect("customer-login.jsp");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- mian-content -->\r\n");
      out.write("	<div class=\"main-banner\" id=\"home\">\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		<header class=\"header\">\r\n");
      out.write("			<div class=\"container-fluid px-lg-5\">\r\n");
      out.write("				<!-- nav -->\r\n");
      out.write("				<nav class=\"py-4\">\r\n");
      out.write("					<div id=\"logo\">\r\n");
      out.write("						<h1>\r\n");
      out.write("							<a href=\"index.html\"><span class=\"fa fa-bold\"\r\n");
      out.write("								aria-hidden=\"true\"></span>ootie</a>\r\n");
      out.write("						</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<label for=\"drop\" class=\"toggle\">Menu</label> <input\r\n");
      out.write("						type=\"checkbox\" id=\"drop\" />\r\n");
      out.write("					<ul class=\"menu mt-2\">\r\n");
      out.write("						<li class=\"active\"><a href=\"customer-index.jsp\">Home</a></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<!-- First Tier Drop Down --> <label for=\"drop-2\" class=\"toggle\">Drop\r\n");
      out.write("								Down <span class=\"fa fa-angle-down\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</label> <a href=\"#\">Products <span class=\"fa fa-angle-down\"\r\n");
      out.write("								aria-hidden=\"true\"></span></a> <input type=\"checkbox\" id=\"drop-2\" />\r\n");
      out.write("							<ul>\r\n");
      out.write("							");
List<WishList> list1 = WishListDao.getWishListByCusId(c.getId()); 
      out.write("\r\n");
      out.write("							");
if(list1.size()!=0){ 
      out.write("\r\n");
      out.write("								<li><a href=\"wishlist.jsp\">WishList (");
out.print(list1.size()); 
      out.write(")</a></li>\r\n");
      out.write("								");
}	
      out.write("\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								<li><a href=\"customer-registration.jsp\">Cart</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<!-- First Tier Drop Down --> <label for=\"drop-2\" class=\"toggle\">Drop\r\n");
      out.write("								Down <span class=\"fa fa-angle-down\" aria-hidden=\"true\"></span>\r\n");
      out.write("						</label> <a href=\"#\">");
      out.print(c.getName() );
      out.write(" <span class=\"fa fa-angle-down\"\r\n");
      out.write("								aria-hidden=\"true\"></span></a> <input type=\"checkbox\" id=\"drop-2\" />\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"seller-login.jsp\">Profile</a></li>\r\n");
      out.write("								<li><a href=\"customer-login.jsp\">Change Password</a></li>\r\n");
      out.write("								<li><a href=\"admin-login.jsp\">Logout</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("				<!-- //nav -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</header>\r\n");
      out.write("		<!-- //header -->\r\n");
      out.write("		<!--/banner-->\r\n");
      out.write("		<div class=\"banner-info\">\r\n");
      out.write("			<p>Trending of the week</p>\r\n");
      out.write("			<h3 class=\"mb-4\">Casual Shoes for Men</h3>\r\n");
      out.write("			<div class=\"ban-buttons\">\r\n");
      out.write("				<a href=\"shop-single.html\" class=\"btn\">Shop Now</a> <a\r\n");
      out.write("					href=\"single.html\" class=\"btn active\">Read More</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--// banner-inner -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"about py-5\">\r\n");
      out.write("		<div class=\"container pb-lg-3\">\r\n");
      out.write("			<h3 class=\"tittle text-center\">New Arrivals</h3>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("			");
List<Product> list = ProductDao.getAllProduct(); 
      out.write("\r\n");
      out.write("			");
for(Product p:list){ 
      out.write("\r\n");
      out.write("				<div class=\"col-md-4 product-men\">\r\n");
      out.write("					<div class=\"product-shoe-info shoe text-center\">\r\n");
      out.write("						<div class=\"men-thumb-item\">\r\n");
      out.write("							<img src=\"IMAGE/");
      out.print(p.getImage() );
      out.write("\" class=\"img-fluid\" alt=\"\"> \r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"item-info-product\">\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a href=\"shop-single.html\">");
      out.print(p.getPname() );
      out.write(" </a>\r\n");
      out.write("							</h4>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"product_price\">\r\n");
      out.write("								<div class=\"grid-price\">\r\n");
      out.write("									<span class=\"money\">");
      out.print(p.getPprice() );
      out.write("</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"product_price\">\r\n");
      out.write("								<div class=\"grid-price\">\r\n");
      out.write("									<form action=\"WishListController\" method=\"post\">\r\n");
      out.write("										<input type=\"hidden\" name=\"cusid\" value=\"");
      out.print(c.getId());
      out.write("\">\r\n");
      out.write("										<input type=\"hidden\" name=\"pid\" value=\"");
      out.print(p.getPid());
      out.write("\">\r\n");
      out.write("										<input type=\"submit\" name=\"action\" value=\"Add to Wishlist\">\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"grid-price\">\r\n");
      out.write("									<span class=\"money\">Add to Cart</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("		\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- //ab -->\r\n");
      out.write("	<!--/testimonials-->\r\n");
      out.write("	<section class=\"testimonials py-5\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"test-info text-center\">\r\n");
      out.write("				<h3 class=\"my-md-2 my-3\">Jenifer Burns</h3>\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"list-unstyled w3layouts-icons clients\">\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-star\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-star\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-star\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-star-half-o\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<p>\r\n");
      out.write("					<span class=\"fa fa-quote-left\"></span> Lorem Ipsum has been the\r\n");
      out.write("					industry's standard since the 1500s. Praesent ullamcorper dui\r\n");
      out.write("					turpis.Nulla pellentesque mi non laoreet eleifend. Integer\r\n");
      out.write("					porttitor mollisar lorem, at molestie arcu pulvinar ut. <span\r\n");
      out.write("						class=\"fa fa-quote-right\"></span>\r\n");
      out.write("				</p>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!--//testimonials-->\r\n");
      out.write("	<!--/ab -->\r\n");
      out.write("	<section class=\"about py-5\">\r\n");
      out.write("		<div class=\"container pb-lg-3\">\r\n");
      out.write("			<h3 class=\"tittle text-center\">Popular Products</h3>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-6 latest-left\">\r\n");
      out.write("					<div class=\"product-shoe-info shoe text-center\">\r\n");
      out.write("						<img src=\"images/img1.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"shop-now\">\r\n");
      out.write("							<a href=\"shop.html\" class=\"btn\">Shop Now</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6 latest-right\">\r\n");
      out.write("					<div class=\"row latest-grids\">\r\n");
      out.write("						<div class=\"latest-grid1 product-men col-12\">\r\n");
      out.write("							<div class=\"product-shoe-info shoe text-center\">\r\n");
      out.write("								<div class=\"men-thumb-item\">\r\n");
      out.write("									<img src=\"images/img2.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("									<div class=\"shop-now\">\r\n");
      out.write("										<a href=\"shop.html\" class=\"btn\">Shop Now</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"latest-grid2 product-men col-12 mt-lg-4\">\r\n");
      out.write("							<div class=\"product-shoe-info shoe text-center\">\r\n");
      out.write("								<div class=\"men-thumb-item\">\r\n");
      out.write("									<img src=\"images/img3.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("									<div class=\"shop-now\">\r\n");
      out.write("										<a href=\"shop.html\" class=\"btn\">Shop Now</a>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- //ab -->\r\n");
      out.write("	<!-- brands -->\r\n");
      out.write("	<section class=\"brands py-5\" id=\"brands\">\r\n");
      out.write("		<div class=\"container py-lg-0\">\r\n");
      out.write("			<div class=\"row text-center brand-items\">\r\n");
      out.write("				<div class=\"col-sm-2 col-3\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-connectdevelop\"\r\n");
      out.write("						aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-sm-2 col-3\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-empire\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-sm-2 col-3\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-ioxhost\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-sm-2 col-3\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-first-order\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-sm-2 col-3 mt-sm-0 mt-4\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-joomla\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-sm-2 col-3 mt-sm-0 mt-4\">\r\n");
      out.write("					<a href=\"#\"><span class=\"fa fa-dropbox\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- brands -->\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row footer-top\">\r\n");
      out.write("				<div class=\"col-lg-4 footer-grid_section_w3layouts\">\r\n");
      out.write("					<h2 class=\"logo-2 mb-lg-4 mb-3\">\r\n");
      out.write("						<a href=\"index.html\"><span class=\"fa fa-bold\"\r\n");
      out.write("							aria-hidden=\"true\"></span>ootie</a>\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco\r\n");
      out.write("						laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n");
      out.write("					<h4 class=\"sub-con-fo ad-info my-4\">Catch on Social</h4>\r\n");
      out.write("					<ul class=\"w3layouts_social_list list-unstyled\">\r\n");
      out.write("						<li><a href=\"#\" class=\"w3pvt_facebook\"> <span\r\n");
      out.write("								class=\"fa fa-facebook-f\"></span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"mx-2\"><a href=\"#\" class=\"w3pvt_twitter\"> <span\r\n");
      out.write("								class=\"fa fa-twitter\"></span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li><a href=\"#\" class=\"w3pvt_dribble\"> <span\r\n");
      out.write("								class=\"fa fa-dribbble\"></span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"ml-2\"><a href=\"#\" class=\"w3pvt_google\"> <span\r\n");
      out.write("								class=\"fa fa-google-plus\"></span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-8 footer-right\">\r\n");
      out.write("					<div class=\"w3layouts-news-letter\">\r\n");
      out.write("						<h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Newsletter</h3>\r\n");
      out.write("\r\n");
      out.write("						<p>By subscribing to our mailing list you will always get\r\n");
      out.write("							latest news and updates from us.</p>\r\n");
      out.write("						<form action=\"#\" method=\"post\" class=\"w3layouts-newsletter\">\r\n");
      out.write("							<input type=\"email\" name=\"Email\"\r\n");
      out.write("								placeholder=\"Enter your email...\" required=\"\">\r\n");
      out.write("							<button class=\"btn1\">\r\n");
      out.write("								<span class=\"fa fa-paper-plane-o\" aria-hidden=\"true\"></span>\r\n");
      out.write("							</button>\r\n");
      out.write("\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"row mt-lg-4 bottom-w3layouts-sec-nav mx-0\">\r\n");
      out.write("						<div class=\"col-md-4 footer-grid_section_w3layouts\">\r\n");
      out.write("							<h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Information</h3>\r\n");
      out.write("							<ul class=\"list-unstyled w3layouts-icons\">\r\n");
      out.write("								<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("								<li class=\"mt-3\"><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("								<li class=\"mt-3\"><a href=\"#\">Gallery</a></li>\r\n");
      out.write("								<li class=\"mt-3\"><a href=\"#\">Services</a></li>\r\n");
      out.write("								<li class=\"mt-3\"><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-4 footer-grid_section_w3layouts\">\r\n");
      out.write("							<!-- social icons -->\r\n");
      out.write("							<div class=\"agileinfo_social_icons\">\r\n");
      out.write("								<h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Customer\r\n");
      out.write("									Service</h3>\r\n");
      out.write("								<ul class=\"list-unstyled w3layouts-icons\">\r\n");
      out.write("\r\n");
      out.write("									<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("									<li class=\"mt-3\"><a href=\"#\">Delivery & Returns</a></li>\r\n");
      out.write("									<li class=\"mt-3\"><a href=\"#\">Waranty</a></li>\r\n");
      out.write("									<li class=\"mt-3\"><a href=\"#\">Terms & Condition</a></li>\r\n");
      out.write("									<li class=\"mt-3\"><a href=\"#\">Privacy Plolicy</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- social icons -->\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-4 footer-grid_section_w3layouts my-md-0 my-5\">\r\n");
      out.write("							<h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Contact\r\n");
      out.write("								Info</h3>\r\n");
      out.write("							<div class=\"contact-info\">\r\n");
      out.write("								<div class=\"footer-address-inf\">\r\n");
      out.write("									<h4 class=\"ad-info mb-2\">Phone</h4>\r\n");
      out.write("									<p>+121 098 8907 9987</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"footer-address-inf my-4\">\r\n");
      out.write("									<h4 class=\"ad-info mb-2\">Email</h4>\r\n");
      out.write("									<p>\r\n");
      out.write("										<a href=\"mailto:info@example.com\">info@example.com</a>\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"footer-address-inf\">\r\n");
      out.write("									<h4 class=\"ad-info mb-2\">Location</h4>\r\n");
      out.write("									<p>Honey Avenue, New York City</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"cpy-right text-left row\">\r\n");
      out.write("						<p class=\"col-md-10\">\r\n");
      out.write("							© 2019 Bootie. All rights reserved | Design by <a\r\n");
      out.write("								href=\"http://w3layouts.com\"> W3layouts.</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<!-- move top icon -->\r\n");
      out.write("						<a href=\"#home\" class=\"move-top text-right col-md-2\"><span\r\n");
      out.write("							class=\"fa fa-long-arrow-up\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("						<!-- //move top icon -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- //footer -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
