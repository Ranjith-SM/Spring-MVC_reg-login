<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>StudentForm</title>
</head>
<body>

<h3 class="text-center" >All Users List</h3>

<c:if test="${users.size() eq 0}">
        <p>No Users Registered</p>
</c:if>

 <div class="mx-auto" style="width:600px;">
            <table class="table ">
                            <thead class="text-center">
                                <tr>
                                    <th scope="col">FirstName</th>
                                    <th scope="col">LastName</th>
                                    <th scope="col">Country</th>
                                    <th scope="col">State</th>
                                    <th scope="col">Language</th>
                                    <th scope="col">OS</th>

                                </tr>
                            </thead>
                            <tbody class="table-group-divider">
                                <c:forEach var="user" items="${users}">
                                    <tr scope="row">
                                        <td>
                                            <c:out value="${user.getFirstName()}" />
                                        </td>
                                        <td>
                                            <c:out value="${user.lastName}" />
                                        </td>
                                        <td>
                                            <c:out value="${user.country}" />
                                        </td>
                                        <td>
                                            <c:out value="${user.state}" />
                                        </td>
                                        <td>
                                            <c:out value="${user.favoriteLanguage}" />
                                        </td>
                                        <td>
                                            <c:out value="${user.getOperatingSystem()}" />
                                        <td>

                                    </tr>
                                </c:forEach>
                            </tbody>

                        </table>
        </div>





</body>
</html>