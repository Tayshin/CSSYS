<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
                        <a href="userDetail.html" class="active-menu"><i class="fa fa-dashboard"></i> 查看个人信息</a>
                    </li>
                    <li>
                        <a href="modifyDetail.html" ><i class="fa fa-desktop"></i> 修改个人信息</a>
                    </li>
                    <li>
                        <a href="viewAllCourse.html"><i class="fa fa-bar-chart-o"></i> 所有课程信息</a>
                    </li>
                    <li>
                        <a href="viewSelectedCourse.html"><i class="fa fa-qrcode"></i> 查看选课信息</a>
                    </li>
                    
                    <li>
                        <a href="selectCourse.html"><i class="fa fa-table"></i> 选修课程</a>
                    </li>
                    <li>
                        <a href="dropCourse.html"><i class="fa fa-edit"></i> 退选课程 </a>
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
                                        <strong>姓名</strong> <small  id="userName">#姓名</small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>性别</strong> <small  id="userSex">#性别</small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>总学分</strong> <small  id="userCredit">#123</small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>备注</strong> <small  id="userInfo">#123</small>
                                    </div>
                                 </div>
                                <div class="col-md-4">
                                    <div class="alert alert-success">
                                        <strong>学号</strong> <small  id="userNum">#学号</small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>出生日期</strong><small id="userBirth">#XXXX.XX</small>
                                    </div>
                                    <div class="alert alert-success">
                                        <strong>专业</strong><small id="userMajor">#软件工程</small>
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