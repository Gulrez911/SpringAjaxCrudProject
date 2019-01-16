<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
    </head>
    <html>
        <body background="<%=request.getContextPath()%>/resources/images/google.jpg">
            <h1>First Spring MVC Application Demo</h1>

            <h2>${msg}</h2>

            <form:form action="save" method="post" modelAttribute="student" id="saveForm">
                <table>
                    <form:hidden path="id"/>
                    <tr>
                        <td>Your Name:</td>
                        <td><form:input path="firstName"/></td> 
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"/></td>
                    </tr>
                </form:form>
                <table border="1">
                    <th>Name</th>
                        <c:forEach var="s" items="${listStudent}">
                        <tr>
                            <td>${s.firstName}</td>
                        </tr>
                    </c:forEach>
                </table>
        </body>
    </html>