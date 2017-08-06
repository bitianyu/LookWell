<%--
  Created by IntelliJ IDEA.
  User: gys
  Date: 2017/8/4
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%pageContext.setAttribute("APP_PATH", request.getContextPath());%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../basic.jsp"></jsp:include>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>用户页面</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button type="button" class="btn btn-primary" id="addUser">新增</button>
            <button type="button" class="btn btn-danger" id="deleteSelectUser">删除</button>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover">
            <tr>
                <th>
                    <input type="checkbox" id="deleteAllSelect">
                </th>
                <th class="col-md-2">用户编号</th>
                <th class="col-md-2">用户名</th>
                <th class="col-md-2">用户角色</th>
                <th class="col-md-3">用户昵称</th>
                <th class="col-md-3">操作</th>
            </tr>
            <c:forEach items="${tlist.list}" var="user">
                <tr>
                    <td>
                        <input type="checkbox" class="deleteSelect">
                    </td>
                    <td class="col-md-2">${user.userId}</td>
                    <td class="col-md-2">${user.username}</td>
                    <td class="col-md-4">
                        <button type="button" data-id="${user.userId}" class="btn btn-primary updateUser" id="updateUser">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true">编辑</span>
                        </button>
                        <button type="button" data-id="${user.userId}" class="btn btn-danger deleteUser">
                            <span class="glyphicon glyphicon-trash" aria-hidden="true">删除</span>
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="row">
        <div class="col-md-6">
            当前为第${tlist.pageNum}页，共有${tlist.pages}页，总共记录有${tlist.total}记录数
        </div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${APP_PATH}/tbuser/queryUser.controller?pn = 1">首页</a></li>
                    <c:if test="${tlist.hasPreviousPage}">
                        <li>
                            <a href="${APP_PATH}/tbuser/queryUser.controller?pn=${tlist.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:forEach items="${tlist.navigatepageNums}" var="page_num">
                        <c:if test="${page_num == tlist.pageNum}">
                            <li class="active"><a href="#">${page_num}</a></li>
                        </c:if>
                        <c:if test="${page_num != tlist.pageNum}">
                            <li><a href="${APP_PATH}/tbuser/queryUser.controller?pn=${page_num}">${page_num}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${tlist.hasNextPage}">
                        <li>
                            <a href="${APP_PATH}/tbuser/queryUser.controller?pn=${tlist.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <li><a href="${APP_PATH}/tbuser/queryUser.controller?pn=${tlist.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>
