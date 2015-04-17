<%-- 
    Document   : ViewCart
    Created on : Apr 17, 2015, 4:23:40 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
    </head>
    <body>
        <h1>Tất cả sách đã mượn</h1>
        
        <table border="2"  style="text-align: left">
                <tr>
                        <td><b>Mã sách  </b></td>
                        <td><b>Tên sách  </b></td>
                        <td><b>Tác giả  </b></td>
                        <td><b>giá sách  </b></td>
                        <td><b>thông tin chi tiết  </b></td>
                        <td><b>Số lượng sách thuê   </b></td>
                    
                </tr>
                <c:forEach items="${requestScope['listView']}" var="b" >
                    <tr>
                        
                    <td>${b.id}</td>
                    <td>${b.name}</td>
                    <td>${b.author}</td>
                    <td>${b.price}</td>
                    <td>${b.total}</td>
                    <td>${b.totalPaid}</td>
                    </tr>
            </c:forEach>
        </table>
    </body>
</html>
