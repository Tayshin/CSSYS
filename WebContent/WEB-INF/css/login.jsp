<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
   <title>选课系统登录页面</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/fontsgoogle.css">
    <script src="js/jquery.js"></script>
</head>
<body>
<div class="container">
   <!--  ROW  1 -->
    <div id ="headerlines" class="row">
    <div class="col-md-4"></div>

        <div class="col-md-4">

 
            <h1 class="text-center">欢迎登陆</h1>

            
       
        <div class="col-md-4"></div>
        </div>
    </div>

    <!-- ROW 2 -->
    <div class="row">
    <div class="col-md-4"></div>

        <div class="col-md-4">
            <br>
       
            <form class="bs-example bs-example-form" role="form" action="login.action" method="post">
                <div class="input-group">
                    <span class="input-group-addon">用户名</span>
                    <input id="loginName" name="loginName" type="text" class="form-control" placeholder="请输入用户名"/>
                </div>

                <br>

                <div class="input-group">
                    <span class="input-group-addon ">密&nbsp;&nbsp;&nbsp;&nbsp;码</span>
                    <input id="loginPassword" name="loginPassword" type="password" class="form-control" placeholder="请输入密码"/>

                </div>

                <br>
                <br>

                
                <div>
                    <div class="col-md-4"></div>

                    <div class="col-md-4">
                        <span id="nameTip"></span>
                        <form>
                            <input type="radio" id="admin"  name="accType" value="1">&nbsp;管理员入口
                            <input type="radio" id="student" name="accType" value="0">&nbsp;学生入口
                        </form>
                        <button id="loginBtn" type="submit" class="btn btn-info"><a>登录</a></button>
                    </div>

                </div>
                
            </form>
        
        <div class="col-md-4"></div>
        </div>
        <div class="col-md-4"></div>
    </div>
<script src="js/bootstrap.js"></script>
</body>
</html>


