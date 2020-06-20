<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/18
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>项目列表展示</title>
</head>
<body>
<h3>项目列表展示</h3>
<hr>
<form action="${pageContext.request.contextPath}/items.form" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${items}" var="item">
            <tr>
                <td>${item.id }</td>
                <td>${item.name }</td>
                <td>${item.price }</td>
                <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                <td>${item.detail }</td>
                <td><a href="">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</form>

<script>
arrays.forEach(${items}=>console.log(items))
</script>
</body>
</html>
