<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</head>

<body>

<form:form action="registerForm" method="POST" modelAttribute="user">
    <div class="row">

    <div class="col my-5"> </div>
    <div class="col">
    <p class="my-5 text-center" > ----Register---- </p>
    <div class="justify-content-center" style="width:600px">
            <div class="form-outline mb-2">
                <label class="form-label" for="form2Example1">Email: </label>
            	<form:input class="form-control" path="email" />
            </div>
            <p class="form-outline mb-2">
                <label class="form-label" for="form2Example1">Password:</label>
                <form:input class="form-control" path="pwd" />
            </p>
    		<p class="form-outline mb-2">
    			<label class="form-label" for="form2Example1">First Name:
    			<form:input class="form-control" path="firstName" />
    		</p>
    		<p class="form-outline mb-2">
    			<label class="form-label" for="form2Example1">Last Name:
    			<form:input class="form-control" path="lastName" />
    		</p>
    		<p class="form-outline mb-2">
    			<label class="form-label" for="form2Example1">Country:
    			<form:select path="country">
    				<form:option value="India" label="India" />
    				<form:option value="USA" label="USA" />
    				<form:option value="China" label="China" />
    			</form:select>
    		</p>


    		<p class="form-outline mb-2">
    			<label class="form-label" for="form2Example1">State:
    			<form:select path="state">
    				<form:options items="${user.stateOptions}" />
    			</form:select>
    		</p>


    		<p class="form-outline mb-2">
    			<label class="form-label" for="form2Example1">Favorite Language:
    			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    			PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
    			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    		</p>

    		<!-- Check Box -->
    		<p class="form-outline mb-2">
    			Linux <form:checkbox path="operatingSystem" value="Linux"/>
    			Windows <form:checkbox path="operatingSystem" value="Windows"/>
    			Mac Os <form:checkbox path="operatingSystem" value="Mac Os"/>
    		</p >

    		<input type="submit" class="btn btn-primary btn-block mb-2" value="Submit" /> Already a User? <a href="login">Login</a>
    	</div>

    </div>
    <div class="col"> </div>

    </div>


</form:form>



</body>
</html>