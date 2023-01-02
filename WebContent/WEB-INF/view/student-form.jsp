<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Student - Input Form</title>
	
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First name: <form:input path="firstName"/>
		
		<br><br>
		
		Last name: <form:input path="lastName"/>
		
		<br><br>
		
		Country:
		
		<form:select path="homeCountry">
		
			<form:options items="${student.countryOptions}"/>
		
		</form:select>
		
		<br><br>
		
		Favorite Language:
		
		Java <form:radiobutton path="favProgrammingLanguage" value="Java"/>
			
		Python <form:radiobutton path="favProgrammingLanguage" value="Python"/>

		Ruby <form:radiobutton path="favProgrammingLanguage" value="Ruby"/>
		
		C# <form:radiobutton path="favProgrammingLanguage" value="C#"/>
		
		<br><br>
		
		Favorite Operating systems:
		
		Linux <form:checkbox path="favouriteOS" value="Linux"/>
		Mac OS <form:checkbox path="favouriteOS" value="MacOS"/>
		Windows <form:checkbox path="favouriteOS" value="Windows"/>
				
		<input type="submit" value="submit"/>
	</form:form>
</body>

</html>