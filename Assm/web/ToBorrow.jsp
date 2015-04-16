<%-- 
    Document   : ToBorrow
    Created on : Apr 16, 2015, 5:14:19 PM
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
        <h1>Hiện thị thông tin về sách thuê</h1>
    <form action="BorrowProcess">
        <table border="1" style="text-align: left">
            <tr>
                <td><b>Hình ảnh  </b></td>
                <td><b>Mã sách  </b></td>
                <td><b>Tên sách  </b></td>
                <td><b>Tác giả  </b></td>
                <td><b>giá sách  </b></td>
                <td><b>thông tin chi tiết  </b></td>
                <td><b>Số lượng sách thuê   </b></td>
                <td></td>
            </tr>
            <tr>
                <td>
               <img width="235px" height="330px" src="${requestScope.book.img}"/>
                
                </td>
                <td>${requestScope.book.id}</td>
                <td>${requestScope.book.name}</td>
                <td>${requestScope.book.author}</td>
                <td>${requestScope.book.price}</td>
                <td>${requestScope.book.description}</td>
                <td>
                    <input type="text" name="number"/>
                    <input type="hidden" name="id" value="${requestScope.book.id}"/>
                </td>
            
                <td>
                    <input type="submit" value="Borrow"/>
                </td>
            </tr>
        </table>
    </form>
    </body>
</html>
