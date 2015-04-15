<%-- 
    Document   : home
    Created on : Apr 15, 2015, 12:50:46 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center> 
        <table border="1" style="text-align: left">
            <h2>WELCOME TO MY LIBRARY</h2> 
            <c:forEach items="${requestScope.listBook}" var="book">
                <tr>
                    <td>
                        <!--hiển thị ảnh-->
                        <img src="${book.img}"/>
                    </td>
                    <td>
                        <p>Id</p> ${book.id}</br>
                        <p>Tên sách</p> ${book.name}</br
                        <p>Tác giả</p> ${book.author}</br>
                        <p>giá</p> ${book.price}</br>
                        <p>Mô tả chi tiết</p> ${book.description}</br>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>
        <a href="Index.jsp">Đăng xuất</a> 
    </body>
</html>
