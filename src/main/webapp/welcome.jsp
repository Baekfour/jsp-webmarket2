<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   <%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  <jsp:include page="menu.jsp" />
   <%!// 변수, 메소드 선언
   String greeting = "웹 쇼핑몰에 오신 것을 환영합니다";
   String tagline = "Welcome to Web Market!";%>
   <%
   // 그냥 java 코드
   // out.println("<h1>Hello World</h1>");
   %>

   <div class="p-5 bg-primary text-white">
   <!-- container :좌우 가운데 정렬 -->
  <div class="container">
  <!-- display-3 : 큰 글자중에 보통크기-->
    <h1 class="display-3">
      <%= greeting %>
    </h1>
  </div>
</div>
<div class="container">
  <div class="text-center">
    <h3><%=tagline%></h3>
    <%
    // 1초에 한번씩 새로고침
    response.setIntHeader("Refresh", 1);
    Date today = new Date();
    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
    out.println("현재 접속 시간" + format.format(today));
    %>
  </div>
  <jsp:include page="footer.jsp" />
</div>
</body>
</html>