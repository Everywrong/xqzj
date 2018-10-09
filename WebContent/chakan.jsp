<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>需求查看</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/CreateDemand.js">
	
</script>
<style type="text/css">
html, body, div, li, form, input, th, td {
	margin: 0;
	padding: 0;
	font-family:黑体;
	font-size: 100%;
}

ul, ol, li {
	list-style: none;
}

a:link, a:visited {
	color: #FF00FF;
	text-decoration: none;
}

a:hover {
	color: #12b7f5;
}

table {
	border-collapse: collapse;
	border: none;
	margin: 60px auto;
	width: 800px;
}

th, td {
	border: 1px solid black;
	height: 20px;
	width:330px;
	margin-bottom: 12px;
	line-height: 25px;
	opacity: 1.0;
}

div, td {
	text-align: left;
}
</style>
</head>
<body style="background-color: #E0F0F8;">

	<form role="form" class="form-horizontal" action="${pageContext.request.contextPath}/XuqiuServlet?method=ck&mingcheng=${xuqiuBean.mingcheng}"
					 id="form1" method="post">
		<center>
			<table class="table" border="0" cellpadding="10">
				<caption>
					<h1>技术需求申请表</h1><br>
					<h2 style="text-align:right;font-size:15px">填报时间:${xuqiuBean.shijian}</h2>
				</caption>
				<tr class='tr1'>
					<td style="color:red;width:60px"><a style="color:black">*</a>机构全称</td>
					<td class="td5">${xuqiuBean.jigou}</td>
					<td style="text-align:center">归口管理部门</td>
					<td colspan="1">${xuqiuBean.bumen}</td>
				</tr>
				<tr>
					<td style="color:black;">*通讯地址</td>
					<td class="td5">${xuqiuBean.txadd}</td>
					<td style="text-align:center;color:black">*所在地域</td>
					<td colspan="1">
					${xuqiuBean.diyu}
				    </td>
				</tr>
				<tr class='tr1'>
					<td style="color:red;">&nbsp;网址</td>
					<td class="td5">${xuqiuBean.dwUrl}</td>
					<td style="text-align:center;color:black">*电子信箱</td>
					<td colspan="1">${xuqiuBean.email}</td>
				</tr>
				<tr>
					<td style="color:black;">*法人代表</td>
					<td>${xuqiuBean.daibiao}</td>
					<td style="text-align:center">邮政编码</td>
					<td colspan="1">${xuqiuBean.youbian}</td>
				</tr>
				<tr>
					<td rowspan="2" style="color:black;">*联系人</td>
					<td rowspan="2" >${xuqiuBean.contact}</td>
					<td style="text-align:center;color:black">*电话</td>
					<td colspan="1">固定:${xuqiuBean.phone}&nbsp;&nbsp;手机:${xuqiuBean.telphone}</td>
				</tr>
				<tr>
					
					<td style="text-align:center">传真</td>
					<td colspan="1">${xuqiuBean.chuanzhen}</td>
				</tr>
				<tr>
				<td style="color:black;">*机构属性</td>
				<td colspan="3">${xuqiuBean.shuxing}</td>
				</tr>
				<tr class="tr1">
					<td colspan="3" style="color:black">*机构简介</td>
				</tr>
				<tr class="tr3">
					<td colspan="4">${xuqiuBean.jianjie}</td>
				</tr>
				<tr>
				<td style="color:black">*技术需求名称</td>
				<td>${xuqiuBean.mingcheng}</td>
				<td style="text-align:center;color:black">*需求时限</td>
				<td style="text-align:center">${xuqiuBean.start}年至${xuqiuBean.finish}年</td>				
				</tr>
				<tr class="tr1">
					<td colspan="5" style="color:black">*技术需求概述</td>
				</tr>
				<tr class="tr2">
					<td class="td5" colspan="3">主要问题</td>
				</tr>
				<tr class="tr3">
					<td colspan="5">${xuqiuBean.problem}</td>
				</tr>
				<tr>
					<td>*关键字:</td>
					<td colspan="4">${xuqiuBean.guanjian}
					</td>
				</tr>
				<tr>
				<td style="color:red">拟投入资金总额</td>
				<td colspan="3">${xuqiuBean.zijin}万元</td>
				</tr>
				<tr>
					<td class="td1">研究类型</td>
					<td colspan="4">${xuqiuBean.leixing}
					</td>
				</tr>
				<tr id="sub">
					<td class="td1">学科分类</td>
					<td colspan="4">${xuqiuBean.fenlei}&nbsp;&nbsp;&nbsp;&nbsp;${xuqiuBean.fenlei1}
					&nbsp;&nbsp;&nbsp;&nbsp;${xuqiuBean.fenlei1}</td>	
				</tr>
				<tr>
					<td class="td1">*技术需求合作模式</td>
					<td colspan="4">${xuqiuBean.moshi}
					</td>
				</tr>
				<tr>			
				
				<tr id="servics" style="display: none;">
					<td class="td1">需求技术所属领域</td>
					<td colspan="4">${xuqiuBean.lingyu}</td>
				</tr>
				<tr id="industry" style="display: none;">
					<td id="td1">需求技术应用行业</td>
					<td colspan="4">${xuqiuBean.usehangye}</td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>