<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>


<meta charset="UTF-8">
<title>Student</title>
</head>
<body>


	<!-- student should match in the controller -->
	<div class="row">
	<div class="col my-5"> </div>
        <div class="col">
            <p class="my-5 text-center" > ----Login---- </p>
            <div class="justify-content-center" style="width:600px">
            <form:form action="loginForm" method="POST" modelAttribute="user">
                    		<div class="form-outline mb-2">
                                            <label class="form-label" for="form2Example1">Email: </label>
                                        	<form:input class="form-control" path="email" />
                            </div>
                            <p class="form-outline mb-2">
                                            <label class="form-label" for="form2Example1">Password:</label>
                                            <form:input class="form-control" path="pwd" />
                            </p>

                    		<input type="submit" class="btn btn-primary btn-block mb-2" value="login" />Not a User ? <a href="register">Register</a>
                        </form:form>
            </div>
        </div>
    <div class="col" > </div>
    </div>



</body>
</html>