<%-- 
    Document   : home
    Created on : Apr 15, 2015, 12:50:46 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Css/Cart.css">
        <title>Home page</title>
    </head>
    <body>
        <a href="Index.jsp">Đăng xuất</a>
        <div class="giohang"><p class="text">Hiện tại trong giỏ hàng của bạn có (${sessionScope['total']}) sách được thuê</p></br></div>
        
    <center>
        <h2 style="color: red">WELCOME TO MY LIBRARY</h2>
    <table border="2"  style="text-align: left">
            <c:forEach items="${requestScope['listBook']}" var="book" >
                <tr>
                    <td>
                        <!--hiển thị ảnh-->
                        <img src="${book.img}" width="235px" height="330px"/>
                    </td>
                    <td>
                        <b> Mã sách : </b> ${book.id}</br></br>
                        
                        <b> Tên sách : </b> ${book.name}</br></br>
                        
                        <b> Tác giả : </b> ${book.author}</br></br>
                        
                        <b> giá : </b> ${book.price}</br></br>
                        
                        <b> Mô tả chi tiết : </b> ${book.description}</br></br>
                        
                        <a href="BorrowBooks?id=${book.id}">Mượn Sách</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>
        
    </body>
</html>
