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
    <link href="css/userDetail.css" rel="stylesheet" />
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
                        <a href="touserDetail.action" class="active-menu"><i class="fa fa-dashboard"></i> 查看个人信息</a>
                    </li>
                    <li>
                        <a href="tomodifyDetail.action" ><i class="fa fa-desktop"></i> 修改个人信息</a>
                    </li>
                    <li>
                        <a href="toviewAllCourse.action"><i class="fa fa-bar-chart-o"></i> 所有课程信息</a>
                    </li>
                    <li>
                        <a href="toviewSelectedCourse.action"><i class="fa fa-qrcode"></i> 查看选课信息</a>
                    </li>
                    
                    <li>
                        <a href="toselectCourse.action"><i class="fa fa-table"></i> 选修课程</a>
                    </li>
                    <li>
                        <a href="todropCourse.action"><i class="fa fa-edit"></i> 退选课程 </a>
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
                            查看个人信息 <small>浏览你的个人信息</small>
                        </h1>
                    </div>
              </div> 
              <!-- /. ROW  -->
                 
                
            <div class="row">

            <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading" >
                 个人信息
                 </div>
                            <div class="panel-body">


                                <div class="col-md-4">
                                    <div class="alert alert-success">
                                        <strong>姓名</strong> <small  id="userName"><c:out value="${sessionScope.student.getStudent_name() }"></c:out></small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>性别</strong> <small  id="userSex">
                                        <c:if test="${sessionScope.student.getSex()==0 }">男
                                        </c:if>
                                        <c:if test="${sessionScope.student.getSex()==1 }">女
                                        </c:if>
                                        </small>
                                    </div>
                                 </div>
                                <div class="col-md-4">
                                    <div class="alert alert-success">
                                        <strong>学号</strong> <small  id="userNum"><c:out value="${sessionScope.student.getStudent_id() }"></c:out></small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>专业</strong><small id="userMajor"><c:out value="${sessionScope.student.getMajor() }"></c:out></small>
                                    </div>
                                </div>
                            </div>
            </div>
            </div>                      
            </div>


    <!-- PAGE SIDE END -->
    </div>

    <script src="js/jquery.js"></script>
      <!-- Bootstrap Js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
 
</body>
</html>