package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import java.util.*;
import java.text.*;

public final class titles_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Untitled Document</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#FFFFFF\" text=\"#000000\">\r\n");
      out.write("        <p>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </p>\r\n");
      out.write("        <table width=\"38%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" height=\"53\" align=\"left\">\r\n");
      out.write("            <tr> \r\n");
      out.write("                <td bgcolor=\"#E2E2E2\"> \r\n");
      out.write("                    <div align=\"left\"><font face=\"Arial, Helvetica, sans-serif\"><font face=\"Times New Roman, Times, serif\" size=\"3\"><b><font face=\"Arial, Helvetica, sans-serif\" size=\"2\">Items \r\n");
      out.write("                            in your Shopping Cart</font></b></font></font></div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                Map items = (Map) session.getAttribute("cart");
                if (items != null) {
                    Set entries = items.entrySet();
                    Iterator iter = entries.iterator();
                    double totalCostOfOrder = 0.00;
                    Book book = null;
                    CartItem item = null;

                    while (iter.hasNext()) {
                        Map.Entry entry = (Map.Entry) iter.next();
                        item = (CartItem) entry.getValue();
                        double cost = item.getOrderCost();
                        totalCostOfOrder += cost;
            
      out.write("\r\n");
      out.write("            <tr> \r\n");
      out.write("                <td height=\"13\" bgcolor=\"#E8FFE8\">");
      out.print( item);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                } // end while
                DecimalFormat dollars = new DecimalFormat("0.00");
                String totalOrderInDollars = (dollars.format(totalCostOfOrder));
            
      out.write("\r\n");
      out.write("            <tr> \r\n");
      out.write("                <td height=\"13\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("                    <div align=\"right\"><font face=\"Times New Roman, Times, serif\"><b><font size=\"2\" face=\"Arial, Helvetica, sans-serif\">Order \r\n");
      out.write("                            Total: ");
      out.print( totalOrderInDollars);
      out.write("</font></b></font></div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

            }// end if
            else {
            
      out.write("\r\n");
      out.write("            <tr> \r\n");
      out.write("                <td height=\"13\">No Items in Cart</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                } // end else
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p><hr>\r\n");
      out.write("        <h2 align=\"center\">WELCOME TO THE ONLINE BOOKSHOP</h2>\r\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"./books\">\r\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"add_to_cart\">\r\n");
      out.write("            <table width=\"93%\" border=\"2\" cellspacing=\"0\" cellpadding=\"1\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("                <tr bgcolor=\"#CCCCCC\"> \r\n");
      out.write("                    <td width=\"10%\"><b>ISBN</b></td>\r\n");
      out.write("                    <td width=\"37%\"><b>Title</b></td>\r\n");
      out.write("                    <td width=\"24%\"><b>Author</b></td>\r\n");
      out.write("                    <td width=\"13%\"><b>Price</b></td>\r\n");
      out.write("                    <td width=\"10%\"><b>Quantity</b></td>\r\n");
      out.write("                    <td width=\"6%\"> \r\n");
      out.write("                        <div align=\"left\"><b>Add</b></div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                ");

                    List books = (List) session.getAttribute("books");
                    Iterator iter = books.iterator();
                    while (iter.hasNext()) {

                        Book book = (Book) iter.next();
                        String isbn = book.getIsbn();
                        String title = book.getTitle();
                        String author = book.getAuthor();
                        String price = book.getDollarPrice();
                
      out.write(" \r\n");
      out.write("                <tr bgcolor=\"#F4F4F4\"> \r\n");
      out.write("                    <td width=\"10%\">");
      out.print( isbn);
      out.write("</td>\r\n");
      out.write("                    <td width=\"37%\">");
      out.print( title);
      out.write("</td>\r\n");
      out.write("                    <td width=\"24%\">");
      out.print( author);
      out.write("</td>\r\n");
      out.write("                    <td width=\"13%\">");
      out.print( price);
      out.write("</td>\r\n");
      out.write("                    <td width=\"10%\"> \r\n");
      out.write("                        <select name=");
      out.print( isbn);
      out.write(" size=\"1\">\r\n");
      out.write("                            <option value=\"1\">1</option>\r\n");
      out.write("                            <option value=\"2\">2</option>\r\n");
      out.write("                            <option value=\"3\">3</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td width=\"6%\"> \r\n");
      out.write("                        <div align=\"center\"> \r\n");
      out.write("                            <input type=\"checkbox\" name=\"add\" value=");
      out.print( isbn);
      out.write(">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 }// end while

      out.write("\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td width=\"10%\"> \r\n");
      out.write("                        <input type=\"submit\" name=\"Details\" value=\"Add to Cart\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td width=\"37%\">&nbsp;</td>\r\n");
      out.write("                    <td width=\"24%\">&nbsp;</td>\r\n");
      out.write("                    <td width=\"13%\">&nbsp;</td>\r\n");
      out.write("                    <td width=\"10%\">&nbsp;</td>\r\n");
      out.write("                    <td width=\"6%\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        <p><a href=\"./books?action=view_cart\">View Shopping Cart</a></p>\r\n");
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
