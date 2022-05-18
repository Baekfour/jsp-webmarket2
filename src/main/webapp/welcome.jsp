<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <nav class="navbar navbar-expand navbar-dark bg-dark">
      <ul class="container">
         <li class="navbar-header">
            <a class="navbar-brand" href="./welcome.jsp">Home</a>
            <a class="navbar-brand" href="./welcome.jsp">Home</a>
         </li>
      </ul>
   </nav>
   <%!// 변수, 메서드 선언
   String greeting = "Welcome to Web Shopping Mall";
   String tagline = "Welcome to Web Market!";%>
   <%
   // 그냥 java 코드
   // out.println("<h1>Hello World</h1>");
   %>

   <div class="p-5 bg-primary text-white">
   <!-- container : 좌우 가운데 정렬 -->
  <div class="container">
  <!-- display-3 : 큰 글자중에 보통크기 -->
    <h1 class="display-3">
      <%= greeting %>
    </h1>
  </div>
</div>
<div class="container">
  <div class="text-center">
    <h3><h1><%=tagline%></h1></h3>
  </div>
  <footer class="cotainer">
  <p >&copy; WebMarket</p>>
  </footer>
</div>
</body>
</html>