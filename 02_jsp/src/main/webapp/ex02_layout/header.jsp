<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/jsp/resource/css/header.css?dt=<%=System.currentTimeMillis()%>">
                         <%-- "../../ 는 이제 안쓰고 ↑ 위 방식 사용함. ↑ 실행할 때마다 자동으로 날짜 값을 바꿔준다. --%>
<script src="/jsp/resource/js/lib/jquery-3.7.1.min.js"></script>               
<script src="/jsp/resource/js/header.js?dt=<%=System.currentTimeMillis()%>"></script>
<%-- jquery가 위에 있어야 한다. --%>
</head>
<body>

  <nav class="gnb">
    <ul>
      <li><a href="main1.jsp">main1</a></li>
      <li><a href="main2.jsp">main2</a></li>
      <li><a href="main3.jsp">main3</a></li>
    </ul>
  </nav>



</body>
</html>