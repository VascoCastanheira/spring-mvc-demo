<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<Title> Student Info </Title>
	

</head>
<body>
	<h2> Student info</h2>
	
	<br><br>
	
	Student name: ${student.firstName} ${student.lastName} 
	
	<br><br>
	
	Country: ${student.homeCountry}

	<br><br>
	
	Language: ${student.favProgrammingLanguage}
	
	<br><br>
	
	Favourite OS:
	
	<ul>
		<c:forEach var="temp" items="${student.favouriteOS}">
			<li> ${temp}</li>
		</c:forEach>
	</ul> 
	
</body>

</html>