<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>需求浏览</title>
<style>
	a{
	color:#000000;
	opacity: 1.0;
	}
	a:visited{
	color:#000000;
	}
    table{
	border-collapse: collapse;
	border: none;
	margin: 45px auto;
	width: 900px;
    }
	td{
	text-align:center;
	height: 20px;
	width:120px;
	margin-bottom: 10px;
	line-height: 25px;
	opacity: 0.7;
	}
.time{
	width:100px;
}</style>
</head>
<body>
<form method="post">
<center>

<input type="hidden" name="i" id="i" value=1>
查询条件:&nbsp;<select name="mc" style="width:120px;height:25px;border-style:outset">
<option value="">技术需求名称</option>
<c:forEach var="item" items="${jsxqmc}" varStatus="status">
    <option value="${item.mingcheng}">${item.mingcheng}</option>
</c:forEach>
</select>
<input formaction="${pageContext.request.contextPath}/XuqiuServlet?method=ck1&username=${adminBean.name}" name="submit" value="查询" type="submit" style="width:60px;height:25px"><br><br>


<br><br>
</center>
</form>
<br><br>
<center>
<c:if test="${param.status == 1}">
<table> 
<tr style="width:90px;text-align:center"><td>技术需求名称</td><td>联系人</td><td>主要问题</td>
		<td>填报人</td><td>法人代表</td><td>状态</td><td>填报时间</td><td>是否通过</td></tr>
<c:forEach var="item" items="${xuqiuBean12}" varStatus="status">
    		<tr style="text-align:center">
    		<td><a href="${pageContext.request.contextPath}/XuqiuServlet?method=ck&xuqiuname=${item.mingcheng}" style="text-decoration:none">${item.mingcheng}</a></td>
    		<td>${item.contact}</td>
    		<td>${item.problem}</td>
    		<td>${item.name}</td>
    		<td>${item.daibiao}</td>
    		<td>${item.status}</td>
    		<td>${item.shijian}</td>
    		<td>
    		<c:if test="${item.status=='已提交'}">
    		<a href="${pageContext.request.contextPath}/XuqiuServlet?method=tg&xuqiuname=${item.mingcheng}" style="text-decoration:none">
    		是</a>/<a href="${pageContext.request.contextPath}/XuqiuServlet?method=wtg&xuqiuname=${item.mingcheng}" style="text-decoration:none">否</a>
    		</c:if>
    		<c:if test="${item.status=='已通过审核'||item.status=='未通过审核'||item.status=='已保存'}">
    		<a style="text-decoration:none">
    		是</a>/<a style="text-decoration:none">否</a>
    		</c:if>
    		</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${param.statustg==1}">
<script>
alert("已完成该操作!");
</script>
</c:if>
</center>
</body>
</html>