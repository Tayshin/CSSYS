<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录失败提示</title>
    <style type="text/css">
        body{
            background-repeat: no-repeat;
            color: #000;
            font:9pt/200% Verdana;
        }
        a{text-decoration: none;color:#659B28}
        a:hover{text-decoration: underline;}
    </style>
</head>
<body>
<center>
    <div style='padding:30px;padding:36px 80px;border:1px solid #a9a9a9;background:#ffffff ; text-align:center; margin:20% auto; background-repeat: no-repeat; width:55%;'>
        <strong>登录失败！将返回登录界面</strong>
        <br /><a href='login.html'>如果没有跳转，请点击这里...</a>
        <script>
            var pgo = 0;
            function JumpUrl(){
                if(pgo == 0){
                    location = 'login.html';
                    pgo = 1;
                }
            }
            setTimeout('JumpUrl()',3000);
            
        </script>
    </div>
</center>
</body>
</html>