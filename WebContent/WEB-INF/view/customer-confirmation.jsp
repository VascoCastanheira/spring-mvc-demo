<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<Title> Customer Info </Title>
	

</head>
<body>
	<h2> Customer info</h2>
	
	<br><br>
	
	Customer name: ${customer.firstName} ${customer.lastName} 
	
	<br><br>
	
	Number of free passes: ${customer.nrFreePasses}

	<br><br>
	
	Postal Code: ${customer.postalCode}
	
	<br><br>
	
	Course Code: ${customer.courseCode}
</body>

</html>