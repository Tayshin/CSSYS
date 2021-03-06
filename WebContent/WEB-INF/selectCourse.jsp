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
                        <a href="touserDetail.action" ><i class="fa fa-dashboard"></i> 查看个人信息</a>
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
                        <a href="toselectCourse.action" class="active-menu"><i class="fa fa-table"></i> 选修课程</a>
                    </li>
                    <li>
                        <a href="todropCourse.action"><i class="fa fa-edit"></i> 退选课程 </a>
                    </li>
                </ul>

            </div>

        </nav>
    <!-- NAV SIDE LEFT END -->
    <!-- PAGE SIDE-->
    <form action=selectCourse.action>
     <div id="page-wrapper" >
            <div id="page-inner">
             <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            选修课程 <small>选择你需要的课程</small>
                        </h1>
                    </div>
                </div> 
                 <!-- /. ROW  -->
                <div class="row">
                    <div class="col-md-10">
                        <!--    Context Classes  -->
                        <div class="panel panel-default">

                            <div class="panel-heading">
                                勾选你想选的课程后提交
                            </div>
                       
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            
                                            <th>课程名</th>
                                            <th>学分</th>
                                            <th>余量</th>
                                            <th></th>

                                        </tr>
                                        </thead>
                                        <tbody>
                         <c:forEach items="${sessionScope.courseList}" var="course" varStatus="loop">
                         <tr class="success">
                            <td>${course.getCourse_name()}</td>
                            <td>${course.getCourse_credit()}</td>
                            <td>${course.getCourse_num_left()}</td>
                            <th><input id="line1" name="sCourse" type="radio" value="${loop.index}"/></th>
                        </tr>
                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <button id="submitBtn" type="submit" class="btn btn-info"><a>提交</a></button>
                                </div>
                            </div>
                        </div>
                        <!--  end  Context Classes  -->
                    </div>

                </div>


             <!-- /. PAGE INNER  -->
            </div>
   
    <!-- PAGE SIDE END -->
    </div>
    </form>
    <script src="js/jquery.js"></script>
      <!-- Bootstrap Js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
 </div>
</body>
</html>