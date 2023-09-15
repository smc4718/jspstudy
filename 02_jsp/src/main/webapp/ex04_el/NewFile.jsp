<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%-- 
    표현언어(EL)
    1. Expression Language
    2. binding 영역에 저장된 값을 나타낼 때 사용할 수 있는 언어이다.
    3. Jsp 표현식 <%=값%>을 대체할 수 있다.
    4. 형식
      ${값}
    5. binding 영역 EL 내장 객체
  
  --%>
  
  
  
  <%-- 각 영역의 속성 확인하기 --%>
  <div>${pageScope.msg}</div>
  <div>${requestScope.msg}</div>
  <div>${sessionScope.msg}</div>
  <div>${applicationScope.msg}</div>
  <%
    // 객체를 만든 뒤 EL 사용이 가능한 binding 영역에 넣는다.

  %>
  <div>이름 : ${person.name}</div>
  <div>나이 : ${person.age}</div>
  
  
  <%-- Map 사용하기 --%>
  <%
    // Map을 만든 뒤 EL 사용이 가능한 binding 영역에 넣는다.
    Map<String, Object> book = new HashMap<>();
    book.put("title", "소나기");
    book.put("price", 10000);
    pageContext.setAttribute("book", book);
  %>
  <div>제목 : ${book.title}</div>
  <div>가격 : ${book.price}</div>
  
  <%-- 
    EL 연산자
    
    1. 산술
      1) +
      2) -
      3) *
      4) / 또는 div (=divide)
      5) % 또는 mod
    EL연산자의 특징 중 하나는 영문 연산자가 있다. (div, mod)
   
   2. 크기 비교
     1) >  또는 gt
     2) <  또는 lt
     3) >= 또는 gd
     4) <= 또는 le
     5) == 또는 eq
     6) != 또는 ne 
   --%>
   
  <%-- 
   3. 논리 연산
      1) 논리 AND : && 또는 and
      2) 논리 OR  : || 또는 or
      3) 논리 NOT : ! 또는 not
      
   4. 조건 연산
      (조건식) ? true일 때 : false일 때
   --%>
   <%
     pageContext.setAttribute("a", 5);
     pageContext.setAttribute("b", 2);
   %>
   <div>${a + b}</div>
   <div>${a - b}</div>
   <div>${a * b}</div>
   <div>${a / b}</div>
   <div>${a div b}</div>
   <div>${a % b}</div>
   <div>${a mod b}</div>
   
   <div>${a gt b}</div>
   <div>${a lt b}</div>
   <div>${a ge b}</div>
   <div>${a le b}</div>
   <div>${a eq b}</div>
   <div>${a ne b}</div>
   
   <div>${a eq 5 && b eq 2}</div>
   <div>${a eq 5 and b eq 2}</div>
   <div>${a eq 5 || b eq 2}</div>
   <div>${a eq 5 or b eq 2}</div>
   <div>${!(a eq 5)}</div>
   <div>${not (a eq 5)}</div>
   
   <%--
     request 사용 시 주의사항
     
     1. 속성(Attribute)을 저장한 경우
       request.setAttribute("name", "홍길동") --->>> ${name}
     
     2. 파라미터(Parameter)를 저장한 경우
       /ContextPath/URLMapping?name=홍길동    --->>> ${param.name}
    --%>
    
   
   </body>
</html>