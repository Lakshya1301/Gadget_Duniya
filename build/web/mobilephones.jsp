<%@page import="java.sql.DriverManager,java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>

<%          ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList();
    ArrayList list3 = new ArrayList();
    ArrayList list4 = new ArrayList();

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gadget", "root", "root");
    PreparedStatement st = con.prepareStatement("select * from mobile ");
    ResultSet rs = st.executeQuery();

    while (rs.next()) {
        list1.add(rs.getString(1));
        list2.add(rs.getString(2));
        list3.add(rs.getString(3));
        list4.add(rs.getString(4));
    }
%>

<html>
    <style>
        .tdtheme
        {
            width:13%;
            background-color: white;
            height:10px;
            font-size:15px;
            font-family: arial;
        }
        .tdtheme:hover
        {
            background-color:#8FC1E3;
        }
        body
        {
            background-repeat:no-repeat;
            background-position:center bottom;
        }
        a
        {
            text-decoration:none;  
            color: black;
            font-weight: bold;         
        }
    </style>

    <body background="Images/background.jpg">
        <form>   
            <input type="text" placeholder=" Search...."name="Search" style='margin-left:810px;'>   
            <button type="submit">Search</button>   
        </form> 

        <div style="width:47%;height:20px;margin-left:650px;margin-top:78px;background-color:white;margin-left: 800px;">
            <table width= "100%" height="100%" border="0" style='margin-top:-80px;background-color: white;margin-left: 0px'>
                <tr align="center">
                    <td class="tdtheme"><a href="home.jsp">Home</a></td>
                    <td class="tdtheme"><a href="products.jsp">Products</a></td>
                    <td class="tdtheme"><a href="feeds.jsp">Feeds</a></td>
                    <td class="tdtheme"><a href="login.jsp">Login</a></td>
                    <td class="tdtheme"><a href="home.jsp"><img src='Images/cart.jpg' width='52px' height='52px'></a></td>
                    <td><select style="width: 80px; height: 30px;margin-right: 60px" onchange=" location = this.value">
                            <option value="">More</option>
                            <option value="aboutus.jsp">About Us</option>
                            <option value="expertiseprofiles.jsp">Expertise Profiles</option>
                            <option value="location.jsp">Location</a></option>
                            <option value="reviews.jsp">Reviews</option>
                            <option value="complaints.jsp">Complaints</option>
                            <option value="contactus.jsp">Contact Us</option>
                </tr>
            </table>
        </div>
        <div style="width:40%;height:80px;margin-left:20px;margin-top:-45px;background-color:white;">
            <table width="100%" border="0" style='margin-left: 11%; font-size: 40px;font-weight: bold;'>
                <tr>
                    <td>
                        GADGET DUNIYA
                        <img src="Images/logo.jpg" style="width: 80px; height: 75px; margin-left: -435px; margin-bottom:-25px;">
                    </td>
                </tr>
            </table>
        </div>

        <div style="width: 80%; height: 70%; background-color: lightblue;margin-left: 10%; margin-top: 5%;">
            <table width="100%" height="8%" border="2" style="background-color: lightblue; color: darkblue;">
                <tr align="center" bgcolor="lightblue" style="width: 100%; height: 8%;">
                    <th>NAME</th>
                    <th>DESCRIPTION</th>
                    <th>PRICE</th>
                    <th>AVAILABILITY</th>
                </tr>
                <%
                    for (int i = 0; i < list1.size(); i++) {
                %>
                <tr align='center' bgcolor='lightblue'>
                    <td><%=list1.get(i)%></td>
                    <td><%=list2.get(i)%></td>
                    <td><%=list3.get(i)%></td>
                    <td><%=list4.get(i)%></td>

                </tr>
                <%}%>
            </table>

        </div>
    </body>
</html>