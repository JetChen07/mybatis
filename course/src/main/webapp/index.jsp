<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.jack.entity.Student,java.util.*" 
isELIgnored="false" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

<%-- <% List<Student>studentList = (List<Student>)request.getAttribute("studentList");
	System.out.println("count in indexjsp"+studentList.size());%> --%>
<head>
    <title>学生课表管理中心</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-1.12.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>学生课表管理中心</h1>
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addstudent.jsp" role="button">新增用户</a></p>
        </div>
    </div>
    <div class="row">
    	 <table class="table table-hover table-striped">
            <tr>
                <th>用户编号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>年级</th>
                <th>专业</th>
                <th>操作</th>
            </tr>
            
            <c:forEach var="st" items="${studentList }" varStatus="status" >
            <tr>
            	<td>${st.id }</td>
                <td>${st.reg_no}</td>
                <td>${st.name}</td>
                <td>${st.sex}</td>
                <td>${st.age}</td>
                <td>${st.grade}</td>
                <td>${st.major}</td>
                <td> <a href="${pageContext.request.contextPath}/detail?id=${st.id}">查看</a>
                	 <a href="${pageContext.request.contextPath}/delete?id=${st.id}">删除</a></td>
            </tr>
            </c:forEach>
         </table>
    </div>
</div>
</html>