<%@page import="java.util.Optional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
  request.setCharacterEncoding("UTF-8");
  Optional<String> opt = Optional.ofNullable(request.getParameter("title"));
  String title = opt.orElse("환영합니다");
  String contextPath = request.getContextPath();
%>
<title><%=title%></title>
<%-- jquery가 제일 위에 있어야 한다. --%>
<script src="<%=contextPath%>/resource/js/lib/jquery-3.7.1.min.js"></script>               
<script src="<%=contextPath%>/resource/js/header.js?dt=<%=System.currentTimeMillis()%>"></script>
<link rel="stylesheet" href="/jsp/resource/css/header.css?dt=<%=System.currentTimeMillis()%>">
                         <%-- "../../ 는 이제 안쓰고 ↑ 위 방식 사용함. ↑ 실행할 때마다 자동으로 날짜 값을 바꿔준다. --%>
<link rel="stylesheet" href="/jsp/resource/css/main.css?dt=<%=System.currentTimeMillis()%>">
<link rel="stylesheet" href="/jsp/resource/css/footer.css?dt=<%=System.currentTimeMillis()%>">
</head>
<body>s

  <nav class="gnb">
    <div class="logo"></div>
    <ul>
      <li><a href="main1.jsp">정치</a></li>
      <li><a href="main2.jsp">경제</a></li>
      <li><a href="main3.jsp">사회</a></li>
    </ul>
  </nav>