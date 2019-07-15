<%--
  Created by IntelliJ IDEA.
  User: chongli
  Date: 2019/7/12
  Time: 下午11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <form action="userLoginServlet" method="post" >
        <table border="1px" width="438px"   >
            <tr align="center">
                <td>用户名</td>
                <td>
                    <input type="text" name="username" >
                </td>
            </tr>
            <tr align="center">
                <td>密码</td>
                <td>
                    <input type="password" name="password" >
                </td>
            </tr>
            <tr align="center">
                <td colspan="2" >
                    <input type="submit" value="用户登录" >

                    <input type="reset" value="重置内容" >
                </td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
