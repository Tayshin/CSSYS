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
                        <a href="toadminStudent.action"><i class="fa fa-dashboard"></i> 管理学生信息</a>
                    </li>
                    <li>
                        <a href="toadminCourse.action"   ><i class="fa fa-desktop"></i> 管理课程信息</a>
                    </li>

                    <li>
                        <a href="toaddStudent.action"  class="active-menu"><i class="fa fa-bar-chart-o"></i> 添加学生</a>
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
                            添加学生 <small>添加新的学生信息</small>
                        </h1>
                    </div>
                </div> 
                 <!-- /. ROW  -->
                 
                  <div class="row">
                    <div class="col-md-6">
                        <div class="panel panel-default">
                             <div class="panel-heading">
                              添加学生信息
                              </div>

                            <div class="panel-body">
                                <div class="col-md-12 column">
                                    <form role="form" action="addstudent.action" method="post">
                                        <div class="form-group">
                                            <label >学号</label><input  class="form-control" id="addNum" name="addNum"/>
                                        </div>
                                        <div class="form-group">
                                            <label >姓名</label><input  class="form-control" id="addName" name="addName" />
                                        </div>
                                        <div class="form-group">
                                            <label >性别</label><br>
                                         
                                            <input type="radio" id="sex1" name="sex" value="0" checked>&nbsp男
                                            <input type="radio" id="sex2" name="sex" value="1">&nbsp女
                                            
                                        </div>
                                        <div class="form-group">
                                            <label >密码</label><input type="password" class="form-control" id="addPassword" name="addPassword" />
                                        </div>
                                        <div class="form-group">
                                            <label >出生日期</label><input  class="form-control" id="addBirth" name="addBirth"/>
                                        </div>
                                        <div class="form-group">
                                            <label >专业</label><input  class="form-control" id="addMajor" name="addMajor"/>
                                        </div>


                                        <button id="submitBtn" type="submit" class="btn btn-info" disabled="disabled">提交</button>
                                       
                                        </form>
                                </div>
                             </div>
                    </div>

                </div>
                 <!-- /. ROW  -->

                <!-- /. ROW  -->

                </div>
             <!-- /. PAGE INNER  -->
            </div>

    <!-- PAGE SIDE END -->
    </div>

    <script src="js/jquery.js"></script>
    <script src="js/addStudent.js"></script>
      <!-- Bootstrap Js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
 </div>

</body>
</html>