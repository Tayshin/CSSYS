<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>选课系统</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->
    <link href="css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='css/fontsgoogle.css' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">

<!--    nav TOP -->
<nav class="navbar navbar-default top-navbar" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="login.html"><i class="fa fa-comments"></i> <strong>选课系统 </strong></a>
    </div>
</nav>

<!--  NAV TOP END -->
<!--    NAV  SIDE  LEFT -->

<nav class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">
                    <li>
                        <a href="toadminStudent.action" class="active-menu"><i class="fa fa-dashboard"></i> 管理学生信息</a>
                    </li>
                    <li>
                        <a href="toadminCourse.action"   ><i class="fa fa-desktop"></i> 管理课程信息</a>
                    </li>

                    <li>
                        <a href="toaddStudent.action" ><i class="fa fa-bar-chart-o"></i> 添加学生</a>
                    </li>
                    <li>
                        <a href="toaddCourse.action"><i class="fa fa-qrcode"></i> 添加课程</a>
                    </li>
        </ul>

    </div>

</nav>
<!-- NAV SIDE LEFT END -->
<!-- PAGE SIDE-->
<div id="page-wrapper" >
<div id="page-inner">
<div class="row">
    <div class="col-md-12">
        <h1 class="page-header">
            管理学生信息<small> 查看或删除学生信息</small>
        </h1>
    </div>
</div>
<!-- /. ROW  -->

    <div class="col-md-10">
        <!--    Context Classes  -->
        <div class="panel panel-default">

            <div class="panel-heading">
                勾选需要删除的学生信息
            </div>
            <form action="removeStudent.action">
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>姓名</th>
                            <th>学号</th>
                            <th>性别</th>
                             <th>专业</th>


                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${sessionScope.studentList}" var="student" varStatus="loop">
                        <tr class="success">
                            <td>${student.getStudent_name() }</td>
                            <td>${student.getStudent_id() }</td>
                            <td><c:if test="${student.getSex()==0}">男</c:if><c:if test="${student.getSex()==1}">女</c:if></td>
                            <td>${student.getMajor() }</td>
                            <th><input id="line1" name="sStudent" type="radio" value="${loop.index}"/></th>
                       </tr>
                        
                        </c:forEach>
                        
                        </tbody>
                    </table>
                    
                     <button id="submitBtn" type="submit" class="btn btn-info"><a>提交</a></button>
                </div>
            </div>
            </form>
        </div>
        <!--  end  Context Classes  -->
    </div>

</div>
<!-- /. ROW  -->
</div>

</div>

<!-- PAGE SIDE END -->


<script src="js/jquery.js"></script>
<!-- Bootstrap Js -->
<script src="js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="assets/js/custom-scripts.js"></script>
<script src="js/adminDetail.js"></script>
</body>
</html>